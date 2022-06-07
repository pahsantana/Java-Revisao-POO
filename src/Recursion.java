public class Recursion {
    // fat(n) = n * n-1 * n-2 * ... * 1 - pilha estourar
    // StackOverFlow
    // fat(n) = 1 se n = 0 // caso base
    // fat(n) = n * fat(n-1) se n>0 // caso recursivo
    public static long factorial(int n){
        if(n<0){
            throw new IllegalArgumentException("n must be positive");
        }
        if(n==0)
            return 1;
        else
            return n * factorial(n-1);
    }

    // f_0 = 0
    // f_1 = 1
    // f_2 = 1
    // f_3 = f_2 + f_1 = 2
    // f_4 = f_3 + f_2 = 3
    // f_n = f_(n-1) + f_(n-2)

    public static long fibonacci(int n){
        if(n<0){
            throw new IllegalArgumentException("n must be positive");
        }
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(10));
        System.out.println(factorial(20));

        System.out.println();

        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(10));
    }
}
