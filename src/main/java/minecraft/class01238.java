package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class01238 extends class07150 {
   protected static final class02131<Boolean> L = class03289.N(class01238.class, class02154.U);
   public static final int u = 300;
   private static final boolean N = false;
   private static final boolean y = true;
   private static final int R = 0;
   protected int i = 0;

   public void L(class04782 var1) {
      this.N(class07078.LN, class08234.N(this, true, true), var0 -> var0.method_6092(new class07055(class07047.Z, 200, 0)));
   }

   private void M() {
      if (class05459.N(this)) {
         this.f().y(true);
      }
   }

   @Nullable
   @Override
   public class07438 T() {
      return this.S();
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(L, false);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("IsImmuneToZombification", this.t());
      var1.N("TimeInOverworld", this.i);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.L(var1.N("CanPickUpLoot", true));
      this.B(var1.N("IsImmuneToZombification", false));
      this.i = var1.N("TimeInOverworld", 0);
   }

   public class01238(class07078<? extends class01238> var1, class07299 var2) {
      super(var1, var2);
      this.L(true);
      this.M();
      this.N(class04425.field_9, 16.0F);
      this.N(class04425.field_3, -1.0F);
   }

   protected abstract boolean B();

   public void B(boolean var1) {
      this.method_5841().N(L, var1);
   }

   @Override
   public void D() {
      if (class01514.L(this)) {
         super.D();
      }
   }

   public boolean l() {
      return !this.method_6109();
   }

   protected boolean d() {
      return this.method_6047().L(class02484.O);
   }

   protected boolean t() {
      return this.method_5841().N(L);
   }

   @Override
   protected abstract void v();

   public abstract class01484 E();

   @Override
   public void N(class04782 var1) {
      super.N(var1);
      if (this.G()) {
         this.i++;
      } else {
         this.i = 0;
      }

      if (this.i > 300) {
         this.v();
         this.L(var1);
      }
   }

   public void N(int var1) {
      this.i = var1;
   }

   @Override
   public boolean G() {
      return !this.t() && !this.Nt() && this.method_73183().method_75728().N(class00608.K, this.method_73189());
   }
}
