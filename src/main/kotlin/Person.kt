package org.example

class Person(val firstName: String, val lastName: String, val age: Int) {
    fun getInfo(): String {
        return "Имя: $firstName, Фамилия: $lastName, Возраст: $age"
    }
}

