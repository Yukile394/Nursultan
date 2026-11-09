package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import org.jspecify.annotations.Nullable;

public record class05534(class08983<class07078<?>> entityData, int ticksInHive, int minTicksInHive) {
   public static final Codec<class05534> L = RecordCodecBuilder.create(
      var0 -> var0.group(
            class08983.N(class07078.N).fieldOf("entity_data").forGetter(class05534::N),
            Codec.INT.fieldOf("ticks_in_hive").forGetter(class05534::y),
            Codec.INT.fieldOf("min_ticks_in_hive").forGetter(class05534::L)
         )
         .apply(var0, class05534::new)
   );
   public static final Codec<List<class05534>> u = L.listOf();
   public static final class02362<class04247, class05534> i = class02362.N(
      class08983.N(class07078.y), class05534::N, class02389.B, class05534::y, class02389.B, class05534::L, class05534::new
   );

   public int L() {
      return this.minTicksInHive;
   }

   public class05534(class08983<class07078<?>> entityData, int ticksInHive, int minTicksInHive) {
      super();
      this.entityData = entityData;
      this.ticksInHive = ticksInHive;
      this.minTicksInHive = minTicksInHive;
   }

   public int y() {
      return this.ticksInHive;
   }

   @Nullable
   public class07049 N(class07299 var1, class07209 var2) {
      class07001 class07001 = this.entityData.L();
      class04620.y.forEach(class07001::b);
      class07049 class07049 = class07078.N(this.entityData.N(), class07001, var1, class06113.field_52444, class06837.N);
      if (class07049 != null && class07049.method_5864().N(class01217.R)) {
         class07049.method_5875(true);
         if (class07049 instanceof class04626 class04626) {
            class04626.R(var2);
            N(this.ticksInHive, class04626);
         }

         return class07049;
      } else {
         return null;
      }
   }

   public static class05534 N(class07049 var0) {
      class05534 class05534;
      try (class04495 class04495 = new class04495(var0.method_71370(), class04620.N)) {
         class08303 class08303 = class08303.N(class04495, var0.method_56673());
         var0.method_5662(class08303);
         class04620.y.forEach(class08303::L);
         class07001 class07001 = class08303.y();
         boolean flag = class07001.y("HasNectar", false);
         class05534 = new class05534(class08983.N(var0.method_5864(), class07001), 0, flag ? 2400 : 600);
      }

      return class05534;
   }

   public class08983<class07078<?>> N() {
      return this.entityData;
   }

   public static class05534 N(int var0) {
      return new class05534(class08983.N(class07078.m, new class07001()), var0, 600);
   }

   private static void N(int var0, class04626 var1) {
      int ix = var1.K();
      if (ix < 0) {
         var1.u(Math.min(0, ix + var0));
      } else if (ix > 0) {
         var1.u(Math.max(0, ix - var0));
      }

      var1.M(Math.max(0, var1.NH() - var0));
   }
}
