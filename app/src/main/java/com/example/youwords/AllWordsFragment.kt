package com.example.youwords

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.youwords.data.WordViewModel

import com.example.youwords.databinding.FragmentAllWordsBinding




class AllWordsFragment : Fragment() {
    private var binding: FragmentAllWordsBinding? = null
    private lateinit var wordviewmodel: WordViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        wordviewmodel = ViewModelProvider(this).get(WordViewModel::class.java)
        val fragmentBinding = FragmentAllWordsBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            wordViewModel=wordviewmodel
            allwordsFragment=this@AllWordsFragment
        }


    }

}