package Core;

import java.util.Date;

public class Cat extends Pets {
    protected Cat(String name, Date dateOfBirhday) {
        super(name, dateOfBirhday);
    }
    public static Cat getCat(String name, Date dob){
        return new Cat(name,dob);
    }
    public void walk(){
        System.out.println("Как грациозно она ходит!");
    }
    @Override
    public void makeASound() {
        System.out.println("мяу");
    }

    public Cat() {
        super();
    }

    @Override
    public String getCommand() {
        StringBuilder sb = new StringBuilder(super.getCommand());
        sb.append("\nwalk()");
        return sb.toString();
    }

    @Override
    public void caress() {
        System.out.println("Мурррр");
    }
}
