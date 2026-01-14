public class GeneralNoGenericMain1 {
    public static void main(String[] args) {
        
        GeneralNoGeneric1 general = new GeneralNoGeneric1();


        //정수형 배열(autoboxing)
        Integer Arr[] = {10,20,30,40,50};
        general.printInArr(Arr);

        
        Double[] dArr = { 10.1, 20.1, 30.1, 40.1, 50.1 };
        general.printDoubleArr(dArr);

		Character[] cArr = { 'A', 'B', 'C', 'D', 'E' };
		general.printCharArr(cArr);

        

    }

}
