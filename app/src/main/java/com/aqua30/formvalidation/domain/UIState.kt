package com.aqua30.formvalidation.domain

/**
 * Created by Saurabh
 */
data class UIState(
    val accountNumber: String = "",
    val confirmAccountNumber: String = "",
    val code: String = "",
    val ownerName: String = "",
    val hasAccountError: Boolean = false,
    val hasConfirmAccountError: Boolean = false,
    val hasCodeError: Boolean = false,
    val hasNameError: Boolean = false,
)