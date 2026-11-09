package minecraft;

public class class03122 extends class02941<class07541, class08278, class04817> {
   private static final class01894 N = class01894.y("textures/entity/zombie/drowned.png");

   public class03122(class04832 var1) {
      super(
         var1,
         new class04817(var1.N(class04802.Nc)),
         new class04817(var1.N(class04802.NX)),
         class08118.N(class04802.NF, var1.R(), class04817::new),
         class08118.N(class04802.Na, var1.R(), class04817::new)
      );
      this.N(new class02577(this, var1.R()));
   }

   public class08278 method_55269() {
      return new class08278();
   }

   @Override
   public class01894 N(class08278 var1) {
      return N;
   }

   protected void y(class08278 var1, class01421 var2, float var3, float var4) {
      super.y(var1, var2, var3, var4);
      float f = var1.L;
      if (f > 0.0F) {
         float f1 = -10.0F - var1.h;
         float f2 = class04995.B(f, 0.0F, f1);
         var2.N(class02058.y.N(f2), 0.0F, var1.T / 2.0F / var4, 0.0F);
      }
   }

   protected class01180 N(class07541 var1, class07070 var2) {
      class06584 class06584 = var1.method_61420(var2);
      return var1.method_6068() == var2 && var1.Nl() && class06584.N(class06570.db) ? class01180.field_63542 : super.N((class07541)var1, var2);
   }
}
