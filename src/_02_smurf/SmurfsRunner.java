package _02_smurf;

public class SmurfsRunner {
	public static void main(String[] args) {
		Smurf smurf = new Smurf("Handy");
		smurf.eat();
		smurf.getName();
		Smurf papa = new Smurf("Papa");
		System.out.println(papa.getName());
		System.out.println(papa.getHatColor() + papa.isGirlOrBoy());
		Smurf girl = new Smurf("Smurfette");
		System.out.println(girl.getName());
		System.out.println(girl.getHatColor() + girl.isGirlOrBoy());
	}
}
