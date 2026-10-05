import java.util.Arrays;

public class SelectionSort2 {
    public static void main(String[] args) {
        int [] arr = {5, 3, 4, 1, 2};
        selectionsort(arr); // 5,3,4,1,2
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void selectionsort(int[] arr) { // 5,3,4,1,2
        for (int i = 0; i < arr.length; i++) {  // 0<5, 1<5 2<5 3<5
            
            int last = arr.length - i - 1; //i=0:5-0-1=4; i=1: 5-1-1=3 so last = 3; i=2: 5-2-1=4 so last=2  last=1
            int MaxIndex = maxIndex(arr, 0, last); //5(5,3,4,1,2; 0 ; 4) //maxIndex=2(2,3,4,1,5; 0, 3)MaxIndex=2//MaxIndex=1(2,3,1,4,5; 0,2);MaxIndex=0(2,1,3,4,5,0,1)
            swapArr(arr, last, MaxIndex); //(2,3,4,1,5; 3, 2) //(2,3,1,4,5; 2;1) (2,1,3,4,5;1;0)
        }
    }

    static void swapArr(int[] arr, int first, int second) { //(5,3,4,1,2), 0,4 (2,3,4,1,5; 3;2) (2,3,1,4,5;first=2;second=1) (2,1,3,4,5;first=1,second=0)
        int temp = arr[first]; // temp = 4, temp = 1 temp = 1  temp = 1;
        arr[first] = arr[second]; //index arr[4]=arr[0];  arr[3]=arr[2] arr[2]=arr[1]; arr[1]=arr[0]
        arr[second] = temp;//    arr[0]=arr[4]; {arr[2]=3(2,3,1,4,5)} arr[1] = 1 arr[0]=1 Final array ={1,2,3,4,5}
    }

    static int maxIndex(int[] arr, int start, int end) { //(5,3,4,1,2; start = 0, end =last = 4)//(2,3,4,1,5; start = 0; end=3)
    // //(2,3,1,4,5;start=0;end = 2) //{(2,1,3,4,5, start = 0, end=1)}
        int max = start; // 0 //0 // 0 //0
        for(int i = start; i <= end; i++){ //0<=4, 1<=4, 2<=4, 3<=4, 4<=4; (0<=3,1<=3)(2<=3)(3<=3); {(0<=2)(1<=2)(2<=2)}{(0<1}
            if(arr[max] < arr[i]) { //5 < 5(false), 5<3(false), 5<4(false) 5<1(false), 5<2(false); {(2<2)(2<3)(3<4)(3<1)}; {(2<1)(2<3)} {(2<1)}
                max = i;// max = 1, max = 2 ,max = 1 max = 0
            }
        }
        return max; // max = 2 max = 1, max= 0
    }
}