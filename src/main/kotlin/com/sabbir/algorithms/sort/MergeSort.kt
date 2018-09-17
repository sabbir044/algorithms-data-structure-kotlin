package com.sabbir.algorithms.sort

class MergeSort {
    fun merge(numArr: IntArray, start: Int, mid: Int, end: Int) {
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

    private fun mergeSortInternal(numArr: IntArray, start: Int, end: Int) {
        if(start>=end)
            return
        val mid = (start+end)/2
        mergeSortInternal(numArr,start, mid)
        mergeSortInternal(numArr,mid+1,end)
        merge(numArr,start,mid,end)
    }

    fun sort(numArr: IntArray) {
        mergeSortInternal(numArr,0,numArr.size)
    }
}