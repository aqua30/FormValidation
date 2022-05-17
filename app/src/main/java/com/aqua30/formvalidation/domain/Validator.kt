package com.aqua30.formvalidation.domain

/**
 * Created by Saurabh
 */
object Validator {

    fun validateAccountNumber(account: String): ValidationResult {
        return ValidationResult(account.isNotEmpty() && account.length > 5)
    }

    fun validateConfirmAccountNumber(account: String, confirmAccount: String): ValidationResult {
        return ValidationResult(confirmAccount.isNotEmpty() && confirmAccount == account)
    }

    fun validateBankCode(code: String): ValidationResult {
        return ValidationResult(code.isNotEmpty())
    }

    fun validateOwnerName(name: String): ValidationResult {
        return ValidationResult(name.isNotEmpty())
    }
}

data class ValidationResult(
    val status: Boolean = false,
)