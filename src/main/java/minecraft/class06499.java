package minecraft;

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import net.fabricmc.fabric.mixin.content.registry.ShovelItemAccessor;

public class class06499 extends class06581 implements ShovelItemAccessor {
   protected static final Map<class00891, class00500> N = Maps.newHashMap(
      new Builder()
         .put(class00869.Z, class00869.Ek.W())
         .put(class00869.z, class00869.Ek.W())
         .put(class00869.E, class00869.Ek.W())
         .put(class00869.U, class00869.Ek.W())
         .put(class00869.RC, class00869.Ek.W())
         .put(class00869.nM, class00869.Ek.W())
         .build()
   );

   public class06499(class02749 var1, float var2, float var3, class06573 var4) {
      super(var4.u(var1, var2, var3));
   }

   @Override
   public class07082 N(class06501 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();
      class00500 class00500xx = class07299.method_8320(class07209);
      if (var1.method_8038() == class07211.field_11033) {
         return class07082.i;
      } else {
         class08036 class08036 = var1.method_8036();
         Map map1 = N;
         class00891 class00891 = class00500xx.i();
         Map<class00891, class00500> map = map1;
         class00500 class00500x = (class00500)this.N(map, class00891);
         class00500 class00500xx = null;
         if (class00500x != null && class07299.method_8320(class07209.method_10084()).P()) {
            class07299.method_8396(class08036, class07209, class04909.wF, class04911.field_15245, 1.0F, 1.0F);
            class00500xx = class00500x;
         } else if (class00500xx.i() instanceof class05847 && class00500xx.L(class05847.y)) {
            if (!class07299.method_8608()) {
               class07299.method_8444(null, 1009, class07209, 0);
            }

            class05847.N(var1.method_8036(), class07299, class07209, class00500xx);
            class00500xx = class00500xx.y(class05847.y, false);
         }

         if (class00500xx != null) {
            if (!class07299.method_8608()) {
               class07299.method_8652(class07209, class00500xx, 11);
               class07299.N(class01194.L, class07209, class01164.N(class08036, class00500xx));
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

   private Object N(Map var1, Object var2) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) ? null : var1.get(var2);
   }
}
