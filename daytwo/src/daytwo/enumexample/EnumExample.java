package daytwo.enumexample;

public class EnumExample {

	public static void main(String[] args) {
		System.out.println(Days.Monday);
		System.out.println("Friday");
		if((Days.Friday).equals(DaysConstant.FRIDAY)){
			System.out.println(MessageConstants.TGIF);
		}else {
			System.out.println(MessageConstants.WE_HAVE_TO_WORK_HARDER);
		}
		if((Days.Friday).equals("Friday")) {
			System.out.println("Thank God Its Friday");
		}else {
			System.out.println("Please read the article on enum which I shared");
		}
		
		CoffeeSize cs = CoffeeSize.BIG;
		System.out.println(cs.values());
		System.out.println(CoffeeSize.values());
		System.out.println(CoffeeSize.valueOf("BIG"));
	}

}
