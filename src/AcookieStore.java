import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Scanner;

public class AcookieStore {

    int personalBalance;
    public AcookieStore(int personalBalance){this.personalBalance = personalBalance;

    }

    public static void main(String[] args) {
        String LINE = "---------------------------------------------------------------------";

        System.out.println("Please enter your name: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ".");

        System.out.println(LINE);

        }

    }


