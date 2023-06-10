package Search;

public class ElementSearch {
    public static void main(String[] args) {
        String[] box = {"машина", "дерево", "телефон", "клавиатура", "время"};
        boolean word = search(box);
        System.out.println(word);

    }

    public static boolean search(String[] box) {
        boolean x = false;
        for (String s : box) {

            if (s.equalsIgnoreCase("дерево")) {
                x = true;
                break;
            }
        }
        return x;
    }
}
