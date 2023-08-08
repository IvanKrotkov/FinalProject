package Core;


import java.util.Date;

public class Hamster extends Pets {
    protected Hamster(String name, Date dateOfBirhday) {
        super(name, dateOfBirhday);
    }

    public Hamster() {
        super();
    }
    public static Hamster getHamster(String name, Date dob){
        return new Hamster(name,dob);
    }

    @Override
    public void makeASound() {
        System.out.println("Хомяки известны, " +
                "как тихие животные, которые без видимых причин звуков не издают");
    }

    @Override
    public void caress() {
        System.out.println("Хомячок просто лежит в твоей руке, и ему хорошо");
    }
    public void go(){
        System.out.println("Хомяку срочно нужно бежать по колесу, и он бежит");
    }
    @Override
    public String getCommand() {
        StringBuilder sb = new StringBuilder(super.getCommand());
        sb.append("\ngo()");
        return sb.toString();
    }
}
