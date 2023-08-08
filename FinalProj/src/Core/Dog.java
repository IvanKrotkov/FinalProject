package Core;


import java.util.Date;

public class Dog extends Pets {
    protected Dog(String name, Date dateOfBirhday) {
        super(name, dateOfBirhday);
    }
    public static Dog getDog(String name, Date dob){
        return new Dog(name,dob);
    }
    @Override
    public void makeASound() {
        System.out.println("Гав");
    }

    public Dog() {
        super();
    }

    @Override
    public void caress() {
        System.out.println("Он виляет хвостом, потому что он хороший мальчик");
    }
    public void play(){
        System.out.println("Ты кинул собаке мячик, и она счатливая бежит за ним");
    }
    @Override
    public String getCommand() {
        StringBuilder sb = new StringBuilder(super.getCommand());
        sb.append("\nplay()");
        return sb.toString();
    }
}
