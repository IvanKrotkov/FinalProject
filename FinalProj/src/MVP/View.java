package MVP;

import java.util.Date;
import java.util.Scanner;

interface View {
    void menu() throws Exception;
    Date getData(Scanner scanner);
    String getName(Scanner scanner);
}
