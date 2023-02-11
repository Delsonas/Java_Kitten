import java.io.IOException;
import java.util.Scanner;

public class first
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Время выбрать котёнка!");
        System.out.println("Выберите породу котёнка: 1 - Мейн Кун, а 0 - Сфинкс.");
        int value = scanner.nextInt();
        Kitten yourKitten;
        if (value !=1 && value !=0)
        {
            System.out.println("Пожалуйста, выберите породу котёнка: 1 - Мейн Кун, а 0 - Сфинкс.");
            int value1 = scanner.nextInt();
            scanner.close();
            if(value1 !=1 && value1 !=0)
            {
                value = (int)(Math.round(Math.random()));
                System.out.println("Мы выбрали вам котёнка рандомной породы!");
            }
        }

        if (value == 1)
        {
            System.out.println("Вы выбрали миленького котёнка породы Мейн Кун.\n");
            yourKitten = new MaineCoon();
            double a = yourKitten.weight();
            System.out.print("Вес вашего котёнка - ");
            System.out.printf("%.1f", a);
        }
        else
        {
            System.out.println("Вы выбрали миленького котёнка породы Сфинкс.\n");
            yourKitten = new Sfinks();
            double b = yourKitten.weight();
            System.out.print("Вес вашего котёнка - ");
            System.out.printf("%.1f", b);

        }
        System.out.println(" киллограмм!");

        System.out.println(yourKitten.sound());
        System.out.println(yourKitten.comeToMe());
    }

}
