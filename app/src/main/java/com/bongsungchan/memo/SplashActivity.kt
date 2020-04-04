package com.bongsungchan.memo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.bongsungchan.memo.MainFolder.MainActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        supportActionBar?.let {
            it.hide()
        }

        Handler().postDelayed({

            startActivity(Intent(applicationContext,MainActivity::class.java).setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP))
            finish()
        },1300)

    }
}
