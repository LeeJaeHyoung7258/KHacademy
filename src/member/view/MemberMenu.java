package member.view;

import java.util.Scanner;

import member.controller.MemberManager;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MemberManager mm = new MemberManager();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		
		System.out.println("======== ȸ�� ���� �޴� ========");
		System.out.println("1. �ű� ȸ�� ���");
		System.out.println("2. ȸ�� ���� �˻�");
		System.out.println("3. ȸ�� ���� ����");
		System.out.println("4. ȸ�� ���� ����");
		System.out.println("5. ȸ�� ���� ���");
		System.out.println("9. ����");
		System.out.println("===========================");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 : mm.insertMember(); break;
		case 2 : mm.
		}
		
		
	}

}
