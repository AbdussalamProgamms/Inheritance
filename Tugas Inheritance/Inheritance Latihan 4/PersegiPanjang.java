public class PersegiPanjang extends BangunDatar{
    float panjang,lebar;
    public void luas(){
        float luas=panjang*lebar;
        System.out.println("Luas Persegi Panjang = "+luas);
    }
    public void keliling(){
        float keliling=2*(panjang+lebar);
        System.out.println("Keliling Persegi panjang = "+keliling);
    }
}
