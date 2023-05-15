package com.example.ToDoList

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.loyaltyy.R
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    lateinit var loginText:TextView
    lateinit var edtEmail:EditText
    lateinit var edtPassword:EditText
    lateinit var btnLogin:Button
    lateinit var TvRegisterText:TextView
    lateinit var mAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginText = findViewById(R.id.mTvLoginText)
        edtEmail = findViewById(R.id.mEdtEmail)
        edtPassword = findViewById(R.id.mEdtPassword)
        btnLogin = findViewById(R.id.mBtnLogin)
        TvRegisterText = findViewById(R.id.mTvRegisterText)
        mAuth = FirebaseAuth.getInstance()

        TvRegisterText.setOnClickListener{
            var reg = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(reg)
        }

        btnLogin.setOnClickListener {
            var email = edtEmail.text.toString().trim()
            var password = edtPassword.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()){
                // message displayed for empty fields
                Toast.makeText(this, "Fill all inputs", Toast.LENGTH_SHORT).show()
            }else{
                //proceed to save data
                mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener{
                    if (it.isSuccessful){
                        Toast.makeText(this, "User logged in successfully", Toast.LENGTH_SHORT).show()
                        startActivity(Intent(this,MainActivity::class.java))
                        finish()
                    }
                }
            }
        }
    }
}