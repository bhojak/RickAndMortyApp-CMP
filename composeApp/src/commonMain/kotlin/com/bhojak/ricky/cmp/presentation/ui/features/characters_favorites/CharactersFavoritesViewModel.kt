package com.bhojak.ricky.cmp.presentation.ui.features.characters_favorites

import cafe.adriel.voyager.core.model.coroutineScope
import com.bhojak.ricky.cmp.domain.interactors.GetCharactersFavoritesUseCase
import com.bhojak.ricky.cmp.presentation.mvi.BaseViewModel
import com.bhojak.ricky.cmp.presentation.model.ResourceUiState
import kotlinx.coroutines.launch

class CharactersFavoritesViewModel(
    private val getCharactersFavoritesUseCase: GetCharactersFavoritesUseCase
) : BaseViewModel<CharactersFavoritesContract.Event, CharactersFavoritesContract.State, CharactersFavoritesContract.Effect>() {

    init {
        getCharactersFavorites()
    }

    override fun createInitialState(): CharactersFavoritesContract.State =
        CharactersFavoritesContract.State(
            charactersFavorites = ResourceUiState.Idle
        )

    override fun handleEvent(event: CharactersFavoritesContract.Event) {
        when (event) {
            CharactersFavoritesContract.Event.OnTryCheckAgainClick -> getCharactersFavorites()
            is CharactersFavoritesContract.Event.OnCharacterClick ->
                setEffect { CharactersFavoritesContract.Effect.NavigateToDetailCharacter(event.idCharacter) }

            CharactersFavoritesContract.Event.OnBackPressed ->
                setEffect { CharactersFavoritesContract.Effect.BackNavigation }
        }
    }

    private fun getCharactersFavorites() {
        setState { copy(charactersFavorites = ResourceUiState.Loading) }
        coroutineScope.launch {
            getCharactersFavoritesUseCase(Unit).collect {
                it.onSuccess {
                    setState {
                        copy(
                            charactersFavorites =
                            if (it.isEmpty())
                                ResourceUiState.Empty
                            else
                                ResourceUiState.Success(it)
                        )
                    }
                }.onFailure { setState { copy(charactersFavorites = ResourceUiState.Error()) } }
            }
        }
    }
}