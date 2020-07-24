import kotlin.Exception

fun main(args: Array<String>){
    print("What's your current city?")
    val currentCity:String = readLine() ?: ""
    if (currentCity.isEmpty()) {
        print(println("Fields filled in incorrectly, please try again!"))
        return
    }

    print("What is the temperature outside?")
    val outsideTemperature:String = readLine() ?: ""
    when (
        try {outsideTemperature.toInt()}
        catch (e:Exception) {null}) {
        in -50..15 -> println("It's cold in $currentCity now")
        in 15..25 -> println("It's normal in $currentCity now")
        in 25..50 -> println("It's hot in $currentCity now")
        null->println("Fields filled in incorrectly, please try again!")
        else -> println("It's disastrously in $currentCity now")
    }
}