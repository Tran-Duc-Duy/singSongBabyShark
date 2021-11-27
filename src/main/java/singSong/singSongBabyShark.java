package singSong;
import java.io.*;
public class singSongBabyShark {
    public static void main(String[] args) throws IOException {
        shark[] familyShark = new shark[5];
        act[] actP = new act[5];
        String[] nameFamilyShark ={"baby","Mommy","Daddy","Grandma","Grandpa"};
        String[] actPerson ={"Let's go hunt!","Run away","Safe at last"};
        for(int i=0;i<5;i++) {
            shark temp = new shark(nameFamilyShark[i]);
            familyShark[i] =temp;
        }
        for(int i=0;i<3;i++) {
            act temp = new act(actPerson[i]);
            actP[i] =temp;
        }
        for(int i=0;i<5;i++) {
            for(int j=0;j<3;j++) {
                familyShark[i].sayName();
                familyShark[i].sayDoo();
            }
            familyShark[i].sayName();
            System.out.print("\n");
        }
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                actP[i].sayName();
                actP[i].sayDoo();
            }
            actP[i].sayName();
            System.out.print("\n");
        }
    }
}
