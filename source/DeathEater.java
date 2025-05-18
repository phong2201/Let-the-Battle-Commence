public class DeathEater extends Monster implements Combatable {
	public DeathEater(Complex mana) {
		super(mana);
	}

	@Override
	public double getCombatScore() {
		// double x = getMana().getRe();
		// double y = getMana().getIm();
		return this.getMana().getMagnitude();
	}
}
