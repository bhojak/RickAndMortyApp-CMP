package com.bhojak.ricky.cmp.repository

import com.bhojak.ricky.cmp.domain.model.Character

interface IRemoteData {
    suspend fun getCharactersFromApi(): List<Character>
    suspend fun getCharacterFromApi(id: Int): Character
}