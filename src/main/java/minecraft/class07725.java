package minecraft;

import com.mojang.serialization.MapCodec;

public class class07725 extends class06761 implements class00873 {
   public static final MapCodec<class07725> L = y(class07725::new);

   public class07725(class01362 var1) {
      super(var1);
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      N_21(var1, var3, new class06584(this));
   }

   @Override
   public MapCodec<class07725> N() {
      return L;
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return true;
   }
}
