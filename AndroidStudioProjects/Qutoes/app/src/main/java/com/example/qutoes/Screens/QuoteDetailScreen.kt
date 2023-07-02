package com.example.qutoes.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.example.qutoes.R
import com.example.qutoes.models.Quote


@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun QuoteDetail(quote:Quote) {
    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFFffffff),
                        Color(0xFFE3E3E3)
                    )
                )
            )
    ){
        Card(elevation = CardDefaults.cardElevation(4.dp),
            modifier = Modifier
                .padding(32.dp)
        ) {
            Image(imageVector = Icons.Filled.FormatQuote,
                contentDescription ="Quote",
                modifier = Modifier
                    .size(90.dp)
                    .rotate(180F)
            )
            Text(text = quote.text,
                fontFamily = FontFamily(Font(R.font.fontnumber4)),
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(text = quote.author,
                fontFamily = FontFamily(Font(R.font.fontnumber4)),
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}