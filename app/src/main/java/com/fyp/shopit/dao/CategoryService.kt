package com.fyp.shopit.dao

import com.fyp.shopit.dto.ApiResponse
import com.fyp.shopit.dto.api.CategoryResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CategoryService {
    @GET("category/all")
    suspend fun getCategories(@Query("off") offset: Int, @Query("lim") limit: Int): ApiResponse<CategoryResponse>
}