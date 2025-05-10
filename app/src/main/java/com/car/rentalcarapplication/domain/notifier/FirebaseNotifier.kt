package com.car.rentalcarapplication.domain.notifier

import android.util.Log
import com.car.rentalcarapplication.data.model.SpeedViolation

class FirebaseNotifier : AlertNotifier {
    override fun sendViolation(violation: SpeedViolation) {
        //sending to firebase ( replace with real FCM call
        Log.d("FirebaseNotifier","Sending violation to firebase :$violation")
        /*In realtime, use FirebaseMessagingService for receiving or
          FCM with Http via retrofit for sending*/
    }
}