class getterSetter{
    public static void main(String args[]){
        Pen Elkos = new Pen(); //created a pen on object called Elkos
        Elkos.setColor("Red");
        System.out.println(Elkos.getColor());
        Elkos.setTip(5); //fn name
        System.out.println(Elkos.getTip());
        //
    }
}

class Pen{
    private String color;
    private int tip;
// Getter
String getColor(){
    return this.color;
}
int getTip(){
    return this.tip;
}
//Setter
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}