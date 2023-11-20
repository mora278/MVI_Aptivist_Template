package com.mora278.mviaptivist.data.implementations

import com.mora278.mviaptivist.data.models.CoffeeDTO
import com.mora278.mviaptivist.data.utils.toDomain
import com.mora278.mviaptivist.domain.repository.ICoffeeRepository
import kotlinx.serialization.json.Json
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

class CoffeeRepositoryImp(
    private val okHttpClient: OkHttpClient,
) {
    fun getCoffee() {
        val request = Request.Builder().url(BASE_URL).build()
        okHttpClient.newCall(request).enqueue(
            object : Callback {
                override fun onFailure(call: Call, e: IOException) {
                    TODO("Not yet implemented")
                }

                override fun onResponse(call: Call, response: Response) {
                    response.body?.toString()?.let {
                        Json.decodeFromString<CoffeeDTO>(it).toDomain()
                    }
                }
            }
        )
    }

    companion object {
        private const val BASE_URL = "https://coffee.alexflipnote.dev/random.json"
    }
}