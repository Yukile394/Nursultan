package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;

public class class06121 extends class07193 {
   public static final MapCodec<class06121> N = y(class06121::new);
   private static final class00392 y = class00392.L("container.grindstone_title");
   private final Function<class00500, class00494> u;

   private class00494 T(class00500 var1) {
      return this.u.apply(var1);
   }

   public class06121(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(R, class07211.field_11043).y(L, class06657.field_12471));
      this.u = this.y();
   }

   @Override
   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.T(var1);
   }

   private Function<class00500, class00494> y() {
      class00494 class00494x = class00389.N(class00891.N(2.0, 6.0, 7.0, 4.0, 10.0, 16.0), class00891.N(2.0, 5.0, 3.0, 4.0, 11.0, 9.0));
      class00494 class00494x = class00389.N(class00494x, class01372.field_23323);
      Map<class06657, Map<class07211, class00494>> map = class00389.i(class00389.N(class00891.N(8.0, 2.0, 14.0, 0.0, 12.0), class00494x, class00494x));
      return this.N(var1x -> map.get(var1x.L(L)).get(var1x.L(R)));
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(R, L);
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(R)));
   }

   @Override
   public MapCodec<class06121> N() {
      return N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.T(var1);
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!var2.method_8608()) {
         var4.method_17355(var1.N(var2, var3));
         var4.method_7281(class01235.NI);
      }

      return class07082.N;
   }

   @Override
   protected class06237 N(class00500 var1, class07299 var2, class07209 var3) {
      return new class03965((var2x, var3x, var4) -> new class05262(var2x, var3x, class05880.N(var2, var3)), y);
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(R, var2.N(var1.L(R)));
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return true;
   }
}
