package com.saiful.firstkotlinapp.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

import com.saiful.firstkotlinapp.R

/**
 * Created by user- on 25-Nov-16.
 */

class SplashScreenActivity : AppCompatActivity() {

    // Splash screen timer
    private val SPLASH_TIME_OUT = 2500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed(/*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

                {
                    // This method will be executed once the timer is over
                    // Start your app main activity
                    val i = Intent(this@SplashScreenActivity, MainActivity::class.java)
                    startActivity(i)

                    // close this activity
                    finish()
                }, SPLASH_TIME_OUT.toLong())
    }

    override fun onBackPressed() {

    }

    /*companion object {

        // Splash screen timer
        private val SPLASH_TIME_OUT = 2500
    }*/
}
