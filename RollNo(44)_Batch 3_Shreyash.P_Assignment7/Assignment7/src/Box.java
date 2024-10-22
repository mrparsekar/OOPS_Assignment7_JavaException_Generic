// src/Box.java
public class Box<T> {
    private T value;

    // Setter for the value
    public void set(T value) {
        this.value = value;
    }

    // Getter for the value
    public T get() {
        return value;
    }
}
