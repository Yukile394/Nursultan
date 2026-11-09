package minecraft;

public final class class05005 implements Comparable<class05005> {
   public final double N;
   public final double y;
   public final long L;
   public final String u;

   public class05005(String var1, double var2, double var4, long var6) {
      super();
      this.u = var1;
      this.N = var2;
      this.y = var4;
      this.L = var6;
   }

   public int compareTo(class05005 var1) {
      if (var1.N < this.N) {
         return -1;
      } else {
         return var1.N > this.N ? 1 : var1.u.compareTo(this.u);
      }
   }

   public int N() {
      return (this.u.hashCode() & 11184810) + -12303292;
   }
}
