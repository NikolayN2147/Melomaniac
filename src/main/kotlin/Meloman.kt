fun main() {

    print("Введите сумму предыдущей покупки: ")
    val sum = readLine()?.toUInt() ?: return
    println("Является ли покупатель постоянным")
    print("Для подтверждения введите \"y\",нет - \"n\" : ")
    val booleanMeloman = readLine()?.equals("y")
    print("Сумма покупки: ")
    val amount = readLine()?.toUInt() ?: return
    val discountFive = amount * 95U / 100U
    val discoutOne = amount * 99U / 100U
    val discount100 = amount - 100U
    if (sum >= 10_001U) {
        if (booleanMeloman == true) {
            println("Внесенная сумма $amount руб.")
            println(
                "после применения 5% скидки: " + discountFive + " руб. "
                        + (discountFive * 100U) % 100U + " коп."
            )
            println(
                "после применения 1% скидки: " + (discountFive * 99U / 100U) + " руб. "
                        + (discountFive * 99U) % 100U + " коп."
            )
        } else {
            println("Внесенная сумма $amount рублей")
            println(
                "после применения 5% скидки: " + discountFive + " руб. "
                        + (discountFive * 100U) % 100U + " коп."
            )
        }
    } else if (sum < 10_001U && sum >= 1_001U) {
        if (booleanMeloman == true) {
            println("Внесенная сумма $amount рублей")
            println(
                "Вам скидка в 100 руб.: " + discount100 + " руб. "
                        + (discount100 * 100U) % 100U + " коп."
            )
            println(
                "после применения 1% скидки: " + discount100 * 99U / 100U + " руб."
                        + (discount100 * 99U) % 100U + "коп"
            )
        } else {
            println("Внесенная сумма $amount рублей")
            println(
                "Вам скидка в 100 руб.: " + discount100 + " руб. "
                        + (discount100 * 100U) % 100U + " коп.")
        }
    } else {
        if (booleanMeloman == true) {
            println("Внесенная сумма $amount рублей")
            println(
                "после применения 1% скидки: " + discoutOne + " руб."
                        + (discoutOne * 100U) % 100U + "коп"
            )
        } else {
            println("Внесенная сумма $amount рублей")
        }

    }
}