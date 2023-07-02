package com.example.qutoes

import android.content.Context
import androidx.compose.runtime.mutableStateOf

import com.example.qutoes.models.Quote
import com.google.gson.Gson
import java.nio.charset.Charset

object DataManager {
    var data = emptyArray<Quote>()
    var isDataLoaded = mutableStateOf(false)
    fun loadAssetsFromFile(context:Context){
        val inputStream = context.assets.open("quotes.json")
        val size : Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charset.defaultCharset())
        val gson = Gson ()
        data = gson.fromJson(json, Array<Quote>::class.java)
        isDataLoaded.value = true
    }
}
/*
object DataManager: Defines a singleton object called DataManager which will hold
 the data and functionality related to managing quotes.

var data = emptyArray<Quote>(): Declares a mutable variable data of type
Array<Quote> to store the loaded quotes. It is initially set to an empty array.

fun loadAssetsFromFile(context: Context): Defines a function named
loadAssetsFromFile that takes a Context parameter. This function is
responsible for reading and parsing the JSON file.

val inputStream = context.assets.open("quotes.json"): Opens an input stream to read
the quotes.json file located in the assets folder of the provided Context.

val size: Int = inputStream.available(): Retrieves the size
 (in bytes) of the input stream.

val buffer = ByteArray(size): Creates a byte array with
a size equal to the size of the input stream.

inputStream.read(buffer): Reads the content of the
 input stream into the buffer byte array.

inputStream.close(): Closes the input stream to release system resources.

val json = String(buffer, Charset.defaultCharset()): Converts the byte array
buffer to a String using the default character set.

val gson = Gson(): Creates a Gson instance, which is a library for converting
 JSON strings to objects and vice versa.

data = gson.fromJson(json, Array<Quote>::class.java): Uses Gson to parse the JSON
 string json into an array of Quote objects.
 The parsed data is assigned to the data variable.

This code sets up a DataManager object with a function loadAssetsFromFile that
 reads a JSON file (quotes.json) from the assets folder, parses it using Gson,
  and stores the resulting quotes in the data variable.

Remember to import the necessary dependencies
(import com.google.gson.Gson and import java.nio.charset.Charset)
 for the code to work correctly.
 */