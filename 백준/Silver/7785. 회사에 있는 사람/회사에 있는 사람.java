import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Employee[] employees = new Employee[N+1];
        int count = 0;
        for (int i = 0; i < N; i++) {
            employees[i] = new Employee(sc.next(), sc.next());
            count++;
        }
        employees[count] = new Employee("1234556", "123");
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.name.compareTo(o1.name);
            }
        });

        for (int j = 0; j < N; j++) {
            if (employees[j].type.equals("enter") && !employees[j+1].type.equals("leave"))
                System.out.println(employees[j].name);
        }

    }

}

class Employee {
    String name;
    String type;

    Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }
}


