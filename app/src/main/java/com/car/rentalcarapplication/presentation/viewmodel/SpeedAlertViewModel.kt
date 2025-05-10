package com.car.rentalcarapplication.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.car.rentalcarapplication.domain.usecase.MonitorSpeedUseCase
import com.car.rentalcarapplication.domain.usecase.NotifyViolationUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SpeedAlertViewModel @Inject constructor(
    private val monitorSpeedUseCase: MonitorSpeedUseCase
) : ViewModel() {

    private val _alertMessage = MutableLiveData<String>()
    val alertMessage: LiveData<String> = _alertMessage

    fun monitorSpeed(rentalId: String) {
        val result = monitorSpeedUseCase.execute(rentalId)
        result.let {
            _alertMessage.value = it
        }
    }
}
