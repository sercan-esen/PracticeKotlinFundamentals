package com.example.practicekotlinfundamentals

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    val sercan = Person("Sercan",26,"play football",atiqah)

    amanda.showProfile()
    atiqah.showProfile()
    sercan.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        // Fill in code
        println("Name: $name")
        println("Age: $age")
        if (hobby != null) {
            print("Likes to $hobby.")
        }
        if (referrer != null) {
            print("Has a referrer named ${referrer.name}")
            if (referrer.hobby != null) {
                print(", who likes to ${referrer.hobby}.")
            } else {
                print(".")
            }
        } else {
            print("Doesn't have referrer.")
        }
        print("\n\n")
    }
}