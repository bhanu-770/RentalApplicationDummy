package com.car.rentalcarapplication.domain.usecase

import com.car.rentalcarapplication.data.model.SpeedViolation
import com.car.rentalcarapplication.domain.repository.SpeedMonitorRepository
import javax.inject.Inject

class NotifyViolationUseCase @Inject constructor(
    private val repository: SpeedMonitorRepository
) {
    fun execute(violation: SpeedViolation) {
        repository.notifyViolation(violation)
    }

}