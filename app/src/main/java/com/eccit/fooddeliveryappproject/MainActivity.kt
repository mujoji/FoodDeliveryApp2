package com.eccit.fooddeliveryappproject

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eccit.fooddeliveryappproject.adapter.DishAdapter
import com.eccit.fooddeliveryappproject.models.Dish

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerview.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<Dish>()

        data.add(Dish(R.drawable.cheeseburger, "Cheese Burger", "Our simple, classic cheeseburger begins with a 100% pure beef burger patty seasoned with just a pinch of salt and pepper."))
        data.add(Dish(R.drawable.cheeseburger, "Fried Chicken", "Lorem ipsum sir dolor amet..."))
        data.add(Dish(R.drawable.ic_keyboard_black_24dp, "Coba aja", "Lorem ipsum sir dolor amet..."))

        val adapter = DishAdapter(data)
        recyclerview.adapter = adapter
    }
}
