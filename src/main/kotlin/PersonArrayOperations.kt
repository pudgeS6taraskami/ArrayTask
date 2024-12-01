package org.example

class PersonArrayOperations {
    private var persons: Array<Person?> = arrayOfNulls(100)

    fun addPerson(person: Person, position: Int): Boolean {
        if (position < 0 || position >= persons.size) {
            return false
        }
        persons[position] = person
        return true
    }

    fun findPerson(firstName: String, lastName: String): Person? {
        for (person in persons) {
            if (person != null && person.firstName == firstName && person.lastName == lastName) {
                return person
            }
        }
        return null
    }

    fun removePerson(firstName: String, lastName: String): Boolean {
        for (i in persons.indices) {
            if (persons[i] != null && persons[i]!!.firstName == firstName && persons[i]!!.lastName == lastName) {
                persons[i] = null
                return true
            }
        }
        return false
    }

    fun printPersons() {
        for (person in persons) {
            if (person != null) {
                println(person.getInfo())
            }
        }
    }
}
