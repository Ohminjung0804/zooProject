package zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class OtherUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �� �Ĵ��̳� ����Ʈ ��Ʈ�� �̿��Ͻðڽ��ϱ�?");
		System.out.println("1.�Ĵ� �̿� \n2.����Ʈ ��Ʈ �̿�\n3.��� �̿�\n4.�̿����");
		int answer = scan.nextInt();
	}
	public void mart() {
		Scanner scan = new Scanner(System.in);
		int desert=0; //�Է¹��� ����Ʈ
		int desertC=1; //�Է¹��� ����Ʈ ����
		int i=0;
		ArrayList<Integer> desertAll = new ArrayList<Integer>(); //������ ����Ʈ
		int[] desertPrice = {1000,500,5000,1500,3000,7000,3000,2000,500,3000,3000,3000,4000,4000,5000,3000,4000,4000,3500,1500}; //����Ʈ ����
		ArrayList<Integer> desertCount = new ArrayList<Integer>();//����Ʈ ����
		ArrayList<Integer> priceCheck = new ArrayList<Integer>();//������ ���� �� ���� (���� *����)
		
		while(desert == 0) {
			desert = 0;
			System.out.println("---------------����Ʈ---------------");
			System.out.println("1.����\t2.��ī��\t3.�̴��ɟ�\n4.���̽�ũ��\t5.����\t6.����\n7.����\t8.��\n9.����/����\t10.Ÿ��Ʈ");
			System.out.println("----------------����----------------");
			System.out.println("11.�Ƹ޸�ī��\t12.����������\t13.�ٴҶ��\n14.īǪġ��\t15.ī��Ḷ���ƶ�\t16.����\n17.���̵�\t18.������\n19.������\t20.������");
			System.out.println("*�ϳ��� �Է����ּ���\n*��� ����ٸ� ���͸� ġ����.");
			System.out.println("���ϴ� ������ ��ȣ�� �Է��ϼ��� : ");
			desert = scan.nextInt();
			System.out.println("������ ������ ������ �Է��ϼ��� : ");
			desertC = scan.nextInt();
			
			desertCount.add(desertC);
			desertAll.add(desert);
			priceCheck.add(desertPrice[desert]*desertC);
			
			i++;
		}
	}
}
