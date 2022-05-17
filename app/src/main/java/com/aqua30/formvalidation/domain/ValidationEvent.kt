package com.aqua30.formvalidation.domain

/**
 * Created by Saurabh
 */
sealed class ValidationEvent {
    object Success: ValidationEvent()
}
