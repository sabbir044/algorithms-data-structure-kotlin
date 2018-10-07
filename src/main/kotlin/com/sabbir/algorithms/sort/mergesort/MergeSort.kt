package com.sabbir.algorithms.sort.mergesort

class MergeSort {
    fun mergeOptimized(numArr: IntArray, start: Int, mid: Int, end: Int) {
        val leftArray = numArr.copyOfRange(start, mid)
        val rightArray = numArr.copyOfRange(mid, end)
        var i=0
        var j=0
        for(k in start until end) {
            if((j>=rightArray.size) || (i<leftArray.size && leftArray[i]<=rightArray[j])) {
                numArr[k]=leftArray[i]
                i++
            } else {
                numArr[k]=rightArray[j]
                j++
            }
        }
    }

    private fun mergeSortInternalOptimized(numArr: IntArray, start: Int, end: Int) {
        if(start>=end)
            return
        val mid = (start+end)/2
        mergeSortInternalOptimized(numArr,start, mid)
        mergeSortInternalOptimized(numArr,mid+1,end)
        mergeOptimized(numArr,start,mid,end)
    }

    fun mergeSortOptimized(numArr: IntArray) {
        mergeSortInternalOptimized(numArr,0,numArr.size)
    }

    fun mergeSort(numArr: IntArray) {
        if(numArr.size<=1)
            return
        val leftArray = numArr.copyOfRange(0,numArr.size/2)
        val rightArray = numArr.copyOfRange(numArr.size/2, numArr.size)
        mergeSort(leftArray)
        mergeSort(rightArray)
        merge(leftArray,rightArray, numArr)

    }

    fun merge(leftArray: IntArray, rightArray: IntArray, toNumArray: IntArray) {
        var i=0
        var j=0
        for(k in 0 until toNumArray.size) {
            if((j>=rightArray.size) || (i<leftArray.size && leftArray[i]<=rightArray[j])) {
                toNumArray[k]=leftArray[i]
                i++
            } else {
                toNumArray[k]=rightArray[j]
                j++
            }
        }
    }

}