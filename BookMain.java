package Exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookData book1 = new BookData("�ڹ�", 10000, "����");
		BookData book2 = new BookData("DataBase", 20000, "����");
		BookData book3 = new BookData("Web", 30000, "��ȯ");

		// ���������� private���� ������� ������ ���� �߻�
		// book1.title = "¥�İ�Ƽ";

		BookData[] bookList = new BookData[3];
		
		ArrayList<BookData> array = new ArrayList<BookData>();
		array.add(book1);
		array.get(0).getTitle();
		
		
		// book1, book2, book3 �ݺ������� �ֱ�
		for (int i = 0; i < bookList.length; i++) {
			System.out.print("å ������ �Է����ּ��� >> ");
			String title = sc.next();
			System.out.print("������ �Է����ּ��� >> ");
			int price = sc.nextInt();
			System.out.print("���ڸ� �Է����ּ��� >> ");
			String writer = sc.next();

			BookData book = new BookData(title, price, writer);
			bookList[i] = book;
		}
//		bookList[0] = book1;
//		bookList[1] = book2;
//		bookList[2] = book3;

		// bookList ����ؼ� å �̸��� ���� ������ּ���!
		// bookList[i] = book(i+1)�� �ּҰ�
		for (int i = 0; i < bookList.length; i++) {
			System.out.println(bookList[i].getTitle());
			System.out.println(bookList[i].getPrice());
			System.out.println(bookList[i].getWriter());
			System.out.println();
		}
		// private�� ������ ������ ���� �ϴ� ���!!
		// System.out.println("å ���� : " + book1.getTitle());

		

		// �Է¹��� �ݾ����� �� �� �ִ� å ��� ���
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int inputMoney = sc.nextInt();
		System.out.println("< ���Ű����� å ��� >");
		int cnt = 0;
		for (int i = 0; i < bookList.length; i++) {
			if (inputMoney >= bookList[i].getPrice()) {
				System.out.print((i + 1) + ". " + bookList[i].getTitle() + " , ");
				System.out.print(bookList[i].getPrice() + "�� , ");
				System.out.println(bookList[i].getWriter());
				cnt++;
			}
			if (i == bookList.length - 1 && cnt == 0) {
				System.out.println("���԰����� å�� �����ϴ�.");
			}
		}

	}


}
