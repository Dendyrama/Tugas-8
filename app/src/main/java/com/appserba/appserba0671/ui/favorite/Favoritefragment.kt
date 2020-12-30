package com.appserba.appserba0671.ui.favorite

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appserba.appserba0671.R

class Favoritefragment : Fragment() {

    companion object {
        fun newInstance() = Favoritefragment()
    }

    private lateinit var viewModel: FavoritefragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_favorite, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FavoritefragmentViewModel::class.java)
        // TODO: Use the ViewModel
    }

}