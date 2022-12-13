package com.example.kal

import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val plusText: TextView = findViewById<TextView>(R.id.textView4)
        val numText= findViewById<TextView>(R.id.textView2)
        val seekNum= findViewById<SeekBar>(R.id.seekBar)
        val plusButton= findViewById<Button>(R.id.button)
        var i = 0
        var num = ""
        numText.text = i.toString()
        plusText.text = num.toString()
        plusButton.setOnClickListener {
            num = plusText.text.toString()
            i+=num.toInt()
            numText.text = i.toString()
        }
        seekNum.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                plusText.setText(progress.toString())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })
    }
}