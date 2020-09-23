//package 笔试;
///*
// * Description:输入一个浮点数，请按照三位分节制（金融计数法）打印，
// * 示例：1000.12 => 1,000.12
// *   12345   678  .51 => 12,345,678.51
// */
//import java.io.IOException;
//public class StringReverserThroughStack {
//    String s = "ss\0";
//
//        private String input;
//        private String output;
//        public StringReverserThroughStack(String in) {
//            input = in;
//        }
//        public void  trans(String string) {
//            int stackSize = string.length();
//            Stack theStack = new Stack(stackSize);
//
////            for (int i = 0; i <string.length() ; i++) {
////                char ch =string.
////            }
//            //output = "";
//        while (string.length()/3>0)
//        {
//            for (int i =0 ; i <= 3; i++) {
//                stackSize--;
//                char ch = string.charAt(i);
//                theStack.push(ch);
//            }
//            theStack.pop();
//        }
//
//        for (int i =stackSize ; i < 3; i--) {
//            char ch = string.charAt(i);
//            theStack.push(ch);
//        }
//        theStack.pop();
//
//        }
//        public static void main(String[] args)
//                throws IOException {
//            String input = "12345678.51";
//            String[] chars = input.split(".");
//            String  str= chars[0];
//            String input1 = "12345678";
//          //  String input2 = new StringBuilder(str).reverse().toString();
//            StringReverserThroughStack theReverser = new StringReverserThroughStack(input1);
//            theReverser.trans(input1);
//        }
//        class Stack {
//            private int maxSize;
//            private char[] stackArray;
//            private int top;
//            public Stack(int max) {
//                maxSize = max;
//                stackArray = new char[maxSize];
//                top = -1;
//            }
//            public void push(char j) {
//                stackArray[++top] = j;
//            }
//            public char pop() {
//                System.out.println(stackArray[top]);
//                top--;
//                return stackArray[top--];
//            }
//            public char peek() {
//                return stackArray[top];
//            }
//            public boolean isEmpty() {
//                return (top == -1);
//            }
//        }
//    }
