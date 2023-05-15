package com.example.ToDoList

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.room.Room
import com.example.loyaltyy.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Splashscreen : AppCompatActivity() {
    private lateinit var database: myDatabase
    lateinit var mIvSplashScreen: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        database = Room.databaseBuilder(
            applicationContext,myDatabase::class.java,"To_Do"
        ).build()
        GlobalScope.launch {
            DataObject.listdata=database.dao().getTasks() as MutableList<CardInfo>
        }
        mIvSplashScreen = findViewById(R.id.mIvSplashScreen)
        mIvSplashScreen.alpha = 0f
        Handler(Looper.getMainLooper()).postDelayed({
            mIvSplashScreen.animate().setDuration(1500).alpha(1f).withEndAction {
                val i = Intent(this, LoginActivity::class.java)
                startActivity(i)
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                finish()
            }

        },2000)
    }
}