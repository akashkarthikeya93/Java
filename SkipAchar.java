public class SkipAchar {
    public static void main(String[] args) {
        skipachar("","baccdah");
    }
    public static void skipachar(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skipachar(p, up.substring(1));
        }
        else
        skipachar(p+ch, up.substring(1));
        }
}
