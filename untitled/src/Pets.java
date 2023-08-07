import java.util.Date;

public abstract class Pets extends ParentClass{
    protected Pets(String name, Date dateOfBirhday) {
        super(name, dateOfBirhday);
    }
    abstract void caress();
}
