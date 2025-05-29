public class Patterns {
    public static void main(String[] args) {

        int n=4;
        pattern30(n);
    }
    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int i=0;i<2*n;i++){
            int c=i>n?2*n-i:i;
           for(int j=0;j<c;j++){
            System.out.print("* ");
           }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for(int i=0;i<2*n;i++){
            int c=i>n?2*n-i:i;
            int spaces=n-c;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
           for(int j=0;j<c;j++){
            System.out.print("* ");
           }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for(int i=1;i<=n;i++){
            for(int s=0;s<n-i;s++){
                System.out.print("  ");
            }
           for(int j=i;j>=1;j--){
            System.out.print(j+" ");
           }
           for(int j=2;j<=i;j++)
           {
            System.out.print(j+" ");
           }
            System.out.println();
        }
    }
}
