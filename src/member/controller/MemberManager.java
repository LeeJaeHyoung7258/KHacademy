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
			System.out.print("���̵� �Է� : ");
			String id = sc.nextLine();
			System.out.print("��й�ȣ �Է� : ");
			String pwd = sc.nextLine();
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("���� : ");
			int age = sc.nextInt();
			System.out.print("���� : ");
			char gender = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("�̸��� : ");
			String email = sc.nextLine();
			System.out.println();
			
			marr[i] = new Member(id, pwd, name, age, gender, email);
			++ctn;
		}
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���� �޴��� ���ư��ϴ�.");
		System.out.println();
	}
	
	public void searchId() {
		System.out.print("�˻��� ���̵� �Է��ϼ��� : ");
		String srch = sc.nextLine();
		int count = 0;
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getUserId().equals(srch)) {
				count++;
				printOne(marr[i]); break; 
			} 
		}
		if(count == 0) {
			System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
			System.out.println();
		}
	}
	
	public void searchName() {
		System.out.print("�˻��� �̸��� �Է��ϼ��� : ");
		String srch = sc.nextLine();
		int count = 0;
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getUserName().equals(srch)) {
				count++;
				printOne(marr[i]); break; 
			} 
		}
		if(count == 0) {
			System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
			System.out.println();
		}
		
	}
	
	public void searchEmail() {
		System.out.print("�˻��� �̸��ϸ� �Է��ϼ��� : ");
		String srch = sc.nextLine();
		int count = 0;
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getEmail().equals(srch)) {
				count++;
				printOne(marr[i]); break; 
			} 
		}
		if(count == 0) {
			System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
			System.out.println();
		}
	}
	
	public void updatePwd() {
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String updt = sc.nextLine();
		int count = 0;
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getUserId().equals(updt)) {
				count++;
				System.out.print("������ ��й�ȣ�� �Է��ϼ��� : ");
				String nPwd = sc.nextLine();
				marr[i].setUserPwd(nPwd);
				System.out.println("��й�ȣ ������ �Ϸ�Ǿ����ϴ�.");
				System.out.println();
			} 
		}
		if(count == 0) {
			System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
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
		System.out.println("���̵� : " + m.getUserId());
		System.out.println("��й�ȣ : " + m.getUserPwd());
		System.out.println("�̸� : " + m.getUserName());
		System.out.println("���� : " + m.getAge());
		System.out.println("���� : " + m.getGender());
		System.out.println("�̸��� : " + m.getEmail());
		
	}

}
