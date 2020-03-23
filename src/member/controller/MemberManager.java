package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {
	
	private static Member[] marr = new Member[2];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {}
	
	public void insertMember() {
		
		for(int i = 0; i < marr.length; i++) {
			System.out.print("아이디 입력 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 입력 : ");
			String pwd = sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("성별 : ");
			char gender = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("이메일 : ");
			String email = sc.nextLine();
			System.out.println();
			
			marr[i] = new Member(id, pwd, name, age, gender, email);
			++ctn;
		}
		System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다.");
		System.out.println(ctn);
		
	}
	
	public void searchId() {
		System.out.print("검색할 아이디를 입력하세요 : ");
		String srch = sc.nextLine();
		for(int i = 0; i < marr.length; i++) {
//			marr[i].getUserId()
		}
	}
	
	public void searchName() {
		
	}
	
	public void searchEmail() {
		
	}
	
	public void updatePwd() {
		
	}
	
	public void updateName() {
		
	}
	
	public void updateEmail() {
		
	}
	
	public void deleteOne() {
		
	}
	
	public void deleteAll() {
		
	}
	
	public void printAllMember() {
		
	}
	
	public void printOne(Member m) {
		System.out.println();
		
	}

}
