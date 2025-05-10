package com.car.rentalcarapplication.di

import com.car.rentalcarapplication.data.repository.SpeedMonitorRepositoryImpl
import com.car.rentalcarapplication.domain.repository.SpeedMonitorRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideSpeedMonitorRepository() : SpeedMonitorRepository{
        return SpeedMonitorRepositoryImpl()
    }
}