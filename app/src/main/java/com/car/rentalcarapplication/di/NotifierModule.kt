package com.car.rentalcarapplication.di

import com.car.rentalcarapplication.domain.notifier.AlertNotifier
import com.car.rentalcarapplication.domain.notifier.AlertNotifierImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object NotifierModule {

    @Provides
    fun providesNotifier() : AlertNotifier{
        return AlertNotifierImpl()
    }
}