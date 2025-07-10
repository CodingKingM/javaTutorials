public class Main {

    public static void main(String[] args) {

        Box<Integer> boxInteger = new Box<>();
        boxInteger.setIem(50);
        System.out.println(boxInteger.getItem());
    }
}
