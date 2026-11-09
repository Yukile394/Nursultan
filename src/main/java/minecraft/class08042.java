package minecraft;

import Nursultan.class10865;
import org.jspecify.annotations.Nullable;

public class class08042 extends class07150 implements class03244 {
   public static final float N = 45.836624F;
   public static final int y = class04995.u((float) (Math.PI * 5.0 / 4.0));
   protected static final class02131<Byte> L = class03289.N(class08042.class, class02154.N);
   private static final int u = 1;
   @Nullable
   private class08372<class07079> i;
   @Nullable
   private class07209 R;
   private boolean M;
   private int B;

   public static class05300 M() {
      return class07150.Y().N(class05298.n, 14.0).N(class05298.u, 4.0);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(L, (byte)0);
   }

   @Override
   public void method_5773() {
      this.field_5960 = true;
      super.method_5773();
      this.field_5960 = false;
      this.method_5875(true);
      if (this.M && --this.B <= 0) {
         this.B = 20;
         this.method_64419(this.method_48923().z(), 1.0F);
      }
   }

   @Override
   protected boolean method_61410() {
      return !this.method_31481();
   }

   @Override
   public boolean method_5776() {
      return this.field_6012 % y == 0;
   }

   @Override
   public float method_5718() {
      return 1.0F;
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.y("bound_pos", class07209.field_25064, this.R);
      if (this.M) {
         var1.N("life_ticks", this.B);
      }

      class08372.N(this.i, var1, "owner");
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.R = var1.<class07209>N("bound_pos", class07209.field_25064).orElse(null);
      var1.i("life_ticks").ifPresentOrElse(this::N, () -> this.M = false);
      this.i = class08372.N(var1, "owner");
   }

   @Override
   public void method_5878(class07049 var1) {
      super.method_5878(var1);
      if (var1 instanceof class08042 class08042) {
         this.i = class08042.i;
      }
   }

   public class08042(class07078<? extends class08042> var1, class07299 var2) {
      super(var1, var2);
      this.q = new class10865(this, this);
      this.J = 3;
   }

   @Nullable
   public class07079 z() {
      return class08372.N(this.i, this.method_73183(), class07079.class);
   }

   @Override
   protected class04891 s() {
      return class04909.gM;
   }

   private boolean y(int var1) {
      return (this.field_6011.N(L) & var1) != 0;
   }

   @Nullable
   public class07209 E() {
      return this.R;
   }

   public void N(int var1) {
      this.M = true;
      this.B = var1;
   }

   public void N(@Nullable class07209 var1) {
      this.R = var1;
   }

   public void N(class07079 var1) {
      this.i = class08372.N(var1);
   }

   public void N(boolean var1) {
      this.N(1, var1);
   }

   private void N(int var1, boolean var2) {
      int ix = this.field_6011.N(L);
      if (var2) {
         ix |= var1;
      } else {
         ix &= ~var1;
      }

      this.field_6011.N(L, (byte)(ix & 0xFF));
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class06069 class06069 = var1.method_8409();
      this.N(class06069, var2);
      this.N(var1, class06069, var2);
      return super.N(var1, var2, var3, var4);
   }

   @Override
   protected void N(class06069 var1, class07052 var2) {
      this.method_5673(class07085.field_6173, new class06584(class06570.To));
      this.N(class07085.field_6173, 0.0F);
   }

   public boolean W() {
      return this.y(1);
   }

   @Override
   protected void l_() {
      super.l_();
      this.e.N(0, new class07427(this));
      this.e.N(4, new class08032(this));
      this.e.N(8, new class08001(this));
      this.e.N(9, new class07962(this, class08036.class, 3.0F, 1.0F));
      this.e.N(10, new class07962(this, class07079.class, 8.0F));
      this.H.N(1, new class07989(this, class04882.class).N());
      this.H.N(2, new class08015(this, this));
      this.H.N(3, new class07952<>(this, class08036.class, true));
   }

   @Override
   public class04891 method_6002() {
      return class04909.gZ;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.gz;
   }
}
