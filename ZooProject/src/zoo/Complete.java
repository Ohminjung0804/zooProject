
package zoo;
import java.util.ArrayList;
import java.util.Scanner;
public class Complete {
	public static class price {
	   Scanner sc = new Scanner(System.in);
	   public int Person(int a, int b, int c, int d) {
	       return a+b+c+d;
	   }
	   
	   public int Calculate(int a, int b, int c, int d) {
	      int Ca = (int)((4500*a)+(6000*b)+(4500*c)+(4500*d));
	        return Ca;
	   }
	   
	   public static double getPlusBuy(int price, int elder, int soldier, int disabled, int nationalmerit) {
	         double total = 0;                                           //�� ���ΰ���
	         if (elder > 0) {
	            total += elder*(price - (price*0.1));
	         }
	         if (soldier > 0) {
	            total += soldier*(price - (price * 0.15));
	         }
	         if (disabled > 0) {
	            total += disabled*(price - (price * 0.2));
	         }
	         if (nationalmerit > 0) {
	            total += nationalmerit*(price - (price * 0.25));
	         }
	         return total;
	   }
	   
	   public static class Other{
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
	            }
	            else if(rest == 0) {
	               return;
	            }
	            restNamelist.add(restName[rest-1]);
	         }
	     }
	      
	     public void total() {
	 		int sum = 0;
	 		if(!restNamelist.isEmpty()) {
	 			System.out.println("--------------------------------------------");
	 			System.out.print("����� �Ĵ� : ");
	 			for(int i = 0; i < restNamelist.size(); i++) {
	 				System.out.print(restNamelist.get(i) + " ");
	 			}
	 			System.out.println("");
	 		}
	 		if(!desertNamelist.isEmpty()) {
	 			System.out.println("========����Ʈ ========");
	 			for(int i =0; i < desertNamelist.size(); i++) {
	 				System.out.println(desertNamelist.get(i) + "  " +desertCount.get(i) + "��   = " + priceCheck.get(i));
	 			}
	 			System.out.print("�� �ݾ� : ");
	 			for(int i= 0; i < priceCheck.size(); i++) {
	 				sum += priceCheck.get(i);
	 			}
	 			System.out.println(sum+ "��");
	 		}
	 	}	
	}


	         public static void main(String[] args) {
	       // TODO Auto-generated method stub
	      
	   
	      Scanner sc = new Scanner(System.in);
	       System.out.println("�ȳ��ϼ���! ȯ���մϴ�!\n----------����ǥ----------\n ���: 4500��\n ����: 6000��\n �����: 4500��\n ����������: 4500��\n *���� ������ ������� ������ ����*");
	       System.out.println("--------------------");
	       System.out.println("�ο� üũ �ϰڽ��ϴ�.");
	       System.out.println("��̴� ����̼���?");
	       int a = sc.nextInt();
	       System.out.println("������ ����̼���?");
	       int b = sc.nextInt();
	       System.out.println("������� ����̼���?");
	       int c = sc.nextInt();
	       System.out.println("���������ڴ� ����̼���?");
	       int d = sc.nextInt();
	       
	       price myPrice = new price();
	       int chong = myPrice.Person(a,b,c,d);
	       System.out.println("�� "+chong+"�� �̰�");
	       
	       System.out.println("���"+a+"�� ����"+(a*4500)+("��"));
	       System.out.println("�"+b+"�� ����"+(b*6000)+("��"));
	       System.out.println("�����"+c+"�� ����"+(c*4500)+("��"));
	       System.out.println("����������"+d+"�� ����"+(d*4500)+("��"));
	       
	       int Cal = myPrice.Calculate(a,b,c,d);
	       System.out.println("��"+Cal+"�� �Դϴ�");
	       
	       while(true) {
	       System.out.print("���� ����:");
	       int money= sc.nextInt();
	       
	       int change = (money-Cal);
	  
	       if(Cal<money) {
	          System.out.println(money+"�� �޾Ұ�, �Ž�����" +change+ "�� �帮�ڽ��ϴ�. ��ſ� ���� �Ǽ���!"); break;
	       }
	       else if (Cal==money) {
	          System.out.println(money+"�� �޾Ұ�, �Ž������� �����ϴ�. ��ſ� ���� �Ǽ���!"); break;
	       }
	       else {
	          System.out.println("���� �����մϴ�."); 
	       }
	     }
	       
	       int child = 0;
	       int adult = 0;
	       int elder = 0;
	       int soldier = 0;
	       int nationalmerit = 0;
	       int disabled = 0;
	    
	       int price = 500;                                          //�ӽ� Ƽ�ϰ���
	       double ticket;                                              // ���� ���� ���� �ޱ� ���� ����

	       Scanner scan = new Scanner(System.in);
	       System.out.print("���� ü���� ���Ͻʴϱ�? ��(0), �ƴϿ�(1) : ");
	       int ask = scan.nextInt( );                                     //���Pü�迡 ���� ��� ����
	       
	       if (ask == 0) {
	          System.out.println("�߰� ü�谪�� �����ؾ��մϴ�. (��ᰪ, ü�躹, ü����� ����)");
	       
	          System.out.print("��̴� �� ���Դϱ�? : ");
	          child = scan.nextInt();
	          
	          System.out.print("��� �� ���Դϱ�? : ");
	          adult = scan.nextInt();
	          
	          System.out.println("��̿� ��� Ƽ�ϰ��� " + ((child*price) + (adult*price)) + " ���Դϴ�.");
	          
	          System.out.print("Ȥ�� ����̳� �����, ����, ���������ڿ� �����ϼ̽��ϱ�? <Ư����������> ��(0), �ƴϿ�(1) : ");
	          
	          int ask2 = scan.nextInt();                                     //��ȸ�� ��ġ�� ���� ��� ����
	       
	          if (ask2 == 0) {
	       
	          System.out.print("����� �� ���Դϱ�? : ");
	          elder = scan.nextInt();
	    
	          System.out.print("������ �� ���Դϱ�? : ");
	          soldier = scan.nextInt();
	          
	          System.out.print("������� �� ���Դϱ�? : ");
	          disabled = scan.nextInt();
	          
	          System.out.print("���������ڴ� �� ���Դϱ�? : ");
	          nationalmerit = scan.nextInt();
	          
	          ticket = getPlusBuy(price, elder, soldier, disabled, nationalmerit); // �÷������̿� ���ϸ� Ƽ�Ͽ� ������!
	          System.out.print("Ư������ ���밡���� " + ticket + "���Դϴ�.");
	          }
	         }   
	          else {
	             System.out.println("��ſ� �����Ǽ���.");
	          }
	       
	       
	          Other other = new Other();
	          System.out.println("���� �� �Ĵ��̳� ����Ʈ ��Ʈ�� �̿��Ͻðڽ��ϱ�?");
	          System.out.print("1.�Ĵ� �̿� \n2.����Ʈ ��Ʈ �̿�\n3.��� �̿�\n4.�̿����");
	          int answer = scan.nextInt();
	          
	          if(answer == 1) {
	        	  other.rest();
	          }
	          else if(answer == 2) {
	        	  other.mart();
	          }
	          else if(answer == 3) {
	        	  other.rest();
	        	  other.mart();
	          }
	          else if(answer == 4) {
	        	  System.out.println("���α׷��� �����մϴ�.");
	        	  System.exit(0);
	          }
	          else {
	        	  System.out.println("�ٽ� �Է��ϼ���.\n\n\n\n");
	        	  main(args);
	          }
	          other.total();
	          System.out.println("�̿����ּż� �����մϴ�! ������ �� ������!");
	      }  
	}

	       
}
