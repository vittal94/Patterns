package org.example.kotlinCode.composite.movieComponent

interface MovieComponent {
    fun play(): String
    fun stop(): String
}

class Movie(private val name: String) : MovieComponent {

    override fun play(): String {
        return "Playing movie name: $name\n"
    }

    override fun stop(): String {
        return "Stopping movie name: $name\n"
    }
}

class PlayList(private val name: String) : MovieComponent {
    private val movieComponents = mutableListOf<MovieComponent>()

    fun add(movieComponent: MovieComponent) {
        movieComponents.add(movieComponent)
    }

    override fun play(): String = StringBuilder().apply {
        append("Playing playlist name: $name\n")
        for(movieComponent in movieComponents)
            append(movieComponent.play())
    }.toString()


    override fun stop(): String = StringBuilder().apply {
        append("Stopping playlist name: $name\n")
        for(movieComponent in movieComponents)
            append(movieComponent.stop())
    }.toString()
}

fun movieService() {
    val actionMoviePlayList = PlayList("ActionMovie").apply {
        add(Movie("Matrix"))
        add(Movie("Die Hard"))
    }

    val comicMoviesPlayList = PlayList("ComicMovie").apply {
        add(Movie("The hangover"))
        add(Movie("Naked gun"))
    }

    val allPlayList = PlayList("All movies").apply {
        add(actionMoviePlayList)
        add(comicMoviesPlayList)
    }

    val playResult = allPlayList.play()
    val stopResult = allPlayList.stop()

    println("Play result is: $playResult\n")
    println("Stop result is: $stopResult\n")

}