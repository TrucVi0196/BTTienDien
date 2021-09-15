import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String hoTen;
        int soDau, soCuoi;
        double thanhTien;

        // Nhap thong tin khach hang
        Scanner inp = new Scanner(System.in);
        System.out.print("\n Ho ten KH: ");
        hoTen = inp.nextLine();
        do {
            System.out.print("\n So dau: ");
            soDau = inp.nextInt();
            if (soDau < 0)
                System.out.print("\n Nhap lai so dien ");
        } while (soDau < 0);

        do {
            System.out.print("\n So cuoi: ");
            soCuoi = inp.nextInt();
            if (soCuoi < soDau)
                System.out.print("\n Nhap lai so dien ");
        } while (soCuoi < soDau);

        int soDien = soCuoi - soDau;

        // Tinh tien
        if (soDien <= 50)
            thanhTien = (soDien * 1678);
        else if (soDien <= 100 && soDien > 50)
            thanhTien = 50 * 1678 + (soDien - 50) * 1734;
        else if (soDien <= 200 && soDien > 100)
            thanhTien = 50 * 1678 + 100 * 1734 + (soDien - 100) * 2014;
        else if (soDien <= 300 && soDien > 200)
            thanhTien = 50 * 1678 + 100 * 1734 + 100 * 2014 + (soDien - 200) * 2536;
        else if (soDien <= 400 && soDien > 300)
            thanhTien = 50 * 1678 + 100 * 1734 + 100 * 2014 + 100 * 2536 + (soDien - 300) * 2834;
        else
            thanhTien = 50 * 1678 + 100 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (soDien - 400) * 2927;

        System.out.print("\n IN THONG TIN HOA DƠN:\n");
        System.out.println("\n + Ho ten khach hang:  " + hoTen);
        System.out.println("\n + So dien dau: " + soDau);
        System.out.println("\n + So dien cuoi: " + soCuoi);
        System.out.println("\n + Thanh tien: " + thanhTien);
    }
}
