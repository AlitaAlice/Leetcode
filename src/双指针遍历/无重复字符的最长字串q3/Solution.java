package 双指针遍历.无重复字符的最长字串q3;

import java.util.HashMap;

/**
 * This program demonstrates
 *
 * @author Alita Alice
 * @version 1.0
 * @Date: Created in 23:35 2020/6/6
 */
public class Solution {
    /**
     * 双指针滑动 +hash
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s)
    {
        int left = 0;
        int right = 0;
        int len = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            Integer index=map.get(s.charAt(right));
            map.put(s.charAt(right), right);
            if(index!=null&&index>=left)
            {
                left = index + 1;
            }
            if(right-left+1>len)
            {
                len = right - left + 1;
            }
            right++;
        }
        return len;
    }
}
