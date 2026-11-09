package minecraft;

public class class03093 extends class06078<class08260> implements class06230, class06275<class08260> {
   protected final class01686 N;
   private final class01686 y;
   private final class01686 L;
   private final class01686 u;
   private final class01686 i;

   public class03093(class01686 var1) {
      super(var1);
      this.y = var1.y("head");
      this.N = this.y.y("nose");
      this.L = var1.y("right_leg");
      this.u = var1.y("left_leg");
      this.i = var1.y("arms");
   }

   public class01686 y() {
      return this.N;
   }

   public void N(class08260 var1, class01421 var2) {
      this.field_54014.N(var2);
      this.i.N(var2);
   }

   public void method_2819(class08260 var1) {
      super.method_2819(var1);
      this.y.R = var1.D * (float) (Math.PI / 180.0);
      this.y.i = var1.h * (float) (Math.PI / 180.0);
      this.L.i = class04995.P(var1.NN * 0.6662F) * 1.4F * var1.Ny * 0.5F;
      this.u.i = class04995.P(var1.NN * 0.6662F + (float) Math.PI) * 1.4F * var1.Ny * 0.5F;
      float f = 0.01F * (var1.N % 10);
      this.N.i = class04995.m(var1.P * f) * 4.5F * (float) (Math.PI / 180.0);
      this.N.M = class04995.P(var1.P * f) * 2.5F * (float) (Math.PI / 180.0);
      if (var1.y) {
         this.N.N(0.0F, 1.0F, -1.5F);
         this.N.i = -0.9F;
      }
   }

   public static class04806 N() {
      class04792 class04792 = class03094.N();
      class04839 class04839 = class04792.N().N("head", class04822.L().N(0, 0).N(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), class04838.N);
      class04839.N("hat", class04822.L().N(0, 64).N(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F), class04838.N(-5.0F, -10.03125F, -5.0F))
         .N("hat2", class04822.L().N(0, 76).N(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F), class04838.N(1.75F, -4.0F, 2.0F, -0.05235988F, 0.0F, 0.02617994F))
         .N("hat3", class04822.L().N(0, 87).N(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), class04838.N(1.75F, -4.0F, 2.0F, -0.10471976F, 0.0F, 0.05235988F))
         .N(
            "hat4",
            class04822.L().N(0, 95).N(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new class04834(0.25F)),
            class04838.N(1.75F, -2.0F, 2.0F, (float) (-Math.PI / 15), 0.0F, 0.10471976F)
         );
      class04839.y("nose").N("mole", class04822.L().N(0, 0).N(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, new class04834(-0.25F)), class04838.N(0.0F, -2.0F, 0.0F));
      return class04806.N(class04792, 64, 128);
   }

   @Override
   public class01686 R() {
      return this.y;
   }
}
