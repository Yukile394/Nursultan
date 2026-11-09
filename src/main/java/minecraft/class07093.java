package minecraft;

import com.mojang.serialization.MapCodec;

public class class07093 extends class07732 {
   public static final MapCodec<class07093> N = y(class07093::new);

   public class07093(class01362 var1) {
      super(var1);
   }

   @Override
   public MapCodec<class07093> N() {
      return N;
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      super.N_20(var1, var2, var3, var4);
      if (var4.y(10) == 0) {
         var2.method_8406(class07107.Nu, var3.method_10263() + var4.U(), var3.method_10264() + 1.1, var3.method_10260() + var4.U(), 0.0, 0.0, 0.0);
      }
   }
}
