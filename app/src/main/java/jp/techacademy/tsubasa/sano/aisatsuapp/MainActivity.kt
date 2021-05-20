package jp.techacademy.tsubasa.sano.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.text = "ボタン"
        button1.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        showTimePickerDialog()
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                    if(hour in 2..9){
                    textView.text = "おはよう"
                } else if(hour in 10..17){
                    textView.text = "こんにちは"
                } else {
                    textView.text ="こんばんは"
                }
                },
                13, 0, true)
        timePickerDialog.show()
    }
}
