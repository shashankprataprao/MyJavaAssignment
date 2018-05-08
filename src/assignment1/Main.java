package assignment1;

public class Main {

	public static void main(String[] args) {
		Parent num = new Parent();
		
		//private data member
		/**
		 * this code will not work if the data member and member fun() both are private
		 */
		/*num. printNum();*/
		
		
		/**
		 * this code will not work if the data member is private and member fun() is protected
		 */
		/*num. printNum();*/
		
		
		/** ---->>
		 * this code will  work if the data member is private and member fun() is default
		 */
		/*num.printNum();*/
		
		
		/** ---->>
		 * this code will  work if the data member is private and member fun() is public
		 */
		/*num.printNum();*/
		
		
		
		
		//protected data member
		/**
		 * this code will not work if the data member is protected and member fun() is private
		 */
		/*num.printNum();*/
		
		/** ---->>
		 * this code will work if the data member is protected and member fun() is also protected
		 */
		/*num.printNum();*/
		
		/** ---->>
		 * this code will work if the data member is protected and member fun() is  default
		 */
		/*num.printNum();*/
		
		
		/** ---->>
		 * this code will work if the data member is protected and member fun() is public
		 */
		/*num.printNum();*/
		
		
		
		
		
		
		//Default data member
		/** 
		 * this code will not work if the data member is default and member fun() is private
		 */
		/*num.printNum();*/
		
		/** ---->>
		 * this code will work if the data member is default and member fun() is protected
		 */
		/*num.printNum();*/
		
		/** ---->>
		 * this code will work if the data member is default and member fun() is default
		 */
		/*num.printNum();*/
		
		
		/** ---->>
		 * this code will work if the data member is default and member fun() is public
		 */
		/*num.printNum();*/
		
		//public data member
		/** 
		 * this code will not work if the data member is public and member fun() is private
		 */
		/*num.printNum();*/
		
		
		/** ---->>
		 * this code will work if the data member is public and member fun() is protected
		 */
		num.printNum();
	}

}
