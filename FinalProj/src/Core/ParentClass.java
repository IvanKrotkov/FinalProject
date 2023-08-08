package Core;


import java.util.Date;

abstract class ParentClass {
    private String name;
    private Date dateOfBirhday;

    public ParentClass(String name, Date dateOfBirhday) {
        this.name = name;
        this.dateOfBirhday = dateOfBirhday;
    }
    protected ParentClass(){
        this("Animal",new Date());
    }

    protected void makeASound(){}
    protected String getCommand(){
        return "Список комнад: \nmakeAsound()";
    }


}
