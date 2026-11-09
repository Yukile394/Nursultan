package minecraft;

import java.util.Objects;

public class class05377 {
   private final class07209 N;
   private final class03556<class05369> y;
   private int L;
   private final Runnable u;

   public boolean L() {
      if (this.L <= 0) {
         return false;
      } else {
         this.L--;
         this.u.run();
         return true;
      }
   }

   public class07209 M() {
      return this.N;
   }

   class05377(class07209 var1, class03556<class05369> var2, int var3, Runnable var4) {
      super();
      this.N = var1.method_10062();
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   public class05377(class07209 var1, class03556<class05369> var2, Runnable var3) {
      this(var1, var2, ((class05369)var2.N()).y(), var3);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 != null && this.getClass() == var1.getClass() ? Objects.equals(this.N, ((class05377)var1).N) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.N.hashCode();
   }

   public class03556<class05369> B() {
      return this.y;
   }

   public boolean i() {
      return this.L > 0;
   }

   protected boolean u() {
      if (this.L >= this.y.N().y()) {
         return false;
      } else {
         this.L++;
         this.u.run();
         return true;
      }
   }

   @Deprecated
   public int y() {
      return this.L;
   }

   public class05342 N() {
      return new class05342(this.N, this.y, this.L);
   }

   public boolean R() {
      return this.L != this.y.N().y();
   }
}
