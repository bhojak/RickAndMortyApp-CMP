package com.bhojak.ricky.cmp.presentation.ui.features.characters

import cafe.adriel.voyager.core.model.coroutineScope
import com.bhojak.ricky.cmp.domain.interactors.GetCharactersUseCase
import com.bhojak.ricky.cmp.presentation.mvi.BaseViewModel
import com.bhojak.ricky.cmp.presentation.model.ResourceUiState
import kotlinx.coroutines.launch

class CharactersViewModel(
    private val getCharactersUseCase: GetCharactersUseCase,
) : BaseViewModel<CharactersContract.Event, CharactersContract.State, CharactersContract.Effect>() {

    init {
        getCharacters()
    }

    override fun createInitialState(): CharactersContract.State =
        CharactersContract.State(characters = ResourceUiState.Idle)

    override fun handleEvent(event: CharactersContract.Event) {
        when (event) {
            CharactersContract.Event.OnTryCheckAgainClick -> getCharacters()
            is CharactersContract.Event.OnCharacterClick -> setEffect {
                CharactersContract.Effect.NavigateToDetailCharacter(
                    event.idCharacter
                )
            }

            CharactersContract.Event.OnFavoritesClick -> setEffect { CharactersContract.Effect.NavigateToFavorites }
        }
    }

    private fun getCharacters() {
        setState { copy(characters = ResourceUiState.Loading) }
        coroutineScope.launch {
            getCharactersUseCase(Unit)
                .onSuccess {
                    setState {
                        copy(
                            characters = if (it.isEmpty())
                                ResourceUiState.Empty
                            else
                                ResourceUiState.Success(it)
                        )
                    }
                }
                .onFailure { setState { copy(characters = ResourceUiState.Error()) } }
        }
    }
}
