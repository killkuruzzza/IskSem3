import java.io.IOException;

public class CountTask2 implements AutoCloseable
{
    private Integer count;

    public CountTask2() {
        this.count = 0;
    }

    public Integer getCount() throws IOException {
        checkClose();
        return count;
    }

    public void add() throws IOException {
        checkClose();
        this.count++;
    }
    public void checkClose() throws IOException {
        if (this.count  == null)
            throw new IOException("Экземпляр закрыт");
    }

    @Override
    public void close() {
        this.count = null;
    }
}
