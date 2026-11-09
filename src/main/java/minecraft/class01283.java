package minecraft;

import Nursultan.class09456;
import java.util.function.UnaryOperator;

public interface class01283 {
   UnaryOperator<class00392> N = UnaryOperator.identity();
   class01283 y = N(N, true);
   class01283 L = N(N("pack.source.builtin"), true);
   class01283 u = N(N("pack.source.feature"), false);
   class01283 i = N(N("pack.source.world"), true);
   class01283 R = N(N("pack.source.server"), true);

   private static UnaryOperator<class00392> N(String var0) {
      return var1 -> class00392.N("pack.nameAndSource", var1, var0x).N(class06541.field_1080);
   }

   static class01283 N(UnaryOperator<class00392> var0, boolean var1) {
      return new class09456(var0, var1);
   }

   class00392 method_45282(class00392 var1);

   boolean method_45279();
}
