package minecraft;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleListIterator;

public class class05041 {
   private static final double N = 1.0181268882175227;
   private static final double y = 0.3333333333333333;
   private final double L;
   private final class05008 u;
   private final class05008 i;
   private final double R;
   private final class05056 M;

   private class05041(class06069 var1, class05056 var2, boolean var3) {
      super();
      int ix = var2.N();
      DoubleList doublelist = var2.y();
      this.M = var2;
      if (var3) {
         this.u = class05008.y(var1, ix, doublelist);
         this.i = class05008.y(var1, ix, doublelist);
      } else {
         this.u = class05008.N(var1, ix, doublelist);
         this.i = class05008.N(var1, ix, doublelist);
      }

      int j = Integer.MAX_VALUE;
      int k = Integer.MIN_VALUE;
      DoubleListIterator doublelistiterator = doublelist.iterator();

      while (doublelistiterator.hasNext()) {
         int l = doublelistiterator.nextIndex();
         if (doublelistiterator.nextDouble() != 0.0) {
            j = Math.min(j, l);
            k = Math.max(k, l);
         }
      }

      this.L = 0.16666666666666666 / N(k - j);
      this.R = (this.u.N() + this.i.N()) * this.L;
   }

   public static class05041 y(class06069 var0, class05056 var1) {
      return new class05041(var0, var1, true);
   }

   public class05056 y() {
      return this.M;
   }

   private static double N(int var0) {
      return 0.1 * (1.0 + 1.0 / (var0 + 1));
   }

   public double N(double var1, double var3, double var5) {
      double d0 = var1 * 1.0181268882175227;
      double d1 = var3 * 1.0181268882175227;
      double d2 = var5 * 1.0181268882175227;
      return (this.u.N(var1, var3, var5) + this.i.N(d0, d1, d2)) * this.L;
   }

   public void N(StringBuilder var1) {
      var1.append("NormalNoise {");
      var1.append("first: ");
      this.u.N(var1);
      var1.append(", second: ");
      this.i.N(var1);
      var1.append("}");
   }

   public double N() {
      return this.R;
   }

   public static class05041 N(class06069 var0, int var1, double... var2) {
      return y(var0, new class05056(var1, new DoubleArrayList(var2)));
   }

   @Deprecated
   public static class05041 N(class06069 var0, class05056 var1) {
      return new class05041(var0, var1, false);
   }
}
