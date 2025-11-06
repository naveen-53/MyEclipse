package JavaProgram;

public class Box {
	int length,breath,height;
	String color;
	
	public Box(){
		length=10;
		breath=10;
		height=10;
		
	}
	
	public Box(int l,int b,int h){
		length=l; 
		breath=b;
		height=h;
	}
	
	public Box(int l,int b,int h,String c) {
		length=l; 
		breath=b;
		height=h;
		color=c;
	}
	
		int volume() {                                 
			return length*breath*height; // 5*4*3
		}
		String colorName() {
			return color;
		}

		public static void main(String[] args) {
			Box giftbox = new Box();
			System.out.println("volume is "+ giftbox.volume());
			
			Box giftbox1=new Box(5,4,3);                          
			System.out.println("volume is "+ giftbox1.volume());
			
			Box giftbox2=new Box(2,3,4,"green");
			System.out.println("volume is "+ giftbox2.volume());
			System.out.println("Color is "+ giftbox2.colorName());
			
		}


}
