package ru.godsonpeya.mvvmbasic.ui.quotes

import androidx.lifecycle.ViewModel
import ru.godsonpeya.mvvmbasic.data.Quote
import ru.godsonpeya.mvvmbasic.data.QuoteRepository

// QuoteRepository dependency will again be passed in the
// constructor using dependency injection
class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}