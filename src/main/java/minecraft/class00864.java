package minecraft;

import com.mojang.serialization.MapCodec;

public abstract class class00864 extends class00891 {
   public class00864(class01362 var1) {
      super(var1);
   }

   @Override
   protected boolean y(class00500 var1) {
      return var1.Y().W();
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return var2 == class08791.field_51 && !this.I ? true : super.N(var1, var2);
   }

   @Override
   public class00500 N(class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8) {
      return !var1.N(var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   protected boolean N(class00500 var1, class07290 var2, class07209 var3) {
      return var1.N(class01210.Ni) || var1.N(class00869.Lr);
   }

   @Override
   protected abstract MapCodec<? extends class00864> N();

   @Override
   public boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07209 class07209 = var3.method_10074();
      return this.N(var2.method_8320(class07209), var2, class07209);
   }
}
