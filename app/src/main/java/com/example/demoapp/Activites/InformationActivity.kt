package com.example.demoapp.Activites

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.demoapp.R
import kotlin.random.Random


class InformationActivity : AppCompatActivity() {


    private  var rl:RelativeLayout?=null
    private  var r2:RelativeLayout?=null
    private  var r3:RelativeLayout?=null

    private  var r4:RelativeLayout?=null
    private  var r5:RelativeLayout?=null
    private  var r6:RelativeLayout?=null

    private  var r7:RelativeLayout?=null
    private  var r8:RelativeLayout?=null
    private  var r9:RelativeLayout?=null

    private  var rt:RelativeLayout?=null
    private  var r11:RelativeLayout?=null
    private  var r12:RelativeLayout?=null

    private var toolbar: Toolbar?=null




    private var B2D:TextView?=null
    private var B2O:TextView?=null
    private var B2H:TextView?=null


    private var D2O:TextView?=null
    private var D2B:TextView?=null
    private var D2H:TextView?=null


    private var O2D:TextView?=null
    private var O2B:TextView?=null
    private var O2H:TextView?=null


    private var H2B:TextView?=null
    private var H2D:TextView?=null
    private var H2O:TextView?=null


    private var b2drandom:TextView?=null
    private var b2orandom:TextView?=null
    private var b2hrandom:TextView?=null


    private var d2brandom:TextView?=null
    private var d2orandom:TextView?=null
    private var d2hrandom:TextView?=null

    private var o2brandom:TextView?=null
    private var o2drandom:TextView?=null
    private var o2hrandom:TextView?=null

    private var h2brandom:TextView?=null
    private var h2drandom:TextView?=null
    private var h2orandom:TextView?=null




    private var b2drandomresult:TextView?=null
    private var b2orandomresult:TextView?=null
    private var b2hrandomresult:TextView?=null


    private var d2brandomresult:TextView?=null
    private var d2orandomresult:TextView?=null
    private var d2hrandomresult:TextView?=null

    private var o2brandomresult:TextView?=null
    private var o2drandomresult:TextView?=null
    private var o2hrandomresult:TextView?=null

    private var h2brandomresult:TextView?=null
    private var h2drandomresult:TextView?=null
    private var h2orandomresult:TextView?=null



    private var randomresult1text:TextView?=null
    private var randomresult1text2:TextView?=null
    private var randomresult1text3:TextView?=null

    private var randomresult1text4:TextView?=null
    private var randomresult1text5:TextView?=null
    private var randomresult1text6:TextView?=null
    private var randomresult1text7:TextView?=null
    private var randomresult1text8:TextView?=null
    private var randomresult1text9:TextView?=null
    private var randomresult1texttt:TextView?=null
    private var randomresult1text11:TextView?=null
    private var randomresult1text12:TextView?=null




    private var finalresult1:TextView?=null
    private var finalresult2:TextView?=null
    private var finalresult3:TextView?=null
    private var finalresult4:TextView?=null
    private var finalresult5:TextView?=null
    private var finalresult6:TextView?=null
    private var finalresult7:TextView?=null
    private var finalresult8:TextView?=null
    private var finalresult9:TextView?=null
    private var finalresult10t:TextView?=null
    private var finalresult11:TextView?=null
    private var finalresult12:TextView?=null




    private  val TAG = "InformationActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)




        initialfields()
        passedlayouts()

        textlistners()


