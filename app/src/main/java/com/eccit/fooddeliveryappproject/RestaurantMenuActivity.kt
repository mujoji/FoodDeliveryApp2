package com.eccit.fooddeliveryappproject

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.eccit.fooddeliveryappproject.models.Menus
import com.eccit.fooddeliveryappproject.models.RestaurantModel

@Suppress("DEPRECATION")
class RestaurantMenuActivity : AppCompatActivity() {

    private var menuList: List<Menus?>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_menu)

        val restaurantModel = intent?.getParcelableExtra<RestaurantModel>("RestaurantModel")

        val actionBar: ActionBar? = supportActionBar
        actionBar?.title = restaurantModel?.name
        actionBar?.subtitle = restaurantModel?.address
        actionBar?.setDisplayHomeAsUpEnabled(true)

        menuList = restaurantModel?.menus




    }
}