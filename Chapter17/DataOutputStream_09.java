import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataOutputStream_09 {
    public static void main(String[] args) {
        String filePath = "datastream_output.dat";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {

            dos.writeUTF("Hello, DataOutputStream!");
            dos.writeInt(123);
            dos.writeDouble(45.67);
            System.out.println("데이터가 파일에 성공적으로 저장되었습니다");

        } catch (Exception e) {
            e.printStackTrace();

        }

        //DataInputStream을 사용하여 기본형 데이터를 읽기
   try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {

           String message =  dis.readUTF();
            int number = dis.readInt();
            double decimal =dis.readDouble();

            System.out.println("파일에서 읽은 데이터: ");
            System.out.println("Message: " + message);
            System.out.println("Number: " +number);
            System.out.println("Decimal: "+decimal);

        } catch (Exception e) {
            e.printStackTrace();

        }


    }

}
