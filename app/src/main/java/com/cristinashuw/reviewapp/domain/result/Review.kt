package com.cristinashuw.reviewapp.domain.result

data class Review(
        var id: Long,
        var productId: Long,
        var rating: Int,
        var title: String,
        var description: String,
        var date: String,
        var username: String

)