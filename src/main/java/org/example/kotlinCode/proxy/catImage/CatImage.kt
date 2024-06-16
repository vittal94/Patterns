package org.example.kotlinCode.proxy.catImage

import java.net.URI
import java.net.URL

data class CatImage(val thumbnailURL: String,
    val url: String) {
    val image: ByteArray by lazy {
        println("Loading image")
        URI(url).toURL().readBytes()
    }

}

fun testCatImage() {
    val catImage = CatImage("a","https://youtube.com")
    catImage.image
    catImage.image

}
fun main() {
    testCatImage()
}
