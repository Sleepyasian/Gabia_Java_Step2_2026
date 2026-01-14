public class CompanyMain_06 {
    public static void main(String[] args) {
        Company company = new Company();
        Company company2 = new Company();

        System.out.println(company);
        System.out.println(company2);

        System.out.println("------------singleton--------------");

    Company mycompany =  Company.getInstance();
    Company mycompany2 =Company.getInstance();
    
    System.out.println(mycompany);
    System.out.println(mycompany2);
    System.out.println(mycompany==mycompany2);

    }
}
