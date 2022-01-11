package coding;

import com.sun.jdi.IntegerValue;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Temp {
     static int abc = 0;
    public static void main(String argv[]) {
        System.out.println("Hello");
        int a = 1234;
        System.out.println(new String());
        int []ar = {0,0,0,2,4};
        Arrays.sort(ar);
        ArrayList<String> str1 = new ArrayList<>();
        str1.add("A1");
        str1.add("B");
        str1.add("C1");
        str1.add("D");
        str1.forEach(System.out::println);
        System.out.println("");
        str1.removeIf(x-> x.length() == 2);
        str1.forEach(System.out::println);
        
//        HashSet<Integer> set = new HashSet<Integer>();
//        for(int aa : set) {
//
//        }
        str1.equals(str1);

//        System.out.println(this.plusOne());
    }

    public int[] plusOne(int[] digits) {
        int carry = 1;
        int temp = 0;
        for(int i = digits.length-1;i >= 0; i--) {
            temp = digits[i] +carry;
            carry = temp/10;
            digits[i] = temp%10;
            if(carry == 0) break;
        }
        Arrays.stream(digits).boxed().collect(Collectors.toList());
        if(carry == 1) {
            int ar[] = new int[digits.length+1];
            System.arraycopy(digits,0, ar,1, digits.length );
            return ar;
        } else {
            return digits;
        }
    }

    private static int binarySearch(int[] nums, int target, int min, int max) {
        if(min> max) return -1;
        int mid = min + (max-min)/2;
        System.out.println(""+mid+ " "+ min +" "+ max);
        if(nums[mid] == target) return mid;
        else if(target < nums[mid]) return binarySearch(nums, target, min, mid-1);
        else return binarySearch(nums, target, mid+1, max);
    }



    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while(n > 1 && !set.contains(n)) {
            set.add(n);
            n = getHappy(n);
        }

        return n == 1;
    }

    private int getHappy(int n) {
        int sum = 0;
        while(n != 0) {
            sum += Math.pow(n%10, 2);
            n = n/10;
        }
        return sum;
    }

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        String s1, s2;
        int carry = 0;
        if(a.length() > b.length()) {
            s1 = a;
            s2 = b;
        } else {
            s1 = b;
            s2 = a;
        }

        int i = s1.length()-1;
        int j = s2.length() -1;

        for(; i >= 0; i--, j--) {
            if(j >= 0 && s2.charAt(j) == '1')
                carry += 1;
            if(s1.charAt(i) == '1')
                carry += 1;
            sb.insert(0,carry%2);
            carry = carry/2;
        }
        if(carry == 1)
            sb.append("1");
        return sb.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for(int i = 1; i < strs.length; i++) {
            str = getPref(strs[i], str);
            if(str == "") return str;
        }
        return str;
    }

    private String getPref(String a, String b) {
        int i = 0, index =-1;
        while(i < a.length() && i <b.length()) {
            if(a.charAt(i) == b.charAt(i)) {
                index = i;
            } else break;
            i++;
        }
        if(index == -1) return "";
        return a.substring(0, index+1);
    }
}
