import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Member[] member = new Member[N];

        for (int i = 0; i < N; i++) {
            member[i] = new Member(sc.nextInt(), sc.next(), i);
        }

        Arrays.sort(member, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
//                if (o1.age != o2.age)
                return o1.age - o2.age;
//                return o1.idx - o2.idx;
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(member[i].age + " " + member[i].name);
        }

    }

}


class Member {
    int age;
    String name;
    int idx;

    public Member (int age, String name, int idx) {
        this.age = age;
        this.name = name;
        this.idx = idx;
    }
}
