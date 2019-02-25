package com.jamian.fragmentcommunication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.jamian.fragmentcommunication.R
import com.jamian.fragmentcommunication.viewmodel.CommonViewModel
import kotlinx.android.synthetic.main.fragment_one.*

class FragmentOne: Fragment(){

    private lateinit var model: CommonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_one,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        model = activity?.run {
            ViewModelProviders.of(this).get(CommonViewModel::class.java)
        }!!

        model.data.observe(this, Observer {
            tv_fragmentone.text = it
        })
    }

}