package com.example.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = btnCalcular
        val txtResultado = txtResultado

        btnCalcular.setOnClickListener {
            val nota1 =Integer.parseInt(edtNota1.text.toString())
            val nota2 = Integer.parseInt(edtNota2.text.toString())
            val faltas = Integer.parseInt(edtFaltas.text.toString())

            val media = (nota1 + nota2)/2

            if(media >= 6 && faltas <= 10){
                txtResultado.setTextColor(Color.GREEN)
                txtResultado.setText("Aluno foi Aprovado \n" +
                        "Média: ${media} \n " +
                        "Faltas: ${faltas}")
            }else{
                txtResultado.setTextColor(Color.RED)
                txtResultado.setText("Aluno foi Reprovado \n" +
                        "Média: ${media} \n" +
                        "Faltas: ${faltas}")
            }
        }

    }
}