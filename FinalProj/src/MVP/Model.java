package MVP;


import Core.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Model implements View {

    @Override
    public void menu() throws Exception {
        try (Scanner scanner = new Scanner(System.in)){
            String name = null;
            Date dob;
            System.out.println("Выберите функцию:" +
                    "\nЗавести новое животное (1)" +
                    "\nУвидеть список команд животного (2)" +
                    "\nОбучить животное новым командам (3)" +
                    "\nВыход (q):");
            switch (scanner.nextLine()){
                case "1":
                    try (Counter counter = new Counter()){
                        counter.add();
                        System.out.println("Определите класс(Camel/Cat/Dog/Donkey/" +
                                "Horse/Hamster):");
                        switch (scanner.nextLine()){
                            case "Camel":
                                Camel camel = Camel.getCamel(getName(scanner),getData(scanner));
                                menu();
                            case "Сat":
                                Cat cat  = Cat.getCat(getName(scanner),getData(scanner));
                                menu();
                            case "Dog":
                                Dog dog  = Dog.getDog(getName(scanner),getData(scanner));
                                menu();
                            case "Donkey":
                                Donkey donkey  = Donkey.getDonkey(getName(scanner),getData(scanner));
                                menu();
                            case "Horse":
                                Horse horse = Horse.getHorse(getName(scanner),getData(scanner));
                                menu();
                            case "Hamster":
                                Hamster hamster = Hamster.getHamster(getName(scanner),getData(scanner));
                                menu();
                        }
                    }
                case "2":
                    System.out.println("Определите класс(Camel/Cat/Dog/Donkey/" +
                            "Horse/Hamster):");
                    switch (scanner.nextLine()){
                        case "Camel":
                            System.out.println(new Camel().getCommand());
                            menu();
                        case "Cat":
                            System.out.println(new Cat().getCommand());
                            menu();
                        case "Dog":
                            System.out.println(new Dog().getCommand());
                            menu();
                        case "Donkey":
                            System.out.println(new Donkey().getCommand());
                            menu();
                        case "Horse":
                            System.out.println(new Horse().getCommand());
                            menu();
                        case "Hamster":
                            System.out.println(new Hamster().getCommand());
                            menu();
                    }
                case "3":
                    System.out.println("Что должно уметь животное?");
                    String doit = scanner.nextLine();
                    System.out.printf("Поздравляю, твоё животное теперь умеет %s!", doit);
                    menu();
                case "q":
                    scanner.close();
                    break;
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Date getData(Scanner scanner) {
        System.out.println("Введите дату рождения животного(dd-MMM-yyyy):");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String temp = scanner.nextLine();
        Date date = null;
        try {
            date = dateFormat.parse(temp);
        } catch (NoSuchElementException | ParseException e){
            System.out.println(e.getMessage());
        }
        return date;
    }

    public String getName(Scanner scanner) {
        String name = null;
        System.out.println("Введите имя животного:");
        name = scanner.nextLine();
        return name;
    }
}
