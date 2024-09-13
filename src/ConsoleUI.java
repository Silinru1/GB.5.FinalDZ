import java.util.Scanner;

public class ConsoleUI {

    private LaptopService service = new LaptopService();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.print("> Введите параметр поиска или n для выхода:");
            String param = scanner.nextLine();
            switch (param) {
                case "n": System.exit(0);
                case "ram": {
                    System.out.print("> Введите значение:");
                    System.out.println(service.findRAM(scanner.nextLine())); }
                    break;
                case "hdd": {
                    System.out.print("> Введите значение:");
                    System.out.println(service.findHDD(scanner.nextLine())); }
                    break;
                case "os": {
                    System.out.print("> Введите значение:");
                    System.out.println(service.findOS(scanner.nextLine())); }
                    break;
                case "color": {
                    System.out.print("> Введите значение:");
                    System.out.println(service.findColor(scanner.nextLine())); }
                    break;
            }
        }
    }

    /*
     * find(String searchParam) {
     *   return service.какой-то метод поиска
     * }
     *
     * */
}
