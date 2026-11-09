package minecraft;

import com.mojang.serialization.MapCodec;

public class class00741 extends class00891 {
   public static final MapCodec<class00741> u = y(class00741::new);

   public class00741(class01362 var1) {
      super(var1);
   }

   @Override
   protected boolean y(class00500 var1, class00500 var2, class07211 var3) {
      return var2.N(this) ? true : super.y(var1, var2, var3);
   }

   @Override
   protected MapCodec<? extends class00741> N() {
      return u;
   }
}
