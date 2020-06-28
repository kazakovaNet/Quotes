package ru.kazakovanet.quotes.data.repository

import androidx.lifecycle.LiveData
import ru.kazakovanet.quotes.data.db.QuoteDao
import ru.kazakovanet.quotes.data.model.Quote

class QuoteRepositoryImpl(private val quoteDao: QuoteDao) : QuoteRepository {
    override fun addQuote(quote: Quote) = quoteDao.addQuote(quote)

    override fun getQuotes(): LiveData<List<Quote>> = quoteDao.getQuotes()
}