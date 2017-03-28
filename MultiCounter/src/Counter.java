/**
 * 
 */

/**
 * @author Kog-Dev
 *
 */
public class Counter {
	private int val = 0;
	public Counter(int init){
		val=init;
	}
	public Counter(){
		new Counter(0);
	}
	public Counter(Counter c){
		new Counter(c.getVal());
	}
	
	public void inc(int step){
		val=val+step;
	}
	public void dec(int step){ //probably unnecessary
		val=val-step;
	}
	public int getVal(){
		return val;
	}
	public void reset(){
		val=0;
	}
	public void set(int in){
		val=in;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
