package Interface;

public interface Edit {
	
	void read();
	void update();
	default void write() {
		System.out.println("The write method ");
	}
	

}
