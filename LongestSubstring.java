package string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    /*Given a string s, find the length of the longest
            substring
    without repeating characters.*/
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        int right=0;
        int left=0;

        Set<Character> set=new HashSet<>();

        while(right<s.length()&&left<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                len=Math.max(right-left,len);
            }else{
                set.remove(s.charAt(left++));//这里为什么要remove?

            }
        }

        return len;
    }
}
