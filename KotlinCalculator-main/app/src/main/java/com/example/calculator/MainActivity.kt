package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /////////////////////////////////////////
        setContentView(R.layout.activity_main)
        var btn = findViewById<Button>(R.id.B1)
        var btn2 = findViewById<Button>(R.id.B2)
        var btn3 = findViewById<Button>(R.id.B3)
        var btn4 = findViewById<Button>(R.id.B4)
        var btn5 = findViewById<Button>(R.id.B5)
        var btn6 = findViewById<Button>(R.id.b6)
        var btn7 = findViewById<Button>(R.id.b7)
        var btn8 = findViewById<Button>(R.id.b8)
        var btn9 = findViewById<Button>(R.id.b9)
        var btn0 = findViewById<Button>(R.id.b0)
        var btnPls = findViewById<Button>(R.id.bPlus)
        var btnMns = findViewById<Button>(R.id.bMinus)
        var btnTms = findViewById<Button>(R.id.bTimes)
        var btnDvd = findViewById<Button>(R.id.bDiv)
        var btnEqls = findViewById<Button>(R.id.bEquals)
        var btnDlt = findViewById<Button>(R.id.bDelete)
        var pantalla = findViewById<TextView>(R.id.Pantalla)
        var n0= 0
        var oper = 0
        btn.setOnClickListener{
            pantalla.text = pantalla.text.toString()+"1"
        }
        btn2.setOnClickListener {
            pantalla.text = pantalla.text.toString()+"2"
        }
        btn3.setOnClickListener {
            pantalla.text = pantalla.text.toString()+"3"
        }
        btn4.setOnClickListener {
            pantalla.text = pantalla.text.toString()+"4"
        }
        btn5.setOnClickListener {
            pantalla.text = pantalla.text.toString()+"5"
        }
        btn6.setOnClickListener {
            pantalla.text = pantalla.text.toString()+"6"
        }
        btn7.setOnClickListener {
            pantalla.text = pantalla.text.toString()+"7"
        }
        btn8.setOnClickListener {
            pantalla.text = pantalla.text.toString()+"8"
        }
        btn9.setOnClickListener {
            pantalla.text = pantalla.text.toString()+"9"
        }
        btn0.setOnClickListener {
            pantalla.text = pantalla.text.toString()+"0"
        }
        btnDlt.setOnClickListener {
            pantalla.text = pantalla.text.toString().dropLast(1)
        }
        btnPls.setOnClickListener {
            n0 =  pantalla.text.toString().toInt()
            pantalla.text = pantalla.text.toString().dropWhile { pantalla.text.toString().count() > 0 }
            oper = 1;
        }
        btnMns.setOnClickListener {
            n0 =  pantalla.text.toString().toInt()
            pantalla.text = pantalla.text.toString().dropWhile { pantalla.text.toString().count() > 0 }
            oper = 2;
        }
        btnTms.setOnClickListener {
            n0 =  pantalla.text.toString().toInt()
            pantalla.text = pantalla.text.toString().dropWhile { pantalla.text.toString().count() > 0 }
            oper = 3;
        }
        btnDvd.setOnClickListener {
            n0 =  pantalla.text.toString().toInt()
            pantalla.text = pantalla.text.toString().dropWhile { pantalla.text.toString().count() > 0 }
            oper = 4;
        }
        btnEqls.setOnClickListener {
            var n1 =  pantalla.text.toString().toInt()
            pantalla.text = pantalla.text.toString().dropWhile { pantalla.text.toString().count() > 0 }
            when(oper){
                1->{
                    pantalla.text = pantalla.text.toString()+(n0+n1)
                }
                2->{
                    pantalla.text = pantalla.text.toString()+(n0-n1)
                }
                3->{
                    pantalla.text = pantalla.text.toString()+(n0*n1)
                }
                4->{
                    pantalla.text = pantalla.text.toString()+(n0/n1)
                }
                else->{
                }
            }

       }
    }
}