package com.fyp.shopit.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fyp.shopit.repository.CategoryRepository

class HomeViewModel: ViewModel() {
    private val categoryRepository = CategoryRepository();
    private val categories = MutableLiveData<List<Catego>>

    suspend fun getCategories(offset: Int, limit: Int) {
        categoryRepository.getCategories(offset, limit)
    }

}