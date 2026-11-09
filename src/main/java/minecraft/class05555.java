package minecraft;

import com.mojang.serialization.MapCodec;

public class class05555 extends class00864 implements class00873 {
   public static final MapCodec<class05555> N = y(class05555::new);
   private static final class00494 y = class00389.N(class00891.y(16.0, 8.0, 16.0), class00891.y(4.0, 0.0, 8.0));

   public class05555(class01362 var1) {
      super(var1);
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      class03707.i.N(var1, var1.method_14178().U(), var3, var4, var2);
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return var1.field_9229.z() < 0.45;
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   public MapCodec<class05555> N() {
      return N;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return var1.method_8316(var2.method_10084()).W();
   }

   @Override
   protected boolean N(class00500 var1, class07290 var2, class07209 var3) {
      return var1.N(class00869.in) || super.N(var1, var2, var3);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return y;
   }
}
