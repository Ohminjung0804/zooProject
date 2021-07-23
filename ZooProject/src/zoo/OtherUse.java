package zoo;

import java.util.ArrayList;
import java.util.Scanner;
class Other{
	ArrayList<Integer> desertAll = new ArrayList<Integer>(); //������ ����Ʈ
	int[] desertPrice = {1000,500,5000,1500,3000,7000,3000,2000,500,3000,3000,3000,4000,4000,5000,3000,4000,4000,3500,1500}; //����Ʈ ����
	String[] desertName = {"����","��ī��","�̴��ɟ�","���̽�ũ��","����","����","����","��","����/����","Ÿ��Ʈ","�Ƹ޸�ī��","����������","�ٴҶ��","īǪġ��","ī��Ḷ���߶�","����","���̵�","������","������","������"};
	ArrayList<String> desertNamelist = new ArrayList<String>();
	ArrayList<Integer> desertCount = new ArrayList<Integer>();//����Ʈ ����
	ArrayList<Integer> priceCheck = new ArrayList<Integer>();//������ ���� �� ���� (���� *����)
	
	String[] restName = {"�Ե�����","�����","���ҸӴϺ���","ȫ�����","�γ�������","�ϻͳ���"}; //�Ĵ��̸�
	ArrayList<String> restNamelist = new ArrayList<String>(); //�Է¹��� �Ĵ��̸�
	
	public void mart() {
		Scanner scan = new Scanner(System.in);
		int desert=1; //�Է¹��� ����Ʈ
		int desertC=1; //�Է¹��� ����Ʈ ����
		
		while(desert != 0) {
			
			System.out.println("----------------------------����Ʈ----------------------------");
			System.out.println("1.����(1000)\t2.��ī��(500)\t3.�̴��ɟ�(5000)\n4.���̽�ũ��(1500)\t5.����(3000)\t6.����(7000)\n7.����(3000)\t8.��(2000)\n9.����/����(500)\t10.Ÿ��Ʈ(3000)");
			System.out.println("----------------------------����----------------------------");
			System.out.println("11.�Ƹ޸�ī��(3000)\t 12.����������(3000)\t 13.�ٴҶ��(4000)\n14.īǪġ��(4000)\t15.ī��Ḷ���ƶ�(5000)\t16.����(3000)\n17.���̵�(4000)\t18.������(4000)\n19.������(3500)\t20.������(1500)");
			System.out.println("\n*�ϳ��� �Է����ּ���\n*��� ����ٸ� 0�� ġ����.");
			System.out.print("���ϴ� ������ ��ȣ�� �Է��ϼ��� : ");
			desert = scan.nextInt();
			
			if(desert > 20 || desert < 0) {
				System.out.println("�ùٸ��� �Է��ϼ���.");
				mart();
			}else if(desert != 0) {
				System.out.print("������ ������ ������ �Է��ϼ��� : ");
				desertC = scan.nextInt();
			}else {
				return;
			}
			
			
			desertNamelist.add(desertName[desert-1]); //����Ʈ �̸� �߰�
			desertCount.add(desertC); //����Ʈ ���� �߰�
			desertAll.add(desert); // ����Ʈ ��ȣ
			priceCheck.add(desertPrice[desert-1]*desertC); //���ݰ��
			
		}
	}
	
	public void rest() {
		Scanner scan = new Scanner(System.in);
		int rest =1;
		while(rest != 0) {
			
			System.out.println("------------------�Ĵ�------------------");
			System.out.println("1.�Ե�����  2.�����  3.���ҸӴϺ���  \n4.ȫ�����  5.�γ�������  6.�ϻͳ���\n");
			System.out.println("*�Ĵ� �޴� �� ������ �ٸ��Ƿ� ���������� �Ұ��� �մϴ�.");
			System.out.println("*�ϳ��� �Է����ּ���\n*��� ����ٸ� 0�� ġ����.");
			System.out.print("���ϴ� �Ĵ��� ��ȣ�� �Է��ϼ��� : ");
			rest = scan.nextInt();
			
			if(rest > 7 || rest < 0) {
				System.out.println("�ùٸ��� �Է��ϼ���.\n\n\n\n");
				rest();
			}else if(rest == 0) {
				return;
			}
			restNamelist.add(restName[rest-1]);
		}
	}
	public void total() {
		int sum = 0;
		if(restNamelist.size() >= 0 ) {
			System.out.println("--------------------------------------------");
			System.out.print("����� �Ĵ� : ");
			for(int i = 0; i < restNamelist.size(); i++) {
				System.out.print(restNamelist.get(i) + " ");
			}
		}
		if(desertNamelist.size() >= 0) {
			System.out.print(" ========����Ʈ ========");
			for(int i =0; i < desertNamelist.size(); i++) {
				System.out.print(desertNamelist.get(i) + "  " +desertCount.get(i) + " = " + priceCheck.get(i));
			}
			System.out.print("�� �ݾ� : ");
			for(int i= 0; i < priceCheck.get(i); i++) {
				sum += priceCheck.get(i);
			}
			System.out.println(sum);
		}
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
		if(answer == 1) {
			other.rest();
		}else if(answer == 2) {
			other.mart();
		}else if(answer == 3) {
			other.rest();
			other.mart();
		}else if(answer == 4) {
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
		}else {
			System.out.println("�ٽ� �Է��ϼ���.\n\n\n\n");
			main(args);
		}
		other.total();
		
	}
	
	
}
