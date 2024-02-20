package exercises;

import java.io.*;

public class ExampleTryWithResources {

    private static final String MY_FILE = "/Users/thomas-al" + File.separator + "exemple-file.txt";
    public ExampleTryWithResources() {

        try {
            writeFileUsingIO();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        readFileUsingIO();
    }

    private void readFileUsingIO() {

        try {
            final InputStream input = new FileInputStream(MY_FILE);

            int content;

            while ((content = input.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeFileUsingIO() throws IOException {

        final File file = new File(MY_FILE);
        boolean fileIsCreated = false;

        if (!file.exists()) {
            fileIsCreated = file.createNewFile();
        }

        if (fileIsCreated) {

            final OutputStream output = new FileOutputStream(file);

            output.write("Ola Mundo! Tipo Guanabara!!".getBytes("UTF-8"));
            output.close();

            System.out.println("Deu certo... em principio");
        }
    }

    public static void main(String[] args) {
        new ExampleTryWithResources();
    }

}
