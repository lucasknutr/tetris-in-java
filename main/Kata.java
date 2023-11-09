package main;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

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
//        int numb = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
//
//        // Numb
//        System.out.println(numb);
//        JOptionPane.showMessageDialog(null, expandedForm(numb));
//        JOptionPane.showMessageDialog(null, "Done", "Confirmed", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showOptionDialog(null, "Do you want to continue?", "Continue?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
//        JOptionPane.showInternalConfirmDialog(null, "Confirmed. Thank you!");
//        Locale location = JPanel.getDefaultLocale();
//        System.out.println(location);
//        int randomNumber = new Random().nextInt(5000);
//        System.out.println(randomNumber);
//        JOptionPane.showMessageDialog(null, expandedForm(randomNumber));
//        JPanel.getDefaultLocale();
    }
}
