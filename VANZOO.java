import java.io.*;
import java.util.*;
import java.lang.*;

public class VANZOO{
    int decide;
    int adults;
    int children;
    static int totald;
    static int tochild;
    public VANZOO(){
        this.getout("Enter 1 if you are visiting\n2 to see the end list\n3 to exit\n");
    }
    // public VANZOO(int b)
    // {
    //     VANZOO();
    // }
            
        public void getout(String h)
        {System.out.print(h);}
        
        public void getout(float f)
        {System.out.print(f);}
        
        public void getout(int i)
        {System.out.print(i);}
        
        public static int add(int one,int two)
        {return one+two;}

        public int getin(){
            int a;
            Scanner s = new Scanner(System.in);
            a=s.nextInt();
            return a;
        }
    
        public static void main(String[] args) {
            
            VANZOO v = new VANZOO();
            v.decide=3;
            v.tochild=0;
            v.totald=0;
            while(v.decide!=0)
        {
            v.decide=v.getin();
            if(v.decide==1)
            {   v.getout("Enter the number of Adult Visitors: ");
                v.adults=v.getin();
                v.totald=v.totald+v.adults;
                v.getout("\nEnter the number of Children Visitors: ");
                v.children=v.getin();
                v.tochild=v.tochild+v.children;
                v.getout("\nEnter 1 if you are visiting\n2 to see the end list\n3 to exit\n");
            }
            if(v.decide==2)
            {
                v.getout("The total number of Adults visited = ");
                v.getout(v.totald);
                v.getout("\nThe total number of Children visited = ");
                v.getout(v.tochild);
                v.getout("\nThe Total amount collected = ");
                int sum1 = v.totald*50;
                int sum2 = v.tochild*20;
                v.getout(add(sum1,sum2));
                v.getout("\nEnter 1 if you are visiting\n2 to see the end list\n3 to exit\n");
            }
        }
            
        }
    
}