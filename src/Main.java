import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws NotFile {
        main4();

    }
    public static void main2(){
        try (CountTask2 ct = new CountTask2()){
            ct.add();
            ct.add();
            ct.add();
            ct.add();
            System.out.println(ct.getCount());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }}

    public static void main3() {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            try {
                throw new DivBuZero();
            } catch (DivBuZero ex) {
                System.out.println(ex.getMessage());
            }

        }


        int i = 0;
        try {
            Integer[] array = {1, 2, 3, 4, null, 6, 7, 8, 9, 0};
            for (; i < array.length; i++) {
                System.out.println(array[i]);
                array[i]++;
            }
        } catch (NullPointerException e) {
            try {
                throw new NullPointerArray(i);
            } catch (NullPointerArray ex) {
                System.out.println(ex.getMessage());
            }
        }


        String path = "wqeqwesdasd.txt";
        try (FileReader fr = new FileReader(path)) {
            int a = 5;
        } catch (FileNotFoundException e) {
            try {
                throw new NotFile(path);
            } catch (NotFile ex) {
                System.out.println(ex.getMessage());
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static void main4() {
        String[][] array = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};


        String[][] array1 = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};

        String[][] array2 = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "ihhi", "4"}};
        System.out.println(Task4.checkArray(array));
        try {
        System.out.println(Task4.checkArray(array1));
        }catch (MyArrayDataException | MyArraySizeException e){
            System.out.println(e.getMessage());
        }


        try {
        System.out.println(Task4.checkArray(array2));
        }catch (MyArrayDataException | MyArraySizeException e){
            System.out.println(e.getMessage());
        }
    }
}