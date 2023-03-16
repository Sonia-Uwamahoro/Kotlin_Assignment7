
fun main() {

    oddNumbers()

    var newNames = longerNames(arrayOf("Sonia", "Joshuah", "Sam", "Lavender","mariannaki"))
    println(newNames)

    nameOfDrinks(5)

    numbers()

}

//A function that prints out all the odd numbers between 1 and 100.
fun oddNumbers(){
    for(x in 1..100){
        if (x % 2 != 0){
            println(x)
        }
    }
}


//A function that takes in an array of names and returns the number of names longer than 5 characters.
fun longerNames(names: Array<String>): Int{
    var arrayNames = 0
    for (name in names){
        if (name.length > 5){
            arrayNames ++
        }
    }
    return arrayNames
}


//A function that prints out the name of the drink each person gets according to their age.
fun nameOfDrinks(age: Int){

    when(age){
        in 0..6 -> println("Serve a glass of milk")
        in 6..15 -> println("Serve a bottle of fanta orange")
        else -> println("Serve a bottle of coca cola")
    }
}


//A function that prints each number from 1 to 100 on a new line.
fun numbers(){
    for (number in 1 .. 100){
    when {
        number % 3 == 0 && number % 5== 0 -> println(" FizzBuzz")
        number % 5 == 0 -> println("Buzz")
        number % 3 == 0 -> println("Fizz")
        else -> println(number)
    }
}
}