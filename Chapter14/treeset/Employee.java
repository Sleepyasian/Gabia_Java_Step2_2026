package treeset;


//record :맴버 변수 선언, 생성자 오버로딩, getter/setter
//done constructor, overloading and getter and setter
public record Employee(String name, int age) {

    @Override
    public String toString() {
        return name + ": "+age;
    }

    


}
