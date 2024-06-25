package com.bhojak.ricky.cmp.presentation.ui.features.characters

import com.bhojak.ricky.cmp.domain.model.Character
import com.bhojak.ricky.cmp.presentation.model.ResourceUiState
import com.bhojak.ricky.cmp.presentation.mvi.UiEffect
import com.bhojak.ricky.cmp.presentation.mvi.UiEvent
import com.bhojak.ricky.cmp.presentation.mvi.UiState

interface CharactersContract {
    sealed interface Event : UiEvent {
        object OnTryCheckAgainClick : Event
        object OnFavoritesClick : Event
        data class OnCharacterClick(val idCharacter: Int) : Event
    }

    data class State(
        val characters: ResourceUiState<List<Character>>
    ) : UiState

    sealed interface Effect : UiEffect {
        data class NavigateToDetailCharacter(val idCharacter: Int) : Effect
        object NavigateToFavorites : Effect
    }
}


