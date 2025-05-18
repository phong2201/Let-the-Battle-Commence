public class Paladin extends Knight {
	public Paladin(int baseHp, int wp) {
		super(baseHp, wp);
	}

	private int Pos_Fibonacci(int num)
	{
		if ( num < 0 ) return -1;
		int a = 0 , b =1, index = 1;
		while (b < num)
		{ 
			int temp = b;
			b += a;
			a=temp;
			index ++;
		}
		return (b == num && index >2 ) ? index : -1;
	}
	@Override
	public double getCombatScore() {
		if (Pos_Fibonacci(this.getBaseHp()) == -1) return this.getBaseHp()*3.0;
		return Pos_Fibonacci(this.getBaseHp())+1000;
	}
}
