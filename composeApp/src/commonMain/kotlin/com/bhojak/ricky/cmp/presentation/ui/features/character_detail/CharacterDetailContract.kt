package com.bhojak.ricky.cmp.presentation.ui.features.character_detail

import com.bhojak.ricky.cmp.domain.model.Character
import com.bhojak.ricky.cmp.presentation.model.ResourceUiState
import com.bhojak.ricky.cmp.presentation.mvi.UiEffect
import com.bhojak.ricky.cmp.presentation.mvi.UiEvent
import com.bhojak.ricky.cmp.presentation.mvi.UiState

interface CharacterDetailContract {
    sealed interface Event : UiEvent {
        object OnFavoriteClick : Event
        object OnTryCheckAgainClick : Event
        object OnBackPressed : Event
    }

    data class State(
        val character: ResourceUiState<Character>,
        val isFavorite: ResourceUiState<Boolean>,
    ) : UiState

    sealed interface Effect : UiEffect {
        object CharacterAdded : Effect
        object CharacterRemoved : Effect
        object BackNavigation : Effect
    }
}