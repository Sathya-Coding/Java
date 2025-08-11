public class stringdeclareofstringbb {
    public static void main(String[]args) {
        String s1 = "priya";
        concat1(s1);
        System.out.println("String: " + s1);
        StringBuilder s2 = new StringBuilder("sathya");
        concat2(s2);
        System.out.println("StringBuilder: " + s2);
        StringBuffer s3 = new StringBuffer("sathya");
        concat3(s3);
        System.out.println("StringBuffer: " + s3);
    }
        public static void concat1 (String s1){

        s1=s1+"priya";
        }
        public static void concat2(StringBuilder s2){

        s2.append("priya");
        }
        public static void concat3(StringBuffer s3){

        s3.append("priya");
        }

    }

