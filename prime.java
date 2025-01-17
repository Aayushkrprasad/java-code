import java.util.*;
class ceo
{
    public static void main()
    {
        int n=15;
        for(int j=1;j<n;j++){
        int c=0;
        for(int i=j;i<j;i++){
           if(n%i==0)
           {
               c++;
           }
         }
           if(c==2)
           {
               System.out.println(j);
           }
           
        }
        
    }
}