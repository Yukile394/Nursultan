package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class08373(class06428 keybind) implements class08909 {
   private static final Codec<class06428> L = Codec.STRING.comapFlatMap(var0 -> {
      class06428 class06428 = class06428.y(var0);
      return class06428 != null ? DataResult.success(class06428) : DataResult.error(() -> "Invalid keybind: " + var0);
   }, class06428::U);
   public static final MapCodec<class08373> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(L.fieldOf("keybind").forGetter(class08373::y)).apply(var0, class08373::new)
   );

   public class08373(class06428 keybind) {
      this.keybind = keybind;
   }

   public class06428 y() {
      return this.keybind;
   }

   @Override
   public MapCodec<class08373> N() {
      return N;
   }

   @Override
   public boolean method_65638(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      return this.keybind.R();
   }
}
