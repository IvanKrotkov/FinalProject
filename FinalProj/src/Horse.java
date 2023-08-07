import java.util.Date;

public class Horse extends PackAnimal{
    public Horse(String name, Date dateOfBirhday) {
        super(name, dateOfBirhday);
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
    protected String getCommand() {
        StringBuilder sb = new StringBuilder(super.getCommand());
        sb.append("\njump()");
        sb.append("\nrun()");
        return sb.toString();
    }
}
