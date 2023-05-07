package com.example.day20custo

import android.app.Dialog
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var dialog : Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myButton = findViewById<Button>(R.id.btnclick)

        dialog = Dialog(this)
        dialog.setContentView(R.layout.customize_alertbox)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))

        val btngood = dialog.findViewById<Button>(R.id.btngood)
        val btnfeedback = dialog.findViewById<Button>(R.id.btnfeedback)

        btngood.setOnClickListener {
            dialog.dismiss()
        }
        btnfeedback.setOnClickListener {
            Toast.makeText(this, "Thanks for feedback", Toast.LENGTH_SHORT).show()
        }

        myButton.setOnClickListener {
            dialog.show()
        }
    }
}