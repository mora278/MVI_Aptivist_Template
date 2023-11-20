package com.mora278.mviaptivist.core

import com.mora278.mviaptivist.data.implementations.CoffeeRepositoryImp
import com.mora278.mviaptivist.domain.listeners.ICoffeeListener
import com.mora278.mviaptivist.domain.repository.ICoffeeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import okhttp3.OkHttpClient

object NetworkModule {
    private fun provideOkhttpClient(): OkHttpClient =
        OkHttpClient
            .Builder()
            .build()

    fun provideCoffeeRepository(): Flow<ICoffeeRepository> = callbackFlow {
        val okHttpClient = provideOkhttpClient()
        CoffeeRepositoryImp(
            okHttpClient = okHttpClient,

        )
        send()
    }

    fun provideCoffeeListener() {

    }
}