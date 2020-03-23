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
		System.out.println();
	}
	
	public void searchId() {
		System.out.print("검색할 아이디를 입력하세요 : ");
		String srch = sc.nextLine();
		int count = 0;
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getUserId().equals(srch)) {
				count++;
				printOne(marr[i]); break; 
			} 
		}
		if(count == 0) {
			System.out.println("검색한 회원 정보가 존재하지 않습니다.");
			System.out.println();
		}
	}
	
	public void searchName() {
		System.out.print("검색할 이름를 입력하세요 : ");
		String srch = sc.nextLine();
		int count = 0;
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getUserName().equals(srch)) {
				count++;
				printOne(marr[i]); break; 
			} 
		}
		if(count == 0) {
			System.out.println("검색한 회원 정보가 존재하지 않습니다.");
			System.out.println();
		}
		
	}
	
	public void searchEmail() {
		System.out.print("검색할 이메일를 입력하세요 : ");
		String srch = sc.nextLine();
		int count = 0;
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getEmail().equals(srch)) {
				count++;
				printOne(marr[i]); break; 
			} 
		}
		if(count == 0) {
			System.out.println("검색한 회원 정보가 존재하지 않습니다.");
			System.out.println();
		}
	}
	
	public void updatePwd() {
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String updt = sc.nextLine();
		int count = 0;
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getUserId().equals(updt)) {
				count++;
				System.out.print("변경할 비밀번호를 입력하세요 : ");
				String nPwd = sc.nextLine();
				marr[i].setUserPwd(nPwd);
				System.out.println("비밀번호 수정이 완료되었습니다.");
				System.out.println();
			} 
		}
		if(count == 0) {
			System.out.println("검색한 회원 정보가 존재하지 않습니다.");
			System.out.println();
		}
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
		System.out.println("아이디 : " + m.getUserId());
		System.out.println("비밀번호 : " + m.getUserPwd());
		System.out.println("이름 : " + m.getUserName());
		System.out.println("나이 : " + m.getAge());
		System.out.println("성별 : " + m.getGender());
		System.out.println("이메일 : " + m.getEmail());
		
	}

}
