// Tower of honai ( Rules:1 Move only one disk at a time.
// 2. Only the top disk of any rod can be moved.
// 3. A larger disk cannot be placed on a smaller disk.(2^n - 1)
public class TowerOfHanoi {
    public static void hanoi(int n, char source, char helper, char destination) {

        // Base condition
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move n-1 disks from source to helper
        hanoi(n - 1, source, destination, helper);

        // Step 2: Move nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move n-1 disks from helper to destination
        hanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;  // Number of disks
        hanoi(n, 'A', 'B', 'C');
    }
}
