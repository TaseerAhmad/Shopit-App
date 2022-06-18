package com.fyp.shopit.repository

import com.fyp.shopit.dao.CategoryService
import com.fyp.shopit.model.RetrofitClient
import kotlinx.coroutines.*

class CategoryRepository {
    private val categoryService = RetrofitClient.getInstance()
        .create(CategoryService::class.java)

    suspend fun getCategories(offset: Int, limit: Int) = coroutineScope {
        withContext(Dispatchers.IO) {
            return@withContext categoryService.getCategories(offset, limit)
        }
    }

}