package com.divisiblenumber.services;


import java.util.List;
import java.util.stream.Collectors;


/**
 * Copyright
 * User: Ganzf
 * Date: 2019/8/22
 * Description:
 */
public class NumberService {

    private static int num3 = 3;
    private static int num5 = 5;

    /**
     * Divisble by number(3/5)
     * @param numberList
     * @return
     */
    public static  List divisibleByNumber(List<Integer> numberList){
        return numberList.stream().map(x -> {
            if(x % num3 == 0 && x % num5 == 0) {
                return "FizzBuzz";
            }
            if(x % num3 == 0) {
                return "Fizz";
            }
            if(x % num5 == 0) {
                return "Buzz";
            }
            return x;
        }).collect(Collectors.toList());

    }

    /**
     * Divisble by number(3/5) or has number(3/5) int it
     * @param numberList
     * @return
     */
    public static  List divisibleAndExistNumber(List<Integer> numberList){

        return numberList.stream().map(x -> {
            if((x % num3 == 0 || String.valueOf(x).indexOf(String.valueOf(num3))!= -1 ) &&
                    (x % num5 == 0 || String.valueOf(x).indexOf(String.valueOf(num5)) != -1)) {
                return "FizzBuzz";
            }
            if(x % num3 == 0 || String.valueOf(x).indexOf(String.valueOf(num3))!= -1) {
                return "Fizz";
            }
            if(x % num5 == 0 || String.valueOf(x).indexOf(String.valueOf(num5))!= -1) {
                return "Buzz";
            }
            return x;
        }).collect(Collectors.toList());
    }

}
