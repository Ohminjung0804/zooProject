package zoo;

import java.util.ArrayList;
import java.util.Scanner;
class Other{
	ArrayList<Integer> desertAll = new ArrayList<Integer>(); //������ ����Ʈ
	int[] desertPrice = {1000,500,5000,1500,3000,7000,3000,2000,500,3000,3000,3000,4000,4000,5000,3000,4000,4000,3500,1500}; //����Ʈ ����
	ArrayList<Integer> desertCount = new ArrayList<Integer>();//����Ʈ ����
	ArrayList<Integer> priceCheck = new ArrayList<Integer>();//������ ���� �� ���� (���� *����)
	
	public void mart() {
		Scanner scan = new Scanner(System.in);
		int desert=1; //�Է¹��� ����Ʈ
		int desertC=1; //�Է¹��� ����Ʈ ����
		int i=0;
		
		while(desert != 0) {
			
			System.out.println("----------------------------����Ʈ----------------------------");
			System.out.println("1.����(1000)\t2.��ī��(500)\t3.�̴��ɟ�(5000)\n4.���̽�ũ��(1500)\t5.����(3000)\t6.����(7000)\n7.����(3000)\t8.��(2000)\n9.����/����(500)\t10.Ÿ��Ʈ(3000)");
			System.out.println("----------------------------����----------------------------");
			System.out.println("11.�Ƹ޸�ī��(3000)\t 12.����������(3000)\t 13.�ٴҶ��(4000)\n14.īǪġ��(4000)\t15.ī��Ḷ���ƶ�(5000)\t16.����(3000)\n17.���̵�(4000)\t18.������(4000)\n19.������(3500)\t20.������(1500)");
			System.out.println("\n*�ϳ��� �Է����ּ���\n*��� ����ٸ� 0�� ġ����.");
			System.out.print("���ϴ� ������ ��ȣ�� �Է��ϼ��� : ");
			desert = scan.nextInt();
			
			if(desert != 0) {
				System.out.print("������ ������ ������ �Է��ϼ��� : ");
				desertC = scan.nextInt();
			}else {
				return;
			}
			
			desertCount.add(desertC);
			desertAll.add(desert);
			priceCheck.add(desertPrice[desert-1]*desertC);
			
			i++;
		}
	}
	
	public void rest() {
		
	}
}
public class OtherUse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Other other = new Other();
		System.out.println("���� �� �Ĵ��̳� ����Ʈ ��Ʈ�� �̿��Ͻðڽ��ϱ�?");
		System.out.print("1.�Ĵ� �̿� \n2.����Ʈ ��Ʈ �̿�\n3.��� �̿�\n4.�̿����");
		int answer = scan.nextInt();
		
		if(answer == 2) {
			other.mart();
		}
		System.out.println(other.priceCheck);
	}
	
	
}
