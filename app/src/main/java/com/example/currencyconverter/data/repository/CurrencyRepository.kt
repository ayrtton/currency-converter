package com.example.currencyconverter.data.repository

import com.example.currencyconverter.data.model.ExchangeResponseValue
import kotlinx.coroutines.flow.Flow

interface CurrencyRepository {
    suspend fun getExchangeValue(currencies: String) : Flow<ExchangeResponseValue>

    suspend fun save(exchange: ExchangeResponseValue)
    fun list(): Flow<List<ExchangeResponseValue>>
}