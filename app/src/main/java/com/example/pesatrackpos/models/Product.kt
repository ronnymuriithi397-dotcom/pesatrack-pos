package com.example.pesatrackpos.models

import androidx.room.PrimaryKey

data class Product(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val price: Double,
    val stock: Int,
    val category: String = "General"
)