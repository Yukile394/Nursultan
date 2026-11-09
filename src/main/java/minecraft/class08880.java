package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.model.loading.CustomUnbakedBlockStateModelRegistry;

@Environment(EnvType.CLIENT)
public interface class08880 extends class08389 {
   Codec<class04523<class03674>> N = RecordCodecBuilder.create(
      var0 -> var0.group(class03674.N.forGetter(class04523::N), class06338.b.optionalFieldOf("weight", 1).forGetter(class04523::y))
         .apply(var0, class04523::new)
   );
   Codec<class00177> y = class06338.y(N.listOf())
      .flatComapMap(var0 -> new class00177(class04540.N(Lists.transform(var0, var0x -> var0x.N(class08883::new)))), var0 -> {
         List list = var0.y().u();
         ArrayList arraylist = new ArrayList(list.size());

         for (class04523 class04523 : list) {
            if (!(class04523.N() instanceof class08883 class08883)) {
               return DataResult.error(() -> "Only single variants are supported");
            }

            arraylist.add(new class04523<>(class08883.y(), class04523.y()));
         }

         return DataResult.success(arraylist);
      });
   Codec<class08880> L = Codec.either(y, class08883.u).flatComapMap(var0 -> (class08880)var0.map(var0x -> var0x, var0x -> var0x), var0 -> {
      return switch (var0) {
         case class08883 class08883 -> DataResult.success(Either.right((class08883)var0));
         case class00177 class00177 -> DataResult.success(Either.left((class00177)var0));
         default -> DataResult.error(() -> "Only a single variant or a list of variants are supported");
      };
   });

   private static Codec y(Codec var0, Function var1, Function var2) {
      return CustomUnbakedBlockStateModelRegistry.MODEL_CODEC;
   }

   private static Codec N(Codec var0, Function var1, Function var2) {
      return CustomUnbakedBlockStateModelRegistry.WEIGHTED_MODEL_CODEC;
   }

   default class08889 N() {
      return new class08864(this);
   }

   class08887 method_68521(class02028 var1);
}
