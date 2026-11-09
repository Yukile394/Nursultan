package minecraft;

import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.function.Supplier;

public class class07137 extends class00891 {
   public static final MapCodec<class07137> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class04206.i.T().fieldOf("host").forGetter(class07137::y), t()).apply(var0, class07137::new)
   );
   private final class00891 y;
   private static final Map<class00891, class00891> L = Maps.newIdentityHashMap();
   private static final Map<class00500, class00500> u = Maps.newIdentityHashMap();
   private static final Map<class00500, class00500> i = Maps.newIdentityHashMap();

   public class00500 T(class00500 var1) {
      return N(i, var1, () -> this.y().W());
   }

   public class07137(class00891 var1, class01362 var2) {
      super(var2.i(var1.Y() / 2.0F).R(0.75F));
      this.y = var1;
      L.put(var1, this);
   }

   public static boolean U(class00500 var0) {
      return L.containsKey(var0.i());
   }

   public class00891 y() {
      return this.y;
   }

   public static class00500 E(class00500 var0) {
      return N(u, var0, () -> L.get(var0.i()).W());
   }

   @Override
   public MapCodec<? extends class07137> N() {
      return N;
   }

   private void N(class04782 var1, class07209 var2) {
      class07147 class07147 = class07078.yW.N(var1, class06113.field_16461);
      if (class07147 != null) {
         class07147.method_5808(var2.method_10263() + 0.5, var2.method_10264(), var2.method_10260() + 0.5, 0.0F, 0.0F);
         var1.method_8649(class07147);
         class07147.h();
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06584 var4, boolean var5) {
      super.N(var1, var2, var3, var4, var5);
      if (var2.method_64395().N(class07305.u) && !class07323.N(var4, class02625.v)) {
         this.N(var2, var3);
      }
   }

   private static class00500 N(Map<class00500, class00500> var0, class00500 var1, Supplier<class00500> var2) {
      return var0.computeIfAbsent(var1, var1x -> {
         class00500 class00500 = (class00500)var2.get();

         for (class08092 class08092 : var1x.y()) {
            class00500 = class00500.y(class08092) ? class00500.y(class08092, var1x.L(class08092)) : class00500;
         }

         return class00500;
      });
   }
}
