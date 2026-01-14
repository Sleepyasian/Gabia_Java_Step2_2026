public abstract  class Computer {
//하나라도 수상메서드가 존재하면 수상 클래스이나(keyward: abstract) 반드시 추상클래스로 선언해야 한다.

    //추상메서드 -> Body가 없다
    public abstract void display(); //하위 클래스 구현부에서 구현하여 사용
    public abstract void typing(); //하위 클래스 구현부에서 구현하여 사용

    //이반 메서드
    public void turnon(){
        System.out.println("전원을 킵니다.");
    }
    public void turnoff(){
        System.out.println("전원을 끕니다.");
    }


}
