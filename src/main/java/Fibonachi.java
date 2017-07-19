import java.util.Scanner;

public class Fibonachi {

    public static void main(String[] args) {
//        int input = 0;
//        Scanner sc = new Scanner(System.in);
//        if (sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
//            input = sc.nextInt();
//        }
//        int[] array = new int[input];
//        if (array.length > 2) {
//            array[0] = 1;
//            array[1] = 1;
//
//            for (int i = 2; i < array.length; i++) {
//                array[i] = (array[i - 1] + array[i - 2])%10;
//            }
//            System.out.println(array[array.length - 1]);
//        }else if(array.length == 0){
//
//            System.out.println(0);
//        }else {
//            System.out.println(1);

        Student student = new Student("Artiom");
        foo(student);
        System.out.println(student.getName());
    }

    public static void foo(Student student) {
        student = new Student("Lev");
    }

}

