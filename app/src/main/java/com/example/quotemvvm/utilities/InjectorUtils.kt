package com.example.quotemvvm.utilities

import com.example.quotemvvm.data.FakeDatabase
import com.example.quotemvvm.data.QuoteRepository
import com.example.quotemvvm.ui.quotes.QuoteViewModelFactory

object InjectorUtils {
    fun provideQuoteViewModelFactory():QuoteViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuoteViewModelFactory(quoteRepository )
    }
}