import java.util.Date;

public class Humster extends Pets{
    protected Humster(String name, Date dateOfBirhday) {
        super(name, dateOfBirhday);
    }

    @Override
    void makeASound() {
        System.out.println("Хомяки известны, " +
                "как тихие животные, которые без видимых причин звуков не издают");
    }

    @Override
    void caress() {
        System.out.println("Хомячок просто лежит в твоей руке, и ему хорошо");
    }
    public void go(){
        System.out.println("Хомяку срочно нужно бежать по колесу, и он бежит");
    }
    @Override
    protected String getCommand() {
        StringBuilder sb = new StringBuilder(super.getCommand());
        sb.append("\ngo()");
        return sb.toString();
    }
}
