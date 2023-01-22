package ru.justagod.scapi.models

import io.ktor.util.*

enum class Order {
    ASC,
    DESC;

    override fun toString(): String {
        return super.toString().toLowerCasePreservingASCIIRules()
    }
}