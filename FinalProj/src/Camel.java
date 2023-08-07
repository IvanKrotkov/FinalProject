import java.util.Date;

public class Camel extends PackAnimal{
    public Camel(String name, Date dateOfBirhday) {
        super(name, dateOfBirhday);
    }

    @Override
    void transport() {
        System.out.println("Верблюд работает");
    }

    @Override
    void makeASound() {
        System.out.println("Верблюд чем то недоволен..");
    }

    @Override
    public String getCommand() {
        StringBuilder sb = new StringBuilder(super.getCommand());
        sb.append("\nspit()");
        sb.append("\ngo()");
        return sb.toString();
    }


    void spit(){
        System.out.println("Осторожно, он плюгнул!");
    }
    void go(){
        System.out.println("Верблюд пошёл");
    }
}
