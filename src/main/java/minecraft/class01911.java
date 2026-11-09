package minecraft;

import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;

public class class01911 implements class07135 {
   private static final Logger N = LogUtils.getLogger();
   private final Path i;
   private final CompletableFuture<class01929> R;
   private static final MapCodec<class05946<class00780>> M = class05946.N(class04227.NA).fieldOf("biome");
   private static final Codec<class03221<class05946<class00780>>> B = class03221.N(M).fieldOf("biomes").codec();

   public class01911(class01996 var1, CompletableFuture<class01929> var2) {
      super();
      this.i = var1.method_45972(class02024.field_39369).resolve("biome_parameters");
      this.R = var2;
   }

   private static <E> CompletableFuture<?> N(Path var0, class04476 var1, DynamicOps<JsonElement> var2, Encoder<E> var3, E var4) {
      Optional optional = var3.encodeStart(var2, var4).resultOrPartial(var1x -> N.error("Couldn't serialize element {}: {}", var0, var1x));
      return optional.isPresent() ? class07135.N(var1, (JsonElement)optional.get(), var0) : CompletableFuture.completedFuture(null);
   }

   private Path N(class01894 var1) {
      return this.i.resolve(var1.y()).resolve(var1.N() + ".json");
   }

   @Override
   public String method_10321() {
      return "Biome Parameters";
   }

   @Override
   public CompletableFuture<?> method_10319(class04476 var1) {
      return this.R.thenCompose(var2 -> {
         class03519 class03519 = var2.N(JsonOps.INSTANCE);
         ArrayList arraylist = new ArrayList();
         class03573.y().forEach((var4x, var5) -> arraylist.add(N(this.N(var4x.y()), var1, class03519, B, var5)));
         return CompletableFuture.allOf(arraylist.toArray(CompletableFuture[]::new));
      });
   }
}
