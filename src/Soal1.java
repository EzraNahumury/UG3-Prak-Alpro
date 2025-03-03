
public class Soal1 {
    private int bilanganganjil;
    
    public Soal1(int bilanganganjil) {
        this.bilanganganjil = bilanganganjil;
    }

    public int[] jawaban() {
        int[] hasil = new int[getBilanganganjil()];
        int count = 0;
        for (int i = 1; i <= 100; i+=2) {
            if (i % 5 != 0) {
                hasil[count++] = i;
                if(count == getBilanganganjil()){
                    break;
                }
            }
        }
        return hasil;
    }
    
    public int getBilanganganjil() {
        return bilanganganjil;
    }

    public void setBilanganganjil(int bilanganganjil) {
        this.bilanganganjil = bilanganganjil;
    }

    public static void main(String[] args) {
        Soal1 soal1 = new Soal1(10);
        int[] hasil = soal1.jawaban();
        for(int bilanganganjil : hasil){
            System.out.println(bilanganganjil);
        }
    }
    
}