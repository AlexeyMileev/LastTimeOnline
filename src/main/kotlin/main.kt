package ru.netology


fun main() {
    val seconds = 346_000
    agoToText(seconds)

}

fun agoToText(seconds: Int) {

    val text = when(seconds) {
        in 0..60 -> "был(а) только что"
        in 61..60 * 60 -> wordMinutes(seconds)
        in 60 * 60 + 1..24 * 60 * 60 -> wordHours(seconds)
        in 24 * 60 * 60 + 1..2 * 24 * 60 * 60 -> "был(а) вчера"
        in 2 * 24 * 60 * 60 +1 .. 3 * 24 * 60 * 60 -> "был(а) позавчера"
        else -> "был(а) давно"
    }
    println(text)

}

fun wordMinutes(seconds: Int): String {
    val minutes = when(seconds / 60 ) {
        1, 21, 31, 41, 51 -> "был(а) ${seconds / 60 } минуту назад"
        2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54  -> "был(а) ${seconds / 60 } минуты назад"
        60 -> "был(а) 1 час назад"
        else -> "был(а) ${seconds / 60} минут назад"
    }
        return minutes
}

fun wordHours(seconds: Int): String {
    val hours = when(seconds / 60 / 60) {
        1, 21 -> "был(а) ${seconds / 60 / 60 } час назад"
        2, 3, 4, 22, 23, 24 -> "был(а) ${seconds / 60 / 60 } часa назад"
        else -> "был(а) ${seconds / 60 / 60 } часов назад"
    }
    return hours
}