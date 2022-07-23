/**
 * Below method is to explain variables in kotlin
 */
fun main(args: Array<String>) {
    var tvShows = "many"  //mutable
    println(tvShows)
    tvShows = "too many"
    println(tvShows)

    val age = 25 //immutable
    println(age)

    //Variables and Strings Exercise

    //Problem 1
    val catName = "My cat\'s name is Fluppy"
    println(catName)

    //Problem 2
    val slashes = "There are two types of slashes \\ and / "
    println(slashes)

    //Problem 3
    val url = "https://www.google.com "
    println(url)

    //Draw Bunny
    val bunny = "(\\(\\\n" +
            "(-.-)\n" +
            "O_(\")(\")"
    println(bunny)


}