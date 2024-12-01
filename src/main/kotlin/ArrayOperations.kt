package org.example

import kotlin.random.Random

class ArrayOperations {
    private var array: IntArray = IntArray(100)

    init {
        fillArrayWithRandomNumbers()
    }

    private fun fillArrayWithRandomNumbers() {
        for (i in array.indices) {
            array[i] = Random.nextInt(0, 101)
        }
    }

    fun printArray() {
        println(array.joinToString(", "))
    }

    fun findElement(element: Int): Boolean {
        return array.contains(element)
    }

    fun removeElement(element: Int): Boolean {
        val index = array.indexOf(element)
        if (index != -1) {
            for (i in index until array.size - 1) {
                array[i] = array[i + 1]
            }
            array[array.size - 1] = 0
            return true
        }
        return false
    }

    fun insertElement(element: Int, position: Int): Boolean {
        if (position < 0 || position >= array.size) {
            return false
        }
        for (i in (array.size - 1) downTo position + 1) {
            array[i] = array[i - 1]
        }
        array[position] = element
        return true
    }
}