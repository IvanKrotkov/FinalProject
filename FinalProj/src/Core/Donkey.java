package Core;


import java.util.Date;
public class Donkey extends PackAnimal {
    public Donkey(String name, Date dateOfBirhday) {
        super(name, dateOfBirhday);
    }
    public static Donkey getDonkey(String name, Date dob){
        return new Donkey(name,dob);
    }
    public Donkey() {
        super();
    }

    @Override
    void transport() {
        System.out.println("Осёл работает");
    }

    @Override
    public void makeASound() {
        System.out.println("iiii ahn");
    }

}

