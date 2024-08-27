package arrays_strings.lc_605_can_place_flowers;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0) {

                boolean left = (i == 0) || (flowerbed[i - 1] == 0);
                boolean right = (length - 1 == 0) || (flowerbed[i + 1] == 0);

                if (left && right) {
                    flowerbed[i] = 1;
                    count++;

                    if (count >= n) {
                        return true;
                    }
                }
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        CanPlaceFlowers sol = new CanPlaceFlowers();

        /* Case 1: Placing One in The Middle: Expected Output - True */ 
        int[] input1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println(sol.canPlaceFlowers(input1, n1));

        /* Case 2: n = 2 */
        int[] input2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println(sol.canPlaceFlowers(input2, n2)); 
    }
}
