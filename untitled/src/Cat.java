import java.util.Date;

public class Cat extends Pets{
    protected Cat(String name, Date dateOfBirhday) {
        super(name, dateOfBirhday);
    }

    @Override
    void makeASound() {
        System.out.println("мяу");
    }
    @Override
    void caress() {
        System.out.println("Мурррр");
    }
}
