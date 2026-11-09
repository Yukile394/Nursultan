package minecraft;

import Nursultan.class10846;
import Nursultan.class10849;
import Nursultan.class10851;
import org.jspecify.annotations.Nullable;

public class class07872 extends class07633 {
   private static final class02131<Boolean> R = class03289.N(class07872.class, class02154.U);
   private static final class02131<Boolean> M = class03289.N(class07872.class, class02154.U);
   private static final float B = 0.3F;
   private static final class01325 Z = class07078.yK.E().N(class03810.N().N(class03831.field_47743, 0.0F, class07078.yK.U(), -0.25F)).N(0.3F);
   private static final boolean X = false;
   int N;
   public static final class01317 y = (var0, var1) -> var0.method_6109() && !var0.method_5799();
   class07209 L = class07209.field_10980;
   @Nullable
   public class07209 u;
   public boolean i;

   void M(boolean var1) {
      this.N = var1 ? 1 : 0;
      this.field_6011.N(M, var1);
   }

   @Override
   protected void M() {
      super.M();
      if (!this.method_6109() && this.method_73183() instanceof class04782 class04782 && class04782.method_64395().N(class07305.O)) {
         this.method_64169(class04782, class06273.NV, this::method_5775);
      }
   }

   @Override
   public boolean method_5675() {
      return false;
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(R, false);
      var1.N(M, false);
   }

   @Override
   protected float method_5867() {
      return this.field_5994 + 0.15F;
   }

   @Override
   protected class04891 method_5737() {
      return class04909.Oq;
   }

   @Override
   protected void method_5734(float var1) {
      super.method_5734(var1 * 1.5F);
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      class04891 class04891 = this.method_6109() ? class04909.Oo : class04909.OJ;
      this.method_5783(class04891, 0.15F, 1.0F);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("home_pos", class07209.field_25064, this.L);
      var1.N("has_egg", this.B());
   }

   @Override
   public void method_5749(class08299 var1) {
      this.N(var1.<class07209>N("home_pos", class07209.field_25064).orElse(this.method_24515()));
      super.method_5749(var1);
      this.N(var1.N("has_egg", false));
   }

   @Override
   public void method_5800(class04782 var1, class00672 var2) {
      this.method_64397(var1, this.method_48923().L(), Float.MAX_VALUE);
   }

   public class07872(class07078<? extends class07872> var1, class07299 var2) {
      super(var1, var2);
      this.N(class04425.field_18, 0.0F);
      this.N(class04425.field_8, -1.0F);
      this.N(class04425.field_23, -1.0F);
      this.N(class04425.field_15, -1.0F);
      this.q = new class07895(this);
   }

   public boolean B() {
      return this.field_6011.N(R);
   }

   @Nullable
   @Override
   protected class04891 s() {
      return !this.method_5799() && this.method_24828() && !this.method_6109() ? class04909.Ol : super.s();
   }

   public static class05300 m() {
      return class07633.Ne().N(class05298.n, 30.0).N(class05298.l, 0.25).N(class05298.O, 1.0);
   }

   @Override
   public boolean g() {
      return false;
   }

   @Nullable
   @Override
   public class07077 y(class04782 var1, class07077 var2) {
      return class07078.yK.N(var1, class06113.field_16466);
   }

   @Override
   public float N(class07209 var1, class05487 var2) {
      if (!this.i && var2.method_8316(var1).N(class01231.N)) {
         return 10.0F;
      } else {
         return class00628.N(var2, var1) ? 10.0F : var2.B(var1);
      }
   }

   public void N(class07209 var1) {
      this.L = var1;
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.yi);
   }

   public static boolean N(class07078<class07872> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var3.method_10264() < var1.method_8615() + 4 && class00628.N(var1, var3) && N(var1, var3);
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      this.N(this.method_24515());
      return super.N(var1, var2, var3, var4);
   }

   void N(boolean var1) {
      this.field_6011.N(R, var1);
   }

   @Override
   protected class07623 N(class07299 var1) {
      return new class10849(this, var1);
   }

   public boolean W() {
      return this.field_6011.N(M);
   }

   @Override
   public int m_() {
      return 200;
   }

   @Override
   protected void l_() {
      this.e.N(0, new class10846(this, 1.2));
      this.e.N(1, new class07885(this, 1.0));
      this.e.N(1, new class07893(this, 1.0));
      this.e.N(2, new class07960(this, 1.1, var0 -> var0.N(class01226.yi), false));
      this.e.N(3, new class07868(this, 1.0));
      this.e.N(4, new class07867(this, 1.0));
      this.e.N(7, new class07866(this, 1.0));
      this.e.N(8, new class07962(this, class08036.class, 8.0F));
      this.e.N(9, new class10851(this, 1.0, 100));
   }

   @Nullable
   @Override
   public class04891 method_6002() {
      return this.method_6109() ? class04909.Ow : class04909.Od;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return this.method_6109() ? Z : super.method_55694(var1);
   }

   @Override
   public void method_6007() {
      super.method_6007();
      if (this.method_5805() && this.W() && this.N >= 1 && this.N % 5 == 0) {
         class07209 class07209 = this.method_24515();
         if (class00628.N(this.method_73183(), class07209)) {
            this.method_73183().N(2001, class07209, class00891.W(this.method_73183().method_8320(class07209.method_10074())));
            this.method_32876(class01194.n);
         }
      }
   }

   @Override
   public float method_17825() {
      return this.method_6109() ? 0.3F : 1.0F;
   }

   @Nullable
   @Override
   public class04891 method_6011(class07072 var1) {
      return this.method_6109() ? class04909.Og : class04909.OO;
   }

   @Override
   public void method_76087(class06889 var1, double var2, boolean var4, double var5) {
      this.method_5724(0.1F, var1);
      this.method_5784(class07451.field_6308, this.method_18798());
      this.method_18799(this.method_18798().L(0.9));
      if (this.T() == null && (!this.i || !this.L.method_19769(this.method_73189(), 20.0))) {
         this.method_18799(this.method_18798().y(0.0, -0.005, 0.0));
      }
   }

   @Override
   public boolean T_() {
      return super.T_() && !this.B();
   }
}
