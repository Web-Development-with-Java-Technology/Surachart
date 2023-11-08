public class TestRectEncaps {
    public static void main(String[] args){
        RectEncaps tle = new RectEncaps();

        tle.setWidth(5);
        tle.setHeight(20);

        System.out.println("ค่าของ width : "+tle.getWidth());
        System.out.println("ค่าของ height : "+tle.getHeight());

        System.out.println("area :"+tle.computerArea());
    }
    }

