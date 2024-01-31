package com.jetpack.firstapplication.data

import androidx.lifecycle.ViewModel
import com.jetpack.firstapplication.R

class FoodViewModel : ViewModel() {

    private val names = arrayOf(
        "Paperoni",
        "Vegan",
        "FourCheese",
        "Margaritta",
        "American",
        "Maxican"
    )

    private val ingredients = arrayOf(
        "A classic pizza featuring pepperoni",
        "A pizza designed for those following.",
        "A delicious pizza topped with a blend ",
        "A traditional Italian pizza named after",
        "American-style pizza varies widely but",
        "Inspired by Mexican flavors, this pi ",
    )

    private val image = arrayOf(
        R.drawable.p1,
        R.drawable.p2,
        R.drawable.p3,
        R.drawable.p4,
        R.drawable.khushi,
        R.drawable.ramji
    )

    fun getNames(): Array<String> = names

    fun getIngredients(): Array<String> = ingredients

    fun getImages(): Array<Int> = image





}
