package minecraft;

import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public interface class04506 {
   void N(class07078<?> var1, class06069 var2);

   @Nullable
   static class00392 N(@Nullable class08983<class00404<?>> var0, String var1) {
      return var0 == null
         ? null
         : var0.y()
            .W(var1)
            .flatMap(var0x -> var0x.W("entity"))
            .flatMap(var0x -> var0x.N_15("id", class07078.N))
            .map(var0x -> class00392.L(var0x.R()).N(class06541.field_1080))
            .orElse(null);
   }

   static void N(@Nullable class08983<class00404<?>> var0, Consumer<class00392> var1, String var2) {
      class00392 class00392 = N(var0, var2);
      if (class00392 != null) {
         var1.accept(class00392);
      } else {
         var1.accept(class05220.N);
         var1.accept(class00392.L("block.minecraft.spawner.desc1").N(class06541.field_1080));
         var1.accept(class05220.N().y(class00392.L("block.minecraft.spawner.desc2").N(class06541.field_1078)));
      }
   }
}
