package lesson5;

import java.io.Serializable;
import java.util.Arrays;

public class AppData implements Serializable {
    private String[] headers;
    private int[][] data;

    public AppData(String[] headers, int[][] data) {
        this.headers = headers;
        this.data = data;
    }

    public String getHeaders() {
        return Arrays.toString(headers);
    }

    public String getData() {
        return Arrays.deepToString(data);
    }
/*
    @Override
    public String toString() {
        return getHeaders() + " " + getData();
    }
 */
    @Override
    public String toString() {
        return "headers=" + Arrays.toString(headers) +"" +
                "" +
                ", data=" + Arrays.deepToString(data);
    }
}