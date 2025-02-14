import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int price = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int totalPrice = 0;

        while (N-- > 0) {

            String[] line = br.readLine().split(" ");

            int num1 = Integer.parseInt(line[0]);
            int num2 = Integer.parseInt(line[1]);
            totalPrice += num1 * num2;

        }
        if (totalPrice == price) System.out.println("Yes");
        else System.out.println("No");

    }
}

