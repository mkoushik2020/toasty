package com.mkoushik2020.toasty


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast

class CustomToast private constructor() {
    companion object {
        fun showToast(context: Context, message: String, duration: Int = Toast.LENGTH_SHORT) {
            val inflater = LayoutInflater.from(context)
            val layout: View = inflater.inflate(R.layout.toast_layout, null)

            val textView: TextView = layout.findViewById(R.id.toast_message)
            textView.text = message

            with(Toast(context)) {
                setDuration(duration)
                setView(layout)
                show()
            }
        }
    }
}