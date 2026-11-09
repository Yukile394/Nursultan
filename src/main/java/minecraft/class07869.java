package minecraft;

import Nursultan.class10714;
import org.jspecify.annotations.Nullable;

public class class07869 extends class07633 implements class01279 {
   private static final class02131<Boolean> N = class03289.N(class07869.class, class02154.U);
   private static final float y = 6.0F;
   private float L;
   private float u;
   private int i;
   private static final class02135 R = class01517.N(20, 39);
   private long M;
   @Nullable
   private class08372<class07438> B;

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, false);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.method_73183().method_8608()) {
         if (this.u != this.L) {
            this.method_18382();
         }

         this.L = this.u;
         if (this.n()) {
            this.u = class04995.N(this.u + 1.0F, 0.0F, 6.0F);
         } else {
            this.u = class04995.N(this.u - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.i > 0) {
         this.i--;
      }

      if (!this.method_73183().method_8608()) {
         this.N((class04782)this.method_73183(), true);
      }
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.lW, 0.15F, 1.0F);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      this.N(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(this.method_73183(), var1);
   }

   public class07869(class07078<? extends class07869> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   protected class04891 s() {
      return this.method_6109() ? class04909.lz : class04909.lZ;
   }

   public boolean n() {
      return this.field_6011.N(N);
   }

   public static class05300 m() {
      return class07633.Ne().N(class05298.n, 30.0).N(class05298.P, 20.0).N(class05298.l, 0.25).N(class05298.u, 6.0);
   }

   @Override
   protected void v() {
      if (this.i <= 0) {
         this.method_56078(class04909.lm);
         this.i = 40;
      }
   }

   public float u(float var1) {
      return class04995.B(var1, this.L, this.u) / 6.0F;
   }

   @Nullable
   @Override
   public class07077 y(class04782 var1, class07077 var2) {
      return class07078.yL.N(var1, class06113.field_16466);
   }

   @Override
   public long E() {
      return this.M;
   }

   @Override
   public boolean N(class06584 var1) {
      return false;
   }

   public void N(boolean var1) {
      this.field_6011.N(N, var1);
   }

   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      if (var4 == null) {
         var4 = new class10714(1.0F);
      }

      return super.N(var1, var2, var3, (class07446)var4);
   }

   @Override
   public void N(long var1) {
      this.M = var1;
   }

   @Override
   public void N(@Nullable class08372<class07438> var1) {
      this.B = var1;
   }

   public static boolean N(class07078<class07869> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return !var1.i(var3).N(class03557.NE) ? L(var0, var1, var2, var3, var4) : N(var1, var3) && var1.method_8320(var3.method_10074()).N(class01210.Lb);
   }

   @Nullable
   @Override
   public class08372<class07438> W() {
      return this.B;
   }

   @Override
   protected void l_() {
      super.l_();
      this.e.N(0, new class07427(this));
      this.e.N(1, new class07875(this));
      this.e.N(1, new class07993(this, 2.0, var0 -> var0.method_6109() ? class03696.I : class03696.J));
      this.e.N(4, new class07459(this, 1.25));
      this.e.N(5, new class07978(this, 1.0));
      this.e.N(6, new class07962(this, class08036.class, 6.0F));
      this.e.N(7, new class07956(this));
      this.H.N(1, new class07887(this));
      this.H.N(2, new class07898(this));
      this.H.N(3, new class07952<>(this, class08036.class, 10, true, false, this::N));
      this.H.N(4, new class07952<>(this, class06165.class, 10, true, true, null));
      this.H.N(5, new class01251<>(this, false));
   }

   @Override
   public class04891 method_6002() {
      return class04909.lU;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      if (this.u > 0.0F) {
         float f = this.u / 6.0F;
         float f1 = 1.0F + f;
         return super.method_55694(var1).N(1.0F, f1);
      } else {
         return super.method_55694(var1);
      }
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.lE;
   }

   @Override
   public float method_6120() {
      return 0.98F;
   }

   @Override
   public void W_() {
      this.y(R.N(this.field_5974));
   }
}
