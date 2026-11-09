package minecraft;

import com.mojang.serialization.MapCodec;

public class class07112 extends class07101 {
   public static final MapCodec<class07112> N = y(class07112::new);
   private static final class00392 y = class00392.L("container.loom");

   public class07112(class01362 var1) {
      super(var1);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(R);
   }

   @Override
   public MapCodec<class07112> N() {
      return N;
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(R, var1.method_8042().b());
   }

   @Override
   protected class06237 N(class00500 var1, class07299 var2, class07209 var3) {
      return new class03965((var2x, var3x, var4) -> new class06951(var2x, var3x, class05880.N(var2, var3)), y);
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!var2.method_8608()) {
         var4.method_17355(var1.N(var2, var3));
         var4.method_7281(class01235.Nw);
      }

      return class07082.N;
   }
}
