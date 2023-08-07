import java.util.Date;

public class Cat extends Pets{
    protected Cat(String name, Date dateOfBirhday) {
        super(name, dateOfBirhday);
    }
    public void walk(){
        System.out.println("Как грациозно она ходит!");
    }
    @Override
    void makeASound() {
        System.out.println("мяу");
    }

    @Override
    protected String getCommand() {
        StringBuilder sb = new StringBuilder(super.getCommand());
        sb.append("\nwalk()");
        return sb.toString();
    }

    @Override
    void caress() {
        System.out.println("Мурррр");
    }
}
