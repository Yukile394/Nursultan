package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01002 {
   private static final Logger M = LogUtils.getLogger();
   private static final float B = 0.1F;
   public static final class04540<class01016> N = class04540.N();
   public static final class01002 y = new class01003().N();
   public static final MapCodec<class01002> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter(var0x -> var0x.u),
            Codec.simpleMap(
                  class07428.field_24655, class04540.N(class01016.N).promotePartial(class07536.N("Spawn data: ", M::error)), class05033.y(class07428.values())
               )
               .fieldOf("spawners")
               .forGetter(var0x -> var0x.i),
            Codec.simpleMap(class04206.M.T(), class01043.N, class04206.M).fieldOf("spawn_costs").forGetter(var0x -> var0x.R)
         )
         .apply(var0, class01002::new)
   );
   public float u;
   public Map<class07428, class04540<class01016>> i;
   public Map<class07078<?>, class01043> R;

   class01002(float var1, Map<class07428, class04540<class01016>> var2, Map<class07078<?>, class01043> var3) {
      super();
      this.u = var1;
      this.i = ImmutableMap.copyOf(var2);
      this.R = ImmutableMap.copyOf(var3);
      this.N(var1, var2, var3, null);
   }

   private void N(float var1, Map var2, Map var3, CallbackInfo var4) {
      EnumMap enummap = Maps.newEnumMap(class07428.class);

      for (Entry entry : this.i.entrySet()) {
         enummap.put((class07428)entry.getKey(), (class04540)entry.getValue());
      }

      this.i = enummap;
   }

   public class04540<class01016> N(class07428 var1) {
      return this.i.getOrDefault(var1, N);
   }

   @Nullable
   public class01043 N(class07078<?> var1) {
      return this.R.get(var1);
   }

   public float N() {
      return this.u;
   }
}
