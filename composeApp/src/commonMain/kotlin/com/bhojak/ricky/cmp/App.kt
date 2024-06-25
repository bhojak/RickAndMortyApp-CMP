package com.bhojak.ricky.cmp

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import com.bhojak.ricky.cmp.presentation.ui.theme.AppTheme
import com.bhojak.ricky.cmp.presentation.ui.features.characters.CharactersScreen

@Composable
internal fun App() = AppTheme {
    Navigator(CharactersScreen())
}

