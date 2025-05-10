package com.car.rentalcarapplication.domain.notifier

import android.util.Log
import com.car.rentalcarapplication.data.model.SpeedViolation

class AwsNotifier : AlertNotifier {
    override fun sendViolation(violation: SpeedViolation) {
        Log.d("AwsNotifier","sending violation to aws: $violation")
        /*In realtime, use retrofit with AWS gateway endpoints to get requests*/
    }
}