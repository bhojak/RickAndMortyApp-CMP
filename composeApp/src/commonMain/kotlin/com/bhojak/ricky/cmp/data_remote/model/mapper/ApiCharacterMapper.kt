package com.bhojak.ricky.cmp.data_remote.model.mapper

import com.bhojak.ricky.cmp.data_remote.model.ApiCharacter
import com.bhojak.ricky.cmp.domain.model.Character
import com.bhojak.ricky.cmp.domain.model.Gender
import com.bhojak.ricky.cmp.domain.model.Status
import com.bhojak.ricky.cmp.domain.model.map.Mapper

class ApiCharacterMapper : Mapper<ApiCharacter, Character>() {
    override fun map(model: ApiCharacter): Character = model.run {
        Character(
            id, name, when (status) {
                "Alive" -> Status.ALIVE
                "Dead" -> Status.DEAD
                else -> Status.UNKNOWN
            }, species, when (gender) {
                "Male" -> Gender.MALE
                "Female" -> Gender.FEMALE
                "Genderless" -> Gender.GENDERLESS
                else -> Gender.UNKNOWN
            }, origin.name, location.name, image
        )
    }

    override fun inverseMap(model: Character): ApiCharacter {
        TODO("Not yet implemented")
    }
}