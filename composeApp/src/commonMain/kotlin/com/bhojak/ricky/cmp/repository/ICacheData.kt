package com.bhojak.ricky.cmp.repository

import com.bhojak.ricky.cmp.domain.model.Character
import kotlinx.coroutines.flow.Flow

interface ICacheData {
    suspend fun addCharacterToFavorite(character: Character)
    suspend fun removeCharacterFromFavorite(idCharacter: Int)
    suspend fun getAllCharacterFavorites(): Flow<List<Character>>
    suspend fun isCharacterFavorite(idCharacter: Int): Boolean
}