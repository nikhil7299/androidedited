package com.example.empty_activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class z1checkboxIntent1 : AppCompatActivity() {
    lateinit var btn: Button
    lateinit var pizza: CheckBox
    lateinit var chocolate: CheckBox
    lateinit var coffee: CheckBox
    lateinit var drink: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_z1checkbox_intent1)

            pizza = findViewById(R.id.pizza)
            chocolate = findViewById(R.id.Chocolate)
            coffee = findViewById(R.id.Coffee)
            drink = findViewById(R.id.Drink)
            btn = findViewById(R.id.btn)

            btn.setOnClickListener() {
                var amount: Int = 0
                var result = StringBuilder()
                result.append("Selected Items")

                if (pizza.isChecked) {
                    result.append("\nPizza : ₹150")
                    amount += 150
                }
                if (chocolate.isChecked) {
                    result.append("\nChocolate : ₹250")
                    amount += 250
                }
                if (coffee.isChecked) {
                    result.append("\nCoffee : ₹50")
                    amount += 50
                }
                if (drink.isChecked) {
                    result.append("\nDrink : ₹150")
                    amount += 150
                }
                result.append("\nTotal : ₹${amount}")
//                Toast.makeText(this, result.toString(), Toast.LENGTH_LONG).show()
                val intent = Intent(this,z1checkboxIntent2::class.java)
                intent.putExtra("result",result.toString())
                startActivity(intent)
            }
    }
}