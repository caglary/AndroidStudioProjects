package com.caglar.siniflarvefonksiyonlar

class SuperKahraman//Constructor
    (var isim: String, var yas: Int, var meslek: String) {

    init {
        println("Constructor invoked")
    }
    private var sacininRengi="Sarı"
    public fun testFonksiyonu(){
        println("test")
    }

    //Getter
    fun sacRenginiAl():String{
        return this.sacininRengi
    }
    //Setter
    /*
    fun sacRengiDegistir(){
        this.sacininRengi = "Yesil"
    }
    * */



}