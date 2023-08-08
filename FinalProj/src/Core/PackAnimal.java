package Core;

import java.util.Date;

abstract class PackAnimal extends ParentClass {
    public PackAnimal(String name, Date dateOfBirhday) {
        super(name, dateOfBirhday);
    }

    public PackAnimal() {
        super();
    }

    abstract void transport();

    @Override
    public String getCommand() {
        StringBuilder sb = new StringBuilder(super.getCommand());
        sb.append("\ntransport()");
        return sb.toString();
    }
}
