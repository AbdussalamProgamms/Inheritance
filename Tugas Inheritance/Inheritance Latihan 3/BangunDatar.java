public class BangunDatar{
    double luas;
    double a=0.5;

    void luas(double panjang,double lebar){
        luas = panjang*lebar;
        System.out.println("Luas pertama = "+luas);
    }
    void luas(int panjang, int lebar, int a){
        luas = panjang * lebar * a;
        System.out.println("Luas kedua = "+luas);
    }
}