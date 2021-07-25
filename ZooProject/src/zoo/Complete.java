
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
	         double total = 0;                                           //총 할인가격
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
	 			System.out.print("사용할 식당 : ");
	 			for(int i = 0; i < restNamelist.size(); i++) {
	 				System.out.print(restNamelist.get(i) + " ");
	 			}
	 			System.out.println("");
	 		}
	 		if(!desertNamelist.isEmpty()) {
	 			System.out.println("========디저트 ========");
	 			for(int i =0; i < desertNamelist.size(); i++) {
	 				System.out.println(desertNamelist.get(i) + "  " +desertCount.get(i) + "개   = " + priceCheck.get(i));
	 			}
	 			System.out.print("총 금액 : ");
	 			for(int i= 0; i < priceCheck.size(); i++) {
	 				sum += priceCheck.get(i);
	 			}
	 			System.out.println(sum+ "원");
	 		}
	 	}	
	}


	         public static void main(String[] args) {
	       // TODO Auto-generated method stub
	      
	   
	      Scanner sc = new Scanner(System.in);
	       System.out.println("안녕하세요! 환영합니다!\n----------가격표----------\n 어린이: 4500원\n 성인: 6000원\n 장애인: 4500원\n 국가유공자: 4500원\n *입장 과정은 교통수단 과정과 같음*");
	       System.out.println("--------------------");
	       System.out.println("인원 체크 하겠습니다.");
	       System.out.println("어린이는 몇명이세요?");
	       int a = sc.nextInt();
	       System.out.println("성인은 몇명이세요?");
	       int b = sc.nextInt();
	       System.out.println("장애인은 몇명이세요?");
	       int c = sc.nextInt();
	       System.out.println("국가유공자는 몇명이세요?");
	       int d = sc.nextInt();
	       
	       price myPrice = new price();
	       int chong = myPrice.Person(a,b,c,d);
	       System.out.println("총 "+chong+"명 이고");
	       
	       System.out.println("어린이"+a+"명 가격"+(a*4500)+("원"));
	       System.out.println("어른"+b+"명 가격"+(b*6000)+("원"));
	       System.out.println("장애인"+c+"명 가격"+(c*4500)+("원"));
	       System.out.println("국가유공자"+d+"명 가격"+(d*4500)+("원"));
	       
	       int Cal = myPrice.Calculate(a,b,c,d);
	       System.out.println("총"+Cal+"원 입니다");
	       
	       while(true) {
	       System.out.print("가격 지불:");
	       int money= sc.nextInt();
	       
	       int change = (money-Cal);
	  
	       if(Cal<money) {
	          System.out.println(money+"원 받았고, 거스름돈" +change+ "원 드리겠습니다. 즐거운 관람 되세요!"); break;
	       }
	       else if (Cal==money) {
	          System.out.println(money+"원 받았고, 거스름돈은 없습니다. 즐거운 관람 되세요!"); break;
	       }
	       else {
	          System.out.println("돈이 부족합니다."); 
	       }
	     }
	       
	       int child = 0;
	       int adult = 0;
	       int elder = 0;
	       int soldier = 0;
	       int nationalmerit = 0;
	       int disabled = 0;
	    
	       int price = 500;                                          //임시 티켓가격
	       double ticket;                                              // 계산된 값을 리턴 받기 위한 선언

	       Scanner scan = new Scanner(System.in);
	       System.out.print("동물 체험을 원하십니까? 예(0), 아니오(1) : ");
	       int ask = scan.nextInt( );                                     //동뭁체험에 대한 대답 변수
	       
	       if (ask == 0) {
	          System.out.println("추가 체험값을 지불해야합니다. (사료값, 체험복, 체험장비 포함)");
	       
	          System.out.print("어린이는 몇 명입니까? : ");
	          child = scan.nextInt();
	          
	          System.out.print("어른은 몇 명입니까? : ");
	          adult = scan.nextInt();
	          
	          System.out.println("어린이와 어른의 티켓값은 " + ((child*price) + (adult*price)) + " 원입니다.");
	          
	          System.out.print("혹시 어르신이나 장애인, 군인, 국가유공자와 동행하셨습니까? <특별할인적용> 예(0), 아니오(1) : ");
	          
	          int ask2 = scan.nextInt();                                     //사회적 위치에 대한 대답 변수
	       
	          if (ask2 == 0) {
	       
	          System.out.print("어르신은 몇 명입니까? : ");
	          elder = scan.nextInt();
	    
	          System.out.print("군인은 몇 명입니까? : ");
	          soldier = scan.nextInt();
	          
	          System.out.print("장애인은 몇 명입니까? : ");
	          disabled = scan.nextInt();
	          
	          System.out.print("국가유공자는 몇 명입니까? : ");
	          nationalmerit = scan.nextInt();
	          
	          ticket = getPlusBuy(price, elder, soldier, disabled, nationalmerit); // 플러스바이에 구하면 티켓에 넣을게!
	          System.out.print("특별할인 적용가격은 " + ticket + "원입니다.");
	          }
	         }   
	          else {
	             System.out.println("즐거운 관람되세요.");
	          }
	       
	       
	          Other other = new Other();
	          System.out.println("관람 중 식당이나 디저트 마트를 이용하시겠습니까?");
	          System.out.print("1.식당 이용 \n2.디저트 마트 이용\n3.모두 이용\n4.이용안함");
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
	        	  System.out.println("프로그램을 종료합니다.");
	        	  System.exit(0);
	          }
	          else {
	        	  System.out.println("다시 입력하세요.\n\n\n\n");
	        	  main(args);
	          }
	          other.total();
	          System.out.println("이용해주셔서 감사합니다! 다음에 또 오세요!");
	      }  
	}

	       
}
