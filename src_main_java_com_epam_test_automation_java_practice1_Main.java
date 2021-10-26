package com.epam.test.automation.java.practice1;

public class Main {

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int task1(int n) {
        //TODO: Delete line below and write your own solution;
        if (n ==) return 0;
        if (n > 0) return n*n;
        else return Math.abs(n);

        throw new UnsupportedOperationException();
                
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int n){

        int[] count = new int[10];
        String str = Integer.toString(n);
        for(int i=0; i < str.length(); i++)
            count[str.charAt(i)-'0']++;
        int result = 0, multiplier = 1;
        for (int i = 0; i <= 9; i++)
        {
            while (count[i] > 0)
            {
                result = result + (i * multiplier);
                count[i]--;
                multiplier = multiplier * 10;
            }
        }
        return result;
                
                throw new UnsupportedOperationException();

    }

}
