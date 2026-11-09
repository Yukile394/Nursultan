package minecraft;

import Nursultan.class10555;
import org.jspecify.annotations.Nullable;

public abstract class class06091 extends class07150 {
   private static final boolean N = false;
   private static final boolean y = false;
   @Nullable
   private class07209 L;
   private boolean u = false;
   private boolean i = false;

   public void M(boolean var1) {
      this.u = var1;
      this.i = true;
   }

   public boolean Q() {
      return this.u;
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.y("patrol_target", class07209.field_25064, this.L);
      var1.N("PatrolLeader", this.u);
      var1.N("Patrolling", this.i);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.L = var1.<class07209>N("patrol_target", class07209.field_25064).orElse(null);
      this.u = var1.N("PatrolLeader", false);
      this.i = var1.N("Patrolling", false);
   }

   public class06091(class07078<? extends class06091> var1, class07299 var2) {
      super(var1, var2);
   }

   public void B(boolean var1) {
      this.i = var1;
   }

   public void I() {
      this.L = this.method_24515().method_10069(-500 + this.field_5974.y(1000), 0, -500 + this.field_5974.y(1000));
      this.i = true;
   }

   @Nullable
   public class07209 l() {
      return this.L;
   }

   public boolean d() {
      return this.L != null;
   }

   public boolean o() {
      return this.i;
   }

   public boolean v() {
      return true;
   }

   public void N(class07209 var1) {
      this.L = var1;
      this.i = true;
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      if (var3 != class06113.field_16527 && var3 != class06113.field_16467 && var3 != class06113.field_16474 && var1.method_8409().z() < 0.06F && this.v()) {
         this.u = true;
      }

      if (this.Q()) {
         this.method_5673(class07085.field_6169, class04877.N(this.method_56673().L(class04227.NF)));
         this.N(class07085.field_6169, 2.0F);
      }

      if (var3 == class06113.field_16527) {
         this.i = true;
      }

      return super.N(var1, var2, var3, var4);
   }

   @Override
   public boolean N(double var1) {
      return !this.i || var1 > 16384.0;
   }

   public static boolean N(class07078<? extends class06091> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var1.method_8314(class00772.field_9282, var3) > 8 ? false : L(var0, var1, var2, var3, var4);
   }

   public boolean O() {
      return true;
   }

   @Override
   public void l_() {
      super.l_();
      this.e.N(4, new class10555<>(this, 0.7, 0.595));
   }
}
