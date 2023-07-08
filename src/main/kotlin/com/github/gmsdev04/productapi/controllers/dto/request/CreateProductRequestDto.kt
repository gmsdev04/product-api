package com.github.gmsdev04.productapi.controllers.dto.request

import com.github.gmsdev04.productapi.domain.Product

data class CreateProductRequestDto (
    val id : Long,
    val name : String,
    val description : String
){
    fun toDomain() : Product = Product(
        id = id,
        name = name,
        description = description
    )
}
