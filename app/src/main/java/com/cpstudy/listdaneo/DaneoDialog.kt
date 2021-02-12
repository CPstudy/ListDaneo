package com.cpstudy.listdaneo

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import androidx.databinding.DataBindingUtil
import com.cpstudy.listdaneo.databinding.DialogDaneoBinding

class DaneoDialog(context: Context) : Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: DialogDaneoBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.dialog_daneo, null, false)
        setContentView(binding.root)
    }
}