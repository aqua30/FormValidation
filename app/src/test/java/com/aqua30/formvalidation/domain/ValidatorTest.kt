package com.aqua30.formvalidation.domain

import com.google.common.truth.Truth.assertThat
import org.junit.Test

/**
 * Created by Saurabh
 */
class ValidatorTest {

    @Test
    fun `for empty account number result should be false`() {
        val result = Validator.validateAccountNumber("")
        assertThat(result.status).isFalse()
    }

    @Test
    fun `for account number with less than 5 digits should result in false`() {
        val result = Validator.validateAccountNumber("1234")
        assertThat(result.status).isFalse()
    }
}