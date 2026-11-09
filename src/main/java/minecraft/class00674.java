package minecraft;

import org.jspecify.annotations.Nullable;

public class class00674 extends class07049 implements class03244 {
   private static final class02131<Integer> y = class03289.N(class00674.class, class02154.y);
   private static final class02131<class00500> L = class03289.N(class00674.class, class02154.Z);
   private static final short u = 80;
   private static final float i = 4.0F;
   private static final class00500 R = class00869.Ln.W();
   private static final String M = "block_state";
   public static final String N = "fuse";
   private static final String B = "explosion_power";
   private static final class01284 Z = new class00688();
   @Nullable
   private class08372<class07438> z;
   private boolean U;
   private float E = 4.0F;

   public class00500 L() {
      return this.field_6011.N(L);
   }

   @Override
   protected void method_5693(class04293 var1) {
      var1.N(y, 80);
      var1.N(L, R);
   }

   @Override
   public void method_5773() {
      this.method_60698();
      this.method_56990();
      this.method_5784(class07451.field_6308, this.method_18798());
      this.method_61409();
      this.method_18799(this.method_18798().L(0.98));
      if (this.method_24828()) {
         this.method_18799(this.method_18798().u(0.7, -0.5, 0.7));
      }

      int ix = this.y() - 1;
      this.N(ix);
      if (ix <= 0) {
         this.method_31472();
         if (!this.method_73183().method_8608()) {
            this.u();
         }
      } else {
         this.method_5876();
         if (this.method_73183().method_8608()) {
            this.method_73183().method_8406(class07107.NZ, this.method_23317(), this.method_23318() + 0.5, this.method_23321(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public final boolean method_64397(class04782 var1, class07072 var2, float var3) {
      return false;
   }

   @Override
   protected class07065 method_33570() {
      return class07065.field_28630;
   }

   @Override
   protected double method_7490() {
      return 0.04;
   }

   @Override
   protected void method_5652(class08329 var1) {
      var1.N("fuse", (short)this.y());
      var1.N("block_state", class00500.N, this.L());
      if (this.E != 4.0F) {
         var1.N("explosion_power", this.E);
      }

      class08372.N(this.z, var1, "owner");
   }

   @Override
   public boolean method_5863() {
      return !this.method_31481();
   }

   @Override
   protected void method_5749(class08299 var1) {
      this.N(var1.N("fuse", (short)80));
      this.N(var1.<class00500>N("block_state", class00500.N).orElse(R));
      this.E = class04995.N(var1.N("explosion_power", 4.0F), 0.0F, 128.0F);
      this.z = class08372.N(var1, "owner");
   }

   @Nullable
   @Override
   public class07049 method_5731(class01032 var1) {
      class07049 class07049 = super.method_5731(var1);
      if (class07049 instanceof class00674) {
         ((class00674)class07049).N(true);
      }

      return class07049;
   }

   @Override
   public void method_5878(class07049 var1) {
      super.method_5878(var1);
      if (var1 instanceof class00674 class00674) {
         this.z = class00674.z;
      }
   }

   public class00674(class07078<? extends class00674> var1, class07299 var2) {
      super(var1, var2);
      this.field_23807 = true;
   }

   public class00674(class07299 var1, double var2, double var4, double var6, @Nullable class07438 var8) {
      this(class07078.yg, var1);
      this.method_5814(var2, var4, var6);
      double d0 = var1.field_9229.U() * (float) (Math.PI * 2);
      this.method_18800(-Math.sin(d0) * 0.02, 0.2F, -Math.cos(d0) * 0.02);
      this.N(80);
      this.field_6014 = var2;
      this.field_6036 = var4;
      this.field_5969 = var6;
      this.z = class08372.N(var8);
   }

   private void u() {
      class07299 class07299 = this.method_73183();
      if (class07299 instanceof class04782 && ((class04782)class07299).method_64395().N(class07305.Nu)) {
         this.method_73183()
            .method_55117(
               this,
               class07307.N(this.method_73183(), this),
               this.U ? Z : null,
               this.method_23317(),
               this.method_23323(0.0625),
               this.method_23321(),
               this.E,
               false,
               class07328.field_40891
            );
      }
   }

   public int y() {
      return this.field_6011.N(y);
   }

   @Nullable
   public class07438 z() {
      return class08372.y(this.z, this.method_73183());
   }

   public void N(class00500 var1) {
      this.field_6011.N(L, var1);
   }

   public void N(int var1) {
      this.field_6011.N(y, var1);
   }

   private void N(boolean var1) {
      this.U = var1;
   }
}
