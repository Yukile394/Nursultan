package minecraft;

public enum class07214 {
   field_10962,
   field_10963,
   field_10965;

   public static final class07185[] field_10961 = class07185.values();
   public static final class07214[] field_10960 = values();

   class07214() {
   }

   public static class07214 N(class07185 var0, class07185 var1) {
      return field_10960[Math.floorMod(var1.ordinal() - var0.ordinal(), 3)];
   }

   public abstract class07185 N(class07185 var1);

   public abstract class07214 N();

   public abstract double N(double var1, double var3, double var5, class07185 var7);

   public abstract int N(int var1, int var2, int var3, class07185 var4);
}
