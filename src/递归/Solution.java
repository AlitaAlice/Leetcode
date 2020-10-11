package 递归;

import java.util.HashMap;
import java.util.Map;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 19:04 2020/10/11
 */
class Solution {
    public boolean isSubsequenceByIndexOfChar(String s, String t) {
        int index = -1;
        for (char c: s.toCharArray()) {
            index = t.indexOf(c, index + 1);
            if (index == -1) {
                return false;
            }
        }
        return true;
    }

}
