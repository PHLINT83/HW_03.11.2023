import javax.crypto.spec.PSource;
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
        /*System.out.print("Введите значение добавляемого элемента: ");
        int value = kb.nextInt();
        System.out.print("Введите индекс добавляемого элемента: ");
        int index = kb.nextInt();
        list.insert(value, index);
        //list.pop_front();
        //list.pop_back();
        list.print();*/
        long start_time = System.nanoTime();
        ForwardList list2 = new ForwardList(list);
        long end_time = System.nanoTime();
        System.out.println("Список скопировался за %f секунд.".formatted((double)(end_time - start_time)*1e-9));
        list2.print();
        list.pop_back();
        list.print();
        list2.print();

        ForwardList d_list = new ForwardList();
        d_list.push_back(2.7);
        d_list.push_back(3.4);
        d_list.push_back(5.1);
        d_list.push_back(8.3);
        d_list.print();

        ForwardList s_list = new ForwardList();
        s_list.push_back("Хорошо");
        s_list.push_back("живёт");
        s_list.push_back("на");
        s_list.push_back("свете");
        s_list.push_back("Винни");
        s_list.push_back("Пух");
        s_list.print();

        ForwardList s_list_2 = new ForwardList(s_list);
        s_list_2.push_back(3.14);
        s_list_2.push_back(true);
        s_list_2.print();
    }
}