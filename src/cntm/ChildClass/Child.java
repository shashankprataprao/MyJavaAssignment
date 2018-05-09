package cntm.ChildClass;

public class Child extends SubParentClass {

	
		// Child c = new Child();

		// datamember is private
		// c.fun();
		/**
		 * this will not work becasue method in parent is private
		 * java.lang.Error: Unresolved compilation problem: The method fun()
		 * from the type Parent is not visible
		 */

		// c.fun();
		/**
		 * this will work becasue method in parent is protected
		 */
		// c.fun();
		/**
		 * this will work becasue method in parent is default
		 */
		// c.fun();
		/**
		 * this will work becasue method in parent is public
		 */

		// here data member is protected

		// c.fun();
		/**
		 * The method fun() from the type Parent is not visible due to method is
		 * private
		 */
		// c.fun();

		/**
		 * here it is working when both member fun and data member is protected
		 * or of wider scope or if member is protected and memberfun is of wider
		 * scope or of protected scope
		 */

		/*
		 * Parent p = new Parent(); p.fun();
		 */
		/**
		 * The method fun() is undefined for the type Parent
		 * 
		 * this error comes when we create object of parent in child class
		 */
		
		
		/*---------------------------------------------------------------------------------------------*/
		
		
			
			/*protected void Childfun() {
				System.out.println("num from child class ->"+num);
			}*/

		
		
		
		
		
		
		
		
		
		
		
		


}
