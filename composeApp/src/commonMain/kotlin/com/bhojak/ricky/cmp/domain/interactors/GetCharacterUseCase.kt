package com.bhojak.ricky.cmp.domain.interactors

import com.bhojak.ricky.cmp.domain.IRepository
import com.bhojak.ricky.cmp.domain.interactors.type.BaseUseCase
import com.bhojak.ricky.cmp.domain.model.Character
import kotlinx.coroutines.CoroutineDispatcher

class GetCharacterUseCase(
    private val repository: IRepository,
    dispatcher: CoroutineDispatcher,
) : BaseUseCase<Int, Character>(dispatcher){
    override suspend fun block(param: Int): Character = repository.getCharacter(param)
}