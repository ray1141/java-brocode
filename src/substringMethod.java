import java.util.Scanner;
public class substringMethod {
    public static void main(String[] args){
        //checking for valid email
//        String email = "abc@gmail.com";
//        String username = email.substring(0,3);
//        String domain = email.substring(4,13);
        Scanner sc = new Scanner(System.in);
        String email="";
        String username="";
        String domain="";
        System.out.print("Email: ");
        email = sc.nextLine();
        if(email.contains("@")){
            username = email.substring(0,email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+1);
            System.out.println(username);
            System.out.println(domain);
        }
        else System.out.println("Not a valid email!");
        sc.close();
    }
}
