package com.github.gmsdev04.productapi.controllers

import com.github.gmsdev04.productapi.controllers.dto.request.CreateProductRequestDto
import com.github.gmsdev04.productapi.controllers.dto.response.CreateProductResponseDto
import com.github.gmsdev04.productapi.service.ProductService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(
    val service : ProductService
) {

    fun createProduct(body : CreateProductRequestDto) : ResponseEntity<CreateProductResponseDto> {
        val productCreated = service.create(body.toDomain())

        val response = CreateProductResponseDto(
            id = productCreated.id,
            name = productCreated.name,
            description = productCreated.description
        )

        return ResponseEntity.ok(response)
    }
}