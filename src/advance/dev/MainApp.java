package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student arr[] = new Student[10];
		for (int i = 0; i < arr.length; i++) {
		arr[i] = new Student();
		System.out.println("Nhap vao nguoi thu:" + (i+1));
		
		System.out.println("Nhap ten");
		arr[i].Name = sc.nextLine();
		
		System.out.println("Nhap tuoi");
		arr[i].old = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Nhap dia chi");
		arr[i].address = sc.nextLine();
	
		System.out.println("Nhap so dien thoai");
		arr[i].phone = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Nhap diem trung binh");
		arr[i].dTB = sc.nextFloat();
		sc.nextLine();
		}	
		for (int i = 0; i < arr.length; i++) {
			Student s = arr [i];
			System.out.format("Ten: %s - Tuoi: %d - Dia chi: %s - So dien thoai: %d - Diem trung binh: %.1f", s.Name, s.old, s.address, s.phone, s.dTB).println(); 
		}
	}
}