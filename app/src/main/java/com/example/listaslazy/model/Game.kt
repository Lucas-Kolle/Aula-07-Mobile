package com.example.listaslazy.model

data class Game (

    // Criando um contrutor para passar as informações do "game"
    val id: Long = 0,
    val title: String = "",
    val studio: String = "",
    val releaseYear: Int = 0
)