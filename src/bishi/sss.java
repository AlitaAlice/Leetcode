//public void Move(int[] arr) {
//        int size = arr.length;
//        int start = 0;
//        int end = 0;
//        int now;
//        int i= 0;
//        while(i < size){
//        now = arr[i];
//        if (now == 0) {
//        start = i;
//        end = i;
//        break;
//        }
//        ++i;
//        }
//        if (arr[end] != 0)
//        return;
//        ++i;
//        while (i < size)
//        {
//        now = arr[i];
//        if (now == 0)
//        {
//        end = i;
//        } else {
//        arr[start] = now;
//        arr[i] = 0;
//        ++start;
//        ++end;
//        }
//        ++i;
//        }
//        }