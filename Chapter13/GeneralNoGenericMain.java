public class GeneralNoGenericMain {
    public static void main(String[] args) {
        
        General general = new General();

        //정수형 배열(autoboxing)
        Integer Arr[] = {10,20,30,40,50};
        general.printArr(Arr);

        
        Double[] dArr = { 10.1, 20.1, 30.1, 40.1, 50.1 };
        general.printArr(dArr);

		Character[] cArr = { 'A', 'B', 'C', 'D', 'E' };
		general.printArr(cArr);

        

    }

}
