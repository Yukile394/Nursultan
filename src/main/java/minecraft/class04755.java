package minecraft;

public class class04755 implements Comparable<class04755> {
   private final int N;
   private final class07209 y;
   private int L;
   private int u;

   public int L() {
      return this.L;
   }

   public class04755(int var1, class07209 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class04755 class04755 = (class04755)var1;
         return this.N == class04755.N;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Integer.hashCode(this.N);
   }

   public int u() {
      return this.u;
   }

   public class07209 y() {
      return this.y;
   }

   public void y(int var1) {
      this.u = var1;
   }

   public void N(int var1) {
      if (var1 > 10) {
         var1 = 10;
      }

      this.L = var1;
   }

   public int compareTo(class04755 var1) {
      return this.L != var1.L ? Integer.compare(this.L, var1.L) : Integer.compare(this.N, var1.N);
   }

   public int N() {
      return this.N;
   }
}
