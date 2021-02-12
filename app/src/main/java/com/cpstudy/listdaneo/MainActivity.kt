package com.cpstudy.listdaneo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.cpstudy.listdaneo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val list = arrayListOf<Daneo>(
            Daneo("apple", "사과"),
            Daneo("banana", "바나나"),
            Daneo("cat", "고양이"),
            Daneo("dog", "개"),
            Daneo("elephant", "코끼리")
    )

    private val binding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val model: MainViewModel by viewModels()

        binding.viewmodel = model
        val adapter = MainAdapter(list)
        binding.recyclerView.adapter = adapter

        binding.button.setOnClickListener {
            val dialog: DaneoDialog = DaneoDialog(this)
            dialog.show()
        }
    }
}