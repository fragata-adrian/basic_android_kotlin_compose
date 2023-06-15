package com.example.superhero

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.superhero.ui.theme.SuperHeroTheme
import com.example.superhero.model.HeroesRepository


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperHeroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HeroCard(R.string.hero1, R.string.description1, R.drawable.android_superhero1)
                }
            }
        }
    }
}


@Preview()
@Composable
fun DefaultPreview() {
    val heroes = HeroesRepository.heroes
    SuperHeroTheme {
        Heroes(heroes = heroes)
        //HeroCard(nameRes = heroes[0].nameRes, descriptionRes = heroes[0].descriptionRes, imageRes = heroes[0].imageRes)
    }
}