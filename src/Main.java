import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Random rand = new Random(0);
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int n = kb.nextInt();

        ForwardList list = new ForwardList();
        for (int i = 0; i < n; i ++)
        {
            //list.push_back(rand.nextInt(100));
            list.push_front(rand.nextInt(100));
        }
        //list.push_back(123);
        list.print();
        System.out.print("Введите значение добавляемого элемента: ");
        int value = kb.nextInt();
        System.out.print("Введите индекс добавляемого элемента: ");
        int index = kb.nextInt();
        list.insert(value, index);
        //list.pop_front();
        //list.pop_back();
        list.print();

    }
}