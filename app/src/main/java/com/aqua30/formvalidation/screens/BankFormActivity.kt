package com.aqua30.formvalidation.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.aqua30.formvalidation.ui.theme.LearnComposeTheme

/**
 * Created by Saurabh
 */
class BankFormActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnComposeTheme {
                Surface {
                    BankForm()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BankFormPreview() {
    LearnComposeTheme {
        BankForm()
    }
}