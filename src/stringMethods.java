public class stringMethods {
    public static void main(String[] args){
        String name = "  Aarav Kumar  ";
        int length = name.length();
        System.out.println(length);
        char letter = name.charAt(6);
        System.out.println(letter);
        int index = name.indexOf('a');
        System.out.println(index);
        int lastIndex = name.lastIndexOf('a');
        System.out.println(lastIndex);
        name = name.toUpperCase();
        System.out.println(name);
        name = name.toLowerCase();
        System.out.println(name);
        name = name.trim();
        System.out.println(name);
        name = name.replace('a','o');
        System.out.println(name);
        boolean isEmpty = name.isEmpty();
        System.out.println(isEmpty);
        boolean isContains = name.contains(" ");
        System.out.println(isContains);
        boolean isEquals = name.equals("Aarav Kumar");
        System.out.println(isEquals);
        boolean isEquals2 = name.equalsIgnoreCase("Aarav Kumar");
        System.out.println(isEquals2);
    }
}
