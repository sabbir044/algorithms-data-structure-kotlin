package com.sabbir.algorithms.sort.mergesort

fun merge(a: IntArray, b:IntArray, t:IntArray) {
    println(String.format("Merging %s and %s",a.contentToString(), b.contentToString()))
    var i=0
    var j=0
    for(k in 0 until t.size) {
        //print(String.format("Loop %d: ",k+1))
        if(i<a.size&&j<b.size) {
            //print(String.format("Comparing a[$i]->%d and b[$j]->%d, ",a[i],b[j]))
        }
        if((j>=b.size) || (i<a.size && a[i]<=b[j])) {
            if(j>=b.size) {
                //print(String.format("no number left in b, going to set a[$i]->%d to t[$k]",a[i]))
            } else {
                //print(String.format("a[$i] is smaller then or equal to b[$j], setting a[$i] to t[$k]"))
            }
            t[k]=a[i]
            i++
        } else {
            if(i>=a.size) {
                //print(String.format("no number left in a, going to set b[$j]->%d to t[$k]",b[j]))
            } else {
                //print(String.format("a[$i] is greater then b[$j], setting b[$j] to t[$k]"))
            }
            t[k]=b[j]
            j++
        }
        //println()
    }
    println(String.format("Merged array: %s",t.contentToString()))
}

fun merge2(a: IntArray, b:IntArray, t:IntArray) {
    var i=0
    var j=0
    for(k in 0 until t.size) {
        if((j>=b.size) || (i<a.size && a[i]<=b[j])) {
            t[k]=a[i]
            i++
        } else {
            t[k]=b[j]
            j++
        }
    }
}

fun mergeSort(numArr:IntArray) {
    if(numArr.size<=1)
        return
    println(String.format("Original Input Array: %s",numArr.contentToString()))
    val leftArray = numArr.copyOfRange(0,numArr.size/2)
    println(String.format("Left Array: %s",leftArray.contentToString()))
    val rightArray = numArr.copyOfRange(numArr.size/2, numArr.size)
    println(String.format("Right Array: %s",rightArray.contentToString()))
    mergeSort(leftArray)
    mergeSort(rightArray)
    merge(leftArray,rightArray, numArr)
}

fun main(args: Array<String>) {
    mergeSort(intArrayOf(4,5,7,3,1))
}