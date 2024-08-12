public class Pens {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.settip(6);
        System.out.println(p1.tip);
        // p1.setcolor("yellow");
        p1.color = "yellow";
        System.out.println(p1.color);

        bankaccount myaccount=new bankaccount();
        myaccount.username="Anandshukla";
        myaccount.setpassword("anand02");
    }
}

class bankaccount {
    public String username;
    private String password;
    public void setpassword(String pwd){
        password=pwd;
    }


}

class Pen {
    // Prop + Functi
    String color;
    int tip;

    void setcolor(String newColor) {
        color = newColor;
    }

    void settip(int newtip) {
        tip = newtip;
    }

    public char[] getColor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getColor'");
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void percentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
