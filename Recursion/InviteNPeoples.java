package Recursion;

public class InviteNPeoples {
    public static int inviteGuests(int n) {
        if (n <= 0) {
            return 1;
        }
        int singleGuest = inviteGuests(n - 1);
        int pairGuest = (n - 1) * inviteGuests(n - 2);
        return singleGuest + pairGuest;
    }

    public static void main(String[] args) {
        int n = 4;
        int result = inviteGuests(n);
        System.out.println("Possible ways to invite guests - " + result);
    }
}
