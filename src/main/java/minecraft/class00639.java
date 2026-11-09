package minecraft;

import com.mojang.serialization.MapCodec;

public class class00639 extends class00860 {
   public static final MapCodec<class00639> N = y(class00639::new);

   @Override
   protected class04907<class01894> T() {
      return class01235.Z.y(class01235.NU);
   }

   public class00639(class01362 var1) {
      super(() -> class00404.field_11891, class04909.Rb, class04909.Rs, var1);
   }

   @Override
   protected int y(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var4 == class07211.field_11036 ? var1.N(var2, var3, var4) : 0;
   }

   @Override
   protected int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return class04995.N(class00379.N(var2, var3), 0, 15);
   }

   @Override
   public MapCodec<class00639> N() {
      return N;
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class00476(var1, var2);
   }

   @Override
   protected boolean i_(class00500 var1) {
      return true;
   }
}
