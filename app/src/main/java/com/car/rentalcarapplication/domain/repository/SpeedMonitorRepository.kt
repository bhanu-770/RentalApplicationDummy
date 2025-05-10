package com.car.rentalcarapplication.domain.repository

import com.car.rentalcarapplication.data.model.Rental
import com.car.rentalcarapplication.data.model.SpeedViolation

interface SpeedMonitorRepository {
    fun getRentalInfo(renalId : String) : Rental
    fun getCurrentSpeed(vehicleId : String) : Int
    fun notifyViolation(violation : SpeedViolation)

}