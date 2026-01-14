public class GenericContainerMain04 {

    public static void main(String[] args) {
        GenericContainter<String> StringContainter = new GenericContainter<String>(5);
        StringContainter.addItem("Apple");
        StringContainter.addItem("Banana");
        StringContainter.addItem("Cherry");

        StringContainter.printItems();

        //E extends Number <- only types that only includes numbers
        // String[] stringArray = { "1.1, 2.2, 3.3, 4.4, 5.5" };
        // System.out.println("Sum of int array: "+StringContainter.sum(stringArray));

        GenericContainter<Double> DoublContainter = new GenericContainter<Double>(5);
        DoublContainter.addItem(2.3);
        DoublContainter.addItem(2.4);
        DoublContainter.addItem(2.5);

        DoublContainter.printItems();

        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        System.out.println("Sum of int array: "+DoublContainter.sum(doubleArray));

        GenericContainter<Integer> integercontainer = new GenericContainter<Integer>(5);
        integercontainer.addItem(3);
        integercontainer.addItem(4);
        integercontainer.addItem(5);

        integercontainer.printItems();

        Integer[] intArray = { 1, 2, 3, 4, 5 };
        System.out.println("Sum of int array: "+integercontainer.sum(intArray));

        

    }

}
