public class Soal2 {
    private int n;

    public Soal2(int n){
        this.n = n;
    }

    public static void tampilkanFibonacci(int n) {
        int a = 1, b = 1; // Suku pertama dan kedua
        System.out.print("Hasil yang ditampilkan: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
    public int getN() {
        return n;
    }

    public static void main(String[] args) {
        tampilkanFibonacci(5);
    }
}
