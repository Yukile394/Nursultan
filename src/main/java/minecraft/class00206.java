package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00206(class06826 gameRulesMap) implements class00225 {
   public static final MapCodec<class00206> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06826.N.fieldOf("rules").forGetter(class00206::y)).apply(var0, class00206::new)
   );

   public class00206(class06826 gameRulesMap) {
      this.gameRulesMap = gameRulesMap;
   }

   @Override
   public void y(class04782 var1) {
      this.gameRulesMap.y().forEach(var2 -> this.N(var1, (class06839<?>)var2));
   }

   public class06826 y() {
      return this.gameRulesMap;
   }

   @Override
   public MapCodec<class00206> N() {
      return L;
   }

   private <T> void N(class04782 var1, class06839<T> var2) {
      var1.method_64395().N(var2, var2.Z(), var1.method_8503());
   }

   @Override
   public void N(class04782 var1) {
      class07305 class07305 = var1.method_64395();
      class02796 class02796 = var1.method_8503();
      class07305.N(this.gameRulesMap, class02796);
   }
}
