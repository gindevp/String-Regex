import java.util.List;

public class demo {
    public static void main(String[] args) {
//tính bất biến
//        String s = "Hello";
//        s.concat(" Java");//phương thức concat() để nối thêm chuỗi vào đuôi chuỗi s.
//        System.out.println(s);//sẽ chỉ in ra "Hello" vì các chuỗi này là đối tượng không thể thay đổi.
//
//
//        s = s.concat(" Java");//s sẽ trỏ đến "Hello Java" sau khi nối chuỗi
//        System.out.println(s);//Nhưng đối tượng chuỗi "Hello" vẫn tồn tại trong StringPool  và không bị thay đổi.
//
//
//        String s1="hello";
//        String s2=s1;//s2 nhận tham chiếu s1
//        s1="help";//s1 trỏ tới tham chiếu mới
//        System.out.println(s2);// kết quả là hello
//        System.out.println(s1);//kết quả là help
//
//
//        //String pool
//
//        //Sự khác nhau giữa tham chiếu ở stirng pool và ở heap
//        String x = "Hello World";
//
//        String y = "Hello World";
//
//        String z = new String("Hello World");
//
//        System.out.println(x==y); // kết quả trả về là true

//        System.out.println(x==z); // kết quả trả về là false

        String a = "Duc ANh";
        System.out.println(a.concat(" Nguyen"));
        System.out.println(a);

        // Cộng chuỗi trong string pool

//        String a = "Hello";
//
//        String b = "World";
//
//        String c = a + " " + b;
//
//        String y = "Hello World";
//
//        System.out.println(c==y);//false vì  c và y lưu trữ giá trị “Hello World” ở 2 ô nhớ khác nhau
//        //Chúng ta có thể xử lý bằng cách là thêm từ khóa final vào các biến chuỗi a và biến chuỗi b để những biến này trở thành 1 hằng chuỗi có giá trị không đổi
    }
}
