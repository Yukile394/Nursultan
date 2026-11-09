package minecraft;

public class class08684 extends class06078<class08670> {
   public static final class02415 N = class02415.N(0.2375F);
   private static final float y = 0.9375F;
   private final class01686[] L = new class01686[9];
   private final class01686 u;

   public class08684(class01686 var1) {
      super(var1);
      this.u = var1.y("body");

      for (int i = 0; i < this.L.length; i++) {
         this.L[i] = this.u.y(class03088.N(i));
      }
   }

   public static class04806 N(boolean var0, class04834 var1) {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N()
         .N("body", class04822.L().N(0, 0).N(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, var1), class04838.N(0.0F, 16.0F, 0.0F));
      if (var0) {
         class04839.N("inner_body", class04822.L().N(0, 32).N(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, var1.N(-0.5F)), class04838.N(0.0F, 8.0F, 0.0F));
      }

      class04839.N(class03088.N(0), class04822.L().N(0, 0).N(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, var1), class04838.N(-3.75F, 7.0F, -5.0F));
      class04839.N(class03088.N(1), class04822.L().N(0, 0).N(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, var1), class04838.N(1.25F, 7.0F, -5.0F));
      class04839.N(class03088.N(2), class04822.L().N(0, 0).N(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, var1), class04838.N(6.25F, 7.0F, -5.0F));
      class04839.N(class03088.N(3), class04822.L().N(0, 0).N(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, var1), class04838.N(-6.25F, 7.0F, 0.0F));
      class04839.N(class03088.N(4), class04822.L().N(0, 0).N(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, var1), class04838.N(-1.25F, 7.0F, 0.0F));
      class04839.N(class03088.N(5), class04822.L().N(0, 0).N(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, var1), class04838.N(3.75F, 7.0F, 0.0F));
      class04839.N(class03088.N(6), class04822.L().N(0, 0).N(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, var1), class04838.N(-3.75F, 7.0F, 5.0F));
      class04839.N(class03088.N(7), class04822.L().N(0, 0).N(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, var1), class04838.N(1.25F, 7.0F, 5.0F));
      class04839.N(class03088.N(8), class04822.L().N(0, 0).N(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, var1), class04838.N(6.25F, 7.0F, 5.0F));
      return class04806.N(class04792, 64, 64).N(class02415.N(4.0F));
   }

   public void method_2819(class08670 var1) {
      super.method_2819(var1);
      if (!var1.N.R()) {
         this.u.B = 0.9375F;
         this.u.Z = 0.9375F;
         this.u.z = 0.9375F;
      }

      class06379.N(var1, this.L);
   }
}
