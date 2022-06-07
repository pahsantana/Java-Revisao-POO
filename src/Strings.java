public class Strings {
    public static void main(String[] args) {
        char c = 'a';
        String s1 = "hello";
        String s2 = "world";

        String s3 = s1 + " " + s2;

        System.out.println(s3);
        System.out.println();

        // Implicit number conversion
        System.out.println("bloco " + 1);
        System.out.println("versao " + 2.5);
        System.out.println();

        String si = "";
        String sd = "22.34";

        System.out.println(si + 1);
        System.out.println(sd + 0.1);
        double d = Double.parseDouble(sd);

        int i = Integer.parseInt(si);
        System.out.println(i + 1);
        System.out.println(d + 0.1);

        //double di = Double.parseDouble("10.32-");
        System.out.println(sd.length());
    }
}
