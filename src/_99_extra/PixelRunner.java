package _99_extra;

public class PixelRunner {
	public static void main(String args[]) {
		PixelParty party = new PixelParty();
		party.setColor(0, 255, 100);
		party.drawCircle(30, 30, 50);
		party.drawTriangle(30, 30, 70, 70, 70, 70);
		party.drawRectangle(60, 50, 10, 30);
		party.saveImage();
		party.displayImage();
	}
}
