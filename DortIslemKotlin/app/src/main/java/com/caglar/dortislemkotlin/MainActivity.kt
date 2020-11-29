package com.caglar.dortislemkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
var sayi1:Int?=null
var sayi2:Int?=null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "Hoşgeldiniz",  Toast.LENGTH_LONG).show()
    }
    fun topla(view: View) {
        sayi1=textSayi1.text.toString().toIntOrNull()
        sayi2=textSayi2.text.toString().toIntOrNull()
        if (sayi1!=null && sayi2!=null){
            textSonuc.text="Sonuç : ${sayi1!!+ sayi2!!}"
        }else{
            textSonuc.text="Hatalı sayı girdiniz."
            Toast.makeText(applicationContext, "HATA!!", Toast.LENGTH_SHORT).show()
        }

    }
    fun cikar(view: View) {
        sayi1=textSayi1.text.toString().toIntOrNull()
        sayi2=textSayi2.text.toString().toIntOrNull()
        if (sayi1!=null && sayi2!=null){
            textSonuc.text="Sonuç : ${sayi1!!- sayi2!!}"
        }else{
            textSonuc.text="Hatalı sayı girdiniz."
            Toast.makeText(applicationContext, "HATA!!", Toast.LENGTH_SHORT).show()
        }
    }
    fun carp(view: View) {
        sayi1=textSayi1.text.toString().toIntOrNull()
        sayi2=textSayi2.text.toString().toIntOrNull()
        if (sayi1!=null && sayi2!=null){
            textSonuc.text="Sonuç : ${sayi1!!* sayi2!!}"
        }else{
            textSonuc.text="Hatalı sayı girdiniz."
            Toast.makeText(applicationContext, "HATA!!", Toast.LENGTH_SHORT).show()
        }
    }
    fun bolme(view: View) {
        sayi1=textSayi1.text.toString().toIntOrNull()
        sayi2 =textSayi2.text.toString().toIntOrNull()
        if (sayi1!=null && sayi2!=null){

            textSonuc.text="Sonuç : ${sayi1!!.toDouble()/ sayi2!!.toDouble()}"
        }else{
            textSonuc.text="Hatalı sayı girdiniz."
            Toast.makeText(applicationContext, "HATA!!", Toast.LENGTH_SHORT).show()
        }
    }
}