public class test {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n);
        changeN(n);
        System.out.println(n);
    }
    static void changeN(int n){
        n = 3;
        System.out.println(n);
    }
}
