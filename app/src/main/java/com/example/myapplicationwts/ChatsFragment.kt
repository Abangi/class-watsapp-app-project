package com.example.myapplicationwts

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast

class ChatsFragment : Fragment() {
    var mypicture:ImageView? = null

    companion object {
        fun newInstance() = ChatsFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root =  inflater.inflate(R.layout.chats_fragment, container, false)
        mypicture = root.findViewWithTag(R.id.imageview)
        mypicture!!.setOnClickListener{
            Toast.makeText(context,"u clicked me",Toast.LENGTH_LONG).show()
        }
        return  root
    }



}