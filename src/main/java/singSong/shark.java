package singSong;

public class shark {
    protected String name;
    public shark(String nameIn){
        name = nameIn;
    }
    public shark(){
        name = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void sayName(){
        System.out.println(this.getName() + " shark!");
    }
    public static void sayDoo(){
        for(int i=1;i<=6;i++) {
            System.out.print("doo ");
        }
        System.out.print("\n");
    }
}

