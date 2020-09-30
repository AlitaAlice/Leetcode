import java.util.*;


public class Solution {
    /**
     * return a array which include all ans for op3
     * @param op int整型二维数组 operator
     * @return int整型一维数组
     */
    //ArrayDeque<Integer> data=new ArrayDeque<>();
    ArrayDeque<Integer> min=new ArrayDeque<>();
    public int[] getMinStack (int[][] op) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int[] temp:op){
            int first=temp[0];
            if(first==1){
                //data.push(temp[1]);
                if(min.isEmpty()||temp[1]<min.peek()){
                    min.push(temp[1]);
                }
                else{
                    min.push(min.peek());
                }
            }
            else if(first==2){
                //data.pop();
                min.pop();
            }
            else{
                list.add(min.peek());
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        return res;
    }

}