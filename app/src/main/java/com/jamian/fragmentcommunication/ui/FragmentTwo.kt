package com.jamian.fragmentcommunication.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.jamian.fragmentcommunication.R
import com.jamian.fragmentcommunication.utils.listener
import com.jamian.fragmentcommunication.viewmodel.CommonViewModel
import kotlinx.android.synthetic.main.fragment_two.*
import java.lang.Exception

class FragmentTwo: Fragment(){

    private lateinit var model:CommonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_two,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        model = activity?.run {
            ViewModelProviders.of(this).get(CommonViewModel::class.java)
        }!!

        et_fragmenttwo.listener {
            model.editData(it)
        }

    }

}