package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import org.slf4j.Logger;

public record class04127(Optional<class04123> simpleModels, Optional<class04125> multiPart) {
   static final Logger N = LogUtils.getLogger();
   public static final Codec<class04127> y = RecordCodecBuilder.create(
         var0 -> var0.group(
               class04123.N.optionalFieldOf("variants").forGetter(class04127::N), class04125.N.optionalFieldOf("multipart").forGetter(class04127::y)
            )
            .apply(var0, class04127::new)
      )
      .validate(
         var0 -> var0.N().isEmpty() && var0.y().isEmpty() ? DataResult.error(() -> "Neither 'variants' nor 'multipart' found") : DataResult.success(var0)
      );

   public class04127(Optional<class04123> simpleModels, Optional<class04125> multiPart) {
      this.simpleModels = simpleModels;
      this.multiPart = multiPart;
   }

   public Optional<class04125> y() {
      return this.multiPart;
   }

   public Map<class00500, class08889> N(class00507<class00891, class00500> var1, Supplier<String> var2) {
      IdentityHashMap identityhashmap = new IdentityHashMap();
      this.simpleModels.ifPresent(var3x -> var3x.N(var1, var2, (var1xx, var2xx) -> {
         if (identityhashmap.put(var1xx, var2xx) != null) {
            throw new IllegalArgumentException("Overlapping definition on state: " + var1xx);
         }
      }));
      this.multiPart.ifPresent(var2x -> {
         ImmutableList immutablelist = var1.N();
         class08855 class08855 = var2x.N(var1);

         for (class00500 class00500 : immutablelist) {
            identityhashmap.putIfAbsent(class00500, class08855);
         }
      });
      return identityhashmap;
   }

   public Optional<class04123> N() {
      return this.simpleModels;
   }
}
