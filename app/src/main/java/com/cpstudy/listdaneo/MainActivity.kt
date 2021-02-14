package com.cpstudy.listdaneo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import com.cpstudy.listdaneo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val model: MainViewModel by viewModels()

        binding.viewmodel = model
        val adapter = model.daneoList.value?.let { MainAdapter(it) }
        binding.recyclerView.adapter = adapter

        binding.button.setOnClickListener {
            val dialog = DaneoDialog(this) {
                model.addDaneo(it)
            }
            dialog.show()
        }

        model.daneoList.observe(this) {
            //adapter?.notifyDataSetChanged()
        }
    }
}