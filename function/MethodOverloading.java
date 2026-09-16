public class MethodOverloading {
    public static void main(String[] args) {
        int ans1 = add(1, 2);
        int ans2 = add(1, 2, 3);
        System.out.println("ans1 "+ ans1);
        System.out.println("ans2 "+ ans2);
    }
    static int add(int p, int q) {
        int sum = p + q;
        return sum;
    }
    static int add(int p, int q, int r) {
        int ans = p + q + r;
        return ans;
    }
}
