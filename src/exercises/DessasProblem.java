package exercises;

public class DessasProblem {

  public static void main(String[] args) {
    String e1 = "aaaaaaaaeeeeiiiiioooooouuuuuuuuuu", // 33
        e2 = "aaaaaaaa", // 0
        e3 = "aaaaaaaeeeeiioiuuuuuuuuu", // 0
        e4 = "iiiiiiiiaaaaaeeeeeeeaaeeeeiiouuuuuuaaaaaa", // 15
        e5 = "ooiieeooiiaaooaaeeiioouuaeiouaaaaaaaaaaaaaaaaaaaaaaaaaaaeeeeeeiou", // 36
        e6 = "aeiou"; // 5

    System.out.println(findSpecialString(e1));
    System.out.println(findSpecialString(e2));
    System.out.println(findSpecialString(e3));
    System.out.println(findSpecialString(e4));
    System.out.println(findSpecialString(e5));
    System.out.println(findSpecialString(e6));
  }

  public static long findSpecialString(String str) {
    char[] letters = str.toCharArray();
    char[] vowels = {'a', 'e', 'i', 'o', 'u', 'u'};
    long sum = 0L, tempSum = 0L;
    int i = 0;
    for (char letter : letters) {
      if (letter == vowels[i]) {
        tempSum++;
      } else if (letter == vowels[i + 1]) {
        tempSum++;
        i++;
      } else {
        tempSum = letter == 'a' ? 1L : 0L;
        i = 0;
      }

      if (letter == 'u' && tempSum > sum) {
        sum = tempSum;
      }
    }
    return sum;
  }
}
