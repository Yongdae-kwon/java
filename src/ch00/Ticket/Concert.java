package ch00.Ticket;

//실습과제 8.3: Concert.java
//콘서트 티켓을 모델한다
import java.util.Scanner;

	public class Concert {
		
		
		//필드
		private String singerName;		// 가수의 이름
		private int capacity;			// 공연 장소의 수용 인원
		private int ticketsSold = 0;	// 팔린 티켓 수

		// 변수들
		// 인터넷 티켓 가격, 현장 티켓 가격, 총 판매 금액과 인터넷 판매 가능 여부
		// 여기에 코드를 삽입하세요
		private int costweb;			// 인터넷 티켓 가격
		private int costvenue;			// 현장 판매 티켓 가격
		private int totalSales = 0 ;	// 판매 총 금액
		private boolean salesAreByWeb = true; //인터넷 판매 가능 여부
		
		// 생성자 메소드
		// 가수의 이름, 공연 장소의 수용 인원, 인터넷 티켓 가격과 현장 티켓 가격을
		// 각각 주어진 값으로 초기화하면서 객체를 생성한다
		public Concert(String name, int max, int costOverWeb, int costAtVenue)  {
			singerName = name;
			capacity = max;
			costweb = costOverWeb;
			costvenue = costAtVenue;			
		}// 여기에 코드를 삽입하세요

		// 티켓을 판다
		public void doTicketSale() {
				// 남은 티켓들의 수를 알려 준다
				System.out.print("남은 티켓들 수는? (최대 " + getTicketsLeft() + ") ");

				// 구매 요청한 티켓 수를 입력 받는다
				Scanner reader = new Scanner(System.in);
				int toSell = reader.nextInt();
     
				// 티켓을 판다
				boolean saleCompleted = sellTickets(toSell);

				// 판매가 완료되면 티켓들의 총 가격을 출력하고
				// 티켓을 판매할 수 없으면 오류 메시지를 출력한다
				if(saleCompleted)
					System.out.println("티켓들의 총 가격 = " + getSaleCost(toSell));
				else 
					System.out.println("죄송합니다. 판매를 완료할 수 없습니다.");
				}// 여기에 코드를 삽입하세요

		
		
		
		
		
		
		
		
		// 구매 요청한 수만큼 티켓을 판다
		// 티켓을 판매할 수 있으면 판매 기록을 갱신하고 true를 반환한다
		// 티켓을 판매할 수 없으면 false를 반환한다
		public boolean sellTickets(int number) 	{
			if (number > 0 && number <= getTicketsLeft()) {
				ticketsSold += number;
				totalSales += getSaleCost(number);
				return true;
			} else {
				return false;
			}
		}// 여기에 코드를 삽입하세요
		
		// 구매 요청한 티켓들의 가격을 계산한 후 반환한다
		public int getSaleCost(int number) {
			int saleCost = number;
			if (salesAreByWeb)
				saleCost *= costweb;
			else
				saleCost *= costvenue;
			return saleCost;
		}// 여기에 코드를 삽입하세요

		// 인터넷 판매를 종료한다
		public void webSalesOver(){   		//온라인 판매 종료
			salesAreByWeb =false;			// false로 온라인 판매 되지 않게
		}
		
		public int getTicketsLeft  () {
			return capacity = ticketsSold;
		}
		
		//총 판매 금액
		public int getTotalSales () {
			return totalSales;
		}
		// 온라인 판매 가능 여부
		public boolean webSalesOnly() {
			return salesAreByWeb;
		}
		
		//
		public String getSalesReport() {
			return singerName + "콘서트 티켓 판매 내역 : " + " 팔린 티켓 수 " + capacity + " 총 판매 금액 " + totalSales; 
		}
		
		
		
		
		/*
		public String getSingerName() { return singerName; }
		public void setSingerName(String singerName) { this.singerName = singerName; }

		public int getCapacity() { return capacity; }
		public void setCapacity(int capacity) { this.capacity = capacity; }

		public int getTicketsSold() { return ticketsSold; }
		public void setTicketsSold(int ticketsSold) { this.ticketsSold = ticketsSold; }

		public int getCostweb() { return costweb; }
		public void setCostweb(int costweb) { this.costweb = costweb; }

		public int getCostvenue() { return costvenue; }
		public void setCostvenue(int costvenue) { this.costvenue = costvenue; }

		public int getTotalSales() { return totalSales; }
		public void setTotalSales(int totalSales) { this.totalSales = totalSales; }

		public boolean isSalesAreByWeb() { return salesAreByWeb; }
		public void setSalesAreByWeb(boolean salesAreByWeb) { this.salesAreByWeb = salesAreByWeb; }
		*/
		
		
		
		
		/*

		// 팔린 티켓들의 수를 알려 준다
		public int getTicketsSold() { return ticketsSold; }

		// 남은 티켓들의 수를 알려 준다
		public int getTicketsLeft() {return ticketsSold; }	// 여기에 코드를 삽입하세요

		// 총 판매 금액을 알려 준다
		public int getTotalSales() { return salesreport; }// 여기에 코드를 삽입하세요

		// 인터넷 판매 가능 여부를 알려 준다
		public boolean webSalesOnly() { }// 여기에 코드를 삽입하세요

		// 팔린 티켓 수와 총 판매 금액을 반환한다
		public String getSalesReport() { }// 여기에 코드를 삽입하세요
		*/
}