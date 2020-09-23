package com.example.android.guesstheword.screens.game

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.android.guesstheword.R
import com.example.android.guesstheword.databinding.GameFragmentBinding

class GameFragment : Fragment() {

    private lateinit var viewModel: GameViewModel
    private lateinit var binding: GameFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        Log.i("GameFragment", "Called ViewModelProviders.of")
        viewModel = ViewModelProvider(this, ViewModelFactory()).get(GameViewModel::class.java)

        binding = DataBindingUtil.inflate(inflater, R.layout.game_fragment, container, false)

        //Data binding with viewModel
        binding.gameViewModel = viewModel

        //Data binding with Live Data
        binding.lifecycleOwner = viewLifecycleOwner

        viewModel.eventGameFinish.observe(viewLifecycleOwner, Observer { hasFinished ->
            if (hasFinished) {   //hasFinished=_eventGameFinish eğer true ise yani oyun bitsin isteniliyorsa
                gameFinished()
            }
        })
        return binding.root
    }

    private fun gameFinished() {
        Toast.makeText(context, "Game has just finished", Toast.LENGTH_SHORT).show()
        val action = GameFragmentDirections.actionGameToScore()
        action.score = viewModel.score.value ?: 0
        findNavController().navigate(action)
        // NavHostFragment.findNavController(this).navigate(action)

        viewModel.onGameFinishComplete()
    }
}

//View model const parametre almadıgı için buna gerek yok aslında...
//...viewmodel den obje olustururken ikinci parametreye null geçilebilir.
class ViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass == GameViewModel::class.java) {
            return GameViewModel() as T
        } else {
            throw IllegalArgumentException("modelClass")
        }
    }
}