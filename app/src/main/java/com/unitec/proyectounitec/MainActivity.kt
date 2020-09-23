package com.unitec.proyectounitec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//El punto de partida de toda app es la MainActivity (Presenter)
/*
public lass TarjetaCredito extends Tarjeta{
public TarjetaCredito(){
super();
}
}
    : es herencia xD xD
*/
//AppCompatActivity(): Android 10 hasta Android 5 que fue la que escogimos
// fun es una palabra reservada para el metodo

class MainActivity : AppCompatActivity() {
    //savedInstanceState: Bundle? : nombre y tipo de dato
    override fun onCreate(nombre: Bundle?) {
        super.onCreate(nombre)
        //     Carpeta res/layout/activity main
        setContentView(R.layout.ejemplito)
    }
}
