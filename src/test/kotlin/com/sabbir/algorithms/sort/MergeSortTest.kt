package com.sabbir.algorithms.sort

import com.sabbir.algorithms.sort.mergesort.MergeSort
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MergeSortTest {
    lateinit var mergeSort: MergeSort

    @Before fun initialize() {
        mergeSort = MergeSort()
    }

    @Test fun mergeSingleElement() {
        val arr = intArrayOf(1)
        mergeSort.mergeOptimized(arr,0,arr.size/2,arr.size)
        assertTrue(arr contentEquals intArrayOf(1))
    }

    @Test fun mergeDoubleElement() {
        val arr = intArrayOf(2,1)
        mergeSort.mergeOptimized(arr,0,arr.size/2,arr.size)
        assertTrue(arr contentEquals intArrayOf(1,2))
    }

    @Test fun mergeOddMultipleElement() {
        val arr = intArrayOf(3,1,2)
        mergeSort.mergeOptimized(arr,0,arr.size/2,arr.size)
        assertTrue(arr contentEquals intArrayOf(1,2,3))
    }

    @Test fun mergeEvenMultipleElement() {
        val arr = intArrayOf(3,4,1,2)
        mergeSort.mergeOptimized(arr,0,arr.size/2,arr.size)
        assertTrue(arr contentEquals intArrayOf(1,2,3,4))
    }

    @Test fun mergeOddSameElement() {
        val arr = intArrayOf(3,3,3,3,3)
        mergeSort.mergeOptimized(arr,0,arr.size/2,arr.size)
        assertTrue(arr contentEquals intArrayOf(3,3,3,3,3))
    }

    @Test fun sortSingleElement() {
        val arr = intArrayOf(1)
        mergeSort.mergeSortOptimized(arr)
        assertTrue(arr contentEquals intArrayOf(1))
    }

    @Test fun sortTwoElement() {
        val arr = intArrayOf(2,1)
        mergeSort.mergeSortOptimized(arr)
        assertTrue(arr contentEquals intArrayOf(1,2))
    }

    @Test fun sortOddMultipleElement() {
        val arr = intArrayOf(3,1,2)
        mergeSort.mergeSortOptimized(arr)
        assertTrue(arr contentEquals intArrayOf(1,2,3))
    }

    @Test fun sortEvenMultipleElement() {
        val arr = intArrayOf(3,4,1,2)
        mergeSort.mergeSort(arr)
        assertTrue(arr contentEquals intArrayOf(1,2,3,4))
    }

    @Test fun sortOddSameElement() {
        val arr = intArrayOf(3,3,3,3,3)
        mergeSort.mergeSortOptimized(arr)
        assertTrue(arr contentEquals intArrayOf(3,3,3,3,3))
    }
}