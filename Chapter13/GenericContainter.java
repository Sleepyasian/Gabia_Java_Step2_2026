public class GenericContainter<T> {

    private T items[];
    private int count;

    public GenericContainter(int size) {
        items = (T[]) new Object[size];
        count = 0;

    }
    // 아이템 추가하는 Generic method

    public void addItem(T item) {
        if (count < items.length) {
            // items[count] = item;
            // count++;
            items[count++] = item;

        } else {
            System.out.println("Container Full");
        }

    }

    public void printItems() {
        for (int i = 0; i < count; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    public <E extends Number> double sum(E[] numbers){
        double total =0;
        for(E number:numbers){
            total +=  number.doubleValue();

        }
        return total;
    }
}
