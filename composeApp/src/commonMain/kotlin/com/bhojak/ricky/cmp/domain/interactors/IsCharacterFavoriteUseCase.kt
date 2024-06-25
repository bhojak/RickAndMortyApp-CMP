package com.bhojak.ricky.cmp.domain.interactors

import com.bhojak.ricky.cmp.domain.IRepository
import com.bhojak.ricky.cmp.domain.interactors.type.BaseUseCase
import kotlinx.coroutines.CoroutineDispatcher

class IsCharacterFavoriteUseCase(
    private val repository: IRepository,
    dispatcher: CoroutineDispatcher,
) : BaseUseCase<Int, Boolean>(dispatcher) {
    override suspend fun block(param: Int): Boolean = repository.isCharacterFavorite(param)
}