package com.bhojak.ricky.cmp.domain.interactors

import com.bhojak.ricky.cmp.domain.IRepository
import com.bhojak.ricky.cmp.domain.interactors.type.BaseUseCase
import com.bhojak.ricky.cmp.domain.model.Character
import kotlinx.coroutines.CoroutineDispatcher

class GetCharactersUseCase(
    private val repository: IRepository,
    dispatcher: CoroutineDispatcher,
) : BaseUseCase<Unit, List<Character>>(dispatcher){
    override suspend fun block(param: Unit): List<Character> = repository.getCharacters()
}