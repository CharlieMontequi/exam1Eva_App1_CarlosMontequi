package com.example.app1_carlosm

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enviar = findViewById<Button>(R.id.bt_enviar)
        enviar.setOnClickListener {
           if(/*la funciones correcta*/ 1==1){
               // envia a la otra apliación
               val intent = Intent(Intent.ACTION_SEND,)
           }else{
               //muestra mensaje de solo numeros
           }
          val mensaje = AlertDialog.Builder(this).setMessage("Se habría comprobado el texto y si es correcto te ofrece abrir aplicaciones")
            mensaje.show()
        }



    }
    // comprobar los numeros

}