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
            Product("Adidas Hat", "RM90", "hat01"),
            Product("Nike Hat", "RM110", "hat02"),
            Product("Puma Hat", "RM82", "hat03"),
            Product("Under Amour Hat", "RM150", "hat04")
    )

    val hoodies = listOf(
            Product("Adidas Hoodie", "RM90", "hoodie01"),
            Product("Nike Hoodie", "RM110", "hoodie02"),
            Product("Puma Hoodie", "RM82", "hoodie03"),
            Product("Under Amour Hoodie", "RM150", "hoodie04")
    )

    val shirt = listOf(
            Product("Adidas Shirt", "RM90", "shirt01"),
            Product("Nike Shirt", "RM110", "shirt02"),
            Product("Puma Shirt", "RM82", "shirt03"),
            Product("Under Amour Shirt", "RM150", "shirt04"),
            Product("Gucci Shirt", "RM200", "shirt05")
    )
}