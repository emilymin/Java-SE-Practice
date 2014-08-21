package com.tw.kata;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearcher {
    //chop(int, array_of_int) -> int
    public int chop(int target, int[] targetList){
        int index = targetList.length/2;
        return search(target, targetList, 0, targetList.length - 1);
    }

    public int search(int target, int[] targetList, int left, int right){
        int result = -1;
        int index = (left + right)/2;
        if (right >= targetList.length || left < 0 || index == right || index == left){
            result = -1;
        }
        else {
            if (target == targetList[index]){
                result = index;
            }
            else if(target > targetList[index]){
                left = index;
                search(target, targetList, left, right);
            }
            else if (target < targetList[index]){
                right = index;
                search(target, targetList, left, right);
            }
        }
        return result;
    }

    //use Arrays
    public int chopByArrays(int target, int[] targetList){
        return Arrays.binarySearch(targetList, target);
    }

    //use Collections
    public int chopByCollection(int target, List<Integer> targetList){
        return Collections.binarySearch(targetList, target);
    }
}
