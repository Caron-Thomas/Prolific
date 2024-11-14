package main;

//Questão 2: Verificação de Palíndromo
//Escreva uma função que determine se uma string é um palíndromo (palavra que pode ser lida da mesma forma de trás para frente). A função deve ignorar espaços em branco e diferenças entre maiúsculas e minúsculas.

public class Palindromico2 {

    public static void main(String[] args) {
        String s = "A man a plan a canal Panama";
        boolean palidromic = palidromic(s);
        System.out.println(palidromic);
    }


    public static boolean palidromic(String string){
        String noSpaces = string.replaceAll(" ", "").toLowerCase();
        int end = noSpaces.length() - 1, start = 0;

        while(start <= end) {
            if(noSpaces.charAt(end) != noSpaces.charAt(start)) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}
