import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        String[] str;

        ArrayList<Integer> list = new ArrayList<>();

        while (num > 0) {

            str = sc.nextLine().split(" ");

            switch (str[0]) {
                case "push":
                    list.add(Integer.parseInt(str[1].trim()));
                    break;
                case "pop":
                    if (list.size() > 0)
                        System.out.println(list.remove(0));
                    else System.out.println(-1);
                    break;
                case "size":
                    System.out.println(list.size());
                    break;
                case "empty":
                    if (list.size() == 0)
                        System.out.println(1);
                    else System.out.println(0);
                    break;
                case "front":
                    if (list.size() == 0)
                        System.out.println(-1);
                    else System.out.println(list.get(0));
                    break;
                case "back":
                    if (list.size() == 0)
                        System.out.println(-1);
                    else System.out.println(list.get(list.size() - 1));
                    break;
            }

            num--;
        }

    }
}