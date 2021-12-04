package Exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookData book1 = new BookData("자바", 10000, "병관");
		BookData book2 = new BookData("DataBase", 20000, "동원");
		BookData book3 = new BookData("Web", 30000, "승환");

		// 접근제한자 private으로 감춰놨기 때문에 오류 발생
		// book1.title = "짜파게티";

		BookData[] bookList = new BookData[3];
		
		ArrayList<BookData> array = new ArrayList<BookData>();
		array.add(book1);
		array.get(0).getTitle();
		
		
		// book1, book2, book3 반복문으로 넣기
		for (int i = 0; i < bookList.length; i++) {
			System.out.print("책 제목을 입력해주세요 >> ");
			String title = sc.next();
			System.out.print("가격을 입력해주세요 >> ");
			int price = sc.nextInt();
			System.out.print("저자를 입력해주세요 >> ");
			String writer = sc.next();

			BookData book = new BookData(title, price, writer);
			bookList[i] = book;
		}
//		bookList[0] = book1;
//		bookList[1] = book2;
//		bookList[2] = book3;

		// bookList 사용해서 책 이름을 전부 출력해주세요!
		// bookList[i] = book(i+1)의 주소값
		for (int i = 0; i < bookList.length; i++) {
			System.out.println(bookList[i].getTitle());
			System.out.println(bookList[i].getPrice());
			System.out.println(bookList[i].getWriter());
			System.out.println();
		}
		// private로 감춰진 정보를 접근 하는 방법!!
		// System.out.println("책 제목 : " + book1.getTitle());

		

		// 입력받은 금액으로 살 수 있는 책 목록 출력
		System.out.print("금액을 입력하세요 : ");
		int inputMoney = sc.nextInt();
		System.out.println("< 구매가능한 책 목록 >");
		int cnt = 0;
		for (int i = 0; i < bookList.length; i++) {
			if (inputMoney >= bookList[i].getPrice()) {
				System.out.print((i + 1) + ". " + bookList[i].getTitle() + " , ");
				System.out.print(bookList[i].getPrice() + "원 , ");
				System.out.println(bookList[i].getWriter());
				cnt++;
			}
			if (i == bookList.length - 1 && cnt == 0) {
				System.out.println("구입가능한 책이 없습니다.");
			}
		}

	}


}
