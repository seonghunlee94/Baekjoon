import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        String[] rowStr = new String[N];
        char[] colStr = new char[M];

        int rowNum = 0;
        int colNum = 0;
        int resultNum = 0;
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            rowStr[i] = sc.nextLine();
            if (!rowStr[i].contains("X") ) {
                rowNum++;
            }

            for (int j = 0; j < M; j++) {
                if (rowStr[i].charAt(j) == 'X' && colStr[j] != 'X') {
                    colStr[j] = 'X';
                }

            }
        }

        for (int i = 0; i < M; i++) {
            if (colStr[i] == 0) {
                colNum++;
            }
        }

        if (rowNum > colNum) {
            resultNum = rowNum;
        } else {
            resultNum = colNum;
        }

        System.out.println(resultNum);
    }

}