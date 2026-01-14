public class Bank {

    private String point;
    private String tel;
    static float interest;

    //생성자(지잠명, 전화번호)
    public Bank() {
        
    }
    public Bank(String point, String tel) {
        this.point = point;
        this.tel = tel;
    }

    // 결과 출력 메서드
	public void getBank() {
		System.out.println("지점: " + point + "\n" + "전화번호: " + tel + "\n은행이자: " + interest);
	}
    

    /**
     * @return String return the point
     */
    public String getPoint() {
        return point;
    }

    /**
     * @param point the point to set
     */
    public void setPoint(String point) {
        this.point = point;
    }

    /**
     * @return String return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

}
