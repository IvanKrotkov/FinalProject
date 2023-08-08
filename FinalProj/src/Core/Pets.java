package Core;


import java.util.Date;

public abstract class Pets extends ParentClass {
    protected Pets(String name, Date dateOfBirhday) {
        super(name, dateOfBirhday);
    }
    protected void caress(){};

    public Pets() {
        super();
    }

    @Override
    protected String getCommand() {
        StringBuilder sb = new StringBuilder(super.getCommand());
        sb.append("\ncaress()");
        return sb.toString();
    }
}
