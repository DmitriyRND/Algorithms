package Search;

public class SearchMaxNumber {
    public static void main(String[] args) {
        int[] numbers = {2, 235, 123, 678, 234, 22, 4, 521, 432};
        int max = searchMaxNamber(numbers);
        System.out.println(max);

    }

    public static int  searchMaxNamber(int[] box) {
        int maxNumber = box[0];
        for (int i = 0; i < box.length; i++) {
            if (box[i] > maxNumber)
                maxNumber = box[i];
        }
        return maxNumber;
    }

}
