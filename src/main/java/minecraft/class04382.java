package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.Optional;

public class class04382 {
   public static final Codec<class04382> N = RecordCodecBuilder.create(
         var0 -> var0.group(Codec.unboundedMap(class05946.N(class04227.yI), class01255.N).fieldOf("dimensions").forGetter(var0x -> var0x.L))
            .apply(var0, class04382::new)
      )
      .validate(class04382::N);
   public static final Codec<class03556<class04382>> y = class01281.N(class04227.yO, N);
   private final Map<class05946<class01255>, class01255> L;

   private ImmutableMap<class05946<class01255>, class01255> L() {
      Builder builder = ImmutableMap.builder();
      class03764.N(this.L.keySet().stream()).forEach(var2 -> {
         class01255 class01255 = this.L.get(var2);
         if (class01255 != null) {
            builder.put(var2, class01255);
         }
      });
      return builder.build();
   }

   public class04382(Map<class05946<class01255>, class01255> var1) {
      super();
      this.L = var1;
   }

   public Optional<class01255> y() {
      return Optional.ofNullable(this.L.get(class01255.y));
   }

   private static DataResult<class04382> N(class04382 var0) {
      return var0.y().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success(var0, Lifecycle.stable());
   }

   public class03764 N() {
      return new class03764(this.L());
   }
}
