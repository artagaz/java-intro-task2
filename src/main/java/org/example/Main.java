package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String A = "make install";
        System.out.println(reverse(A));
    }

    public static String reverse(String A)
    {
        String B = "";
        for (int i = A.length()-1; i >= 0; i--) {
            B = B + A.charAt(i);
        }

        return B;
    }
}

