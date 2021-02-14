package com.cpstudy.listdaneo

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialog
import androidx.databinding.DataBindingUtil
import com.cpstudy.listdaneo.databinding.DialogDaneoBinding

class DaneoDialog(context: Context, val onSuccess: (Daneo) -> Unit) : AppCompatDialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: DialogDaneoBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.dialog_daneo, null, false)
        setContentView(binding.root)

        binding.btnApply.setOnClickListener {
            val english = binding.edtEnglish.text.toString()
            val korean = binding.edtKorean.text.toString()
            if(english == "" || korean == "") {
                Toast.makeText(context, "공백이 있습니다.", Toast.LENGTH_LONG).show()
            } else {
                val daneo = Daneo(english, korean)
                onSuccess(daneo)
                dismiss()
            }
        }

        binding.btnCancel.setOnClickListener {
            dismiss()
        }
    }
}