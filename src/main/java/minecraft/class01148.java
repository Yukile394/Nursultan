package minecraft;

public final class class01148 implements Comparable<class01148> {
   private final class03556<class01194> N;
   private final class06889 y;
   private final class01164 L;
   private final class01187 u;
   private final double i;

   public class01164 L() {
      return this.L;
   }

   public class01148(class03556<class01194> var1, class06889 var2, class01164 var3, class01187 var4, class06889 var5) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var2.M(var5);
   }

   public class01187 u() {
      return this.u;
   }

   public class06889 y() {
      return this.y;
   }

   public int compareTo(class01148 var1) {
      return Double.compare(this.i, var1.i);
   }

   public class03556<class01194> N() {
      return this.N;
   }
}
