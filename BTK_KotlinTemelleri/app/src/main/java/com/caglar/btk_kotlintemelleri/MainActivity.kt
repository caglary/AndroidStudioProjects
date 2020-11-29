package com.caglar.btk_kotlintemelleri

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Daha sonra değiştirilmeyecek bir değişken tanımlıyoruz.
        val meetGreat:String ="Merhaba"

        //Logcat ekranına yazı yazdırmak için println() kullanılır.
        println(meetGreat)
        println(5*10)
        println(5*5)

        //Değişken Nedir?
        println("**********Değişkenler********")
        var a=5
        var b=10

        println(a*b)

        var yas=50
        println("Yaş: "+yas/5*8)
        yas=60
        println("Güncellenen Yaş: "+yas/5*8)

        //Sabitler
        println("**********Sabitler********")
        //camelCase kullanımı yapıyoruz.
        val x=10
        val pi=3.14
        println(pi*2)
        println("yaş * Sabit : "+yas*x)
        val yasSonucu=yas*x
        println(yasSonucu)

        //Int Veri Tipi
        println("**********Int********")
        /*
        *
        *   Type	Size (bits)	            Min value	                             Max value
            Byte	    8	                    -128	                                127
            Short	    16	                    -32768	                                32767
            Int	        32	            -2,147,483,648 (-231)	                2,147,483,647 (231 - 1)
            Long        64	            -9,223,372,036,854,775,808 (-263)	9,223,372,036,854,775,807 (263 - 1)
        *

        * */
        //defining
        val benimIntegerim:Int
        //Initializing
        benimIntegerim=5

        var yeniInteger:Int=20

        println(benimIntegerim/2)

        //Long Veri Tipi
        println("**********Long********")

        var benimLong:Long=100
        benimLong=1000000000000000
        println("Benim Long : "+benimLong)

        //Double - Float
        println("**********Double-Float********")

        println(pi/2)

        var floatPi:Float=3.14f
        println("float pi "+floatPi/2)
        var yeniDouble:Double=5.0
        println("Double 5/2 : "+yeniDouble/2)

        //String
        println("**********String********")
        val benimString="Benim yeni metin"
        var metinUzunluk=benimString.length
        println("Metin Uzunluk: "+metinUzunluk)
        var isim="Çağlar"
        var soyIsim="Yurdakul"
        val tamIsim=isim+" "+soyIsim
        println(meetGreat+","+tamIsim)
        val yeniBirString:String
        yeniBirString="10"
        val baskaBirString="20"
        println(yeniBirString+baskaBirString)

        //Boolen
        println("**********Boolen********")
        var benimBoolen=true
        benimBoolen=false
        println(3<5)
        println(3!=3)

        //Veri Dönüştürme
        println("**********Veri Dönüştürme********")
        val benimInt=10
        val benimLongaCevrilenInt=benimInt.toLong()
        println(benimLongaCevrilenInt)
        var kullaniciGirdisi="50"
        var kullaniciInt=kullaniciGirdisi.toInt()
        println(kullaniciInt/2)

        //Array -Dizi
        println("**********Diziler********")
        val stringOrnegi="buse"

        val benimDizi=arrayOf(stringOrnegi,"caglar","Yurdakul","Ahmet","Eda")
        //index
        println(benimDizi[1])
        println(benimDizi.get(0))
        benimDizi[0]="Eda"
        println(benimDizi.get(0))
        benimDizi.set(0,"Muhammed Emin")
        println(benimDizi[0])

        val numaraDizisi= doubleArrayOf(1.0,2.0,3.5)
        println(numaraDizisi.get(1))
        val karisikDizi= arrayOf("caglar",24,true)
        println(karisikDizi.get(2))

        //ArrayList
        println("**********ArrayList********")
        val isimListesi= arrayListOf<String>("caglar")
        isimListesi.add(1,"yurdakul")
        isimListesi.set(0,"Caglar")
        isimListesi.set(1,"YURDAKUL")
        println(isimListesi.get(0)+" "+isimListesi.get(1))
        isimListesi.add("Eda")
        println(isimListesi.get(2))

        val karisikArrayList= arrayListOf<Any>()
        karisikArrayList.add("Caglar")
        karisikArrayList.add(1)
        karisikArrayList.add(true)

        val intArrayList=ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(6)
        intArrayList.add(12)
        println(intArrayList.get(2))

        //Set
        DersBaslik("Set")
        val ornekDizi= arrayOf(7,8,8,8,9,9,9,8,8,7,6,5,5,4)
        println("index 2: ${ornekDizi[2]}")
        println("index 3: ${ornekDizi[3]}")
        println(ornekDizi.size)

        val benimSet= setOf<Int>(7,8,8,8,9,9,9,8,8,7,6,5,5,4)
        println(benimSet.size)

        //For Each
        benimSet.forEach{
            println(it)
        }

        val digerSet= HashSet<String>()
        digerSet.add("Caglar")
        digerSet.add("Caglar")
        digerSet.add("Caglar")
        digerSet.add("Yurdakul")

        digerSet.forEach{
            println(it)
        }

        //Map
        DersBaslik("Map")

        //Key-Value Pairing
        val yemekDizisi= arrayOf("Elma","Et","Tavuk")
        val kaloriDizisi= arrayOf(100,200,300)
        println("${yemekDizisi[0]}'nın kalorisi ${kaloriDizisi[0]}")
        val yemekKaloriMap= hashMapOf<String,Int>()
        yemekKaloriMap.put("Elma",100)
        yemekKaloriMap.put("Et",200)
        yemekKaloriMap.put("Tavuk",300)

        println("Elmanın Kalorisi ${yemekKaloriMap.get("Elma")}")

        val benimMapim= hashMapOf<String,String>()
        benimMapim.put("Örnek","Değer")

        val yeniMap= hashMapOf<String,Int>("Atıl" to 50,"caglar" to 100)
        println(yeniMap.get("caglar"))

        //Matematiksel İşlemler
        DersBaslik("Matematiksel İşlemler")

        var sayi=15
        println(sayi)
        sayi=sayi+1
        println(sayi)
        sayi++
        println(sayi)

        var digerSayi=10

        println(digerSayi<sayi && 2>3)
        println(digerSayi<sayi || 2>3)
        println(digerSayi<sayi)

        println(8+7)
        println(10-4)

        //Remainder
        println("11 in 3 e bölümünden kalan : ${11%3}")

        //if statements
        DersBaslik("If Statements")
        val skor=15
        if (skor<10){
            println("Oyunu Kaybettin!")
        }else if (skor>=10&&skor<20){
            println("Skorun 10 ve 20 arasında, çok iyi skor aldın")
        }else if(skor>=20 && skor<30){
            println("Skorun 30'un üzerinde, efsane oynadın")
        }

        //When
        DersBaslik("When")
        var notRakami=5
        var notStringi=""
  /*      if (notRakami==0){
            notStringi="Geçersiz not"
        }else if(notRakami==1){
            notStringi="Zayıf"
        }else if(notRakami==2){
            notStringi="Kötü"
        }else if(notRakami==3){
            notStringi="Orta"
        }else if (notRakami==4){
            notStringi="iyi"
        }else if (notStringi){
            notStringi="Pekiyi"
        }
*/
        when(notRakami){
            0 -> notStringi="Geçersiz Not"
            1 -> notStringi="Zayıf"
            2 -> notStringi="Kötü"
            3 -> notStringi="Orta"
            4 -> notStringi="İyi"
            else -> notStringi="Pekiyi"
        }
        println(notStringi)

        //Döngüler
        DersBaslik("For Loop")
        val baskaBirDizi= arrayOf(5,10,15,20,25,30)
        val q =baskaBirDizi[0]/5+3
        println(q)
        println("Döngü başladı")
        for (numara in baskaBirDizi){
            println("${baskaBirDizi.indices} ...: "+numara/5+3)
        }
        println("Döngü Bitti")
        for (index in baskaBirDizi.indices){
            println(baskaBirDizi[index])
        }

        for(b in 0..10){
            println(b)
        }

        val benimDigerStrinDizim=ArrayList<String>()
        benimDigerStrinDizim.add("Caglar")
        benimDigerStrinDizim.add("yurdakul")
        for (str in benimDigerStrinDizim){
            println(str)
        }

        //While
        DersBaslik("While Loop")

        var i=0
        if (i<10){
            println(i)

        }

        while (i<10){
            println(i)
            i++
        }


    }
    fun DersBaslik(string: String){

        println("**********"+string+"********")
    }
}