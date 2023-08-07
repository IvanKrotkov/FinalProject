import java.lang.reflect.Method;
import java.util.Date;
public class Donkey extends PackAnimal{
    public Donkey(String name, Date dateOfBirhday) {
        super(name, dateOfBirhday);
    }

    @Override
    void transport() {
        System.out.println("Осёл работает");
    }

    @Override
    void makeASound() {
        System.out.println("iiii ahn");
    }

}

