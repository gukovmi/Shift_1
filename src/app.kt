import java.lang.Exception

fun main(args: Array<String>){
    print("What's your current city?")
    val currentCity:String = readLine()!!

    print("What is the temperature outside?")
    val outsideTemperature:String = readLine()!!

    try {
        when (outsideTemperature.toInt()) {
            in -50..15->{println("It's cold in $currentCity now")}
            in 15..25->{println("It's normal in $currentCity now")}
            in 25..50->{println("It's hot in $currentCity now")}
            else->{println("It's disastrously in $currentCity now")}
        }
    }
    catch (e:Exception) {
        println("Fields filled in incorrectly, please try again!")
    }
}