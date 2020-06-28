package ru.kazakovanet.quotes.data.db

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.kazakovanet.quotes.data.model.Quote

/**
 * Created by NKazakova on 28.06.2020.
 */
class QuoteDaoFakeImpl : QuoteDao {

    private val quotesList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()

    init {
        quotes.value = quotesList
    }

    override fun addQuote(quote: Quote) {
        quotesList.add(quote)
        quotes.value = quotesList
    }

    override fun getQuotes(): LiveData<List<Quote>> = quotes
}