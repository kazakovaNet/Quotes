package ru.kazakovanet.quotes.data.db

import androidx.lifecycle.LiveData
import ru.kazakovanet.quotes.data.model.Quote

/**
 * Created by NKazakova on 28.06.2020.
 */
interface QuoteDao {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}