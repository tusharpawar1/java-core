package org.mycomp.webservices;


public class HelloChild extends HelloParent{
	public static void main1(String[] args) {
		
	}
	public static int bookings;
	
	 public void book() {
	        bookings--;
	    }
	    
	    public void book(int size) {
	        book();
	        super.book();
	        bookings += size;
	        
	        
	        
	    }
	    int a;
	    Integer AA;
	    
	    public HelloChild(int a){
	    	this.a = AA +a;
	    	System.out.println(this.a);
	    	
	    }
	    public HelloChild(){
	    	
	    }
	    
	    public void chgVal (Integer I){
	    	I = new Integer(10);
	    }
		public static void main(String args[]) {
			Integer A = new Integer(1);
			HelloChild t = new  HelloChild();
			t.chgVal(A);
			System.out.println(A);
		}
		
	
}
