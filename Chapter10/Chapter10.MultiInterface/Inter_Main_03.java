public class Inter_Main_03 implements Inter_Menu3 {
    public static void main(String[] args) {
        Inter_Main_03 im = new Inter_Main_03();
        Inter_menu1 im1 = im;
        Inter_Menu2 im2 = im;
        Inter_Menu3 im3 = im;
        System.out.println("-----Inter_menu1-----");
        System.out.println(im1.jajang());
        im1.show();
        System.out.println("-----Inter_menu2-----");
        System.out.println(im2.tangsuyuk());

        System.out.println("-----Inter_menu3-----");
        System.out.println(im3.boggembab());

        
        

    }

    @Override
    public String jajang() {
        return "짜장면";
    }

    @Override
    public String jjambbong() {
        return "짬뽕";
    }

    @Override
    public String tangsuyuk() {
        return "탕수육";
    }

    @Override
    public String boggembab() {
        return "볶음밥";
    }

   
    


}
