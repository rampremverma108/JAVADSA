public class ClassObjectExample{
    public static void main(String args[]){
        Pen Elkos = new Pen();
        Elkos.setColor("Blue");
        System.out.println(Elkos.color);
        Elkos.setTip(5);
        System.out.println(Elkos.tip);
        Elkos.color = "Black";  // 2nd way to set.
        System.out.println(Elkos.color);
    }
}
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}