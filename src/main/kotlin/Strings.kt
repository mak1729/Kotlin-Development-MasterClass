/**
 * Below method is to explain String in kotlin
 */

const val URL_LINK = "https://www.google.com"

fun main(args: Array<String>) {
    //Usage of escape "\" in String
    println("The number is \"yes\" so we can proceed.")
    println("I want to put \\ in my string.")

    //String Functions
    val myPet = "crocodile"
    println(myPet.length)  //length
    println(myPet.capitalize()) //capitalize decapitalize

    val myText = "  There are too many spaces   "
    println(myText.trim())  //trim
    println(myPet.get(3))

    //String Templates
    println("I have ${1+1} cats")

    //Constant
    println("Accessing URL $URL_LINK")

}