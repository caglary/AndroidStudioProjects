package com.caglar.superkahramanprojesi

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
    var isim:String=""
    var yas:Int?=null
    var meslek:String=""
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    @SuppressLint("SetTextI18n")
    fun superKahramanYap(view: View){

        isim=isimText.text.toString()
        yas=yasText.text.toString().toIntOrNull()
        meslek=meslekText.text.toString()
        if (yas==null){
            sonucText.text="Doğru yaşı giriniz."
        }else{
            val superkahraman=Superkahraman(isim,yas!!,meslek)
            sonucText.text="İsim: ${superkahraman.isim} " +
                    "Yaş: ${superkahraman.yas} " +
                    "Meslek: ${superkahraman.meslek}"
        }


    }
}