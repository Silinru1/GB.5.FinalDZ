import java.util.Objects;

public class Laptop {
    //поля, геттерыб конструктор, из класса Object переопределить методы: toString, equals, hashCode

    private String RAM;
    private String HDD;
    private String OS;
    private String Color;

    public String getRAM() {
        return RAM;
    }
    public String getHDD() {
        return HDD;
    }
    public String getOS() {
        return OS;
    }
    public String getColor() {
        return Color;
    }

    public Laptop(String RAM, String HDD, String OS, String Color) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.OS = OS;
        this.Color = Color;
    }

    @Override
    public String toString() {
        return String.format("Laptop { RAM:%s, HDD:%s, OS:%s, Color:%s }", RAM, HDD, OS, Color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(RAM, laptop.RAM) && Objects.equals(HDD, laptop.HDD) && Objects.equals(OS, laptop.OS) && Objects.equals(Color, laptop.Color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(RAM, HDD, OS, Color);
    }
}
