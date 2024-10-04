import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje imie");
        String name = scanner.nextLine();

        System.out.println("Podaj swoje nazwisko");
        String nazwisko = scanner.nextLine();

        System.out.println("Twoje imie to " + name);
        System.out.println("Twoje nazwisko to " + nazwisko);

        System.out.println("Podaj klase");
        String schoolClass = scanner.nextLine();

        System.out.println("Chodzisz do klasy" + schoolClass);

    }
}