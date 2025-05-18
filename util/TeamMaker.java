// Source code is decompiled from a .class file using FernFlower decompiler.
public class TeamMaker {
	public TeamMaker() {
	}
 
	private static Combatable makeFixedTeam1Member(int var0) {
	   if (var0 == 0) {
		  return new Paladin(500, 1);
	   } else if (var0 != 1 && var0 != 6 && var0 != 7) {
		  return (Combatable)(var0 == 2 ? new DeathEater(new Complex(300.0, 200.0)) : new Paladin(987, 1));
	   } else {
		  return new Knight(423, 0);
	   }
	}
 
	private static Combatable makeFixedTeam2Member(int var0) {
	   if (var0 != 0 && var0 != 6) {
		  if (var0 == 1) {
			 return new Warrior(209, 1);
		  } else {
			 return (Combatable)(var0 == 2 ? new DeathEater(new Complex(300.0, 200.0)) : new Warrior(9, 1));
		  }
	   } else {
		  return new Warrior(660, 1);
	   }
	}
 
	public static Combatable[] makeTeam1() {
	   Combatable[] var0 = new Combatable[10];
 
	   for(int var1 = 0; var1 < var0.length; ++var1) {
		  var0[var1] = makeFixedTeam1Member(var1);
	   }
 
	   return var0;
	}
 
	public static Combatable[] makeTeam2() {
	   Combatable[] var0 = new Combatable[10];
 
	   for(int var1 = 0; var1 < var0.length; ++var1) {
		  var0[var1] = makeFixedTeam2Member(var1);
	   }
 
	   return var0;
	}
 }
 