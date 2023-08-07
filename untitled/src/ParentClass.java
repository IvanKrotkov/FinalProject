import java.lang.reflect.Method;
import java.util.Date;

abstract class ParentClass {
    private String name;
    private Date dateOfBirhday;

    protected ParentClass(String name, Date dateOfBirhday) {
        this.name = name;
        this.dateOfBirhday = dateOfBirhday;
    }

    abstract void makeASound();
    protected String getCommand(){
        return "Список комнад: \nmakeAsound()";
    }
}
