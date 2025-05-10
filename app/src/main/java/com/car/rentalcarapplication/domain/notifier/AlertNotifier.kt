package com.car.rentalcarapplication.domain.notifier

import com.car.rentalcarapplication.data.model.SpeedViolation


interface AlertNotifier{
    fun sendViolation(violation: SpeedViolation)
}