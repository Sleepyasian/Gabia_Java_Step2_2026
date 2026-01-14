public class StudentMain {
    public static void main(String[] args) {
        // studentLee에 이수정으로 설정후 serialNum과 StudentName 출력
        Student_03 studentlee = new Student_03();
        studentlee.setStudentName ("이수정");

        System.out.println(studentlee.studentID);
        System.out.println(studentlee.serialNum);

        System.out.println("");
        Student_03 Studentkim = new Student_03();
        Studentkim.setStudentName ("김우성");

        System.out.println(Studentkim.studentID);
        System.out.println(Studentkim.serialNum);
        
        System.out.println("");
        Student_03 StudentPark = new Student_03();
        StudentPark.setStudentName ("박정우");

        System.out.println(StudentPark.studentID);
        System.out.println(StudentPark.serialNum);
        System.out.println(StudentPark.StudentName);



    }
}
