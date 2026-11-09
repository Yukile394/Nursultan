package minecraft;

public class class02322 extends class02840<class07870, class08471, class04529> {
   private static final class01894 N = class01894.y("textures/entity/fish/salmon.png");
   private final class04529 i;
   private final class04529 R;
   private final class04529 M;

   public class02322(class04832 var1) {
      super(var1, new class04529(var1.N(class04802.LC)), 0.4F);
      this.i = new class04529(var1.N(class04802.Lx));
      this.R = new class04529(var1.N(class04802.LC));
      this.M = new class04529(var1.N(class04802.LS));
   }

   public class08471 method_55269() {
      return new class08471();
   }

   public void method_62354(class07870 var1, class08471 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.Q();
   }

   public class01894 N(class08471 var1) {
      return N;
   }

   protected void y(class08471 var1, class01421 var2, float var3, float var4) {
      super.y(var1, var2, var3, var4);
      float f = 1.0F;
      float f1 = 1.0F;
      if (!var1.NZ) {
         f = 1.3F;
         f1 = 1.7F;
      }

      float f2 = f * 4.3F * class04995.m(f1 * 0.6F * var1.P);
      var2.N(class02058.u.N(f2));
      if (!var1.NZ) {
         var2.N(0.2F, 0.1F, 0.0F);
         var2.N(class02058.R.N(90.0F));
      }
   }

   public void method_3936(class08471 var1, class01421 var2, class01237 var3, class06959 var4) {
      this.y = switch (var1.N) {
         case field_52470 -> this.i;
         case field_52471 -> this.R;
         case field_52472 -> this.M;
      };
      super.method_3936(var1, var2, var3, var4);
   }
}
