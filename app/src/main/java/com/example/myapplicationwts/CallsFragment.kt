package com.example.myapplicationwts

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.Toast

class CallsFragment : Fragment() {
    var myChats:ListView? = null

    companion object {
        fun newInstance() = CallsFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root = inflater.inflate(R.layout.calls_fragment, container, false)

            myChats = root.findViewById(R.id.listview)
            myChats!!.setOnItemClickListener { adapterView, view, i, l ->
                var name = adapterView.getItemAtPosition(i).toString()
                Toast.makeText(context, "$name has been clicked",Toast.LENGTH_LONG).show()
            }


        return root
    }


}
