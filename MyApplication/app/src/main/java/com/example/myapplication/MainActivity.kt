package com.example.myapplication;

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import android.app.Activity
import android.content.Intent

class MainActivity : AppCompatActivity() {

    lateinit var listButton: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        // Definir o layout que será utilizado nesta atividade
        setContentView(R.layout.activity_main)

        // Associar os campos de EditText e o Button com o layout XML
        val usernameEditText: EditText = findViewById(R.id.username)
        val passwordEditText: EditText = findViewById(R.id.password)
        val loginButton: Button = findViewById(R.id.listButton)

        // Configurar a ação do botão de login
        loginButton.setOnClickListener {
            // Capturar o texto digitado nos campos de usuário e senha
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Exibir uma mensagem ao usuário com as informações capturadas
            if (username.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Usuário: $username\nSenha: $password", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show()
            }

            listButton = findViewById(R.id.listButton)

            listButton.setOnClickListener{
                val intent = Intent(this, perfilActivity::class.java)
                startActivity(intent)
            }

        }
    }
}
