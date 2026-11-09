package minecraft;

import java.util.Map.Entry;
import java.util.function.UnaryOperator;

public class class05564 extends class06078<class08464> {
   public static final class02415 N = class05564::N;
   private final class01686 y;
   private final class01686 L;
   private final class01686 u;
   private final class01686 i;
   private final class01686 R;
   private final class01686 M;
   private final class01686 B;

   public class05564(class01686 var1) {
      super(var1);
      this.y = var1.y("head");
      this.M = var1.y("right_chest");
      this.B = var1.y("left_chest");
      this.L = var1.y("right_hind_leg");
      this.u = var1.y("left_hind_leg");
      this.i = var1.y("right_front_leg");
      this.R = var1.y("left_front_leg");
   }

   public static class04806 N(class04834 var0) {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N(
         "head",
         class04822.L()
            .N(0, 0)
            .N(-2.0F, -14.0F, -10.0F, 4.0F, 4.0F, 9.0F, var0)
            .N(0, 14)
            .N("neck", -4.0F, -16.0F, -6.0F, 8.0F, 18.0F, 6.0F, var0)
            .N(17, 0)
            .N("ear", -4.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, var0)
            .N(17, 0)
            .N("ear", 1.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, var0),
         class04838.N(0.0F, 7.0F, -6.0F)
      );
      class04839.N(
         "body", class04822.L().N(29, 0).N(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, var0), class04838.N(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      class04839.N(
         "right_chest",
         class04822.L().N(45, 28).N(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, var0),
         class04838.N(-8.5F, 3.0F, 3.0F, 0.0F, (float) (Math.PI / 2), 0.0F)
      );
      class04839.N(
         "left_chest", class04822.L().N(45, 41).N(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, var0), class04838.N(5.5F, 3.0F, 3.0F, 0.0F, (float) (Math.PI / 2), 0.0F)
      );
      byte b0 = 4;
      byte b1 = 14;
      class04822 class04822 = class04822.L().N(29, 29).N(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var0);
      class04839.N("right_hind_leg", class04822, class04838.N(-3.5F, 10.0F, 6.0F));
      class04839.N("left_hind_leg", class04822, class04838.N(3.5F, 10.0F, 6.0F));
      class04839.N("right_front_leg", class04822, class04838.N(-3.5F, 10.0F, -5.0F));
      class04839.N("left_front_leg", class04822, class04838.N(3.5F, 10.0F, -5.0F));
      return class04806.N(class04792, 128, 64);
   }

   public void method_2819(class08464 var1) {
      super.method_2819(var1);
      this.y.i = var1.h * (float) (Math.PI / 180.0);
      this.y.R = var1.D * (float) (Math.PI / 180.0);
      float f = var1.Ny;
      float f1 = var1.NN;
      this.L.i = class04995.P(f1 * 0.6662F) * 1.4F * f;
      this.u.i = class04995.P(f1 * 0.6662F + (float) Math.PI) * 1.4F * f;
      this.i.i = class04995.P(f1 * 0.6662F + (float) Math.PI) * 1.4F * f;
      this.R.i = class04995.P(f1 * 0.6662F) * 1.4F * f;
      this.M.U = var1.y;
      this.B.U = var1.y;
   }

   private static class04792 N(class04792 var0) {
      float f = 2.0F;
      float f1 = 0.7F;
      float f2 = 1.1F;
      UnaryOperator unaryoperator = var0x -> var0x.L(0.0F, 21.0F, 3.52F).u(0.71428573F, 0.64935064F, 0.7936508F);
      UnaryOperator unaryoperator1 = var0x -> var0x.L(0.0F, 33.0F, 0.0F).u(0.625F, 0.45454544F, 0.45454544F);
      UnaryOperator unaryoperator2 = var0x -> var0x.L(0.0F, 33.0F, 0.0F).u(0.45454544F, 0.41322312F, 0.45454544F);
      class04792 class04792 = new class04792();

      for (Entry entry : var0.N().y()) {
         String s = (String)entry.getKey();
         class04839 class04839 = (class04839)entry.getValue();

         UnaryOperator unaryoperator3 = switch (s) {
            case "head" -> unaryoperator;
            case "body" -> unaryoperator1;
            default -> unaryoperator2;
         };
         class04792.N().N(s, class04839.N(unaryoperator3));
      }

      return class04792;
   }
}
