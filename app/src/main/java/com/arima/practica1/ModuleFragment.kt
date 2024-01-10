package com.arima.practica1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner


class ModuleFragment : Fragment() {
    private var selectedOption: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_module, container, false)

        val option = view.findViewById<Spinner>(R.id.spinner)

        if(option != null) {
            val adapter = context?.let{ ArrayAdapter(

                it,
                android.R.layout.simple_spinner_item,
                resources.getStringArray(R.array.options)
            )
            }
            option.adapter = adapter

            option.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                    selectedOption = position
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            }
        }
        return view
    }


}