package MVP;

public class App {
    static Model model = new Model();
    public static void run(){
        try {
            model.menu();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        App.run();
    }
}
