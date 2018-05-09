package myPackage1;

import mypackage2.Parent;

public class Main extends Parent {

	public static void main(String[] args) {
		//Parent p = new Parent();
		//p.parentFun();
		/**
		 * here we can not access the data which is present in other package with private , protected , and default scope.
		*/
		
	/*--------------------------------------------------------------------------------------------------*/
		// after extends 
		//error:The field Parent.x is not visible 
		/**  
		 * here if x is private and method is private than also after extension we can not access data
		 * */		
		//System.out.println(" here num is ->"+x);
		/*Parent parent = new Parent();
		parent.parentFun();
		*/
		
		Main m = new Main();
		m.parentFun();
		
		/**
		 * here if method is having protected access modifier than we can access data from different package
		 * */
		
		
		
		
		
	}

}
