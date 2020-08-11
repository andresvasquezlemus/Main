package com.example.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // Pregunta 3
        var name=" Andres Vasquez"
        val resp1= "Mi nombre es $name"
        Log.d("3", resp1)
        //println (Resp1)

        //Pregunta4y5
        var num1= 10
        var num2= 20
        var num3= 30


        var resultado = num1 + num2 + num3
        //println("$num1 + $num2 + $num3 = $resultado")
        Log.d("4", "El Resultado es $resultado")

        //Pregunta6y7
        var examString ="Arataka Reigen"
        var exaChar='A'

        //Pregunta8
        //println("La Variable ExaString tiene ${examString.count()} caracteres")
        Log.d("8", "La Variable ExaString tiene ${examString.count()} caracteres")
        exaChar='V'

        //Pregunta9y10
        var varFloat: Float= 1.05f

        //Pregunta11y12
        val byteMax = Byte.MAX_VALUE
        val shortMax = Short.MIN_VALUE
        val intMin = Int.MIN_VALUE
        val longMin = Long.MIN_VALUE
        //println("El Valor Maximo de Int es $byteMax y de Short es $shortMax")
        //println("El Valor Minimo de Byte es $intMin y de Short es $longMin")

        //Pregunta13
        val bool = true
        println("El Valor de la Variable es $bool")

        //Pregunta14
        var valorNeto = 100
        obtieneIva(valorNeto)
        var totalChar=0
        imprimiendoParametros()
        println("El Total es $totalChar")





    }
        fun obtieneIva(valorNeto :Int):Double {
            return valorNeto*0.19
            Log.d("14", "valorNeto*0.19")
    }

        fun imprimiendoParametros(): Int {
            var param1 ="Andres Vasquez"
            var param2="Luis Lemus"
            var charPal1= param1.count()
            var charPal2= param2.count()
            var totalChar= charPal1 + charPal2
            return totalChar
        }
}