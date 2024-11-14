package main;

//Questão 5: Menor Subarray com Soma Mínima
//Dado um array de inteiros e um valor s, encontre o menor subarray (com no mínimo um elemento) cuja soma dos elementos seja maior ou igual a s. Retorne o tamanho desse subarray. Se tal subarray não existir, retorne 0.

//Entrada: nums = [2, 3, 1, 2, 4, 3], s = 7
//Saída: 2 (o menor subarray com soma ≥ 7 é [4, 3])

public class MenorSubComSoma {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int s = 7;
        System.out.println(menorSubarrayComSomaMinima(nums, s));
        char[] t = {'c','a','s','a'};
        String u = String.valueOf(t);
        String r = "casa";
        System.out.println(u == r);
        System.out.println(u.equals(r));


    }
    public static int menorSubarrayComSomaMinima(int[] nums, int s) {
        int somaAtual = 0;
        int menorTamanho = Integer.MAX_VALUE;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            somaAtual += nums[end];

            // Reduz o tamanho da janela quando a soma for maior ou igual a 's'
            while (somaAtual >= s) {
                menorTamanho = Math.min(menorTamanho, end - start + 1);
                somaAtual -= nums[start];
                start++;
            }
        }

        // Se menorTamanho ainda for o valor inicial, significa que não encontramos um subarray válido
        return menorTamanho == Integer.MAX_VALUE ? 0 : menorTamanho;
    }
}
