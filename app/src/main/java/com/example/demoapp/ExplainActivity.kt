package com.example.demoapp

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


        rr1?.visibility = View.VISIBLE
        val dd: String? = intent.getStringExtra("aa")
        val txt = intent.getIntExtra("kkk", 0)
        Log.d(TAG, "txt: $txt")
        text1?.setText("($dd)")
        text12?.setText("=$dd")
        text13.text = txt.toString()


    }
}




