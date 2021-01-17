package com.belajarandroid.navdrawer.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.belajarandroid.navdrawer.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    //View bindin
    private val Binding by lazy { ActivityMain2Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(Binding.root)
    }
}