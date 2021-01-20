package com.example.demoapp.Fragments

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.text.TextUtils
import android.text.method.DigitsKeyListener
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.demoapp.Activites.ExplainActivity
import com.example.demoapp.Models.B2D.getOutput
import com.example.demoapp.Models.H2D.getOutput3
import com.example.demoapp.Models.O2D.getOutput2
import com.example.demoapp.R


var code:Int=0
class CodingFragment : Fragment() {

    private var convert: Button? = null
    private var result: TextView? = null
    private var input: EditText? = null
    private var button: TextView? = null
    private var spinner:Spinner?=null
    private var spinner2:Spinner?=null

    var item = arrayOf("Decimal", "Binary", "Octal", "Hexadecimal")
    var item2 = arrayOf("Decimal", "Binary", "Octal", "Hexadecimal")

    private var Adapter: ArrayAdapter<String>? = null
    private var Adapter2: ArrayAdapter<String>? = null


    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {

       val view:View=inflater.inflate(R.layout.fragment_coding, container, false)


         spinner= view?.findViewById(R.id.spinner1)
         spinner2 =view?.findViewById(R.id.spinner2)

        Adapter = context?.let { ArrayAdapter(it, android.R.layout.simple_list_item_1, item) }
        Adapter!!.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spinner?.adapter = Adapter


        Adapter2 = context?.let { ArrayAdapter(it, android.R.layout.simple_list_item_1, item2) }
        Adapter2!!.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spinner2?.adapter = Adapter2

        input = view.findViewById(R.id.inputedittextid)
        convert = view.findViewById(R.id.convertbutoonid)

        button = view.findViewById(R.id.explain_button_id)

        result = view.findViewById(R.id.result_text_id)


        if (spinner != null) {
            spinner!!.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long,) {
                    when (position) {
                        0 -> {
                            input?.inputType = InputType.TYPE_CLASS_NUMBER
                            input?.keyListener = DigitsKeyListener.getInstance("0123456789.")
                        }
                        1 -> {
                            input?.inputType = InputType.TYPE_CLASS_NUMBER
                            input?.keyListener = DigitsKeyListener.getInstance("01.")
                        }
                        2 -> {
                            input?.inputType = InputType.TYPE_CLASS_NUMBER
                            input?.keyListener = DigitsKeyListener.getInstance("01234567.")
                        }
                        3 -> {
                            input?.inputType = InputType.TYPE_NUMBER_VARIATION_PASSWORD
                            input?.keyListener = DigitsKeyListener.getInstance("0123456789abcdefABCDEF.")
                        }
                    }

                } // to close the onItemSelected

                override fun onNothingSelected(parent: AdapterView<*>) {

                }

            }
        }


        convert?.setOnClickListener {

            if (spinner != null) {
                if (spinner2 != null) {
                    if (spinner!!.selectedItem == "Binary" && (spinner2!!.selectedItem == "Decimal")) {

                        if (TextUtils.isEmpty(input?.text.toString())) {
                            input?.setError("enter a valid number")
                            input?.requestFocus()

                        } else {

                            val bin: String? = input?.getText()?.trim().toString()
                            val d= getOutput(bin.toString())
                            result?.text= d.toString()

                        }

                    } else if (spinner2 != null) {
                        if (spinner!!.selectedItem == "Binary" && (spinner2!!.selectedItem == "Octal"))
                        {

                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.error = "enter a valid number"
                                input?.requestFocus()
                            } else {

                                Toast.makeText(context, "binary to octal", Toast.LENGTH_SHORT).show()

                            }


                        }
                        else if (spinner!!.selectedItem == "Binary" && (spinner2!!.selectedItem == "Hexadecimal")) {


                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.error = "enter a valid number"
                                input?.requestFocus()
                            } else {

                                Toast.makeText(context, "binary to hexadecimal", Toast.LENGTH_SHORT).show()

                            }


                        } else if (spinner!!.selectedItem == "Binary" && (spinner2!!.selectedItem == "Binary")) {


                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {
                                val bin: String = input?.text?.trim().toString()
                                result?.text = "" + bin
                            }

                        }


                        //decimat to vice versa....


                        else if (spinner!!.selectedItem == "Decimal" && (spinner2!!.selectedItem == "Decimal")) {

                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {

                                val dec: String = input?.text?.trim().toString()
                                result?.setText("" + dec)
                            }

                        } else if (spinner!!.selectedItem == "Decimal" && (spinner2!!.selectedItem == "Binary")) {


                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {

                                var decimal = input?.text.toString().toInt()
                                val binary: Long = convertDecimalTobinary(decimal)
                                result?.setText("" + binary)

                            }


                        } else if (spinner!!.selectedItem == "Decimal" && (spinner2!!.selectedItem == "Octal")) {


                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {


                                var decimal = input?.text.toString().toInt()
                                val binary: Long = convertDecimalTooctal(decimal)
                                result?.setText("" + binary)

                            }

                        }
                        else if (spinner!!.selectedItem == "Decimal" && (spinner2!!.selectedItem == "Hexadecimal")) {


                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {



                                var decimal = input?.text.toString().toInt()
                                val binary: Long = convertDecimalTohexa(decimal)
                                result?.setText("" + binary)

                            }
                        }


                        //octal to vice versa...


                        else if (spinner!!.selectedItem == "Octal" && (spinner2!!.selectedItem == "Octal")) {

                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {

                                val octal: String = input?.text?.trim().toString()
                                result?.setText("" + octal)
                            }

                        } else if (spinner!!.selectedItem == "Octal" && (spinner2!!.selectedItem == "Decimal")) {


                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {
                                val octal: String? = input?.text?.trim().toString()
                                val d= getOutput2(octal.toString())
                                result?.text= d.toString()
                            }


                        } else if (spinner!!.selectedItem == "Octal" && (spinner2!!.selectedItem == "Binary")) {

                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {

                                Toast.makeText(context, "octal to binary", Toast.LENGTH_SHORT).show()

                            }


                        } else if (spinner!!.selectedItem == "Octal" && (spinner2!!.selectedItem == "Hexadecimal")) {


                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {
                                Toast.makeText(context, "octal to hexadecimal", Toast.LENGTH_SHORT).show()
//                                val octal: String = input?.text?.trim().toString()
//                                val dec: Int = Integer.parseInt(octal.toString(), 8)
//                                val hexa: String = Integer.toHexString(dec.toInt())

//                                result?.setText("" + hexa)
                            }

                        }


                        //            hexa to vice versa....


                        else if (spinner!!.selectedItem == "Hexadecimal" && (spinner2!!.selectedItem == "Hexadecimal")) {

                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {
                                val hexa: String = input?.text?.trim().toString()
                                result?.setText("" + hexa)
                            }


                        } else if (spinner!!.selectedItem == "Hexadecimal" && (spinner2!!.selectedItem == "Decimal")) {
                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {
                                val hexa: String? = input?.text?.trim().toString()
                                val d= getOutput3(hexa.toString())
                                result?.text= d.toString()
                            }


                        } else if (spinner!!.selectedItem == "Hexadecimal" && (spinner2!!.selectedItem == "Binary")) {

                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {
                                Toast.makeText(context, "hexa to binary..", Toast.LENGTH_SHORT).show()
//                                val hexa: String = input?.text?.trim().toString()
//                                val dec: Int = Integer.parseInt(hexa.toString(), 16)
//                                val bin: String = Integer.toBinaryString(dec.toInt())
//                                result?.setText("" + bin)
                            }


                        } else if (spinner!!.selectedItem == "Hexadecimal" && (spinner2!!.selectedItem == "Octal")) {

                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {

                                Toast.makeText(context, "hexa to octal..", Toast.LENGTH_SHORT).show()

//                                val hexa: String = input?.text?.trim().toString()
//                                val dec: Int = Integer.parseInt(hexa.toString(), 16)
//                                val octal: String = Integer.toOctalString(dec.toInt())
//                                result?.setText("" + octal)
                            }


                        } else {
                            result?.setText("Error......")


                        }
                    }
                }
            }


        }


        button?.setOnClickListener {

            if (spinner2 != null) {
                if (spinner != null) {
                    if (spinner!!.selectedItem == "Binary" && (spinner2!!.selectedItem == "Decimal")) {
                          code=1



                        val dec: String? = input?.text?.trim().toString()
                        val d= getOutput(dec.toString())
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("kkk","=${dec}"+"\n"+d)
                        startActivity(intent)



                    }
                    else if (spinner!!.selectedItem == "Binary" && (spinner2!!.selectedItem == "Binary"))
                    {

                        code=2

                        var bin: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("bb", bin)
                        startActivity(intent)
                    } else if (spinner!!.selectedItem == "Binary" && (spinner2!!.selectedItem == "Octal")) {
                        code=3
                        var bin: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("cc", bin)
                        startActivity(intent)
                    } else if (spinner!!.selectedItem == "Binary" && (spinner2!!.selectedItem == "Hexadecimal")) {
                        code=4
                        var bin: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("dd", bin)
                        startActivity(intent)
                    }
                    else if (spinner!!.selectedItem == "Decimal" && (spinner2!!.selectedItem == "Decimal")) {
                        code=5
                        var dec: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("ee", dec)
                        startActivity(intent)
                    } else if (spinner!!.selectedItem == "Decimal" && (spinner2!!.selectedItem == "Binary")) {
                        code=6
                        var dec: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("ff", dec)
                        startActivity(intent)
                    } else if (spinner!!.selectedItem == "Decimal" && (spinner2!!.selectedItem == "Octal")) {
                        code=7
                        var dec: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("gg", dec)
                        startActivity(intent)
                    } else if (spinner!!.selectedItem == "Decimal" && (spinner2!!.selectedItem == "Hexadecimal")) {
                        code=8
                        var dec: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("hh", dec)
                        startActivity(intent)
                    } else if (spinner!!.selectedItem == "Octal" && (spinner2!!.selectedItem == "Octal")) {
                        code=9
                        var octal: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("ii", octal)
                        startActivity(intent)
                    } else if (spinner!!.selectedItem == "Octal" && (spinner2!!.selectedItem == "Binary")) {
                        code=10
                        var octal: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("jj", octal)
                        startActivity(intent)
                    } else if (spinner!!.selectedItem == "Octal" && (spinner2!!.selectedItem == "Decimal")) {
                        code=11

                        val octal: String? = input?.text?.trim().toString()
                        val d= getOutput2(octal.toString())
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("kk","=${octal}"+"\n"+d)
                        startActivity(intent)
                    } else if (spinner!!.selectedItem == "Octal" && (spinner2!!.selectedItem == "Hexadecimal")) {
                        code=12
                        var octal: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("ll", octal)

                        startActivity(intent)
                    } else if (spinner!!.selectedItem == "Hexadecimal" && (spinner2!!.selectedItem == "Hexadecimal")) {
                        code=13
                        var hexa: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("mm", hexa)
                        startActivity(intent)
                    } else if (spinner!!.selectedItem == "Hexadecimal" && (spinner2!!.selectedItem == "Binary")) {
                        code=14
                        var hexa: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("oo", hexa)
                        startActivity(intent)
                    } else if (spinner!!.selectedItem == "Hexadecimal" && (spinner2!!.selectedItem == "Decimal")) {
                        code=15

                        val hexa: String? = input?.text?.trim().toString()
                        val d= getOutput3(hexa.toString())
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("pp","=${hexa}"+"\n"+d)
                        startActivity(intent)

                    } else if (spinner!!.selectedItem == "Hexadecimal" && (spinner2!!.selectedItem == "Octal")) {
                        code=16
                        var hexa: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("qq", hexa)
                        startActivity(intent)
                    }
                }
            }


        }

        return view
    }

    fun convertDecimalTohexa(n: Int): Long {
        var n = n
        var binaryNumber: Long = 0
        var remainder: Int
        var i = 1
        var step = 1
        val builder = StringBuilder()
        while (n != 0) {
            remainder = n % 16


            val text = String.format("%d/16= %d Remainder=%d\n", n, n / 16, remainder)

            builder.append(text)

            n /= 16
            binaryNumber += (remainder * i).toLong()
            i *= 10
        }
//        Resultdteails?.text = "" + builder

        return binaryNumber
    }

    fun convertDecimalTooctal(n: Int): Long {
        var n = n
        var binaryNumber: Long = 0
        var remainder: Int
        var i = 1
        var step = 1
        val builder = StringBuilder()
        while (n != 0) {
            remainder = n % 8


            val text = String.format("%d/8= %d Remainder=%d\n", n, n / 8, remainder)

            builder.append(text)

            n /= 8
            binaryNumber += (remainder * i).toLong()
            i *= 10
        }
//        Resultdteails?.text = "" + builder

        return binaryNumber
    }

    fun convertDecimalTobinary(n: Int): Long {
        var n = n
        var binaryNumber: Long = 0
        var remainder: Int
        var i = 1
        var step = 1
        val builder = StringBuilder()
        while (n != 0) {
            remainder = n % 2


            val text = String.format("%d/2= %d Remainder=%d\n", n, n / 2, remainder)

            builder.append(text)

            n /= 2
            binaryNumber += (remainder * i).toLong()
            i *= 10
        }
//        Resultdteails?.text = "" + builder

        return binaryNumber
    }


}