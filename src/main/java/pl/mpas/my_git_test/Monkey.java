package pl.mpas.my_git_test;

public class Monkey extends Animal {
    public Monkey(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Małpka{" +
                "imie='" + name + '\'' +
                '}';
    }
}
