package ru.kazakovanet.quotes.ui.quotes

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ru.kazakovanet.quotes.data.model.Quote
import ru.kazakovanet.quotes.data.repository.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

    fun getQuotes(): LiveData<List<Quote>> = quoteRepository.getQuotes()
}
