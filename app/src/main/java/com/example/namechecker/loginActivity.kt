package com.example.namechecker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class loginActivity : AppCompatActivity() {
    private val email: String = "geliashvili@gmail.com"
    private val password: String = "sworiparoli"
    lateinit var emailView: EditText
    lateinit var passwordView: EditText
    lateinit var button: Button
    lateinit var signUpButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailView = findViewById(R.id.username)
        passwordView = findViewById(R.id.pass)
        button = findViewById(R.id.logIn)
        signUpButton = findViewById(R.id.signUp)

        button.setOnClickListener{

            val enteredEmail: String = emailView.text.toString()
            val enteredPassword: String = passwordView.text.toString()
            val myToast = Toast.makeText(this,"Welcome Ioseb",Toast.LENGTH_SHORT)
            if (enteredEmail == email && enteredPassword == password){
                myToast.show()
            }
        }

        signUpButton.setOnClickListener{
            val intent = Intent(this, SingUpActivity::class.java)
            startActivity(intent)
        }

    }
}