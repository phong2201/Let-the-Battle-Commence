public class Warrior extends Fighter {
   public Warrior(int baseHp, int wp) {
       super(baseHp, wp);
   }

   @Override
   public double getCombatScore() {
    double hp = this.getBaseHp();
       if (Utility.isPrime(Battle.GROUND)) 
       {
           hp *=2.0;
       }
       else if (this.getWp() != 1)
       {
            hp /=10.0;
       }
       if ( hp >= 999.0) hp= 999.0;
       return hp;
   }
}

    