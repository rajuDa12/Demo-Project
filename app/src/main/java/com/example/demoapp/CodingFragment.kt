package com.example.demoapp

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.text.TextUtils
import android.text.method.DigitsKeyListener
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.demoapp.binary1.getOutput


class CodingFragment : Fragment() {

    private var convert: Button? = null
    private var result: TextView? = null
    private var input: EditText? = null
    private var button: TextView? = null

    var item = arrayOf("Decimal", "Binary", "Octal", "Hexadecimal")
    var item2 = arrayOf("Decimal", "Binary", "Octal", "Hexadecimal")

    private var Adapter: ArrayAdapter<String>? = null
    private var Adapter2: ArrayAdapter<String>? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {

       val v:View=inflater.inflate(R.layout.fragment_coding, container, false)


        val spinner: Spinner? = view?.findViewById(R.id.spinner1)
        val spinner2: Spinner? = view?.findViewById(R.id.spinner2)

        Adapter = context?.let { ArrayAdapter(it, android.R.layout.simple_list_item_1, item) }
        Adapter!!.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spinner?.adapter = Adapter


        Adapter2 = context?.let { ArrayAdapter(it, android.R.layout.simple_list_item_1, item2) }
        Adapter2!!.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spinner2?.adapter = Adapter2

        input = view?.findViewById(R.id.inputedittextid)
        convert = view?.findViewById(R.id.convertbutoonid)

        button = view?.findViewById(R.id.explain_button_id)

        result = view?.findViewById(R.id.result_text_id)


        if (spinner != null) {
            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
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
                            input?.inputType = InputType.TYPE_CLASS_TEXT
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
                    if (spinner.selectedItem == "Binary" && (spinner2.selectedItem == "Decimal")) {

                        if (TextUtils.isEmpty(input?.text.toString())) {
                            input?.setError("enter a valid number")
                            input?.requestFocus()
                        } else {

                            val bin: String? = input?.getText()?.trim().toString()

                            val d= getOutput(bin.toString())
                            result?.text= d.toString()

//                            val dec: Int = Integer.parseInt(bin.toString(), 2)
//                            result?.setText("" + dec)

                        }

                    } else if (spinner2 != null) {
                        if (spinner.selectedItem == "Binary" && (spinner2.selectedItem == "Octal")) {


                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {
                                val bin: String = input?.text?.trim().toString()
                                val dec: Int = Integer.parseInt(bin.toString(), 2)
                                val octal: String = Integer.toOctalString(dec.toInt())
                                result?.setText("" + octal)
                            }


                        } else if (spinner.selectedItem == "Binary" && (spinner2.selectedItem == "Hexadecimal")) {


                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {

                                val bin: String = input?.text?.trim().toString()
                                val dec: Int = Integer.parseInt(bin.toString(), 2)
                                val hexa: String = Integer.toHexString(dec.toInt())
                                result?.setText("" + hexa)
                            }


                        } else if (spinner.selectedItem == "Binary" && (spinner2.selectedItem == "Binary")) {


                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {
                                val bin: String = input?.text?.trim().toString()
                                result?.setText("" + bin)
                            }

                        }


                        //decimat to vice versa....


                        else if (spinner.selectedItem == "Decimal" && (spinner2.selectedItem == "Decimal")) {

                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {

                                val dec: String = input?.text?.trim().toString()
                                result?.setText("" + dec)
                            }

                        } else if (spinner.selectedItem == "Decimal" && (spinner2.selectedItem == "Binary")) {


                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {

                                val dec: String = input?.getText().toString()
                                val bin: String = Integer.toBinaryString(dec.toInt())
                                result?.setText("" + bin)
                            }


                        } else if (spinner.selectedItem == "Decimal" && (spinner2.selectedItem == "Octal")) {


                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {

                                val dec: String = input?.text?.trim().toString()
                                val octal: String = Integer.toOctalString(dec.toInt())
                                result?.setText("" + octal)

                            }

                        } else if (spinner.selectedItem == "Decimal" && (spinner2.selectedItem == "Hexadecimal")) {


                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {

                                val dec: String = input?.text?.trim().toString()
                                val hexa: String = Integer.toHexString(dec.toInt())
                                result?.setText("" + hexa)
                            }
                        }


                        //octal to vice versa...


                        else if (spinner.selectedItem == "Octal" && (spinner2.selectedItem == "Octal")) {

                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {
                                val octal: String = input?.text?.trim().toString()
                                result?.setText("" + octal)
                            }

                        } else if (spinner.selectedItem == "Octal" && (spinner2.selectedItem == "Decimal")) {


                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {
                                val octal: String = input?.text?.trim().toString()
                                val dec: Int = Integer.parseInt(octal.toString(), 8)
                                result?.setText("" + dec)
                            }


                        } else if (spinner.selectedItem == "Octal" && (spinner2.selectedItem == "Binary")) {

                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {
                                val octal: String = input?.text?.trim().toString()
                                val dec: Int = Integer.parseInt(octal.toString(), 8)
                                val bin: String = Integer.toBinaryString(dec.toInt())
                                result?.setText("" + bin)

                            }


                        } else if (spinner.selectedItem == "Octal" && (spinner2.selectedItem == "Hexadecimal")) {


                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {
                                val octal: String = input?.text?.trim().toString()
                                val dec: Int = Integer.parseInt(octal.toString(), 8)
                                val hexa: String = Integer.toHexString(dec.toInt())

                                result?.setText("" + hexa)
                            }

                        }


                        //            hexa to vice versa....


                        else if (spinner.selectedItem == "Hexadecimal" && (spinner2.selectedItem == "Hexadecimal")) {

                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {
                                val hexa: String = input?.text?.trim().toString()
                                result?.setText("" + hexa)
                            }


                        } else if (spinner.selectedItem == "Hexadecimal" && (spinner2.selectedItem == "Decimal")) {
                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {
                                val hexa: String = input?.text?.trim().toString()
                                val dec: Int = Integer.parseInt(hexa.toString(), 16)
                                result?.setText("" + dec)
                            }


                        } else if (spinner.selectedItem == "Hexadecimal" && (spinner2.selectedItem == "Binary")) {

                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {
                                val hexa: String = input?.text?.trim().toString()
                                val dec: Int = Integer.parseInt(hexa.toString(), 16)
                                val bin: String = Integer.toBinaryString(dec.toInt())
                                result?.setText("" + bin)
                            }


                        } else if (spinner.selectedItem == "Hexadecimal" && (spinner2.selectedItem == "Octal")) {

                            if (TextUtils.isEmpty(input?.text.toString())) {
                                input?.setError("enter a valid number")
                                input?.requestFocus()
                            } else {
                                val hexa: String = input?.text?.trim().toString()
                                val dec: Int = Integer.parseInt(hexa.toString(), 16)
                                val octal: String = Integer.toOctalString(dec.toInt())
                                result?.setText("" + octal)
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
                    if (spinner.selectedItem == "Binary" && (spinner2.selectedItem == "Decimal")) {


                        var bin: String = input?.text.toString()
                        var dec: Int = Integer.parseInt(bin.toString(), 2)
                        result?.setText("" + dec).toString()

                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("aa", bin)
                        intent.putExtra("kkk", dec)
                        startActivity(intent)

                    } else if (spinner.selectedItem == "Binary" && (spinner2.selectedItem == "Binary")) {

                        var bin: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("bb", bin)
                        startActivity(intent)
                    } else if (spinner.selectedItem == "Binary" && (spinner2.selectedItem == "Octal")) {
                        var bin: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("cc", bin)
                        startActivity(intent)
                    } else if (spinner.selectedItem == "Binary" && (spinner2.selectedItem == "Hexadecimal")) {
                        var bin: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("dd", bin)
                        startActivity(intent)
                    } else if (spinner.selectedItem == "Decimal" && (spinner2.selectedItem == "Decimal")) {
                        var dec: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("ee", dec)
                        startActivity(intent)
                    } else if (spinner.selectedItem == "Decimal" && (spinner2.selectedItem == "Binary")) {
                        var dec: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("ff", dec)
                        startActivity(intent)
                    } else if (spinner.selectedItem == "Decimal" && (spinner2.selectedItem == "Octal")) {
                        var dec: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("gg", dec)
                        startActivity(intent)
                    } else if (spinner.selectedItem == "Decimal" && (spinner2.selectedItem == "Hexadecimal")) {
                        var dec: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("hh", dec)
                        startActivity(intent)
                    } else if (spinner.selectedItem == "Octal" && (spinner2.selectedItem == "Octal")) {
                        var octal: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("ii", octal)
                        startActivity(intent)
                    } else if (spinner.selectedItem == "Octal" && (spinner2.selectedItem == "Binary")) {
                        var octal: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("jj", octal)
                        startActivity(intent)
                    } else if (spinner.selectedItem == "Octal" && (spinner2.selectedItem == "Decimal")) {
                        var octal: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("kk", octal)
                        startActivity(intent)
                    } else if (spinner.selectedItem == "Octal" && (spinner2.selectedItem == "Hexadecimal")) {
                        var octal: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("ll", octal)

                        startActivity(intent)
                    } else if (spinner.selectedItem == "Hexadecimal" && (spinner2.selectedItem == "Hexadecimal")) {
                        var hexa: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("mm", hexa)
                        startActivity(intent)
                    } else if (spinner.selectedItem == "Hexadecimal" && (spinner2.selectedItem == "Binary")) {
                        var hexa: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("oo", hexa)
                        startActivity(intent)
                    } else if (spinner.selectedItem == "Hexadecimal" && (spinner2.selectedItem == "Decimal")) {
                        var hexa: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("pp", hexa)
                        startActivity(intent)
                    } else if (spinner.selectedItem == "Hexadecimal" && (spinner2.selectedItem == "Octal")) {
                        var hexa: String = input?.text.toString()
                        val intent = Intent(requireContext(), ExplainActivity::class.java)
                        intent.putExtra("qq", hexa)
                        startActivity(intent)
                    }
                }
            }


        }

        return v

    }

}