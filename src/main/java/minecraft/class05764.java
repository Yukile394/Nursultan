package minecraft;

import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class class05764 extends class07473 {
   private final class07473 N;
   private final int y;
   private boolean L;

   @Override
   public void L() {
      if (!this.L) {
         this.L = true;
         this.N.L();
      }
   }

   public boolean M() {
      return this.L;
   }

   public class05764(int var1, class07473 var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 != null && this.getClass() == var1.getClass() ? this.N.equals(((class05764)var1).N) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.N.hashCode();
   }

   @Override
   public boolean B() {
      return this.N.B();
   }

   public int Z() {
      return this.y;
   }

   @Override
   public void i() {
      this.N.i();
   }

   public class07473 U() {
      return this.N;
   }

   @Override
   public EnumSet<class07430> z() {
      return this.N.z();
   }

   @Override
   public void u() {
      if (this.L) {
         this.L = false;
         this.N.u();
      }
   }

   @Override
   public boolean y() {
      return this.N.y();
   }

   public boolean N(class05764 var1) {
      return this.O_() && var1.Z() < this.Z();
   }

   @Override
   public void N_71(EnumSet<class07430> var1) {
      this.N.N_71(var1);
   }

   @Override
   protected int N(int var1) {
      return this.N.N(var1);
   }

   @Override
   public boolean N() {
      return this.N.N();
   }

   @Override
   public boolean O_() {
      return this.N.O_();
   }
}
