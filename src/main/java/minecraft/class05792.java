package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class class05792 extends DataFix {
   private static final int N = 16;

   private static <T> Dynamic<T> L(Dynamic<T> var0) {
      return (Dynamic<T>)DataFixUtils.orElse(
         var0.get("TileTicks")
            .asStreamOpt()
            .result()
            .map(
               var1 -> {
                  List list = IntStream.range(0, 16).mapToObj(var0xx -> new ShortArrayList()).collect(Collectors.toList());
                  var1.forEach(var1x -> {
                     int i = var1x.get("x").asInt(0);
                     int j = var1x.get("y").asInt(0);
                     int k = var1x.get("z").asInt(0);
                     short short1 = N(i, j, k);
                     ((ShortList)list.get(j >> 4)).add(short1);
                  });
                  return var0.remove("TileTicks")
                     .set(
                        "ToBeTicked",
                        var0.createList(list.stream().map(var1x -> var0.createList(var1x.intStream().mapToObj(var1xx -> var0.createShort((short)var1xx)))))
                     );
               }
            ),
         var0
      );
   }

   public class05792(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static <T> Dynamic<T> y(Dynamic<T> var0) {
      return var0.update("Biomes", var1 -> (Dynamic)DataFixUtils.orElse(var1.asByteBufferOpt().result().map(var1x -> {
         int[] aint = new int[256];

         for (int i = 0; i < aint.length; i++) {
            if (i < var1x.capacity()) {
               aint[i] = var1x.get(i) & 255;
            }
         }

         return var0.createIntList(Arrays.stream(aint));
      }), var1));
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0) {
      boolean flag = var0.get("TerrainPopulated").asBoolean(false);
      boolean flag1 = var0.get("LightPopulated").asNumber().result().isEmpty() || var0.get("LightPopulated").asBoolean(false);
      String s;
      if (flag) {
         if (flag1) {
            s = "mobs_spawned";
         } else {
            s = "decorated";
         }
      } else {
         s = "carved";
      }

      return L(y(var0)).set("Status", var0.createString(s)).set("hasLegacyStructureData", var0.createBoolean(true));
   }

   private static short N(int var0, int var1, int var2) {
      return (short)(var0 & 15 | (var1 & 15) << 4 | (var2 & 15) << 8);
   }

   public TypeRewriteRule makeRule() {
      return this.writeFixAndRead(
         "ChunkToProtoChunkFix",
         this.getInputSchema().getType(class06962.u),
         this.getOutputSchema().getType(class06962.u),
         var0 -> var0.update("Level", class05792::N)
      );
   }
}
