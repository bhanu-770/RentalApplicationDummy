package com.car.rentalcarapplication.domain.notifier

import com.car.rentalcarapplication.data.model.SpeedViolation

class AlertNotifierImpl : AlertNotifier {
    override fun sendViolation(violation: SpeedViolation) {
        //Call firebase/aws endpoint with violation details
    }
}

