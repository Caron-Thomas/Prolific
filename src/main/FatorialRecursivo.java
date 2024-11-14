package main;

public class FatorialRecursivo {

    public static void main(String[] args) {

        int i1 = 5, i2 = 100, i3 = 0;
        int fatorial = fatorialComLong(i1);
        int fatorial1 = fatorialComLong(i2);
        int fatorial2 = fatorialComLong(i3);
        System.out.println(fatorial + " "
                + fatorial1 + " " + fatorial2);
    }

    public static int fatorial(int n) {
        int response = 1;
            for (int i = 1; i <= n; i++) {
                if(response < 0)
                    return -1;

                response = response * i;
            }
        return response;
    }

    public static int fatorialComLong(int n) {
        long response = 1;
        for (int i = 1; i <= n; i++) {
            if(response > 2147483647)
                return -1;

            response = response * i;
        }
        return (int)response;
    }
}
