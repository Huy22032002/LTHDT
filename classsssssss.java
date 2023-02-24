package huy123;

import java.util.Calendar;
import java.text.NumberFormat;
import java.text.DateFormat;
import java.util.Locale;

public class classsssssss {
  // khai bao bien
	private String maCD;
	private String tuaCD;
	private Calendar ngayPH;
	private double donGia;
	private int soBH;
  // dong goi
	public String getMaCD() {
		return maCD;
	}
	public void setMaCD(String ma) throws Exception {
	  if (ma!="") {	
		this.maCD = ma;
	  }
	  else throw new Exception("Loi ma");
	}
	public String getTuaCD() throws Exception {
		return tuaCD;
	}
	public void setTuaCD(String tua) throws Exception {
	  if (tua!="") {
		this.tuaCD = tua;
	  }
	  else throw new Exception ("loi");
	}
	public Calendar getNgayPH() {
		return ngayPH;
	}
	public void setNgayPH(Calendar ngay) throws Exception {
		if ( ngay!=null) {
		this.ngayPH = ngay;
		} 
		else throw new Exception ("Loi ngay");
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoBH() {
		return soBH;
	}
	public void setSoBH(int soBH) {
		this.soBH = soBH;
	}
	//tao ham de khoi dong tao doi tuong
	
	public classsssssss() {
		Calendar c1 = Calendar.getInstance();
		this.maCD ="0000000";
		this.tuaCD = "xxxxxxx";
		this.ngayPH =c1;
		this.donGia = 10000;
		this.soBH = 0;
	}
	
	
	public classsssssss(String ma, String tua, Calendar ngay, double donGia, int so) throws Exception {
		if (ma!="") {
		   this.maCD = ma;
		} else throw new Exception("Loi ma");
		if (tua!="") {
		   this.tuaCD = tua;
		} else throw new Exception("Loi tua");
		if (ngay!=null) {
		   this.ngayPH = ngay;
		} else throw new Exception("Loi ngay");
		   this.donGia = donGia;
		if ( so > 0) {
		   this.soBH = so;
		} else throw new Exception("Loi so");
	}
//phuong thuc tinh GetTtnahTien()
   public double GetThanhTien() {
	   return getDonGia()*getSoBH();
	   }
   public void tieuDe( ) {
	   System.out.println("Test ket qua");
	   for (int i=0; i <72; i++)
		   System.out.println("Test ket qua");
	   System.out.println();
	   System.out.printf("|%-10s||%-10s||%-14s||%-10s||%-10s||%-12s|\n",
			              "Ma CD","Tua CD","Ngay Phat Hanh","Don Gia","So Bai Hat","Tong Tien" );
	   for ( int i = 0; i < 72; i++)
		   System.out.printf("-");
	   System.out.println();
   }
   Locale lc= new Locale("vi", "VN");
   DateFormat df = DateFormat.getDateInstance(1, lc);
   NumberFormat sf= NumberFormat.getCurrencyInstance(lc);
   @Override
   public String toString() {
	   String s="";
	   s+=s.format("|%-10s||%-10s||%-14s||%-10s||%-10s||%-12s|", getMaCD(), getTuaCD(),
			       df.format(getNgayPH().getTime()),sf.format(getDonGia()),
			       getSoBH(), sf.format(GetThanhTien()));
   }
	
	  

	
	

