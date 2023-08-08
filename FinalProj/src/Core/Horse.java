package Core;


import java.util.Date;

public class Horse extends PackAnimal {
    public Horse(String name, Date dateOfBirhday) {
        super(name, dateOfBirhday);
    }

    public Horse() {
        super();
    }
    public static Horse getHorse(String name, Date dob){
        return new Horse(name,dob);
    }

    @Override
    void transport() {
        System.out.println("Лошадь что то перевозит");
    }

    @Override
    public void makeASound() {
        System.out.println("Иго-го");
    }
    public void jump(){
        System.out.println("Перепрыгнула через ограждение");
    }
    public void run(){
        System.out.println("Лошадь скачет...");
    }

    @Override
    public String getCommand() {
        StringBuilder sb = new StringBuilder(super.getCommand());
        sb.append("\njump()");
        sb.append("\nrun()");
        return sb.toString();
    }
}
