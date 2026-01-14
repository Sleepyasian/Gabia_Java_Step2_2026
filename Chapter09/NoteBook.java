public abstract class NoteBook extends Computer {

    //상속받은 2개의 추상메서드중 하나만 정의할 경우 아직도 추상클래스로 간주
    @Override
    public void display() {
       System.out.println("NoteBook display");
    }

    @Override
    public void typing() {
        System.out.println("NoteBook typing");
    }
    
    
}
