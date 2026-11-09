package minecraft;

import com.mojang.serialization.MapCodec;

public class class01126 extends class00865 {
   public static final MapCodec<class01126> u = y(class01126::new);
   private static final class00494 i = class00891.y(12.0, 4.0, 15.0);
   private static final class00494 R = class00389.N(class00865.y, i);

   public class01126(class01362 var1) {
      super(var1, class04823.i);
   }

   @Override
   protected double U(class00500 var1) {
      return 0.9375;
   }

   @Override
   public boolean E(class00500 var1) {
      return true;
   }

   @Override
   public MapCodec<class01126> N() {
      return u;
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      return 3;
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      var5.N(class08397.field_61896);
      var5.N(class08397.field_56644);
      var5.y(class08397.field_56644, class07049::method_5730);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class07049 var4) {
      return R;
   }
}
