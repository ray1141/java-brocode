public class varargs {
    public static void main(String[] args) {
        System.out.println(add(1,3,2));
        System.out.println(add(1,3,2,4,5));
        System.out.println(add(1));
        System.out.println(add());
        System.out.println(avg());
        System.out.println(avg(1,2));
        System.out.println(avg(1,2,6,8,9));
        System.out.println(avg(12479.89));
    }
    static int add(int... nums){
        int sum = 0;
        for(int n: nums) sum+=n;
        return sum;
    }
    static double avg(double... nums){
        int n = nums.length;
        if(n==0) return 0;
        double sum = 0;
        for(double num: nums) sum+=num;
        return sum/n;
    }
}
