package com.car.rentalcarapplication.data.repository

import com.car.rentalcarapplication.data.model.Rental
import com.car.rentalcarapplication.data.model.SpeedViolation
import com.car.rentalcarapplication.domain.repository.SpeedMonitorRepository

class SpeedMonitorRepositoryImpl : SpeedMonitorRepository {
    override fun getRentalInfo(renalId: String): Rental {
        //Get the details with Api call
        return Rental(renalId,"Customer123","Car124", maxSpeed = 80)
    }

    override fun getCurrentSpeed(vehicleId: String): Int {
        //Get the current speed reading
        return 100
    }

    override fun notifyViolation(violation: SpeedViolation) {
        println("Send violation to firebase etc $violation")
    }
}