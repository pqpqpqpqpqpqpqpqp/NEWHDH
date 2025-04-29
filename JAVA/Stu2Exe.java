package JAVA;

import java.util.Scanner;

public class Stu2Exe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stu2Mng mng = new Stu2Mng();
		
		System.out.println("======================================================");
		while(true) {	
			System.out.println("1.등록 | 2.조회 | 3. 검색 | 4. 삭제 | 5.수정 | 0. 종료");
			System.out.print("옵션 선택: ");
			
			String op2 = sc.next();
			
			if(op2.equals("0")) {
				break;
			}
		
			switch(op2) {
			case "1" :
				mng.RegStu(sc);
				break;
			case "2" :
				mng.ShowStu();
				break;
			case "3" :
				mng.SchStu(sc);
				break;
			case "4" :
				mng.DelStu(sc);
				break;
			case "5" :
				mng.FixStu(sc);
				break;			
			}
		}
		
		sc.close();
	}
}