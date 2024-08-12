package com.example.myapplication

import android.os.Bundle
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var firstInput = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result = binding.result
        var firstNumber: Double = 0.0
        var firstNumberPlus = binding.formula
        var calculatePlus = false
        var calculateDevide = false
        var calculateMultiply = false
        var calculateMines = false
        var secondNumber: Double = 0.0

        binding.formula.setOnClickListener {

        }

        binding.zero.setOnClickListener {
            if (firstInput) {
                result.text = "0"
                firstInput = false
            } else{
                result.text = "${result.text}0"
            }
        }

        binding.one.setOnClickListener {
            if (firstInput) {
                result.text = "1"
                firstInput = false
            } else{
                result.text = "${result.text}1"
            }
        }

        binding.two.setOnClickListener {
            if (firstInput) {
                result.text = "2"
                firstInput = false
            } else{
                result.text = "${result.text}2"
            }
        }

        binding.three.setOnClickListener {
            if (firstInput) {
                result.text = "3"
                firstInput = false
            } else{
                result.text = "${result.text}3"
            }
        }

        binding.four.setOnClickListener {
            if (firstInput) {
                result.text = "4"
                firstInput = false
            } else{
                result.text = "${result.text}4"
            }
        }

        binding.five.setOnClickListener {
            if (firstInput) {
                result.text = "5"
                firstInput = false
            } else{
                result.text = "${result.text}5"
            }
        }

        binding.six.setOnClickListener {
            if (firstInput) {
                result.text = "6"
                firstInput = false
            } else{
                result.text = "${result.text}6"
            }
        }

        binding.seven.setOnClickListener {
            if (firstInput) {
                result.text = "7"
                firstInput = false
            } else{
                result.text = "${result.text}7"
            }
        }

        binding.eight.setOnClickListener {
            if (firstInput) {
                result.text = "8"
                firstInput = false
            } else{
                result.text = "${result.text}8"
            }
        }

        binding.nine.setOnClickListener {
            if (firstInput) {
                result.text = "9"
                firstInput = false
            } else{
                result.text = "${result.text}9"
            }
        }

        binding.dot.setOnClickListener {
            if (firstInput) {
                result.text = "."
                firstInput = false
            } else{
                result.text = "${result.text}."
            }
        }

        binding.clear.setOnClickListener {
           result.text = "0"
            firstNumber = 0.0
            firstNumberPlus.text = ""
            calculatePlus = false
            calculateDevide = false
            calculateMultiply = false
            calculateMines = false
            secondNumber = 0.0
            firstInput = true
        }

        binding.plus.setOnClickListener {
            firstNumber = result.text.toString().toDouble()
            firstNumberPlus.text = "${result.text}+"
            calculatePlus = true
            firstInput = true
        }

        binding.devide.setOnClickListener {
            firstNumber = result.text.toString().toDouble()
            firstNumberPlus.text = "${result.text}/"
            calculateDevide = true
            firstInput = true
        }

        binding.multiply.setOnClickListener {
            firstNumber = result.text.toString().toDouble()
            firstNumberPlus.text = "${result.text}*"
            calculateMultiply = true
            firstInput = true
        }

        binding.mines.setOnClickListener {
            firstNumber = result.text.toString().toDouble()
            firstNumberPlus.text = "${result.text}-"
            calculateMines = true
            firstInput = true
        }

        binding.equal.setOnClickListener {
            if (calculatePlus){
                var resultString = result.text.toString()
                secondNumber = resultString.toDouble()
                val resultValue = firstNumber + secondNumber
                val formattedResult = String.format("%.2f", resultValue)
                result.text = formattedResult
                calculatePlus = false
                calculateDevide = false
                calculateMultiply = false
                calculateMines = false
                firstNumberPlus.text = ""
                secondNumber = 0.0
            } else if (calculateDevide){
                var resultString = result.text.toString()
                secondNumber = resultString.toDouble()
                val resultValue = firstNumber / secondNumber
                val formattedResult = String.format("%.2f", resultValue)
                result.text = formattedResult
                calculatePlus = false
                calculateDevide = false
                calculateMultiply = false
                calculateMines = false
                firstNumberPlus.text = ""
                secondNumber = 0.0
            } else if (calculateMultiply){
                var resultString = result.text.toString()
                secondNumber = resultString.toDouble()
                val resultValue = firstNumber * secondNumber
                val formattedResult = String.format("%.2f", resultValue)
                result.text = formattedResult
                calculatePlus = false
                calculateDevide = false
                calculateMultiply = false
                calculateMines = false
                firstNumberPlus.text = ""
                secondNumber = 0.0
            } else if (calculateMines){
                var resultString = result.text.toString()
                secondNumber = resultString.toDouble()
                val resultValue = firstNumber - secondNumber
                val formattedResult = String.format("%.2f", resultValue)
                result.text = formattedResult
                calculatePlus = false
                calculateDevide = false
                calculateMultiply = false
                calculateMines = false
                firstNumberPlus.text = ""
                secondNumber = 0.0
            }
        }

        binding.remove.setOnClickListener {
            val currentText = result.text.toString()
            if (currentText.isNotEmpty()) {
                val newText = result.text.dropLast(1)
                if (newText.isEmpty()) {
                    result.text = "0"
                    firstInput = true
                } else {
                    result.text = newText
                }
            }
        }

        // Ajusta os insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



    }
}
