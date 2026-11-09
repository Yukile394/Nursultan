package minecraft;

import com.mojang.serialization.MapCodec;

public class class05439 extends class00891 {
   public static final MapCodec<class05439> N = y(class05439::new);

   public class05439(class01362 var1) {
      super(var1);
   }

   @Override
   public MapCodec<? extends class05439> N() {
      return N;
   }

   @Override
   protected void N(class07299 var1, class00500 var2, class06183 var3, class08005 var4) {
      if (!var1.method_8608()) {
         class07209 class07209 = var3.u();
         var1.method_8396(null, class07209, class04909.g, class04911.field_15245, 1.0F, 0.5F + var1.field_9229.z() * 1.2F);
      }
   }
}
