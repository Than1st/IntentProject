package com.than.intentproject

import java.io.Serializable

data class Person(
    val nama: String,
    val umur: Int,
    val tinggi: Double
) : Serializable
