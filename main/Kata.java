package main;

import java.util.ArrayList;
import java.util.Objects;

public class Kata
{
    public static String expandedForm(int num)
    {
        ArrayList<String> decimals = new ArrayList<>();
        String[] stringNum = String.valueOf(num).split("");
        for(int i = stringNum.length; i > 0; i--) {
            if (!Objects.equals(stringNum[i - 1], "0")){
                decimals.add(((stringNum[stringNum.length - i])) + "0".repeat(i - 1));
            }
        }
        StringBuilder answer = new StringBuilder();
        for (String decimal : decimals) {
            if(!Objects.equals(decimal, decimals.get(decimals.size() - 1))) {
                answer.append(decimal).append(" + ");
            }
            answer.append(decimal);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(123));
    }
}
