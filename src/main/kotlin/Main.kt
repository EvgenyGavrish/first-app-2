
fun main () {
    checkCommission()
    checkLikes()
    checkDiscountForMelomans()
}

fun checkCommission() {
    val commission = 0.75
    val minValue = 3_500
    val amount = 788888
    var result = (amount * commission / 100)
    if (result < minValue) {
        result = 3500.0
    }
    println("Комиссия: " + Math.round(result) + " коп.")
}

fun checkLikes(){
    val likes = 2
    var result = " людям"
    val value = likes % 100
    val num = value % 10
    if(value > 10 && value < 20) result = " людям"
    if(num > 1 && num < 5) result = " людям"
    if(num == 1) result = " человеку"

    println("Понравилось: " + likes + result)
}

 fun checkDiscountForMelomans () {
     val amount = 20000
     val meloman = true
     var result = amount

     if (amount >= 0 && amount <= 1_000) {
         result = amount
     }
     if (amount >= 1001 && amount <= 10_000) {
         result = amount - 100
     }
     if (amount >= 10_001 ) {
         val discount = amount * 5 / 100
         result = amount - discount
     }

     if (meloman) {
         val discount = result * 1 / 100
         result -= discount
     }

println("$result руб.")
 }