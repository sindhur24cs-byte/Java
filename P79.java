public class RandomExample {
    public static void main(String[] args) {
        double num = Math.random(); // 0.0 to 1.0
        System.out.println(num);

        int randomInt = (int)(Math.random() * 100); // 0 to 99
        System.out.println(randomInt);
    }
}
