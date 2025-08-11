public class stringconvertstringtostringbuffer {
    public static void main(String[]args){
        String S="sathya";
        StringBuffer sbr=new StringBuffer(S);
        sbr.reverse();
        System.out.println(sbr);
        StringBuilder sbr2=new StringBuilder(S);
        sbr2.append("priya");
        System.out.println(sbr2);

    }
}
