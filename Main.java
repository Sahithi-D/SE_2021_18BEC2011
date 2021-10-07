import java.util.*;
public class Main{
    public static void print(String a[][]){
        System.out.println("Current Grid:");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        String[][] a=new String[5][5];
        Scanner s=new Scanner(System.in);
        System.out.println("Player1 Input:");
        for(int i=0;i<5;i++){
            a[4][i]="A-"+s.nextLine();
        }
        print(a);
        System.out.println("Player2 Input:");
        for(int i=0;i<5;i++){
            a[0][i]="B-"+s.nextLine();
        }
        print(a);
        int w=0;
        while(true){
            char q=(w%2==0)?'A':'B';
            System.out.println("Player "+q+"\'s Move:");
            String str=s.nextLine();
            int m=0;
            int n=0;
            if(str.length()==4 && str.charAt(2)==':'){
                String s1=q+"-"+str.substring(0,2);
                char s2=str.charAt(3);
                boolean e=false;
                for(int i=0;i<5;i++){
                    for(int j=0;j<5;j++){
                        if(s1.equals(a[i][j])){
                            m=i;
                            n=j;
                            e=true;
                            break;
                        }
                    }
                    if(e) break;
                }
                if(e==false){
                    System.out.println("Invalid Input:- element not found in the array");
                }
                if(q=='B'){
                switch(s2){
                    case 'l':
                    case 'L':
                        {  
                            if(n>0){
                            a[m][n-1]=a[m][n];
                            a[m][n]=null;
                            break;}
                        }
                    case 'r':
                    case 'R':
                        {
                            if(n>4){
                            a[m][n+1]=a[m][n];
                            a[m][n]=null;
                            break;
                            }
                        }
                    case 'f':
                    case 'F':
                        {
                            if(m<4){
                                a[m+1][n]=a[m][n];
                                a[m][n]=null;
                                break;
                            }
                            
                        }
                    case 'b':
                    case 'B':
                        {
                            if(m>0){
                                a[m-1][n]=a[m][n];
                                a[m][n]=null;
                                break;
                            }
                        }
                    default:{
                    System.out.println("Invalid Move:- move given is wrong");
                    break;}
                }}
                else{
                    switch(s2){
                    case 'l':
                    case 'L':
                        {  
                            if(n>0){
                            a[m][n-1]=a[m][n];
                            a[m][n]=null;
                            break;}
                        }
                    case 'r':
                    case 'R':
                        {
                            if(n<4){
                            a[m][n+1]=a[m][n];
                            a[m][n]=null;
                            break;
                            }
                        }
                    case 'f':
                    case 'F':
                        {
                            if(m>0){
                                a[m-1][n]=a[m][n];
                                a[m][n]=null;
                                break;
                            }
                            
                        }
                    case 'b':
                    case 'B':
                        {
                            if(m<4){
                                a[m+1][n]=a[m][n];
                                a[m][n]=null;
                                break;
                            }
                        }
                    default:{
                    System.out.println("Invalid Move:- move given is wrong");
                    break;}
                }
                    
                }
                
            }
            print(a);
            w++;
        }
        
    }
}
