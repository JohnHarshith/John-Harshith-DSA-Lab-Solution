package com.greatlearning.dsa.driver;

import com.greatlearning.dsa.balanceClass.BalancedCheck;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter a string: ");
        String str = sc.nextLine();
        BalancedCheck balanced = new BalancedCheck();
        if(balanced.BalancedOrNot(str))
            System.out.println("\nThe entered String has Balanced Brackets\n");
        else
            System.out.println("\nThe entered Strings do not contain Balanced Brackets\n");
        sc.close();
    }
}