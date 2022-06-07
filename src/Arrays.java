public class Arrays {
    public static void main(String[] args) {
        // declaration
        double[] a;
         // memory allocation - heap
        a = new double[10];

        for(int i = 0; i<a.length;i++){
            a[i] = i + i / 10.0;
        }

        for(int i = 0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        double[] b = {1.1,1.2,1.3,1.4};

        // shallow copy (aliasing)
        double[] c = a;
        double[] d = c;
    }
}
