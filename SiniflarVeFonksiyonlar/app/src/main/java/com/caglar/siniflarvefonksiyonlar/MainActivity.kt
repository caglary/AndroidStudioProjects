package com.caglar.siniflarvefonksiyonlar

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var j=0
        if (j==0){
            ilkFonksiyon()

        }else{
            ikinciFonksiyon()
        }

        cikarma(10,3)
        var x=toplama(3,5)
        textView.text="Sonuç : ${x}"
        button.setOnClickListener(){
            val toplamaSonucu=toplama(10,25)
            textView.text="Sonuç : ${toplamaSonucu}"
        }
        sinifCalismasi()
        nullGuvenligi()

    }

    fun ilkFonksiyon(){
        println("ilk fonksiyon çalıştırıldı.")
    }

     fun ikinciFonksiyon(){
         println("ikinci fonksiyon çağrıldı.")
     }

    //Girdi Almak
    fun cikarma(x:Int,y:Int){
        textView.text="Sonuç: ${x-y}"
    }

    //Return
    fun toplama(a:Int,b:Int):Int {
        return a+b
    }
    /*
    fun Degistir(view: View){
        val toplamaSonucu=toplama(10,25)
        textView.text="Sonuç : ${toplamaSonucu}"
    }
    */

    fun sinifCalismasi(){

        var superman=SuperKahraman("Superman",50,"Gazeteci")
        superman.testFonksiyonu()
        textView.text="Yaş : ${superman.yas}"
        println(superman.sacRenginiAl())

    }

    fun nullGuvenligi(){
        //Null, Nullability, Null Safety
        var benimStringim:String?

        benimStringim="caglar"
        var benimYasim:Int?=null
        println(benimYasim)

        // 1
        if (benimYasim!=null){
            println(benimYasim*2)
        }else{
            println("null geldi")
        }

        // 2
        // !! null olmayacak
        // ? null olabilir
        benimYasim=3
        println(benimYasim!!.minus(2))

        // Elvis
        val sonuc=benimYasim?.minus(2)?:10
        println(sonuc)

        //Let
        benimYasim?.let {
            println(it*5)
        }


    }
}