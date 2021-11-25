package com.example.namechecker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SingUpActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var firstName: EditText
    lateinit var lastName: EditText
    lateinit var password: EditText
    lateinit var userName: EditText
    lateinit var registerButton: Button
    lateinit var loginButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up)

        email = findViewById(R.id.email)
        firstName = findViewById(R.id.firstname)
        lastName = findViewById(R.id.lastname)
        password = findViewById(R.id.pass)
        userName = findViewById(R.id.username)
        registerButton = findViewById(R.id.signUpButton)
        loginButton = findViewById(R.id.logInButton)

        loginButton.setOnClickListener{

            var userNameText: String = userName.text.toString()

            val intent = Intent(this, loginActivity::class.java)
            intent.putExtra("userName", "iosebi")
            startActivity(intent)
        }

        registerButton.setOnClickListener{
            val userNameText: String = userName.text.toString()

            if(userNameText != ""){
                val intent = Intent(this, loginActivity::class.java)
                intent.putExtra("userName", userNameText)
                startActivity(intent)
            }else{
                userName.error = "Username is Required"
            }
        }

    }
}