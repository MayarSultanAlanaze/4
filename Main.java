// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] Name = { "shaza","Mohamed","Asmaa","Anfal","Yousra","Amin","Radwa","Yasmeen"};
        for (String n: Name) {
            if (n.startsWith("A"))
            System.out.println("Name is " + n);
        }
    }
}