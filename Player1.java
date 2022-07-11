import java.util.Scanner;

public class Player1 {

    private String name;
    private String age;

    Player1() {

        System.out.println("Enter player1 name:");
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine().toString();

        System.out.println("Enter player1 age:");
        this.age = scanner.nextLine().toString();
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
