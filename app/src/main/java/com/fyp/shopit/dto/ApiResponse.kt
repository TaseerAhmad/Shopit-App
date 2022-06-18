package com.fyp.shopit.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiResponse<T>(
    @field:Json(name = "message") val message: String,
    @field:Json(name = "statusCode") val statusCode: Int,
    @field:Json(name = "responseData") val responseData: T?
)