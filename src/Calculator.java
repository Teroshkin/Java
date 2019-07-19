import java.util.*;

public class Calculator {
    public static void main(String args[]) throws java.io.IOException {
        double db1 = 0, db2 = 0;
        int choice;
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Введите первое число:");
                db1 = (double) sc.nextDouble();
            }
            catch(InputMismatchException exc) {
                System.out.println("\"" +sc.nextLine() + "\" не является числом" + "\n");
                continue;
            }
            do {
                System.out.println("Выберете желаемое действие:");
                System.out.println("1 - Сложение\t5 - Остаток от деления\n2 - Вычитание\t6 - Корень квадратный\n3 - Умножение\t7 - Возведение в степень\n4 - Деление");
                choice = (int) sc.nextInt();
                switch(choice) {
                    case 1 :
                    case 2 :
                    case 3 :
                    case 4 :
                    case 5 :
                        try {
                            System.out.println("Введите второе число:");
                            db2 = (double) sc.nextDouble();
                        }
                        catch(InputMismatchException exc) {
                            System.out.println("\"" +sc.nextLine() + "\" не является числом" + "\n");
                            continue;
                        }
                        if(choice == 1) {
                            System.out.println(db1 + " + " + db2 + " = " + (db1 + db2) + "\n");
                        }
                        else if(choice == 2) {
                            System.out.println(db1 + " - " + db2 + " = " + (db1 - db2) + "\n");
                        }
                        else if(choice == 3) {
                            System.out.println(db1 + " * " + db2 + " = " + (db1 * db2) + "\n");
                        }
                        else if(choice == 4) {
                            if (Double.isInfinite(db1/db2)) {
                                System.out.println("Деление на 0! \n");
                            }
                            else {
                                System.out.println(db1 + " / " + db2 + " = " + (db1 / db2) + "\n");
                            }
                        }
                        else if(choice == 5) {
                            if (Double.isNaN(db1%db2)) {
                                System.out.println("Деление на 0! \n");
                            }
                            else {
                                System.out.println(db1 + " % " + db2 + " = " + (db1 % db2) + "\n");
                            }
                        }
                        break;
                    case 6 :
                        System.out.println("Корень квадратный из числа " + db1 + " = " + Math.sqrt(db1) + "\n");
                        break;
                    case 7 :
                        try {
                            System.out.println("Укажите степень числа " + db1);
                            db2 = (double) sc.nextDouble();
                        }
                        catch(InputMismatchException exc) {
                            System.out.println("\"" +sc.nextLine() + "\" не является степенью числа " + db1 + "\n");
                            continue;
                        }
                        System.out.println(db1 + " в степени " + db2 + " = " + Math.pow(db1, db2) + "\n");
                        break;
                    default :
                        System.out.print("Выбор неверный! ");
                        break;
                }
            } while(choice < 1 | choice > 6);
        }
    }
}