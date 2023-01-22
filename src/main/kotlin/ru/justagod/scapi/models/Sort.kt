package ru.justagod.scapi.models

import io.ktor.util.*

enum class Sort {
    TIME_CREATED,
    TIME_LEFT,
    CURRENT_PRICE,
    BUYOUT_PRICE;

    override fun toString(): String {
        return super.toString().toLowerCasePreservingASCIIRules()
    }
}