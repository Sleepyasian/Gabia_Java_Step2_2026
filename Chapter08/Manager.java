public class Manager extends Employee {

    String department;

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(name + " 관리자가"
                + department + "부서에서 관리하고 있습니다");
    }

    public void approveLeave(String employeeName) {

        System.out.println(name + " 관리자가"
                + employeeName + "부서의 휴가를 승인했습니다");
    }
    
}
