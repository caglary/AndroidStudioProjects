package com.caglar.myapplication

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    lateinit var sharedPreferences: SharedPreferences
    var alinanKullanici:String?=null
    var alinanaParola:String?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        prin


        sharedPreferences=this.getSharedPreferences("com.caglar.myapplication",Context.MODE_PRIVATE)

        object : CountDownTimer(10000,1000){
            override fun onTick(millisUntilFinished: Long) {
                textView.text="${millisUntilFinished/1000}"

            }

            override fun onFinish() {
                textView.text="0"
            }

        }.start()

        btnSave.setOnClickListener {
            val userName =editTextUserName.text.toString()
            val password=editTextPassword.text.toString()

                if (userName=="" || password==""){
                    Toast.makeText(this, "Alanları doldurun", Toast.LENGTH_LONG).show()
                }
                else {
                    parolaKaydet(userName,password)

                }

            alinanKullanici = sharedPreferences.getString("kullanici","ds")
            alinanaParola=sharedPreferences.getString("parola","")
            if ( alinanKullanici!=null || alinanaParola!=null){
                txt.text=" $alinanKullanici - $alinanaParola"
            }

            }
    }

    override fun onStart() {
        super.onStart()
        println("Execute onStart")
    }

    override fun onResume() {
        super.onResume()
        println("Execute onResume")

    }

    override fun onPause() {
        super.onPause()
        println("Execute onPause")

    }

    override fun onStop() {
        super.onStop()
        println("Execute onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        println("Execute onDestroy")

    }
    fun parolaKaydet(KullaniciAdi:String,Parola:String){

        sharedPreferences.edit().putString("kullanici",KullaniciAdi).apply()
        sharedPreferences.edit().putString("parola",Parola).apply()



    }

}







