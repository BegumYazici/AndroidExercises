package com.example.android.guesstheword.screens.game

import android.os.CountDownTimer
import android.text.format.DateUtils
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    private lateinit var wordList: MutableList<String>

    private val _word = MutableLiveData<String>()
    val word: LiveData<String> = _word

    val wordHint = Transformations.map(word) { word ->
        val randomPosition = (1..word.length).random()
        "Current word has a ${word.length} letters and " +
                "\n The letter at position $randomPosition is ${word.get(randomPosition - 1).toUpperCase()}"
    }

    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    private val _eventGameFinish = MutableLiveData<Boolean>()
    val eventGameFinish: LiveData<Boolean>
        get() = _eventGameFinish

    private val timer: CountDownTimer

    private val _currentTime = MutableLiveData<Long>()
    val currentTime: LiveData<Long>
        get() = _currentTime

    val currentTimeString = Transformations.map(currentTime) { time ->
        DateUtils.formatElapsedTime(time)   //MM:SS string format
    }

    init {
        _word.value = ""
        _score.value = 0
        resetList()
        nextWord()
        Log.i("GameViewModel", "GameViewModel created!")

        timer = object: CountDownTimer(COUNTDOWN_TIME, ONE_SECOND) {

            override fun onTick(millisUntilFinished: Long) {
                _currentTime.value = millisUntilFinished / ONE_SECOND
            }

            override fun onFinish() {
                _currentTime.value = DONE
                onGameFinish()
            }
        }
        timer.start()
    }

    private fun resetList() {
        wordList = mutableListOf("queen", "hospital", "basketball", "cat", "change", "snail", "soup", "calendar",
                "sad", "desk", "guitar", "home", "railway", "zebra", "jelly", "car", "crow", "trade", "bag",
                "roll", "bubble")
        wordList.shuffle()
    }

    private fun nextWord() {
        if (wordList.isEmpty()) {   //liste bittiğinde kelimeleri tekrar karıştır ve kullanıcıya göster
            resetList()
        } else {
            //Select and remove a word from the list
            _word.value = wordList.removeAt(0)
        }
    }

    //süre bittiğinde; 0sn olduğunda ve kullanıcı 'END GAME' butonuna bastıgında bu fonk çağrılır.
    fun onGameFinish() {
        _eventGameFinish.value = true
    }

    fun onSkip() {
        _score.value = (score.value)?.minus(1)
        nextWord()
    }

    fun onCorrect() {
        _score.value = (score.value)?.plus(1)
        nextWord()
    }

    //oyunun bitiş live datasını tekrardan false çekip sıfırlıyoruz aslında.
    fun onGameFinishComplete() {
        _eventGameFinish.value = false
    }

    override fun onCleared() {
        super.onCleared()  //tüm kaynaklar temizlenir bu methodla.
        Log.i("GameViewModel", "GameViewModel destroyed!")
        timer.cancel()   //cancel the timer to avoid memory leaks.
    }

    companion object {
        //time when the game is over
        private const val DONE = 0L
        //Countdown time interval
        private const val ONE_SECOND = 1000L  //1sn
        //Total time for the game
        private const val COUNTDOWN_TIME = 60000L  //60sn
    }
}