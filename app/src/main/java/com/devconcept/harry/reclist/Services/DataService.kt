package com.devconcept.harry.reclist.Services

import com.devconcept.harry.reclist.Model.Category
import com.devconcept.harry.reclist.Model.Product

/**
 * Created by Harry on 17/11/2017.
 */
object DataService {
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Adidas Hat", "RM90", "hat1"),
            Product("Nike Hat", "RM110", "hat2"),
            Product("Puma Hat", "RM82", "hat3"),
            Product("Under Amour Hat", "RM150", "hat4")
    )

    val hoodies = listOf(
            Product("Adidas Hoodie", "RM90", "hoodie1"),
            Product("Nike Hoodie", "RM110", "hoodie2"),
            Product("Puma Hoodie", "RM82", "hoodie3"),
            Product("Under Amour Hoodie", "RM150", "hoodie4")
    )

    val shirts = listOf(
            Product("Adidas Shirt", "RM90", "shirt1"),
            Product("Nike Shirt", "RM110", "shirt2"),
            Product("Puma Shirt", "RM82", "shirt3"),
            Product("Under Amour Shirt", "RM150", "shirt4"),
            Product("Gucci Shirt", "RM200", "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String): List<Product> {
        when(category) {
            "SHIRTS" -> return shirts
            "HATS" -> return hats
            "HOODIES" -> return hoodies
            else -> return digitalGood
        }
    }
}