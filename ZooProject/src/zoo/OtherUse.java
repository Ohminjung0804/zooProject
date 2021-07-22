package zoo;

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
		int[] desertAll = new int[100]; //선택한 디저트
		int[] desertPrice = {1000,500,5000,1500,3000,7000,3000,2000,500,3000,3000,3000,4000,4000,5000,3000,4000,4000,3500,1500}; //디저트 가격
		int[] drinkPrice = {};
		int[] desertCount = new int[100];//디저트 개수
		int[] priceCheck = new int[100];//선택한 갯수 별 가격 (가격 *개수)
		
		
	}
}
