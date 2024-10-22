// Method demonstrating exception handling
public static void checkValue(int value) throws InvalidValueException {
    if (value < 0) {
        throw new InvalidValueException("Value cannot be negative!");
    }
    System.out.println("Value is: " + value);
}

public static void main(String[] args) {
    // Handling exceptions using try-catch
    try {
        checkValue(10);  // Valid value
        checkValue(-5);  // Invalid value that throws exception
    } catch (InvalidValueException e) {
        System.out.println("Caught Exception: " + e.getMessage());
    }

    // Using the generic Box class
    Box<Integer> intBox = new Box<>();
    Box<String> strBox = new Box<>();

    intBox.set(123);  // Set Integer value
    strBox.set("Hello");  // Set String value

    System.out.println("Integer value: " + intBox.get());
    System.out.println("String value: " + strBox.get());

    // Using the generic method to print arrays
    Integer[] intArray = {1, 2, 3, 4};
    String[] strArray = {"A", "B", "C"};

    System.out.print("Integer array: ");
    Utility.printArray(intArray);  // Calls generic method with Integer array

    System.out.print("String array: ");
    Utility.printArray(strArray);  // Calls generic method with String array
}
