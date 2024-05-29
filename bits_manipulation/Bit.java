package bits_manipulation;

public class Bit {
    public static int setBit(int n, int pos) {
        return n | (1 << pos);
    }

    public static int clearBit(int n, int pos) {
        return n & ~(1 << pos);
    }

    public static int toggleBit(int n, int pos) {
        return n ^ (1 << pos);
    }

    public static boolean isBitSet(int n, int pos) {
        return (n & (1 << pos)) != 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 29; // binary: 11101

        System.out.println("Original number: " + number);

        // Set bit at position 1 (binary: 11111)
        System.out.println("Set bit at pos 1: " + setBit(number, 1));

        // Clear bit at position 3 (binary: 10101)
        System.out.println("Clear bit at pos 3: " + clearBit(number, 3));

        // Toggle bit at position 0 (binary: 11100)
        System.out.println("Toggle bit at pos 0: " + toggleBit(number, 0));

        // Check if bit at position 2 is set
        System.out.println("Is bit at pos 2 set? " + isBitSet(number, 2));

        // Count set bits in the number
        System.out.println("Number of set bits: " + countSetBits(number));
    }
}
