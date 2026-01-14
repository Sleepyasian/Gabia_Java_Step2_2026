public class FunInterMain_07 {

    public void test(){
        new FunInter() {
            
            @Override
            public void printData() {
                System.out.println("목요일");
            }

        }.printData();
    }
    public static void main(String[] args) {
        FunInterMain_07 funinter = new FunInterMain_07();
        funinter.test();
        
    }

}
