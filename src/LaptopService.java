import java.util.HashSet;
import java.util.Set;

public class LaptopService {
    // методы или один метод поиска ноутбуков по заданным параметрам

    Laptop lpt1 = new Laptop("32", "200", "windows", "red");
    Laptop lpt2 = new Laptop("16", "150", "linux", "black");
    Laptop lpt3 = new Laptop("8", "120", "windows", "black");
    Laptop lpt4 = new Laptop("16", "160", "linux", "red");

    private Set<Laptop> laptops = new HashSet<>();

    public LaptopService() {
        laptops.add(lpt1);
        laptops.add(lpt2);
        laptops.add(lpt3);
        laptops.add(lpt4);
    }

    public Set<Laptop> findRAM(String RAM) {
        Set<Laptop> result = new HashSet<>();
        for (var laptop : laptops) {
            if (laptop.getRAM().equals(RAM)) {
                result.add(laptop);
            }
        }
        return result;
    }

    public Set<Laptop> findHDD(String HDD) {
        Set<Laptop> result = new HashSet<>();
        for (var laptop : laptops) {
            if (laptop.getHDD().equals(HDD)) {
                result.add(laptop);
            }
        }
        return result;
    }

    public Set<Laptop> findOS(String OS) {
        Set<Laptop> result = new HashSet<>();
        for (var laptop : laptops) {
            if (laptop.getOS().equals(OS)) {
                result.add(laptop);
            }
        }
        return result;
    }

    public Set<Laptop> findColor(String Color) {
        Set<Laptop> result = new HashSet<>();
        for (var laptop : laptops) {
            if (laptop.getColor().equals(Color)) {
                result.add(laptop);
            }
        }
        return result;
    }
}
