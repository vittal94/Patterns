package org.example.kotlinCode.observer.choir

import kotlin.properties.Delegates


class NewsLetter {
    val newstArticleObservers = mutableListOf<(String) -> Unit>()
    var newstArticleUrl: String by Delegates.observable("") {_,_,newValue ->
        newstArticleObservers.forEach {it(newValue)}
    }

}
fun main() {
   val newsLetter = NewsLetter()
    newsLetter.newstArticleObservers.add { newArticlURL -> println("We creating article: $newArticlURL") }

    newsLetter.newstArticleUrl = "dos"  //every time we change the newstArticleUrl property, the delegate was invoked
}