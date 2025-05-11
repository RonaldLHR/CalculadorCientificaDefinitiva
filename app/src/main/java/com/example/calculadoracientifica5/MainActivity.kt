package com.example.calculadoracientifica5

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var mr: Double = 0.0
        var isResult = false


        var operadorMOD = false
        var tempMOD10  = 0.0
        var tempMOD02 = 0.0


        // Declarando as variáveis para cada botão e o display


        // Funação Fatorial
        fun fatorial(n: Int): Long {
            var result: Long = 1
            for (i in 1..n) {
                result *= i
            }
            return result
        }

        var historico = findViewById<TextView>(R.id.historico)

        var btnDegRad = findViewById<Button>(R.id.BTNDEGRAD)
        var display = findViewById<TextView>(R.id.display)
        var btnMRC = findViewById<Button>(R.id.btnMRC)
        var btnMMenos = findViewById<Button>(R.id.btnMMenos)
        var btnMMais = findViewById<Button>(R.id.btnMMais)
        var btnCE = findViewById<Button>(R.id.btnCE)
        var btnC = findViewById<Button>(R.id.btnC)
        var btnSeno = findViewById<Button>(R.id.btnseno)
        var btnCoseno = findViewById<Button>(R.id.btncoseno)
        var btnTangente = findViewById<Button>(R.id.btntangente)
        var btnEuler = findViewById<Button>(R.id.btneuler)
        var btnArcoosn = findViewById<Button>(R.id.btarcoosn)
        var btnCosen = findViewById<Button>(R.id.btnCosen)
        var btnAnt = findViewById<Button>(R.id.btnant)
        var btnPi = findViewById<Button>(R.id.btnpi)
        var btnQuadrado = findViewById<Button>(R.id.btnquadrado)
        var btn1SobreX = findViewById<Button>(R.id.btn1sobrex)
        var btnAbs = findViewById<Button>(R.id.btnabs)
        var btnEx = findViewById<Button>(R.id.btnex)
        var btnMOD = findViewById<Button>(R.id.btnMOD)
        var btnRaizQ = findViewById<Button>(R.id.btnRaizQ)
        var btnParentesB = findViewById<Button>(R.id.btnParentesB)
        var btnParentesF = findViewById<Button>(R.id.btnParentesF)
        var btnNFatorial = findViewById<Button>(R.id.btnNFatorial)
        var btnDividir = findViewById<Button>(R.id.btnDividir)
        var btnXy = findViewById<Button>(R.id.btnXy)
        var btn7 = findViewById<Button>(R.id.btn7)
        var btn8 = findViewById<Button>(R.id.btn8)
        var btn9 = findViewById<Button>(R.id.btn9)
        var btnMultiplicar = findViewById<Button>(R.id.btnMultiplicar)
        var btn10x = findViewById<Button>(R.id.btn10x)
        var btn4 = findViewById<Button>(R.id.btn4)
        var btn5 = findViewById<Button>(R.id.btn5)
        var btn6 = findViewById<Button>(R.id.btn6)
        var btnMenos = findViewById<Button>(R.id.btnMenos)
        var btnLog = findViewById<Button>(R.id.btnlog)
        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        var btn3 = findViewById<Button>(R.id.btn3)
        var btnMais = findViewById<Button>(R.id.btnMais)
        var btnLn = findViewById<Button>(R.id.btnln)
        var btn0 = findViewById<Button>(R.id.btn0)
        var btnPonto = findViewById<Button>(R.id.btnPonto)
        var btnIgual = findViewById<Button>(R.id.btnIgual)

        btn0.setOnClickListener {
            if (display.text.toString() == "0" || isResult == true)  {
                display.text = "0"
            } else {
                display.text = display.text.toString() + "0"
            }

        }

        btn1.setOnClickListener {
            if (display.text.toString() == "0" || isResult == true ) {
                display.text = "1"
                isResult = false
            } else {
                display.text = display.text.toString() + "1"
            }

        }
        btn2.setOnClickListener {
            if (display.text.toString() == "0" || isResult == true ) {
                display.text = "2"
                isResult = false
            } else {
                display.text = display.text.toString() + "2"
            }

        }

        btn3.setOnClickListener {
            if (display.text.toString() == "0" || isResult == true ) {
                display.text = "3"
                isResult = false
            } else {
                display.text = display.text.toString() + "3"
            }

        }

        btn4.setOnClickListener {
            if (display.text.toString() == "0" || isResult == true ) {
                display.text = "4"
                isResult = false
            } else {
                display.text = display.text.toString() + "4"
            }

        }

        btn5.setOnClickListener {
            if (display.text.toString() == "0" || isResult == true ) {
                display.text = "5"
                isResult = false
            } else {
                display.text = display.text.toString() + "5"
            }

        }

        btn6.setOnClickListener {
            if (display.text.toString() == "0" || isResult == true ) {
                display.text = "6"
                isResult = false
            } else {
                display.text = display.text.toString() + "6"
            }

        }

        btn7.setOnClickListener {
            if (display.text.toString() == "0" || isResult == true ) {
                display.text = "7"
                isResult = false
            } else {
                display.text = display.text.toString() + "7"
            }

        }

        btn8.setOnClickListener {
            if (display.text.toString() == "0" || isResult == true ) {
                display.text = "8"
                isResult = false
            } else {
                display.text = display.text.toString() + "8"
            }

        }

        btn9.setOnClickListener {
            if (display.text.toString() == "0" || isResult == true ) {
                display.text = "9"
                isResult = false
            } else {
                display.text = display.text.toString() + "9"
            }

        }

        btnCE.setOnClickListener {
            display.setText("0")
            isResult = false
            historico.text = ""
        }

        btnC.setOnClickListener {

            display.text = display.text.toString().drop(1)
            if (display.text == "")
                display.setText("0")

        }
        btnPonto.setOnClickListener {
            if (!display.text.contains("."))
                display.setText(display.text.toString().plus("."))
        }

        btnMRC.setOnClickListener {
            display.setText(mr.toString())
        }

        btnMMais.setOnClickListener {
            mr += display.text.toString().toDouble()
            display.setText("0")
            isResult = true
        }

        btnMMenos.setOnClickListener {
            mr -= display.text.toString().toDouble()
            display.setText("0")
            isResult = true
        }

        btnEuler.setOnClickListener {
            var euler = Math.E

            if (display.text.toString().equals("0") || isResult) {
                display.text = String.format("%.2f", euler)
                display.text = display.text.toString().replace(",", ".")
            } else {
                display.text = String.format("%.2f", euler)
                display.text = display.text.toString().replace(",", ".")
            }
            isResult = true
        }

        btnPi.setOnClickListener {
            var pi = Math.PI

            if (display.text.toString().equals("0") || isResult) {
                display.text = String.format("%.2f", pi)
                display.text = display.text.toString().replace(",", ".")
            } else {
                display.text = String.format("%.2f", pi)
                display.text = display.text.toString().replace(",", ".")
            }
            isResult = true
        }
        btnSeno.setOnClickListener {
            var calc = Math.sin(display.text.toString().toDouble())
            display.text= String.format("%.2f", calc).replace(",", ".")
            isResult = true
        }

        btnCosen.setOnClickListener {
            var calc = Math.cos(display.text.toString().toDouble())
            display.text= String.format("%.2f", calc).replace(",", ".")
            isResult = true
        }

        btnTangente.setOnClickListener {
            var calc = Math.tan(display.text.toString().toDouble())
            display.text= String.format("%.2f", calc).replace(",", ".")
            isResult = true
        }

        btnArcoosn.setOnClickListener {
            var calc = Math.asin(display.text.toString().toDouble())
            var calctrat = calc*(180/Math.PI)
            display.text= String.format("%.2f", calctrat).replace(",", ".")
            isResult = true
        }

        btnCoseno.setOnClickListener {
            var calc = Math.acos(display.text.toString().toDouble())
            var calctrat = calc*(180/Math.PI)
            display.text= String.format("%.2f", calc).replace(",", ".")
            isResult = true
        }

        btnAnt.setOnClickListener {
            var calc = Math.atan(display.text.toString().toDouble())
            var calctrat = calc*(180/Math.PI)
            display.text= String.format("%.2f", calc).replace(",", ".")
            isResult = true
        }

        btnNFatorial.setOnClickListener {
            var n = display.text.toString().toInt()
            var resultado = fatorial(n)
            display.text = resultado.toString()
        }
        btnQuadrado.setOnClickListener {
            var x = display.text.toString().toDouble()
            var calc = Math.pow(x,2.0)
            display.text = calc.toString()
            isResult = true
        }

        btnRaizQ.setOnClickListener {

            var x = display.text.toString().toDouble()
            var calc = Math.sqrt(x)
            display.text = calc.toString()
            isResult = true
        }

        btn1SobreX.setOnClickListener {

            var x = display.text.toString().toDouble()
            var calc = 1/x
            display.text = calc.toString()
            isResult = true
        }

        btnAbs.setOnClickListener {

            var x = display.text.toString().toDouble()
            var calc = Math.abs(x)
            display.text = calc.toString()
            isResult = true
        }

        btnEx.setOnClickListener {
            var x =display.text.toString().toDouble()
            var e = Math.E
            var calc = Math.pow(e ,x)
            display.text = calc.toString()
            isResult = true
        }

        btn10x.setOnClickListener {
            var x = display.text.toString().toDouble()
            var calc = Math.pow(10.0, x)
            display.text = calc.toString()
            isResult = true
        }

        btnLn.setOnClickListener {
            var x = display.text.toString().toDouble()
            var calc = Math.log(x)
            display.text = calc.toString()
            isResult = true
        }
        btnLog.setOnClickListener {
            var x  = display.text.toString().toDouble()
            var calc = Math.log10(x)
            display.text = calc.toString()
            isResult = true
        }

        btnMOD.setOnClickListener {
           tempMOD10 = display.text.toString().toDouble()
            display.text == "0"
            operadorMOD = true

        }

        btnIgual.setOnClickListener {
            if (operadorMOD == true) {
                tempMOD02 = display.text.toString().toDouble()
                var calc = tempMOD10 % tempMOD02

                display.text = calc.toString()
                tempMOD10 = 0.0
                tempMOD02 = 0.0
                operadorMOD = false
                isResult = true
            }
        }
        btnMais.setOnClickListener {

            var tempo = historico.text.toString()

            if (!historico.text.toString().endsWith("+")) {

                if (tempo != "") {
                    historico.setText(tempo + "+" + display.text.toString())
                }
                else if (tempo == ""){
                    historico.setText(display.text.toString() + "+")
                }
            }

            else if (historico.text.toString().endsWith("+")){

                historico.setText(tempo + display.text.toString())

            }

            isResult = true
        }

        btnMenos.setOnClickListener {

            var tempo = historico.text.toString()

            if (!historico.text.toString().endsWith("-")) {

                if (tempo != "") {
                    historico.setText(tempo + "-" + display.text.toString())
                }
                else if (tempo == ""){
                    historico.setText(display.text.toString() + "-")
                }
            }

            else if (historico.text.toString().endsWith("-")){

                historico.setText(tempo + display.text.toString())

            }

            isResult = true
        }

        btnMultiplicar.setOnClickListener {

            var tempo = historico.text.toString()

            if (!historico.text.toString().endsWith("*")) {

                if (tempo != "") {
                    historico.setText(tempo + "*" + display.text.toString())
                }
                else if (tempo == ""){
                    historico.setText(display.text.toString() + "*")
                }
            }

            else if (historico.text.toString().endsWith("*")){

                historico.setText(tempo + display.text.toString())

            }

            isResult = true
        }

        btnDividir.setOnClickListener {

            var tempo = historico.text.toString()

            if (!historico.text.toString().endsWith("/")) {

                if (tempo != "") {
                    historico.setText(tempo + "/" + display.text.toString())
                }
                else if (tempo == ""){
                    historico.setText(display.text.toString() + "/")
                }
            }

            else if (historico.text.toString().endsWith("/")){

                historico.setText(tempo + display.text.toString())

            }

            btnParentesB.setOnClickListener {

                historico.setText(historico.text.toString() + "(")
                isResult = true


            }

            btnParentesF.setOnClickListener {

                historico.setText(historico.text.toString() + ")")
                isResult = true


            }


        }
        // Botão RESULTADO

        btnIgual.setOnClickListener {
            if (operadorMOD ==true){
                tempMOD02 = display.text.toString().toDouble()
                var calc = tempMOD10 % tempMOD02

                display.text = calc.toString()
                tempMOD10 = 0.0
                tempMOD02 = 0.0
                operadorMOD = false
                isResult = true

            }

            else{
                historico.setText(historico.text.toString() + "+" + display.text.toString())
                var exp = ExpressionBuilder(historico.text.toString()).build()
                var result = exp.evaluate()
                historico.setText(result.toString())
                isResult = true
                historico.setText("")

            }
        }

    }

}