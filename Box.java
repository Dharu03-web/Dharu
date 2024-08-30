public class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public static <U> void inspect(U u) {
        System.out.println("Type: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(123);
        System.out.println("Value: " + integerBox.get());

        inspect("Hello");
        inspect(42);
    }
}
