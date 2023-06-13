package Search;

public class ElementSearch {
    public static void main(String[] args) {
        String[] box = {"машина", "дерево", "телефон", "клавиатура", "время"};
        boolean word = search(box,"дерево");
        System.out.println(word);

    }

    public static boolean search(String [] box, String word) {
        boolean x = false;
        for (String s : box) {

            if (s.equalsIgnoreCase(word)) {
                x = true;
                break;
            }
        }
        return x;
    }
}
