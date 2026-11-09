package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.fabricmc.fabric.mixin.content.registry.HoeItemAccessor;

public class class06561 extends class06581 implements HoeItemAccessor {
   protected static final Map<class00891, Pair<Predicate<class06501>, Consumer<class06501>>> N = Maps.newHashMap(
      ImmutableMap.of(
         class00869.Z,
         Pair.of(class06561::y, N(class00869.Lr.W())),
         class00869.Ek,
         Pair.of(class06561::y, N(class00869.Lr.W())),
         class00869.z,
         Pair.of(class06561::y, N(class00869.Lr.W())),
         class00869.U,
         Pair.of(class06561::y, N(class00869.z.W())),
         class00869.nM,
         Pair.of((Predicate<class06501>)var0 -> true, N(class00869.z.W(), class06570.iM))
      )
   );

   public class06561(class02749 var1, float var2, float var3, class06573 var4) {
      super(var4.L(var1, var2, var3));
   }

   public static boolean y(class06501 var0) {
      return var0.method_8038() != class07211.field_11033 && var0.method_8045().method_8320(var0.method_8037().method_10084()).P();
   }

   private boolean N(class07299 var1, class07049 var2, class07209 var3, class04891 var4, class04911 var5, float var6, float var7) {
      return !DebugSettings.INSTANCE.serversidePlaceSounds.isEnabled();
   }

   @Override
   public class07082 N(class06501 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();
      Pair<Predicate<class06501>, Consumer<class06501>> pair = N.get(class07299.method_8320(class07209).i());
      if (pair == null) {
         return class07082.i;
      } else {
         Predicate<class06501> predicate = (Predicate<class06501>)pair.getFirst();
         Consumer<class06501> consumer = (Consumer<class06501>)pair.getSecond();
         if (predicate.test(var1)) {
            class08036 class08036 = var1.method_8036();
            float f1 = 1.0F;
            float f = 1.0F;
            class04911 class04911 = class04911.field_15245;
            class04891 class04891 = class04909.PE;
            if (this.N(class07299, class08036, class07209, class04891, class04911, f, f1)) {
               class07299.method_8396(class08036, class07209, class04891, class04911, f, f1);
            }

            if (!class07299.method_8608()) {
               consumer.accept(var1);
               if (class08036 != null) {
                  var1.method_8041().N(1, class08036, var1.method_20287().N());
               }
            }

            return class07082.N;
         } else {
            return class07082.i;
         }
      }
   }

   public static Consumer<class06501> N(class00500 var0) {
      return var1 -> {
         var1.method_8045().method_8652(var1.method_8037(), var0, 11);
         var1.method_8045().N(class01194.L, var1.method_8037(), class01164.N(var1.method_8036(), var0));
      };
   }

   public static Consumer<class06501> N(class00500 var0, class07310 var1) {
      return var2 -> {
         var2.method_8045().method_8652(var2.method_8037(), var0, 11);
         var2.method_8045().N(class01194.L, var2.method_8037(), class01164.N(var2.method_8036(), var0));
         class00891.N(var2.method_8045(), var2.method_8037(), var2.method_8038(), new class06584(var1));
      };
   }
}
