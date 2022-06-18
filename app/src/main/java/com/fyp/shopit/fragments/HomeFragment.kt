package com.fyp.shopit.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fyp.shopit.API_URL
import com.fyp.shopit.R
import com.fyp.shopit.dao.CategoryService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okio.IOException
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val retrofit = Retrofit.Builder()
            .baseUrl(API_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        val categoryService = retrofit.create(CategoryService::class.java)

        CoroutineScope(Dispatchers.IO).launch {
            try {
                val apiResponse = categoryService.getCategories(offset = 0, limit = 15)
                Log.d("RESPONSE", apiResponse.toString())
            } catch (ex: IOException) {

            }

        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}