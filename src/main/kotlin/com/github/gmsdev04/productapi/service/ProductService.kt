package com.github.gmsdev04.productapi.service

import com.github.gmsdev04.productapi.domain.Product

interface ProductService {
    fun create(product : Product) : Product
}
