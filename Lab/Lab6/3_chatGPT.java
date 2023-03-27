import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] indexes = scanner.nextLine().split(" ");
        int[] index = new int[indexes.length];
        for (int i = 0; i < indexes.length; i++) {
            index[i] = Integer.parseInt(indexes[i]);
        }
        String answer = moveCharacters(s, index);
        System.out.println(answer);
    }

    public static String moveCharacters(String s, int[] index) {
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[index[i]] = s.charAt(i);
        }
        return new String(chars);
  }
}
