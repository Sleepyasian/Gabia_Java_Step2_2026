public class HttpServletMain_03 {

    public static void main(String[] args) {

        service(new LoginService());
        service(new FileDownloadService());
    }
    public static void service(HttpServlet servlet){
        servlet.service();
    }
    
}
