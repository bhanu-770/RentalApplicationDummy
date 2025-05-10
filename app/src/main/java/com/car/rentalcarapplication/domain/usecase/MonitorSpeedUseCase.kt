package com.car.rentalcarapplication.domain.usecase

import com.car.rentalcarapplication.data.model.SpeedViolation
import com.car.rentalcarapplication.domain.repository.SpeedMonitorRepository
import javax.inject.Inject

class MonitorSpeedUseCase @Inject constructor(
    private val repository: SpeedMonitorRepository,
    private val notifyViolationUseCase: NotifyViolationUseCase) {

    fun execute(rentalId : String): String {
        val rental = repository.getRentalInfo(rentalId)
        val currentSpeed = repository.getCurrentSpeed(rental.vehicleId)

        return if (currentSpeed > rental.maxSpeed) {
            val violation = SpeedViolation(
                rentalId = rental.rentalId,
                actualSpeed = currentSpeed,
                maxAllowedSpeed = rental.maxSpeed
            )
            notifyViolationUseCase.execute(violation)
            "Speed limit exceeded : $currentSpeed km/h (Limit : ${rental.maxSpeed})"
        } else {
            "Null"
        }
    }
}