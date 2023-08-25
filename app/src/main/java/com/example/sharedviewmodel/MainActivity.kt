package com.example.sharedviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var frag1 = Frag1()
        var frag2 = Frag2()
        val fm = supportFragmentManager
        fm.beginTransaction().replace(R.id.frag1, frag1).commit()
        fm.beginTransaction().replace(R.id.frag2, frag2).commit()

    }
}