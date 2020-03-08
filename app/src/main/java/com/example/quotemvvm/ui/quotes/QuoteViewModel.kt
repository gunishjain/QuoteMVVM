package com.example.quotemvvm.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.quotemvvm.data.Quote
import com.example.quotemvvm.data.QuoteRepository

class QuoteViewModel (private val quoteRepository: QuoteRepository)
    :ViewModel()  {
    fun getQuotes() = quoteRepository.getQuotes()
    fun addQuotes(quote: Quote) = quoteRepository.addQuote(quote)
}

