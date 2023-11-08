package main;

import java.util.ArrayList;
import java.util.Objects;
import javax.swing.*;

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
            } else {
            answer.append(decimal);

            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        int numb = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        System.out.println(numb);
        JOptionPane.showMessageDialog(null, expandedForm(numb));
    }
}
