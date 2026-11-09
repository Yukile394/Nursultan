package minecraft;

import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.gamerule.v1.CustomGameRuleCategory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class05218 extends class06318<class05211> {
   private static final int y = 24;
   private final Map L;

   public class05218(class05191 var1, class07305 var2) {
      super(class06202.Nq(), var1.field_22789, var1.N.u(), var1.N.L(), 24);
      this.N = var1;
      this.L = new HashMap();
      HashMap hashmap = Maps.newHashMap();
      var2.N(new class05229(this, var1, hashmap));
      hashmap.entrySet().stream().sorted(Entry.comparingByKey(Comparator.comparing(class05086::N))).forEach(var1x -> {
         this.method_25321(new class05221(this.N, ((class05086)var1x.getKey()).y().N(class06541.field_1067, class06541.field_1054)));
         ((Map)var1x.getValue()).entrySet().stream().sorted(Entry.comparingByKey(Comparator.comparing(class06839::L))).forEach(var1xx -> {
            CallbackInfo callbackinfo = new CallbackInfo("", true);
            this.N(var1xx, callbackinfo);
            if (!callbackinfo.isCancelled()) {
               this.method_25321((class05211)var1xx.getValue());
            }
         });
      });
      this.N(var1, var2, null);
   }

   private void N(Entry var1, CallbackInfo var2) {
      CustomGameRuleCategory.getCategory((class06839)var1.getKey()).ifPresent(var3 -> {
         this.L.computeIfAbsent(var3, var0 -> new ArrayList<>()).add((class05211)var1.getValue());
         var2.cancel();
      });
   }

   private void N(class05191 var1, class07305 var2, CallbackInfo var3) {
      this.L.forEach((var2x, var3x) -> {
         Objects.requireNonNull(var1);
         this.method_25321(new class05221(var1, var2x.getName()));

         for (class05211 class05211 : var3x) {
            this.method_25321(class05211);
         }
      });
   }

   @Override
   public void method_48579(class01054 var1, int var2, int var3, float var4) {
      super.method_48579(var1, var2, var3, var4);
      class05211 class05211 = this.method_37019();
      if (class05211 != null && class05211.field_24311 != null) {
         var1.N(class05211.field_24311, var2, var3);
      }
   }
}
