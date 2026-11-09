package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class06937 {
   private final int N;
   public final class06695 L;
   public int u;
   public final int i;
   public final int R;

   @Nullable
   public class01894 L() {
      return null;
   }

   public void M() {
      this.L.method_5431();
   }

   public class06937(class06695 var1, int var2, int var3, int var4) {
      super();
      this.L = var1;
      this.N = var2;
      this.i = var3;
      this.R = var4;
   }

   public int B() {
      return this.N;
   }

   public boolean Z() {
      return true;
   }

   public void i(class06584 var1) {
      this.L.method_5447(this.N, var1);
      this.M();
   }

   public class06584 i() {
      return this.L.method_5438(this.N);
   }

   public void u(class06584 var1) {
      this.N(var1, this.i());
   }

   public boolean u() {
      return false;
   }

   public boolean y(class08036 var1) {
      return this.N(var1) && this.N(this.i());
   }

   public int y() {
      return this.L.method_5444();
   }

   public class06584 y(class06584 var1, int var2) {
      if (!var1.R() && this.N(var1)) {
         class06584 class06584 = this.i();
         int ix = Math.min(Math.min(var2, var1.c()), this.b_(var1) - class06584.c());
         if (ix <= 0) {
            return var1;
         } else {
            if (class06584.R()) {
               this.u(var1.N(ix));
            } else if (class06584.L(class06584, var1)) {
               var1.B(ix);
               class06584.M(ix);
               this.u(class06584);
            }

            return var1;
         }
      } else {
         return var1;
      }
   }

   public class06584 y(int var1, int var2, class08036 var3) {
      Optional<class06584> optional = this.N(var1, var2, var3);
      optional.ifPresent(var2x -> this.N(var3, var2x));
      return optional.orElse(class06584.E);
   }

   protected void y(int var1) {
   }

   public void y(class06584 var1, class06584 var2) {
      int ix = var2.c() - var1.c();
      if (ix > 0) {
         this.N(var2, ix);
      }
   }

   protected void N(class06584 var1, int var2) {
   }

   public boolean N(class06584 var1) {
      return true;
   }

   public void N(class08036 var1, class06584 var2) {
      this.M();
   }

   public void N(class06584 var1, class06584 var2) {
      this.i(var1);
   }

   public class06584 N(int var1) {
      return this.L.method_5434(this.N, var1);
   }

   public boolean N(class08036 var1) {
      return true;
   }

   public boolean N() {
      return true;
   }

   public Optional<class06584> N(int var1, int var2, class08036 var3) {
      if (!this.N(var3)) {
         return Optional.empty();
      } else if (!this.y(var3) && var2 < this.i().c()) {
         return Optional.empty();
      } else {
         var1 = Math.min(var1, var2);
         class06584 class06584 = this.N(var1);
         if (class06584.R()) {
            return Optional.empty();
         } else {
            if (this.i().R()) {
               this.N(class06584.E, class06584);
            }

            return Optional.of(class06584);
         }
      }
   }

   public boolean R() {
      return !this.i().R();
   }

   public class06584 R(class06584 var1) {
      return this.y(var1, var1.c());
   }

   public int b_(class06584 var1) {
      return Math.min(this.y(), var1.U());
   }

   protected void c_(class06584 var1) {
   }
}
