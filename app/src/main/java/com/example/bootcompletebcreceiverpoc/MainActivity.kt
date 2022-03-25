package com.example.bootcompletebcreceiverpoc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val count = getPref().getInt("count", -1)
        toast("current Count = $count")
    }
}