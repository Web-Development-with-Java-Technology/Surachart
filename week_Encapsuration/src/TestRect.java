public class TestRect {
    
    public static void main(String[] args){
        System.out.println("------------------------------------------");
        Rectangle rec = new Rectangle();
        rec.height=7;
        rec.width=12;
        double area =  rec.computerArea();
        System.out.println("พื้นที่คือ : "+area);
        System.out.println("------------------------------------------");
    }
}
