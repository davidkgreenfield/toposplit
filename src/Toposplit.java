import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Toposplit{
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        BufferedReader reader = new BufferedReader(new FileReader("./topojson"));
        String jsonString = reader.readLine();
        Gson gson = new Gson();
    }

}