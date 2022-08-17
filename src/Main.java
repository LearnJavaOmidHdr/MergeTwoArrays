import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;



public class Main {

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        ArrayList<T> newList = new ArrayList<T>();
        for (T element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }


    public static void main(String[] args) {
        int[] number1 = {1,2,3,4,5,5,6,2,3};
        int[] number2 = {4,2,8,15,18,6,3,8,5};
//        String[] str1 = {"one","two","three","four","five"};
//        String[] str2 = {"one","six","seven","two","nine","one"};
        int[] result = new int[number1.length + number2.length];
        for (int i = 0; i < number1.length; i++) {
            result[i] = number1[i];
            result[number1.length + i] = number2[i];
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int x = 0; x < result.length; x++) {
            list.add(result[x]);
        }
        ArrayList<Integer> newList = removeDuplicates(list);
        Collections.sort(newList);
        for (int file : newList)
            System.out.print(" " + file);
    }
}

