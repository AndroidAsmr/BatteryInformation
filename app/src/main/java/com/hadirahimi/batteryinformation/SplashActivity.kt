package com.hadirahimi.batteryinformation

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hadirahimi.batteryinformation.databinding.ActivitySplashBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity()
{
    private lateinit var binding : ActivitySplashBinding
    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        GlobalScope.launch {
            delay(3000)//wait for 3 seconds
            startActivity(Intent(this@SplashActivity,MainActivity::class.java))
            finish()
        }
    }
}