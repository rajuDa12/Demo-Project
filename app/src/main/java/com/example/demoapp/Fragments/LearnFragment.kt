package com.example.demoapp.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.demoapp.Activites.InformationActivity
import com.example.demoapp.R


class LearnFragment : Fragment() {



    private var B2D: LinearLayout? = null
    private var B2O: LinearLayout? = null
    private var B2H: LinearLayout? = null

    private var D2B: LinearLayout? = null
    private var D2O: LinearLayout? = null
    private var D2H: LinearLayout? = null

    private var O2B: LinearLayout? = null
    private var O2D: LinearLayout? = null
    private var O2H: LinearLayout? = null

    private var H2B: LinearLayout? = null
    private var H2D: LinearLayout? = null
    private var H2O: LinearLayout? = null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.fragment_learn, container, false)




        B2D = v.findViewById(R.id.binary_to_decimal)
        B2O = v.findViewById(R.id.binary_to_octal)
        B2H = v.findViewById(R.id.binary_to_hexadecimal)


        D2B = v.findViewById(R.id.decimal_to_binary)
        D2O = v.findViewById(R.id.decimal_to_octal)
        D2H = v.findViewById(R.id.decimal_to_hexadecimal)

        O2B = v.findViewById(R.id.octal_to_binary)
        O2D = v.findViewById(R.id.octal_to_decimal)
        O2H = v.findViewById(R.id.octal_to_hexadecimal)


        H2B = v.findViewById(R.id.hexadecimal_to_binary)
        H2D = v.findViewById(R.id.hexadecimal_to_decimal)
        H2O = v.findViewById(R.id.hexadecimal_to_octal)





        B2D?.setOnClickListener {
            val intent = Intent(this.context, InformationActivity::class.java)
            intent.putExtra("key", "a")
            startActivity(intent)

        }
        B2O?.setOnClickListener {
            val intent = Intent(this.context, InformationActivity::class.java)
            intent.putExtra("key", "b")
            startActivity(intent)

        }
        B2H?.setOnClickListener {
            val intent = Intent(this.context, InformationActivity::class.java)
            intent.putExtra("key", "c")
            startActivity(intent)

        }


        D2B?.setOnClickListener {
            val intent = Intent(this.context, InformationActivity::class.java)
            intent.putExtra("key", "d")
            startActivity(intent)

        }
        D2O?.setOnClickListener {
            val intent = Intent(this.context, InformationActivity::class.java)
            intent.putExtra("key", "e")
            startActivity(intent)

        }
        D2H?.setOnClickListener {
            val intent = Intent(this.context, InformationActivity::class.java)
            intent.putExtra("key", "f")
            startActivity(intent)

        }





        O2B?.setOnClickListener {
            val intent = Intent(this.context, InformationActivity::class.java)
            intent.putExtra("key", "g")
            startActivity(intent)

        }
        O2D?.setOnClickListener {
            val intent = Intent(this.context, InformationActivity::class.java)
            intent.putExtra("key", "h")
            startActivity(intent)

        }
        O2H?.setOnClickListener {
            val intent = Intent(this.context, InformationActivity::class.java)
            intent.putExtra("key", "i")
            startActivity(intent)

        }


        H2B?.setOnClickListener {
            val intent = Intent(this.context, InformationActivity::class.java)
            intent.putExtra("key", "j")
            startActivity(intent)

        }
        H2D?.setOnClickListener {
            val intent = Intent(this.context, InformationActivity::class.java)
            intent.putExtra("key", "k")
            startActivity(intent)

        }
        H2O?.setOnClickListener {
            val intent = Intent(this.context, InformationActivity::class.java)
            intent.putExtra("key", "l")
            startActivity(intent)

        }









        return v
    }
    }

