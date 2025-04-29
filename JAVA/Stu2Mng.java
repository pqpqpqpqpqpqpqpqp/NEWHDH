package JAVA;

import java.util.*;

public class Stu2Mng {
	
	public void printline() {
		System.out.println("======================================================");
	}
	
	private HashMap<String,Stu2VO> stu2 = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	public void RegStu(Scanner sc) {
		printline();
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("국어: ");
		int kors = sc.nextInt();
		System.out.print("영어: ");
		int engs = sc.nextInt();
		System.out.print("수학: ");
		int mats = sc.nextInt();
		
		Stu2VO stu = new Stu2VO().new Stu2Builder()
				.setName(name)
				.setKorS(kors)
				.setEngS(engs)
				.setMatS(mats)
				.build();
		
		stu2.put(name,stu);
		System.out.println("=======================등록완료=======================");
	}

	public void ShowStu() {
		printline();
		if(stu2.size()==0) {
			System.out.println("등록된 정보가 없습니다");
			printline();
			return;
		}
		for(String stuName : stu2.keySet()) {
			stu2.get(stuName).print(stu2.get(stuName));
		}
		System.out.println("=======================조회완료=======================");
	}

	public void SchStu(Scanner sc) {
		printline();
		if(stu2.size()==0) {
			System.out.println("등록된 정보가 없습니다");
			printline();
			return;
		}
		System.out.print("검색할 이름: ");
		String name = sc.next();
		if(!stu2.containsKey(name)) {
			System.out.println("해당 이름이 없습니다");
			return;
		}
		for(String stuName : stu2.keySet()) {
			if(stu2.get(stuName).getName().equals(name)) {
				printline();
				stu2.get(stuName).print(stu2.get(stuName));
				break;
			}
		}
		System.out.println("=========================검색완료=========================");
	}

	public void DelStu(Scanner sc) {
		printline();
		if(stu2.size()==0) {
			System.out.println("등록된 정보가 없습니다");
			printline();
			return;
		}
		System.out.print("삭제할 이름: ");
		String name = sc.next();
		if(!stu2.containsKey(name)) {
			System.out.println("해당 이름이 없습니다");
			return;
		}
		for(String stuName : stu2.keySet()) {
			if(stu2.get(stuName).getName().equals(name)) {
				stu2.remove(stuName);
				break;
			}
		}
		System.out.println("=======================삭제완료=======================");
	}

	public void FixStu(Scanner sc) {
		printline();
		if(stu2.size()==0) {
			System.out.println("등록된 정보가 없습니다");
			printline();
			return;
		}
		System.out.print("수정할 이름: ");
		String name = sc.next();
		if(!stu2.containsKey(name)) {
			System.out.println("해당 이름이 없습니다");
			return;
		}
		for(String stuName : stu2.keySet()) {
			if(stu2.get(stuName).getName().equals(name)) {
				System.out.print("국어: ");
				int kors = sc.nextInt();
				System.out.print("영어: ");
				int engs = sc.nextInt();
				System.out.print("수학: ");
				int mats = sc.nextInt();
				
				stu2.get(stuName).setKorS(kors);
				stu2.get(stuName).setEngS(engs);
				stu2.get(stuName).setMatS(mats);
				break;
			}
		}
		System.out.println("=======================수정완료=======================");
	}
}