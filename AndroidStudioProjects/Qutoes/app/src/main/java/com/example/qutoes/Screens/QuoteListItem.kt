package com.example.qutoes.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import com.example.qutoes.models.Quote

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun quoteListItem(quote:Quote, onClick:()->Unit) {
Card(elevation = CardDefaults.cardElevation(4.dp),
modifier = Modifier
    .clickable { onClick }
    .padding(9.dp)
) {
Row( modifier = Modifier.
  padding(16.dp)) {



    Image(imageVector = Icons.Filled.FormatQuote,
        contentDescription = "Quote",
    colorFilter = ColorFilter.tint(Color.Blue),
    alignment = Alignment.TopStart,
        modifier = Modifier
            .size(40.dp)
            .rotate(180F)
            .background(Color.Black)
    )
    Spacer(modifier = Modifier.padding(16.dp))

    // here our column composable is taking the whole width it is because
    //because of the weight(1f) property
    Column(modifier = Modifier.weight(1f)) {
        Text(text = quote.text,
        style = MaterialTheme.typography.titleMedium,
        modifier = Modifier.padding(0.dp, 0.dp, 10.dp)


        )
        
        Box(modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth(.4f) // 40 % space it will take
            .height(1.dp)
        )

        Text(text = quote.author,
        style = MaterialTheme.typography.bodySmall,
        modifier = Modifier.padding(6.dp))
    }
}
}

    }



