package zoo;

import java.util.ArrayList;
import java.util.Scanner;
class Other{
	ArrayList<Integer> desertAll = new ArrayList<Integer>(); //선택한 디저트
	int[] desertPrice = {1000,500,5000,1500,3000,7000,3000,2000,500,3000,3000,3000,4000,4000,5000,3000,4000,4000,3500,1500}; //디저트 가격
	String[] desertName = {"도넛","마카롱","미니케잌","아이스크림","과일","빙수","와플","빵","젤리/사탕","타르트","아메리카노","에스프레소","바닐라라떼","카푸치노","카라멜마끼야또","녹차","에이드","프라페","스무디","핫초코"};
	ArrayList<String> desertNamelist = new ArrayList<String>();
	ArrayList<Integer> desertCount = new ArrayList<Integer>();//디저트 개수
	ArrayList<Integer> priceCheck = new ArrayList<Integer>();//선택한 갯수 별 가격 (가격 *개수)
	
	String[] restName = {"롯데리아","빅버거","원할머니보쌈","홍콩반점","두끼떡볶이","니뽕내뽕"}; //식당이름
	ArrayList<String> restNamelist = new ArrayList<String>(); //입력받은 식당이름
	
	public void mart() {
		Scanner scan = new Scanner(System.in);
		int desert=1; //입력받은 디저트
		int desertC=1; //입력받은 디저트 개수
		
		while(desert != 0) {
			
			System.out.println("----------------------------디저트----------------------------");
			System.out.println("1.도넛(1000)\t2.마카롱(500)\t3.미니케잌(5000)\n4.아이스크림(1500)\t5.과일(3000)\t6.빙수(7000)\n7.와플(3000)\t8.빵(2000)\n9.젤리/사탕(500)\t10.타르트(3000)");
			System.out.println("----------------------------음료----------------------------");
			System.out.println("11.아메리카노(3000)\t 12.에스프레소(3000)\t 13.바닐라라떼(4000)\n14.카푸치노(4000)\t15.카라멜마끼아또(5000)\t16.녹차(3000)\n17.에이드(4000)\t18.프라페(4000)\n19.스무디(3500)\t20.핫초코(1500)");
			System.out.println("\n*하나씩 입력해주세요\n*모두 골랐다면 0을 치세요.");
			System.out.print("원하는 음식의 번호를 입력하세요 : ");
			desert = scan.nextInt();
			
			if(desert > 20 || desert < 0) {
				System.out.println("올바르게 입력하세요.");
				mart();
			}else if(desert != 0) {
				System.out.print("선택한 음식의 개수를 입력하세요 : ");
				desertC = scan.nextInt();
			}else {
				return;
			}
			
			
			desertNamelist.add(desertName[desert-1]); //디저트 이름 추가
			desertCount.add(desertC); //디저트 갯수 추가
			desertAll.add(desert); // 디저트 번호
			priceCheck.add(desertPrice[desert-1]*desertC); //가격계산
			
		}
	}
	
	public void rest() {
		Scanner scan = new Scanner(System.in);
		int rest =1;
		while(rest != 0) {
			
			System.out.println("------------------식당------------------");
			System.out.println("1.롯데리아  2.빅버거  3.원할머니보쌈  \n4.홍콩반점  5.두끼떡볶이  6.니뽕내뽕\n");
			System.out.println("*식당 메뉴 별 가격이 다르므로 가격측정이 불가능 합니다.");
			System.out.println("*하나씩 입력해주세요\n*모두 골랐다면 0을 치세요.");
			System.out.print("원하는 식당의 번호를 입력하세요 : ");
			rest = scan.nextInt();
			
			if(rest > 7 || rest < 0) {
				System.out.println("올바르게 입력하세요.\n\n\n\n");
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
			System.out.print("사용할 식당 : ");
			for(int i = 0; i < restNamelist.size(); i++) {
				System.out.print(restNamelist.get(i) + " ");
			}
		}
		if(desertNamelist.size() >= 0) {
			System.out.print(" ========디저트 ========");
			for(int i =0; i < desertNamelist.size(); i++) {
				System.out.print(desertNamelist.get(i) + "  " +desertCount.get(i) + " = " + priceCheck.get(i));
			}
			System.out.print("총 금액 : ");
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
		System.out.println("관람 중 식당이나 디저트 마트를 이용하시겠습니까?");
		System.out.print("1.식당 이용 \n2.디저트 마트 이용\n3.모두 이용\n4.이용안함");
		int answer = scan.nextInt();
		if(answer == 1) {
			other.rest();
		}else if(answer == 2) {
			other.mart();
		}else if(answer == 3) {
			other.rest();
			other.mart();
		}else if(answer == 4) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}else {
			System.out.println("다시 입력하세요.\n\n\n\n");
			main(args);
		}
		other.total();
		
	}
	
	
}
