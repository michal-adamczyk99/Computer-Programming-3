public class Statistics {
    static int rangeNumber(int min, int max) {
        return max-min;
    }
    static int rangeSum(int min, int max) {
        int sum = 0;
        for (int i=min;i<max;i++) {
            sum += i;
        }
        return sum;
    }
    static double rangeMean(int min, int max) {
        return rangeSum(min, max)/rangeNumber(min, max);
    }
    public static void main(String[] args) {
        System.out.println(rangeNumber(5,10));
        System.out.println(rangeSum(5,10));
        System.out.println(rangeMean(5,10));
    }
}