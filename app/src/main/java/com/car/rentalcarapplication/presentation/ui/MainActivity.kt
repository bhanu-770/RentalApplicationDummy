package com.car.rentalcarapplication.presentation.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.car.rentalcarapplication.R
import com.car.rentalcarapplication.presentation.viewmodel.SpeedAlertViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel : SpeedAlertViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        viewModel.alertMessage.observe(this){ message ->
            message?.let {
                Toast.makeText(this,"Alert : $it", Toast.LENGTH_LONG).show()
            }
        }

        viewModel.monitorSpeed("Customer123")

    }
}