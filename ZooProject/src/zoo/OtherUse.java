package zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class OtherUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("관람 중 식당이나 디저트 마트를 이용하시겠습니까?");
		System.out.println("1.식당 이용 \n2.디저트 마트 이용\n3.모두 이용\n4.이용안함");
		int answer = scan.nextInt();
	}
	public void mart() {
		Scanner scan = new Scanner(System.in);
		int desert=0; //입력받은 디저트
		int desertC=1; //입력받은 디저트 개수
		int i=0;
		ArrayList<Integer> desertAll = new ArrayList<Integer>(); //선택한 디저트
		int[] desertPrice = {1000,500,5000,1500,3000,7000,3000,2000,500,3000,3000,3000,4000,4000,5000,3000,4000,4000,3500,1500}; //디저트 가격
		ArrayList<Integer> desertCount = new ArrayList<Integer>();//디저트 개수
		ArrayList<Integer> priceCheck = new ArrayList<Integer>();//선택한 갯수 별 가격 (가격 *개수)
		
		while(desert == 0) {
			desert = 0;
			System.out.println("---------------디저트---------------");
			System.out.println("1.도넛\t2.마카롱\t3.미니케잌\n4.아이스크림\t5.과일\t6.빙수\n7.와플\t8.빵\n9.젤리/사탕\t10.타르트");
			System.out.println("----------------음료----------------");
			System.out.println("11.아메리카노\t12.에스프레소\t13.바닐라라떼\n14.카푸치노\t15.카라멜마끼아또\t16.녹차\n17.에이드\t18.프라페\n19.스무디\t20.핫초코");
			System.out.println("*하나씩 입력해주세요\n*모두 골랐다면 엔터를 치세요.");
			System.out.println("원하는 음식의 번호를 입력하세요 : ");
			desert = scan.nextInt();
			System.out.println("선택한 음식의 개수를 입력하세요 : ");
			desertC = scan.nextInt();
			
			desertCount.add(desertC);
			desertAll.add(desert);
			priceCheck.add(desertPrice[desert]*desertC);
			
			i++;
		}
	}
}
