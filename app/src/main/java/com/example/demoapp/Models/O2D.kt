package com.example.demoapp.Models

import android.content.ContentValues
import android.util.Log
import com.example.demoapp.Fragments.code
import kotlin.math.pow



object O2D {

    private var lol:Int=0
    fun getOutput2(str: String): String {

        // 100.100
        val str1List: MutableList<Int> = mutableListOf()
        val str2List: MutableList<Int> = mutableListOf()

        var flag = 0
        for (st in str) {
            if (st == '.') {
                flag = 1
            } else {
                if (flag == 0) {
                    str1List.add(st.toInt() - '0'.toInt())
                } else {
                    str2List.add(st.toInt() - '0'.toInt())
                }
            }
        }

        //    str2List.reverse()

        var ans = 0.0
        var ans2 = 0.0
        var value = ""
        var sumval1 = ""
        var sumval2 = ""
        var value2 = ""


        str1List.reverse()
            for ((index, str) in str1List.withIndex()) {
                ans += str * 8.0.pow(index.toDouble())
                var vali = str * 8.0.pow(index.toDouble())


                if (index < str1List.size - 1) {
                    sumval1 += "$vali+"
                    value += "($str x 8^$index)+"
                } else {
                    sumval1 += "$vali"
                    value += "($str x 8^$index)"
                }

            }

            for ((index, str2) in str2List.withIndex()) {

                ans2 += str2 * 8.0.pow(-index.toDouble().plus(1.0))
                value2 += "+($str2 x 8^${-index.plus(1)})"
                var valid = str2 * 8.0.pow(-index.toDouble().plus(1.0))
                sumval2 += "+$valid"


            }
            Log.d(ContentValues.TAG, "getOutput: ${value + value2}")
            Log.d(ContentValues.TAG, "getOutput: ${ans.plus(ans2)}")


            var a="${(ans.plus(ans2))}"

          var b="=${value + value2}" + "\n" + "= ${sumval1 + sumval2}" + "\n" + "=${(ans.plus(ans2))}"

        if (code==11)
        {
            return b
        }
        else
            return a
        }


    }



