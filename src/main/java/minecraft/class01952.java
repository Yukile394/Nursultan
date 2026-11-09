package minecraft;

import org.jspecify.annotations.Nullable;

public class class01952 extends class07049 implements class01956, class01959 {
   private static final class02131<Float> N = class03289.N(class01952.class, class02154.u);
   private static final class02131<Float> y = class03289.N(class01952.class, class02154.u);
   private static final class02131<Boolean> L = class03289.N(class01952.class, class02154.U);
   private static final String u = "width";
   private static final String i = "height";
   private static final String R = "attack";
   private static final String M = "interaction";
   private static final String B = "response";
   private static final float Z = 1.0F;
   private static final float z = 1.0F;
   private static final boolean U = false;
   @Nullable
   private class01981 E;
   @Nullable
   private class01981 W;

   public final boolean L() {
      return this.field_6011.N(L);
   }

   @Nullable
   @Override
   public class07438 T() {
      return this.W != null ? this.method_73183().N(this.W.N()) : null;
   }

   @Override
   public class01325 method_18377(class01312 var1) {
      return this.u();
   }

   @Override
   public boolean method_5696() {
      return true;
   }

   @Override
   public class04641 method_5657() {
      return class04641.field_15975;
   }

   @Override
   public void method_5674(class02131<?> var1) {
      super.method_5674(var1);
      if (y.equals(var1) || N.equals(var1)) {
         this.method_18382();
      }
   }

   @Override
   protected void method_5693(class04293 var1) {
      var1.N(N, 1.0F);
      var1.N(y, 1.0F);
      var1.N(L, false);
   }

   @Override
   protected class00734 method_65341(class06889 var1) {
      return this.u().N(var1);
   }

   @Override
   public void method_5773() {
   }

   @Override
   public final boolean method_64397(class04782 var1, class07072 var2, float var3) {
      return false;
   }

   @Override
   protected void method_5652(class08329 var1) {
      var1.N("width", this.N());
      var1.N("height", this.y());
      var1.y("attack", class01981.N, this.E);
      var1.y("interaction", class01981.N, this.W);
      var1.N("response", this.L());
   }

   @Override
   public boolean method_5863() {
      return true;
   }

   @Override
   public boolean method_49108() {
      return false;
   }

   @Override
   public class07082 method_5688(class08036 var1, class07050 var2) {
      if (this.method_73183().method_8608()) {
         return this.L() ? class07082.N : class07082.L;
      } else {
         this.W = new class01981(var1.method_5667(), this.method_73183().N());
         return class07082.L;
      }
   }

   @Override
   protected void method_5749(class08299 var1) {
      this.N(var1.N("width", 1.0F));
      this.y(var1.N("height", 1.0F));
      this.E = var1.<class01981>N("attack", class01981.N).orElse(null);
      this.W = var1.<class01981>N("interaction", class01981.N).orElse(null);
      this.N(var1.N("response", false));
      this.method_5857(this.method_33332());
   }

   @Override
   public boolean method_5698(class07049 var1) {
      if (var1 instanceof class08036 class08036) {
         this.E = new class01981(class08036.method_5667(), this.method_73183().N());
         if (class08036 instanceof class04770 class04770) {
            class06912.B.N(class04770, this, class08036.method_48923().s(), 1.0F, 1.0F, false);
         }

         return !this.L();
      } else {
         return false;
      }
   }

   public class01952(class07078<?> var1, class07299 var2) {
      super(var1, var2);
      this.field_5960 = true;
   }

   private class01325 u() {
      return class01325.y(this.N(), this.y());
   }

   public final float y() {
      return this.field_6011.N(y);
   }

   public final void y(float var1) {
      this.field_6011.N(y, var1);
   }

   public final float N() {
      return this.field_6011.N(N);
   }

   public final void N(float var1) {
      this.field_6011.N(N, var1);
   }

   public final void N(boolean var1) {
      this.field_6011.N(L, var1);
   }

   @Nullable
   @Override
   public class07438 method_49107() {
      return this.E != null ? this.method_73183().N(this.E.N()) : null;
   }
}
