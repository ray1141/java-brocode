public class printfMethod {
    public static void main(String[] args) {
        //printf: [flags][width][.precision][specifier-character]
//        String name = "Aarav";
//        char firstLetter = 'A';
//        int age  = 18;
//        boolean isStudent = true;
//        System.out.printf("%s\n",name);
//        System.out.printf("%c\n",firstLetter);
//        System.out.printf("%d\n",age);
//        System.out.printf("%b\n",isStudent);
//        System.out.printf("%s %d",name,age);
//        double price = -10000102.23422;
//        System.out.printf("%f\n",price);
//        System.out.printf("%.2f\n",price);
//        System.out.printf("%+.2f\n",price); //will add plus only for +ve numbers
//        System.out.printf("%,.2f\n",price);
//        System.out.printf("%(.2f\n",price);
//        System.out.printf("% .2f\n",price);
        int num1 = 1;
        int num2 = 23;
        int num3 = 456;
        int num4 = 7890;
        System.out.printf("%d\n",num1);
        System.out.printf("%d\n",num2);
        System.out.printf("%d\n",num3);
        System.out.printf("%d\n",num4);
        //zero padding
        System.out.printf("%04d\n",num1);
        System.out.printf("%04d\n",num2);
        System.out.printf("%04d\n",num3);
        System.out.printf("%04d\n",num4);
        //+ve padding
        System.out.printf("%3d\n",num1);
        System.out.printf("%3d\n",num2);
        System.out.printf("%3d\n",num3);
        System.out.printf("%3d\n",num4);
        //-ve padding
        System.out.printf("%-5d\n",num1);
        System.out.printf("%-5d\n",num2);
        System.out.printf("%-5d\n",num3);
        System.out.printf("%-5d\n",num4);

    }
}
