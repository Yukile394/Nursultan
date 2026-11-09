package minecraft;

import Nursultan.class10720;
import Nursultan.class10721;
import Nursultan.class10722;
import org.jspecify.annotations.Nullable;

public class class07155 extends class07079 implements class07542 {
   public static final float N = 7.448451F;
   public static final int y = class04995.u(24.166098F);
   private static final class02131<Integer> R = class03289.N(class07155.class, class02154.y);
   public class06889 L;
   @Nullable
   class07209 u;
   class07142 i;

   public int M() {
      return this.field_6011.N(R);
   }

   @Override
   public void method_5674(class02131<?> var1) {
      if (R.equals(var1)) {
         this.Z();
      }

      super.method_5674(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(R, 0);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.method_73183().method_8608()) {
         float f = class04995.P((this.B() + this.field_6012) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float f1 = class04995.P((this.B() + this.field_6012 + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if (f > 0.0F && f1 <= 0.0F) {
            this.method_73183()
               .method_8486(
                  this.method_23317(),
                  this.method_23318(),
                  this.method_23321(),
                  class04909.Gz,
                  this.method_5634(),
                  0.95F + this.field_5974.z() * 0.05F,
                  0.95F + this.field_5974.z() * 0.05F,
                  false
               );
         }

         float f2 = this.method_17681() * 1.48F;
         float f3 = class04995.P(this.method_36454() * (float) (Math.PI / 180.0)) * f2;
         float f4 = class04995.m(this.method_36454() * (float) (Math.PI / 180.0)) * f2;
         float f5 = (0.3F + f * 0.45F) * this.method_17682() * 2.5F;
         this.method_73183().method_8406(class07107.Nu, this.method_23317() + f3, this.method_23318() + f5, this.method_23321() + f4, 0.0, 0.0, 0.0);
         this.method_73183().method_8406(class07107.Nu, this.method_23317() - f3, this.method_23318() + f5, this.method_23321() - f4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public class04911 method_5634() {
      return class04911.field_15251;
   }

   @Override
   public void method_5623(double var1, boolean var3, class00500 var4, class07209 var5) {
   }

   @Override
   public boolean method_5776() {
      return (this.B() + this.field_6012) % y == 0;
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.y("anchor_pos", class07209.field_25064, this.u);
      var1.N("size", this.M());
   }

   @Override
   public boolean method_5640(double var1) {
      return true;
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.u = var1.<class07209>N("anchor_pos", class07209.field_25064).orElse(null);
      this.N(var1.N("size", 0));
   }

   public class07155(class07078<? extends class07155> var1, class07299 var2) {
      super(var1, var2);
      this.L = class06889.L;
      this.i = class07142.field_7318;
      this.J = 5;
      this.q = new class10722(this, this);
      this.o = new class10721(this);
   }

   public int B() {
      return this.method_5628() * 3;
   }

   private void Z() {
      this.method_18382();
      this.method_5996(class05298.u).N(6 + this.M());
   }

   @Override
   protected class04891 s() {
      return class04909.GM;
   }

   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      this.u = this.method_24515().method_10086(5);
      this.N(0);
      return super.N(var1, var2, var3, var4);
   }

   public void N(int var1) {
      this.field_6011.N(R, class04995.N(var1, 0, 64));
   }

   boolean N(class04782 var1, class07438 var2, class01328 var3) {
      return var3.N(var1, this, var2);
   }

   @Override
   protected class07472 Z_() {
      return new class10720(this, this);
   }

   @Override
   protected void l_() {
      this.e.N(1, new class07171(this));
      this.e.N(2, new class07180(this));
      this.e.N(3, new class07177(this));
      this.H.N(1, new class07157(this));
   }

   @Override
   public class04891 method_6002() {
      return class04909.GZ;
   }

   @Override
   public float method_6107() {
      return 1.0F;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      int ix = this.M();
      return super.method_55694(var1).N(1.0F + 0.15F * ix);
   }

   @Override
   public void method_6091(class06889 var1) {
      this.method_70670(var1, 0.2F);
   }

   @Override
   public boolean method_6101() {
      return false;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.GU;
   }

   @Override
   public boolean method_5973(class07078<?> var1) {
      return true;
   }
}
