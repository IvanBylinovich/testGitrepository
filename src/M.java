public class M {
    public static void main(String[] args) {

        try {
            throw new UnsupportedOperationException();
        } catch(Throwable t) {
            System.out.print("1");
        }

    }
}
