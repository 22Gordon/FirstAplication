package com.example.firstaplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

//Master push

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("****TAG", "onCreate")


    }

    override fun onPause() {
        super.onPause()
        Log.d("****TAG", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("****TAG", "onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("****TAG", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("****TAG", "onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("****TAG", "onDestroy")
    }

    fun clickbutton(view: View) {
        val text = findViewById<TextView>(R.id.b1)
        val edit1 = findViewById<EditText>(R.id.b4)
        val edit2 = findViewById<EditText>(R.id.b5)
        val edit3 = findViewById<EditText>(R.id.b6)

        val valor1 = edit1.text.toString().toInt()
        val valor2 = edit2.text.toString().toInt()
        val valor3 = edit3.text.toString().toInt()

        val resultado = valor1 * valor2 + valor3

        text.setText("O resultado de multiplicar $valor1 pelo $valor2 e somar o $valor3 é igual a $resultado")

    }

}
