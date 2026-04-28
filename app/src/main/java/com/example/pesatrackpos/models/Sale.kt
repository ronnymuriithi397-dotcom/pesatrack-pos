package com.example.pesatrackpos.models

import androidx.room.PrimaryKey

data class Sale(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val totalAmount: Double,
    val cashGiven: Double,
    val change: Double,
    val timestamp: Long = System.currentTimeMillis(),
    val cashierName: String
)