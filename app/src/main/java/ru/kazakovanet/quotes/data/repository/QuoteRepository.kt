package ru.kazakovanet.quotes.data.repository

import androidx.lifecycle.LiveData
import ru.kazakovanet.quotes.data.model.Quote

/**
 * Created by NKazakova on 29.06.2020.
 */
interface QuoteRepository {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}