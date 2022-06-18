package com.fyp.shopit.dto.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CategoryResponse(
    @field:Json(name = "total") val total: Int,
    @field:Json(name = "limit") val limit: Int,
    @field:Json(name = "offset") val offset: Int,
    @field:Json(name = "categories") val categories: List<Category>
)

@JsonClass(generateAdapter = true)
data class Category(
    @field:Json(name = "_id") val id: String,
    @field:Json(name = "name") val name: String,
    @field:Json(name = "description") val description: String,
    @field:Json(name = "productCount") val productCount: Int,
    @field:Json(name = "createdByUserId") val createdByUser: String?,
    @field:Json(name = "createdAt") val createdAt: String?
)