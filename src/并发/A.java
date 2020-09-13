package 并发;

import java.util.ArrayList;
import java.util.List;

public class A {


    public void a(){

//        a();
        b();
    }
    public void  b()
    {
a();
    }

    public static void main(String[] args) {
        List<A> aList = new ArrayList<>();
        for (; ;) {
            aList.add(new A());
        }


        //A aa = new A();
        //aa.a();
    }
}
