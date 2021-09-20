package com.example.myapplicationwts

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast

class StatusFragment : Fragment() {
    var mystatus: ImageView? = null
    companion object {
        fun newInstance() = StatusFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       var root = inflater.inflate(R.layout.status_fragment, container, false)
        mystatus = root.findViewWithTag(R.id.statusview)
        mystatus!!.setOnClickListener{
            Toast.makeText(context,"u clicked me", Toast.LENGTH_LONG).show()
        }
       return root
    }
}
//launch a file picker select an image and display it on an image view