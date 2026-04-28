package com.example.pesatrackpos.models

import androidx.room.PrimaryKey

data class SaleItem(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val saleId: Int,
    val productName: String,
    val productPrice: Double,
    val quantity: Int
)