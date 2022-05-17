package com.aqua30.formvalidation.domain

/**
 * Created by Saurabh
 */
sealed class UIEvent {
    data class AccountChanged(val account: String): UIEvent()
    data class ConfirmAccountChanged(val confirmAccount: String): UIEvent()
    data class CodeChanged(val code: String): UIEvent()
    data class NameChanged(val name: String): UIEvent()
    object Submit: UIEvent()
}
