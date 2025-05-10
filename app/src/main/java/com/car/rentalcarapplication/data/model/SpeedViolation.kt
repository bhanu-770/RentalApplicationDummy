package com.car.rentalcarapplication.data.model

class SpeedViolation(
    val rentalId : String,
    val actualSpeed : Int,
    val maxAllowedSpeed : Int,
    val timeStamp : Long = System.currentTimeMillis()
)