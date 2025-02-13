import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Map<String, Integer> saleBook = new TreeMap();

        String book;
        int num;

        sc.nextLine();
        for (int i = 0; i < N; i++) {
            book = sc.nextLine();

            if (saleBook.containsKey(book)) {
                num = saleBook.get(book);
                saleBook.replace(book, num + 1);
            } else {
                saleBook.put(book, 1);
            }

        }

        int maxSale = Collections.max(saleBook.values());

        for (String key : saleBook.keySet()) {
            if (maxSale == saleBook.get(key)) {
                System.out.println(key);
                return;
            }
        }

    }
}

