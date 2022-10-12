package com.example.madpractical2_20012011035

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun showMessage(msg: String) {
        Log.i(TAG, msg)
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }
        override fun onStart() {
        super.onStart()
        showMessage("on start is called")
    }
    override fun onResume() {
        super.onResume()
        showMessage("on resume is called")
    }
}