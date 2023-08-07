import java.util.Date;

public class Dog extends Pets {
    protected Dog(String name, Date dateOfBirhday) {
        super(name, dateOfBirhday);
    }

    @Override
    void makeASound() {
        System.out.println("Гав");
    }

    @Override
    void caress() {
        System.out.println("Он виляет хвостом, потому что он хороший мальчик");
    }
    public void play(){
        System.out.println("Ты кинул собаке мячик, и она счатливая бежит за ним");
    }
    @Override
    protected String getCommand() {
        StringBuilder sb = new StringBuilder(super.getCommand());
        sb.append("\nplay()");
        return sb.toString();
    }
}
