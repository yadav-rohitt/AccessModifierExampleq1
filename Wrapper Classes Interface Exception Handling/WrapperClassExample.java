public class WrapperClassExample {
    
    // Method to convert primitive int to Integer wrapper
    public Integer convertPrimitiveToWrapper(int value) {
        return Integer.valueOf(value);
    }

    // Method to convert Integer wrapper to primitive int
    public int convertWrapperToPrimitive(Integer wrapper) {
        return wrapper.intValue();
    }

    public static void main(String[] args) {
        WrapperClassExample example = new WrapperClassExample();

        // Convert int to Integer
        int primitive = 42;
        Integer wrapper = example.convertPrimitiveToWrapper(primitive);
        System.out.println("Primitive to Wrapper: " + wrapper);

        // Convert Integer to int
        int convertedPrimitive = example.convertWrapperToPrimitive(wrapper);
        System.out.println("Wrapper to Primitive: " + convertedPrimitive);
    }
}
