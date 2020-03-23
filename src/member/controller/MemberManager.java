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
		System.out.println("��� �� : " + ctn);
	}
	
	public void searchId() {
		System.out.print("�˻��� ���̵� �Է��ϼ��� : ");
		String srch = sc.nextLine();
		int count = 0;
		for(int i = 0; i < ctn; i++) {
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
		for(int i = 0; i < ctn; i++) {
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
		for(int i = 0; i < ctn; i++) {
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
		for(int i = 0; i < ctn; i++) {
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
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String updt = sc.nextLine();
		int count = 0;
		for(int i = 0; i < ctn; i++) {
			if(marr[i].getUserId().equals(updt)) {
				count++;
				System.out.print("������ �̸��� �Է��ϼ��� : ");
				String nName = sc.nextLine();
				marr[i].setUserPwd(nName);
				System.out.println("�̸� ������ �Ϸ�Ǿ����ϴ�.");
				System.out.println();
			} 
		}
		if(count == 0) {
			System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
			System.out.println();
		}
	}
	
	public void updateEmail() {
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String updt = sc.nextLine();
		int count = 0;
		for(int i = 0; i < ctn; i++) {
			if(marr[i].getUserId().equals(updt)) {
				count++;
				System.out.print("������ �̸����� �Է��ϼ��� : ");
				String nEmail = sc.nextLine();
				marr[i].setUserPwd(nEmail);
				System.out.println("�̸��� ������ �Ϸ�Ǿ����ϴ�.");
				System.out.println();
			} 
		}
		if(count == 0) {
			System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
			System.out.println();
		}
	}
	
	public void deleteOne() {
		System.out.print("Ż���� ȸ���� ���̵� �Է��ϼ��� : ");
		String del = sc.nextLine();
		int count = 0;
		for(int i = 0; i < ctn; i++) {
			if(marr[i].getUserId().equals(del)) {
				count++;
				ctn--;
				for(int j = i; j < ctn; j++) {
					marr[j] = marr[j+1];
				}
				System.out.println("ȸ��Ż�� �Ϸ�Ǿ����ϴ�.");
				System.out.println();
			} 
		}
		if(count == 0) {
			System.out.println("������ ȸ�� ������ �������� �ʽ��ϴ�.");
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
		System.out.println("��ü������ �Ϸ� �ƽ��ϴ�.");
		System.out.println();
	}
	
	public void printAllMember() {
		for(int i = 0; i < ctn; i++) {
			System.out.println("���̵� : " + marr[i].getUserId());
			System.out.println("��й�ȣ : " + marr[i].getUserPwd());
			System.out.println("�̸� : " + marr[i].getUserName());
			System.out.println("���� : " + marr[i].getAge());
			System.out.println("���� : " + marr[i].getGender());
			System.out.println("�̸��� : " + marr[i].getEmail());
			System.out.println();
		}
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
