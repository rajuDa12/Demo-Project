package com.example.demoapp

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.widget.Toolbar

class ExplainActivity : AppCompatActivity() {


    private val TAG = "ExplanationActivity"
    private var text1: TextView? = null
    private var text12: TextView? = null
    private lateinit var text13: TextView

    private lateinit var text2: TextView
    private lateinit var text21: TextView
    private lateinit var text22: TextView

    private lateinit var text3: TextView
    private lateinit var text31: TextView
    private lateinit var text32: TextView

    private lateinit var text4: TextView
    private lateinit var text41: TextView
    private lateinit var text42: TextView


    private var text5: TextView? = null


    private var rr1: RelativeLayout? = null
    private var rr2: RelativeLayout? = null
    private var rr3: RelativeLayout? = null
    private var rr4: RelativeLayout? = null
    private var rr5: RelativeLayout? = null
    private var rr6: RelativeLayout? = null
    private var rr7: RelativeLayout? = null
    private var rr8: RelativeLayout? = null
    private var rr9: RelativeLayout? = null
    private var rr10t: RelativeLayout? = null
    private var rr11: RelativeLayout? = null
    private var rr12: RelativeLayout? = null


    var item = arrayOf("Decimal", "Binary", "Octal", "Hexadecimal")
    private var Adapter: ArrayAdapter<String>? = null

    private var toolbar: Toolbar? = null

    private var inputtext: TextView? = null
    private var outputText: TextView? = null
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explain)

        toolbar = findViewById(R.id.explaintoolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        rr1 = findViewById(R.id.rlt1)
        rr2 = findViewById(R.id.rlt2)
        rr3 = findViewById(R.id.rlt3)
        rr4 = findViewById(R.id.rlt4)
        rr5 = findViewById(R.id.rlt5)
        rr6 = findViewById(R.id.rlt6)
        rr7 = findViewById(R.id.rlt7)
        rr8 = findViewById(R.id.rlt8)
        rr9 = findViewById(R.id.rlt9)
        rr10t = findViewById(R.id.rlt10t)
        rr11 = findViewById(R.id.rlt11)
        rr12 = findViewById(R.id.rlt12)




        text1 = findViewById(R.id.finalb2dinputid)
        text12 = findViewById(R.id.finalb2dlooptext_id)
        text13 = findViewById(R.id.finb2dresult)



//        text2 = findViewById(R.id.b2dcalculation)
//        text21 = findViewById(R.id.b2dcalculationresult)
//        text21 = findViewById(R.id.b2dcalculationresult)
//
//
//        text3 = findViewById(R.id.b2dcalculation)
//        text31 = findViewById(R.id.b2dcalculationresult)
//        text32 = findViewById(R.id.b2dcalculationresult)
//
//
//        text4 = findViewById(R.id.b2dcalculation)
//        text41 = findViewById(R.id.b2dcalculationresult)
//        text42 = findViewById(R.id.b2dcalculationresult)


        if(code==1)
        {
            rr1?.visibility = View.VISIBLE
            val dd: String? = intent.getStringExtra("aa")
            Log.i(TAG, "onCreate: iscorect?"+dd)
            val txt = intent.getIntExtra("kkk", 0)
            Log.i(TAG, "onCreate: ison?"+txt)
            Log.d(TAG, "txt: $txt")
            text1?.setText("($dd)")
            text12?.setText(""+txt)
            text13.text = txt.toString()
        }
        else if(code==2)
        {
            rr2?.visibility = View.VISIBLE
        }
        else if(code==3)
        {
            rr3?.visibility = View.VISIBLE
        }
        else if(code==4)
        {
            rr4?.visibility = View.VISIBLE
        }
        else if(code==5)
        {
            rr5?.visibility = View.VISIBLE
        }
        else if(code==6)
        {
            rr6?.visibility = View.VISIBLE
        }
        else if(code==7)
        {
            rr7?.visibility = View.VISIBLE
        }
        else if(code==8)
        {
            rr8?.visibility = View.VISIBLE
        }
        else if(code==9)
        {
            rr9?.visibility = View.VISIBLE
        }
        else if(code==10)
        {
            rr10t?.visibility = View.VISIBLE
        }
        else if(code==11)
        {
            rr11?.visibility = View.VISIBLE
        }
        else if(code==12)
        {
            rr12?.visibility = View.VISIBLE
        }





    }
}




