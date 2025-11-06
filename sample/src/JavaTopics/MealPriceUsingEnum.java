package JavaTopics;



public class MealPriceUsingEnum {
	
	enum meal{BREAKFAST(50),LUNCH(100),SNACKS(50),DINNER(100);
		private int value;
		
		private meal(int value) {
			this.value=value;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(meal m:meal.values()) {
			System.out.println(m+" "+m.value);
		}

	}

}
