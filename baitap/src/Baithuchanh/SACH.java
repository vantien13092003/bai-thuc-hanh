package Baithuchanh;

import java.util.Scanner;

public class SACH {
	private String maSach;
    private String tenSach;
    private String tenTacGia;
    private int soTrang;
    private String loaiSach;
    private String nhaXuatBan;
    private int soTap;
    private double gia;
   
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			// Nhap thong tin cho mot cuon sach va in ra thon tin do
			SACH sach1 = new SACH();
			System.out.println("Nhap thong tin cho cuon sach:");
			sach1.NHAPSACH();
			System.out.println("Thong tin cuon sach vua nhap:");
			sach1.INSACH();
			
			// Nhap danh sach cac dau sach cua thu vien va in danh sach do 
			System.out.print("Nhap so luong dau sach: ");
			int n = sc.nextInt();
			sc.nextLine();
			
			SACH[] sachList = new SACH[n];
			for (int i = 0; i < n; i++) {
			    System.out.println("Nhap thong tin cho dau sach thu " + (i+1) + ":");
			    SACH sach = new SACH();
			    sach.NHAPSACH();
			    sachList[i] = sach;
			}
		}
    }
    public void NHAPSACH() {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Nhap ma sach: ");
			maSach = sc.nextLine();
			System.out.print("NHap ten sach: ");
			tenSach = sc.nextLine();
			System.out.print("Nhap ten tac gia: ");
			tenTacGia = sc.nextLine();
			System.out.print("Nhap so trang: ");
			soTrang = sc.nextInt();
			sc.nextLine();
			System.out.print("Nhap loai sach: ");
			loaiSach = sc.nextLine();
			System.out.print("Nhap nha xuat ban: ");
			nhaXuatBan = sc.nextLine();
			System.out.print("Nhap so tap: ");
			soTap = sc.nextInt();
			System.out.print("Nhap gia: ");
			gia = sc.nextDouble();
		}
    }
    
    public void INSACH() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Ten tac gia: " + tenTacGia);
        System.out.println("So trang: " + soTrang);
        System.out.println("Loai sach: " + loaiSach);
        System.out.println("Nha xuat ban: " + nhaXuatBan);
        System.out.println("So tap: " + soTap);
        System.out.println("Gia: " + gia);
    }

}