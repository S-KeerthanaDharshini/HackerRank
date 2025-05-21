import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        LinkedList<String> list = new LinkedList<String>();
        int count = 0;

        // Replace all specified punctuation with space
        s = s.replaceAll("[,\'?!@._-]", " ");

        // Split on one or more whitespace characters
        String[] arr = s.trim().split("\\s+");

        for (String word : arr) {
            if (!word.isEmpty()) {
                count++;
                list.add(word);
            }
        }

        System.out.println(count);
        for (String word : list) {
            System.out.println(word);
        }
    }
}
