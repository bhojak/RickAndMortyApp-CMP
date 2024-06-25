package com.bhojak.ricky.cmp.domain.interactors

import com.bhojak.ricky.cmp.domain.IRepository
import com.bhojak.ricky.cmp.domain.interactors.type.BaseUseCaseFlow
import com.bhojak.ricky.cmp.domain.model.Character
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow

class GetCharactersFavoritesUseCase(
    private val repository: IRepository,
    dispatcher: CoroutineDispatcher,
) : BaseUseCaseFlow<Unit,List<Character>>(dispatcher) {
    override suspend fun build(param: Unit): Flow<List<Character>> = repository.getCharactersFavorites()
}