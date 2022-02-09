
public class ButtonHandler {
	
	private boolean clicked;
	private int num;
	private int r;
	private int c;
	
	public ButtonHandler(int n, int row, int col) {
		clicked = false;
		num = n;
		r = row;
		c = col;
	}
	
	public void setClicked() {
		System.out.println("" + r + " " + c);
		if (clicked == false) {
			clicked = true;
			VoltorbLogic.modifyCurrentPoints(num, r, c);
		}
	}
	
	public boolean getClicked() {
		return clicked;
	}
	
}
