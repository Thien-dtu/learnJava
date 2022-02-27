package demoArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		/**
		 * Khai bao chua co so luong*/
		ArrayList<String> listString = new ArrayList<String>();
		
		/**
		 * Khai bao kem so luong phan tu mong muon*/
		ArrayList<String> listString1 = new ArrayList<String>(20);
		
		/**
		 * Hien thi cac phan tu co trong ArrayList*/
		listString1.add("Thien");
		listString1.add("Duc");
		listString1.add("Nguyen");
		listString1.add("Tran");
		listString1.add("Thien");
		listString1.add("Duc");
		listString1.add("Nguyen");
		listString1.add("Tran");
		listString1.add("Thien");
		listString1.add("Duc");
		listString1.add("Nguyen");
		listString1.add("Tran");
		listString1.add("Thien");
		listString1.add("Duc");
		listString1.add("Nguyen");
		listString1.add("Tran");
		listString1.add("Thien");
		listString1.add("Duc");
		listString1.add("Nguyen");
		listString1.add("Tran");
		System.out.println("Cac phan tu co trong list la: " +listString1);
//		int i = 0;
//		int size = listString1.size();
//		for ( int i =0; i < size; i++) {
//			listString1.remove(i);
//		}
//		
//		int size = listString1.size();
		
		for ( int i = 0; i < listString1.size(); i++) {
			listString1.remove(i);
		}
		
//		for (String str : listString1) {
//			System.out.println("Mang : "+str);
//			System.out.println("Xoa phan tu thu " +i);
//			listString1.remove(i++);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
////		System.out.println("Phan tu dau tien trong list la: " +listString1.indexOf(10));
////		System.out.println("Phan tu dau tien trong list la: " +listString1.lastIndexOf("Nguyen"));
//		System.out.println("Phan tu thu 1 trong mang la: " + listString1.get(0));
//		System.out.println("Phan tu thu 2 trong mang la: " + listString1.get(1));
//		
//		listString1.remove(2);
//		System.out.println("Cac phan tu co trong list la: ");
//		for (int i =1; i < listString1.size(); i++) {
//			System.out.println(listString1.get(i));
//		}
//		
//		listString1.removeAll(listString1);
//		listString1.addAll(listString1);
//		listString1.clear();
//		
////		listString1.add("Tran");
//		for (String str : listString1) {
//			System.out.println("Mang sau khi xoa het gia tri: "+str);
//		}
//		
//		List<Animal> anniList = new ArrayList<Animal>();
//		for (int i = 1; i < 7; i++) {
//			Animal animal = new Animal("myname" +i, i, i );
//			anniList.add(animal);
//		}
//		for (Animal animal : anniList) {
//			System.out.println(animal);
//		}
		
		
		
		
		
	}
}
