package main;
//Questão 1: Busca Binária
//Dado um array de inteiros ordenado de forma crescente, escreva uma função em Java que receba o array e um número alvo. A função deve retornar o índice do alvo no array ou -1 se o alvo não estiver presente.

public class BuscaBinaria {

    public static void main(String[] args) {
        int[] a = {0,0,1,1,1,2,3,4,4,5,6,7,7,7,9,9}
                ,b = {1,3,5,7,9} ;

        int alvo = 1;

        int i = binarySearchFromRatBook(b, alvo);
        System.out.println(i);
    }

    public static int binarySearchFromRatBook (int[] nums, int target) {
        int low = 0, high = nums.length - 1, steps = 0;


        while(low <= high) {
            steps++;
            System.out.println(steps);
            int midle = (high - low) / 2 + low,
                gess = nums[midle];

            if(gess == target)
                return midle;

            if(gess > target)
                high = midle - 1;

            else low = midle + 1;
        }
        return -1;
    }

    public static int buscaBinaria(int[] arr, int alvo) {
        int index = -1, start = 0, end = arr.length - 1;
        int helper = (end - start) / 2 + start;

        while(start <= end) {

            if(arr[helper] == alvo)
                index = helper;

            if(arr[helper] < alvo) {
                start = helper + 1;

            } else {
                end = helper -1;
            }

            helper = (end - start)/2 + start;
        }
         return index;
    }
}
