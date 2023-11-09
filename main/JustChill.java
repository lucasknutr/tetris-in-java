package main;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class JustChill {
    public static int[] twoSums (int[] nums, int target){
        int[] answer = new int[2];
        int counter = 0;

        HashMap<Integer, Integer> hashNums = new HashMap<>();
        for (int num : nums) {
            hashNums.put(counter, num);
            counter++;
        }
        hashNums.forEach((key, value) -> hashNums.forEach((key2, value2) -> {
            if(value + value2 == target) {
                if(!key.equals(key2)) {
                    answer[0] = key;
                    answer[1] = key2;
                }
            }
        }));
        return answer;
    }

    public static int romanToInteger (String s) {
        Map<Character, Integer> m = new HashMap<>();
        // HashMap made of roman numbers
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int answer = 0;

        for(int i = 0; i < s.length(); i++) {
          if(i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
              answer -= m.get(s.charAt(i));
          } else {
              answer += m.get(s.charAt(i));
          }
        }

        return answer;
    }

    public static boolean isPalindrome (int x) {
        String str = String.valueOf(x);
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }

    
    public static void main(String[] args){
        String roman = JOptionPane.showInputDialog("Enter a roman number: ");
        int answer2 = romanToInteger(roman);
        System.out.println(answer2);
    }
}

