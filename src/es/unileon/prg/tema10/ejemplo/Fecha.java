package es.unileon.prg.tema10.ejemplo;

public class Fecha {

		private int year;
		private int month;
		private int day;
		
		
		Fecha(){
			this.setYear(2019);
			this.setMonth(03);
			this.setDay(26);
			
		}


		public int getMonth() {
			return month;
		}


		public void setMonth(int month) {
			this.month = month;
		}


		public int getYear() {
			return year;
		}


		public void setYear(int year) {
			this.year = year;
		}


		public int getDay() {
			return day;
		}


		public void setDay(int day) {
			this.day = day;
		}
}
