package hello;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Velev Vlad on 22.06.2017.
 */
public class Hello {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

            try(FileWriter writer = new FileWriter("C:\\\\Work folder\\java\\TEST\\test.txt", false)){
                // запись всей строки
                String text = "Мама мыла раму, раму мыла мама";
                writer.write(text);
                // запись по символам
                writer.append('\n');
                writer.append('E');

                writer.flush();
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }

    }
}
