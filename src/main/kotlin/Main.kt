
fun main () {
    checkCommission()
    checkLikes()
    checkDiscountForMelomans()
}

fun checkCommission() {
    val commission = 0.75
    val minValue = 35
    val amount = 500_000
    val result = minValue + amount * commission / 100
    println("Комиссия: " + Math.round(result) + " коп.")
}

fun checkLikes() {
    val likes = 2
    val result = if (likes % 2 == 0) " людям" else " человеку"
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