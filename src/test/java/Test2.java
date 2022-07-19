public class Test2 {
    public static void main(String args[]){
        String a="HUMMING LIFE - 君と私.mp3";
        char[] ch=a.toCharArray();
        String b="";
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' '){
                b=b+"+ +";
            }
            else {
                b=b+ch[i];
            }
        }
        System.out.println(b);
    }

}