        randomtextviewslistners()



    }


    private fun randomtextviewslistners()
    {
        b2drandom?.setOnClickListener {

            val list= arrayListOf("10","100","1000","10000","10000")
            val random=Random
            val dot=random.nextInt(list.count())
            b2drandomresult?.text=list[dot]


            randomresult1text?.setText(list[dot]).toString()
        }

        b2orandom?.setOnClickListener {

            val list= arrayListOf("101","1010101","110011","1000100","0000011")
            val random=Random
            val dot=random.nextInt(list.count())
            b2orandomresult?.text=list[dot]
            randomresult1text2?.setText(list[dot]).toString()
        }

        b2hrandom?.setOnClickListener {

            val list= arrayListOf("10001","1010101","1111","10001","0000011")
            val random=Random
            val dot=random.nextInt(list.count())
            b2hrandomresult?.text=list[dot]
            randomresult1text3?.setText(list[dot]).toString()
        }



        d2brandom?.setOnClickListener {

            val list= arrayListOf("68","67","78","79","56")
            val random=Random
            val dot=random.nextInt(list.count())
            d2brandomresult?.text=list[dot]
            randomresult1text4?.setText(list[dot]).toString()
        }

        d2orandom?.setOnClickListener {

            val list= arrayListOf("4446","345","654","678","768")
            val random=Random
            val dot=random.nextInt(list.count())
            d2orandomresult?.text=list[dot]
            randomresult1text5?.setText(list[dot]).toString()
        }

        d2hrandom?.setOnClickListener {

            val list= arrayListOf("99","88","11023","12445","54321")
            val random=Random
            val dot=random.nextInt(list.count())
            d2hrandomresult?.text=list[dot]
            randomresult1text6?.setText(list[dot]).toString()
        }



        o2brandom?.setOnClickListener {

            val list= arrayListOf("222","333","444","555","666")
            val random=Random
            val dot=random.nextInt(list.count())
            o2brandomresult?.text=list[dot]
            randomresult1text7?.setText(list[dot]).toString()
        }

        o2drandom?.setOnClickListener {

            val list= arrayListOf("22","33","44","55","66")
            val random=Random
            val dot=random.nextInt(list.count())
            o2drandomresult?.text=list[dot]
            randomresult1text8?.setText(list[dot]).toString()
        }

        o2hrandom?.setOnClickListener {

            val list= arrayListOf("5","6","7","4","3")
            val random=Random
            val dot=random.nextInt(list.count())
            o2hrandomresult?.text=list[dot]
            randomresult1text9?.setText(list[dot]).toString()
        }






        h2brandom?.setOnClickListener {

            val list= arrayListOf("cc","dd","eee","fff","aaa")
            val random=Random
            val dot=random.nextInt(list.count())
            h2brandomresult?.text=list[dot]
            randomresult1texttt?.setText(list[dot]).toString()
        }

        h2drandom?.setOnClickListener {

            val list= arrayListOf("aa","bb","cc","dd","ee")
            val random=Random
            val dot=random.nextInt(list.count())
            h2drandomresult?.text=list[dot]
            randomresult1text11?.setText(list[dot]).toString()
        }

        h2orandom?.setOnClickListener {

            val list= arrayListOf("f","5f","16","ef","ff")
            val random=Random
            val dot=random.nextInt(list.count())
            h2orandomresult?.text=list[dot]
            randomresult1text12?.setText(list[dot]).toString()
        }


    }

    private fun textlistners() {


        B2D?.setOnClickListener {

            Toast.makeText(this, "balllll", Toast.LENGTH_SHORT).show()

        }


        B2O?.setOnClickListener {
            Toast.makeText(this, "bin to octa.....", Toast.LENGTH_SHORT).show()
        }


        B2H?.setOnClickListener {
            Toast.makeText(this, "bin to hexa.....", Toast.LENGTH_SHORT).show()
        }



        D2B?.setOnClickListener {
            Toast.makeText(this, "deci to bin.....", Toast.LENGTH_SHORT).show()
        }


        D2O?.setOnClickListener {
            Toast.makeText(this, "deci to octa.....", Toast.LENGTH_SHORT).show()
        }


        D2H?.setOnClickListener {
            Toast.makeText(this, "deci to hexa.....", Toast.LENGTH_SHORT).show()
        }


        O2B?.setOnClickListener {
            Toast.makeText(this, "octa to bin....", Toast.LENGTH_SHORT).show()
        }


        O2D?.setOnClickListener {
            Toast.makeText(this, "octa to deci.....", Toast.LENGTH_SHORT).show()
        }

        O2H?.setOnClickListener {
            Toast.makeText(this, "octa to hexa.....", Toast.LENGTH_SHORT).show()
        }


        H2B?.setOnClickListener {
            Toast.makeText(this, "hexa to bin.....", Toast.LENGTH_SHORT).show()
        }

        H2D?.setOnClickListener {
            Toast.makeText(this, "hexa to deci.....", Toast.LENGTH_SHORT).show()
        }

        H2O?.setOnClickListener {
            Toast.makeText(this, "hexa to octa....", Toast.LENGTH_SHORT).show()
        }





    }

    private fun passedlayouts() {

        val Item: String? = intent.getStringExtra("key")
        Log.d(TAG, "onCreate: "+Item)

        if (Item.equals("a")){
            rl?.visibility=View.VISIBLE
        }

        else if (Item.equals("b")){
            r2?.visibility=View.VISIBLE
        }

        else if (Item.equals("c")){
            r3?.visibility=View.VISIBLE
        }
        else if (Item.equals("d")){
            r4?.visibility=View.VISIBLE
        }

        else if (Item.equals("e")){
            r5?.visibility=View.VISIBLE
        }

        else if (Item.equals("f")){
            r6?.visibility=View.VISIBLE
        }
        else if (Item.equals("g")){
            r7?.visibility=View.VISIBLE
        }

        else if (Item.equals("h")){
            r8?.visibility=View.VISIBLE
        }

        else if (Item.equals("i")){
            r9?.visibility=View.VISIBLE
        }
        else if (Item.equals("j")){
            rt?.visibility=View.VISIBLE
        }

        else if (Item.equals("k")){
            r11?.visibility=View.VISIBLE
        }
        else if (Item.equals("l")){
            r12?.visibility=View.VISIBLE
        }



    }

    private fun initialfields() {

        toolbar=findViewById(R.id.toolbar2)
        setSupportActionBar(toolbar)
        toolbar?.setTitle("EXPLANATION")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



//relative layouts ids.....
        rl=findViewById(R.id.B2D_RL)
        r2=findViewById(R.id.B2O_RL)
        r3=findViewById(R.id.B2H_RL)

        r4=findViewById(R.id.D2B_RL)
        r5=findViewById(R.id.D2O_RL)
        r6=findViewById(R.id.D2H_RL)

        r7=findViewById(R.id.O2B_RL)
        r8=findViewById(R.id.O2D_RL)
        r9=findViewById(R.id.O2H_RL)

        rt=findViewById(R.id.H2B_RL)
        r11=findViewById(R.id.H2D_RL)
        r12=findViewById(R.id.H2O_RL)



//trytextview ids.......
        B2D=findViewById(R.id.b2ddtext_id)

        B2O=findViewById(R.id.b2otext_id)

        B2H=findViewById(R.id.b2hdtext_id)
        D2B=findViewById(R.id.d2bdtext_id)

        D2O=findViewById(R.id.d2odtext_id)

        D2H=findViewById(R.id.d2hdtext_id)

        O2D=findViewById(R.id.o2ddtext_id)

        O2B=findViewById(R.id.o2bdtext_id)

        O2H=findViewById(R.id.o2hdtext_id)

        H2B=findViewById(R.id.h2bdtext_id)

        H2D=findViewById(R.id.h2ddtext_id)

        H2O=findViewById(R.id.h2odtext_id)



//randomtextviewide.....
        b2drandom=findViewById(R.id.binarytodecimalrandortext_id)
        b2orandom=findViewById(R.id.binarytooctalrandortext_id)
        b2hrandom=findViewById(R.id.binarytohexadecimalrandortext_id)

        d2brandom=findViewById(R.id.decimaltobinaryrandortext_id)
        d2orandom=findViewById(R.id.decimaltooctalrandortext_id)
        d2hrandom=findViewById(R.id.decimaltohexadecimalrandortext_id)

        o2brandom=findViewById(R.id.octaltobinaryrandortext_id)
        o2drandom=findViewById(R.id.octaltodecimalrandortext_id)
        o2hrandom=findViewById(R.id.octaltohexadecimalrandortext_id)

        h2brandom=findViewById(R.id.hexadecimaltobinaryrandortext_id)
        h2drandom=findViewById(R.id.hexadecimaltodecimalrandortext_id)
        h2orandom=findViewById(R.id.hexadecimaltooctalrandortext_id)

//random resultstextviews ids..............

        b2drandomresult=findViewById(R.id.b2drndmresult)
        b2orandomresult=findViewById(R.id.b2orndmresult)
        b2hrandomresult=findViewById(R.id.b2hrndmresult)

        d2brandomresult=findViewById(R.id.d2brndmresult)
        d2orandomresult=findViewById(R.id.d2orndmresult)
        d2hrandomresult=findViewById(R.id.d2hrndmresult)

        o2brandomresult=findViewById(R.id.o2brndmresult)
        o2drandomresult=findViewById(R.id.o2drndmresult)
        o2hrandomresult=findViewById(R.id.o2hrndmresult)

        h2brandomresult=findViewById(R.id.h2brndmresult)
        h2drandomresult=findViewById(R.id.h2drndmresult)
        h2orandomresult=findViewById(R.id.h2orndmresult)



//down random values textviews ids.....

        randomresult1text=findViewById(R.id.textbin1)
        randomresult1text2=findViewById(R.id.textbin2)
        randomresult1text3=findViewById(R.id.textbin3)


        randomresult1text4=findViewById(R.id.textdec1)
        randomresult1text5=findViewById(R.id.textdec2)
        randomresult1text6=findViewById(R.id.textdec3)


        randomresult1text7=findViewById(R.id.textocta1)
        randomresult1text8=findViewById(R.id.textocta2)
        randomresult1text9=findViewById(R.id.textocta3)

        randomresult1texttt=findViewById(R.id.texthexa1)
        randomresult1text11=findViewById(R.id.texthexa2)
        randomresult1text12=findViewById(R.id.texthexa3)



//finalresults....

        finalresult1=findViewById(R.id.b2dfinalresult)










    }
}