public class CompanyMain_09 {
        

    public static void main(String[] args) {
        //Employee 객채 생성후 메서드 사용
        Employee employee = new Employee("직원1", 250);
        employee.work();
        employee.getInfo();
        // Manager 객채 생성후 메서드 사용
        Manager manager = new Manager("관리자1", 500, "개발");
        manager.work();
        manager.approveLeave("직원1");
        manager.getInfo();
        //상속 개념이 보이게 객체 생성후 메서드 사용
        Employee emp = new Manager("관리자2", 600, "영업");
        emp.work();
        emp.getInfo();

    }

}
