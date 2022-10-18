import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        int c =(int)(Math.random()*7);
        int d =(int)(Math.random()*7);
        System.out.println("Завдання 2 гра в кості: Ваші кості=>>"+a+"; "+b);
        System.out.println("Завдання 2 гра в кості: Kості компьютера=>>"+c+"; "+d);
        if(a+b > c+d)System.out.println("Завдання 2 гра в кості: Ви перемогли");
        if(a+b == c+d)System.out.println("Завдання 2 гра в кості: Нічья");
        if(a+b < c+d)System.out.println("Завдання 2 гра в кості: Ви програли");


        scanner.nextLine();
        String str = scanner.nextLine();
        if(str.contains("-"))System.out.println("Це від'ємне число");
        else if(str.contains("0"))System.out.println("Це 0");
        else if(str.matches("(\\.\\d+)?")) System.out.println("Додатне число");
        else System.out.println("Число не знайдено");

    }
}
