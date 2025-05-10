# RentalApplicationDummy
Car Rental application sample with dummy data.

# Speed Alert System
A clean architecture Android App in kotlin for a Car rental company to monitor and
notify speed violations by customers.
Uses MVVM, Hilt for DI and Firebase/AWS for notifications.

# Use Case
-Rental company can set a max speed to customers before a trip.
-If the Customer exceeds this speed limit :
 -A Warning is triggered for the customer.
 -The Rental company is notified(via Firebase or AWS)

# Architecture

com.example.speedalert/
│
├── data/
│ ├── model/
│ │ ├── Rental.kt
│ │ └── SpeedViolation.kt
│ └── repository/
│ └── SpeedMonitorRepositoryImpl.kt
│
├── di/
│ ├── AppModule.kt
│ └── NotifierModule.kt
│
├── domain/
│ ├── repository/
│ │ └── SpeedMonitorRepository.kt
│ └── usecase/
│ ├── MonitorSpeedUseCase.kt
│ └── NotifyViolationUseCase.kt
│
├── presentation/
│ ├── ui/
│ │ └── MainActivity.kt
│ └── viewmodel/
│ └── SpeedAlertViewModel.kt
