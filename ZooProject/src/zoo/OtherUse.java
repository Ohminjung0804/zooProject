package zoo;

import java.util.ArrayList;
import java.util.Scanner;
class Other{
	ArrayList<Integer> desertAll = new ArrayList<Integer>(); //선택한 디저트
	int[] desertPrice = {1000,500,5000,1500,3000,7000,3000,2000,500,3000,3000,3000,4000,4000,5000,3000,4000,4000,3500,1500}; //디저트 가격
	ArrayList<Integer> desertCount = new ArrayList<Integer>();//디저트 개수
	ArrayList<Integer> priceCheck = new ArrayList<Integer>();//선택한 갯수 별 가격 (가격 *개수)
	
	public void mart() {
		Scanner scan = new Scanner(System.in);
		int desert=1; //입력받은 디저트
		int desertC=1; //입력받은 디저트 개수
		int i=0;
		
		while(desert != 0) {
			
			System.out.println("----------------------------디저트----------------------------");
			System.out.println("1.도넛(1000)\t2.마카롱(500)\t3.미니케잌(5000)\n4.아이스크림(1500)\t5.과일(3000)\t6.빙수(7000)\n7.와플(3000)\t8.빵(2000)\n9.젤리/사탕(500)\t10.타르트(3000)");
			System.out.println("----------------------------음료----------------------------");
			System.out.println("11.아메리카노(3000)\t 12.에스프레소(3000)\t 13.바닐라라떼(4000)\n14.카푸치노(4000)\t15.카라멜마끼아또(5000)\t16.녹차(3000)\n17.에이드(4000)\t18.프라페(4000)\n19.스무디(3500)\t20.핫초코(1500)");
			System.out.println("\n*하나씩 입력해주세요\n*모두 골랐다면 0을 치세요.");
			System.out.print("원하는 음식의 번호를 입력하세요 : ");
			desert = scan.nextInt();
			
			if(desert != 0) {
				System.out.print("선택한 음식의 개수를 입력하세요 : ");
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
		System.out.println("관람 중 식당이나 디저트 마트를 이용하시겠습니까?");
		System.out.print("1.식당 이용 \n2.디저트 마트 이용\n3.모두 이용\n4.이용안함");
		int answer = scan.nextInt();
		
		if(answer == 2) {
			other.mart();
		}
		System.out.println(other.priceCheck);
	}
	
	
}
