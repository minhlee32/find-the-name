import java.util.Scanner;

public class FindTheName {
    public static void main(String[] args) {
        String[] students = {"Sơn", "Quỳnh", "Sỹ", "Việt", "Huế", "Minh", "Đức", "Tuấn", "Lê Minh", "Đức Anh"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's students: ");
        String input_name = scanner.nextLine();


        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the student in the list: " + input_name + " is " + (i + 1));
                break;
            } else {
                System.out.print("Not found " + input_name + " in the list!");
                break;
            }
        }
    }
}