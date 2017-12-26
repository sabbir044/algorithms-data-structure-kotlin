package com.sabbir.algorithms.sort

import java.util.Scanner

fun main(args: Array<String>) {
    val numbers = takeInput()

    sort(numbers)

    println(numbers.joinToString(separator = " "))
}

fun sort(numbers: IntArray) {
    for(i in 1 until numbers.size) {
        //print("Iteration %d: ".format(i))
        for(j in 0 until (numbers.size-i)) {
            if(numbers[j+1] < numbers[j]) {
                val tmp = numbers[j]
                numbers[j] = numbers[j+1]
                numbers[j+1] = tmp
            }
        }
        //println(numbers.joinToString(separator = " "))
    }
}

fun takeInput(): IntArray {
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    val numbers = IntArray(size)
    for(i in 0 until size){
        numbers[i] = scanner.nextInt();
    }
    return numbers;
}

