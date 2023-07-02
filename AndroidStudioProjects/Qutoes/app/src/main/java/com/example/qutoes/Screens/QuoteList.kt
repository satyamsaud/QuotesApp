package com.example.qutoes.Screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.qutoes.models.Quote

@Composable
fun QuoteList( data: Array<Quote>, onClick: ()->Unit) {
    LazyColumn(content = {
        items(data){
            quoteListItem(quote = it) {
                onClick()
            }
        }
    })
}