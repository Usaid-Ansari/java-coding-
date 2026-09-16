public class Swap {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        swap(a, b);
        System.out.println(a + " " + b);  // Pass by Value 
       
        }
        static void swap(int a, int b){
            int temp = a;
            a = b;
            b = temp;  // a and b are local to this method, so the original values in main are not changed
    }
}
