package com.bhojak.ricky.cmp.presentation.ui.features.characters_favorites

import com.bhojak.ricky.cmp.domain.model.Character
import com.bhojak.ricky.cmp.presentation.model.ResourceUiState
import com.bhojak.ricky.cmp.presentation.mvi.UiEffect
import com.bhojak.ricky.cmp.presentation.mvi.UiEvent
import com.bhojak.ricky.cmp.presentation.mvi.UiState

interface CharactersFavoritesContract {
    sealed interface Event : UiEvent {
        object OnBackPressed : Event
        object OnTryCheckAgainClick : Event
        data class OnCharacterClick(val idCharacter: Int) : Event
    }

    data class State(
        val charactersFavorites: ResourceUiState<List<Character>>,
    ) : UiState

    sealed interface Effect : UiEffect {
        data class NavigateToDetailCharacter(val idCharacter: Int) : Effect
        object BackNavigation : Effect

    }
}