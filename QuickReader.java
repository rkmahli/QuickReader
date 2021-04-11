import java.io.IOException;
import java.io.InputStream;

public class QuickReader {

    private long skip = 0;

    private char delimiter = ' ';

    private char eol = '\n';

    private int endOfStream = 0;

    private InputStream inputStream;

    private byte bytes[];

    private int bufferSize = 8 * 1024;

    public QuickReader(InputStream is) {
        bytes = new byte[bufferSize];
        inputStream = is;
    }

    public QuickReader(InputStream is, int bufferKB) {
        bufferSize = bufferKB * 1024;
        inputStream = is;
        bytes = new byte[bufferSize];
    }

    public void setDelimiter(char delimiter) {
        this.delimiter = delimiter;
    }

    public int readInt () throws IOException {
        boolean readInitiated = false;
        inputStream.skip(skip);
        inputStream.mark(0);
        int readLength = inputStream.read(bytes);

        int i;

        return 0;
    }

    public int[] readIntArray() {
        boolean readInitiated = false;
        return new int[0];
    }
}