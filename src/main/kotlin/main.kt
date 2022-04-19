fun main () {
    val itemPrice = 100
    val itemcount = 12
    var regularCustomer: Boolean = true

    val totalPrice = itemPrice * itemcount

    val calculatedPrice = if (totalPrice >= 1_001 && totalPrice <= 10_000) totalPrice - 100
    else if (totalPrice <= 1_000) totalPrice
    else totalPrice - (totalPrice * 5 / 100)

    val discountForRegularCustomer = if (regularCustomer == true) calculatedPrice - (calculatedPrice * 0.01)
    else calculatedPrice


    println("покупка $totalPrice")
    println("после применения скидки $calculatedPrice")
    println("после применения скидки постоянного покупателя $discountForRegularCustomer")
}
