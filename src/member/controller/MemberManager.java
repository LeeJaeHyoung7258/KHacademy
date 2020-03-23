package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {
	
	private static Member[] marr = new Member[5];
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
		System.out.println("사람 수 : " + ctn);
	}
	
	public void searchId() {
		System.out.print("검색할 아이디를 입력하세요 : ");
		String srch = sc.nextLine();
		int count = 0;
		for(int i = 0; i < ctn; i++) {
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
		for(int i = 0; i < ctn; i++) {
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
		for(int i = 0; i < ctn; i++) {
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
		for(int i = 0; i < ctn; i++) {
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
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String updt = sc.nextLine();
		int count = 0;
		for(int i = 0; i < ctn; i++) {
			if(marr[i].getUserId().equals(updt)) {
				count++;
				System.out.print("변경할 이름을 입력하세요 : ");
				String nName = sc.nextLine();
				marr[i].setUserPwd(nName);
				System.out.println("이름 수정이 완료되었습니다.");
				System.out.println();
			} 
		}
		if(count == 0) {
			System.out.println("검색한 회원 정보가 존재하지 않습니다.");
			System.out.println();
		}
	}
	
	public void updateEmail() {
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String updt = sc.nextLine();
		int count = 0;
		for(int i = 0; i < ctn; i++) {
			if(marr[i].getUserId().equals(updt)) {
				count++;
				System.out.print("변경할 이메일을 입력하세요 : ");
				String nEmail = sc.nextLine();
				marr[i].setUserPwd(nEmail);
				System.out.println("이메일 수정이 완료되었습니다.");
				System.out.println();
			} 
		}
		if(count == 0) {
			System.out.println("검색한 회원 정보가 존재하지 않습니다.");
			System.out.println();
		}
	}
	
	public void deleteOne() {
		System.out.print("탈퇴할 회원의 아이디를 입력하세요 : ");
		String del = sc.nextLine();
		int count = 0;
		for(int i = 0; i < ctn; i++) {
			if(marr[i].getUserId().equals(del)) {
				count++;
				ctn--;
				for(int j = i; j < ctn; j++) {
					marr[j] = marr[j+1];
				}
				System.out.println("회원탈퇴가 완료되었습니다.");
				System.out.println();
			} 
		}
		if(count == 0) {
			System.out.println("삭제할 회원 정보가 존재하지 않습니다.");
			System.out.println();
		}
	}
	
	public void deleteAll() {
		for(int i = 0; i < ctn; i++) {
			marr[i].setUserId("");
			marr[i].setUserPwd("");
			marr[i].setUserName("");
			marr[i].setAge(0);
			marr[i].setGender(' ');
			marr[i].setEmail("");
		}
		ctn = 0;
		System.out.println("전체삭제가 완료 됐습니다.");
		System.out.println();
	}
	
	public void printAllMember() {
		for(int i = 0; i < ctn; i++) {
			System.out.println("아이디 : " + marr[i].getUserId());
			System.out.println("비밀번호 : " + marr[i].getUserPwd());
			System.out.println("이름 : " + marr[i].getUserName());
			System.out.println("나이 : " + marr[i].getAge());
			System.out.println("성별 : " + marr[i].getGender());
			System.out.println("이메일 : " + marr[i].getEmail());
			System.out.println();
		}
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
