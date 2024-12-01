package org.example

fun main() {
    val arrayOps = ArrayOperations()
    arrayOps.printArray()

    val elementToFind = 50
    if (arrayOps.findElement(elementToFind)) {
        println("Элемент $elementToFind найден.")
    } else {
        println("Элемент $elementToFind не найден.")
    }

    val elementToRemove = 50
    if (arrayOps.removeElement(elementToRemove)) {
        println("Элемент $elementToRemove удалён.")
    } else {
        println("Элемент $elementToRemove не найден.")
    }

    arrayOps.printArray()

    val elementToInsert = 99
    val positionToInsert = 5
    if (arrayOps.insertElement(elementToInsert, positionToInsert)) {
        println("Элемент $elementToInsert вставлен на позицию $positionToInsert.")
    } else {
        println("Не удалось вставить элемент $elementToInsert на позицию $positionToInsert.")
    }

    arrayOps.printArray()

    val personArrayOps = PersonArrayOperations()
    val person1 = Person("Санёк", "Максимов", 21)
    val person2 = Person("Эш", "Виллиамс", 22)

    personArrayOps.addPerson(person1, 0)
    personArrayOps.addPerson(person2, 1)

    personArrayOps.printPersons()

    val personToFind = personArrayOps.findPerson("Санёк", "Максимов")
    if (personToFind != null) {
        println("Человек найден: ${personToFind.getInfo()}")
    } else {
        println("Человек не найден!")
    }

    if (personArrayOps.removePerson("Эш", "Виллиамс")) {
        println("Человек удалён!")
    } else {
        println("Человек не удалён!")
    }

    personArrayOps.printPersons()
}


