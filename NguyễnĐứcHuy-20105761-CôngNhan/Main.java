package thuongky;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		DanhSachCongNhan  cnhans = new DanhSachCongNhan(3); 
		
		for ( int i = 0; i < 3; i++) 
		{
		cnhans.them(nhap());
		}
		cnhans.xuat();
		
		

	}
	
	public static CongNhan nhap() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap ma cong nhan: " );
	String maCD = sc.nextLine();
	System.out.println("Nhap ho: " );
	String ho = sc.nextLine();
	System.out.println("Nhap ten: " );
	String ten = sc.nextLine();
	System.out.println("Nhap so san pham: " );
	int soSP = sc.nextInt();
	CongNhan cnhan = new CongNhan(maCD, ho, ten, soSP);
	return cnhan;
	
	}

}
