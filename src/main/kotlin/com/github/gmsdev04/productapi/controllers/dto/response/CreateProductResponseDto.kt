package com.github.gmsdev04.productapi.controllers.dto.response

data class CreateProductResponseDto(
    val id : Long,
    val name : String,
    val description : String
)