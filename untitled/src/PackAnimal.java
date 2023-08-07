import java.util.Date;

abstract class PackAnimal extends ParentClass{
    public PackAnimal(String name, Date dateOfBirhday) {
        super(name, dateOfBirhday);
    }
    abstract void transport();

    @Override
    protected String getCommand() {
        StringBuilder sb = new StringBuilder(super.getCommand());
        sb.append("\ntransport()");
        return sb.toString();
    }
}
