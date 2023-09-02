import java.io.FileNotFoundException;

public class Task3 {
}

class DivBuZero extends ArithmeticException{
    public DivBuZero() {
        super("Деление на 0 запрещено ");
    }
}


class NullPointerArray extends NullPointerException{
    public NullPointerArray(int index) {
        super("Oбращении к пустому элементу в массиве запрещено,индекс элемента: " + index);
    }

    public NullPointerArray() {
        super("Oбращении к пустому элементу в массиве запрещено ");
    }
}

class NotFile extends FileNotFoundException{
    public NotFile(String path) {
        super("Открыть несуществующий файл нельзя, ваш путь к фалу -> " + path);
    }
    public NotFile() {
        super("Открыть несуществующий файл нельзя");
    }


}