package ru.kazakovanet.quotes.data.model

/**
 * Created by NKazakova on 28.06.2020.
 */
data class Quote(
    val text: String,
    val author: String
) {
    override fun toString(): String {
        return "$text - $author"
    }
}