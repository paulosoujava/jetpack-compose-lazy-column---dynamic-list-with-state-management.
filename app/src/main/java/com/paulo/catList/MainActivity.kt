package com.paulo.catList

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import hoods.com.lazycolumnlayout.ui.theme.LazyColumnLayoutTheme

class MainActivity : ComponentActivity() {
    val catsViewModel by viewModels<CatsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumnLayoutTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Home(
                        catsViewModel.cats,
                        { catsViewModel.addCat(it) },
                        { catsViewModel.removeCat(it) }
                    )

                }

            }
        }
    }
}
