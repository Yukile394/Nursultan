package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class class06901 extends class00891 {
   public static final class06667 y = class06665.c;
   public static final class06667 L = class06665.X;
   public static final class06667 u = class06665.a;
   public static final class06667 i = class06665.p;
   public static final class06667 R = class06665.e;
   public static final class06667 M = class06665.H;
   public static final Map<class07211, class06667> B = ImmutableMap.copyOf(
      Maps.newEnumMap(
         Map.of(
            class07211.field_11043,
            y,
            class07211.field_11034,
            L,
            class07211.field_11035,
            u,
            class07211.field_11039,
            i,
            class07211.field_11036,
            R,
            class07211.field_11033,
            M
         )
      )
   );
   private final Function<class00500, class00494> N;

   public class06901(float var1, class01362 var2) {
      super(var2);
      this.N = this.N(var1);
   }

   @Override
   protected boolean y(class00500 var1) {
      return false;
   }

   private Function<class00500, class00494> N(float var1) {
      class00494 class00494 = class00891.N((double)var1);
      Map map = class00389.u(class00891.L(var1, 0.0, 8.0));
      return this.N(var2x -> {
         class00494 class00494x = class00494;

         for (Entry entry : B.entrySet()) {
            if (var2x.<Boolean>L((class08092<Boolean>)entry.getValue())) {
               class00494x = class00389.N((class00494)map.get(entry.getKey()), class00494x);
            }
         }

         return class00494x;
      });
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.N.apply(var1);
   }

   @Override
   protected abstract MapCodec<? extends class06901> N();
}
