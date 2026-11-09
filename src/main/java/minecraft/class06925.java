package minecraft;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class class06925 {
   public static final BiMap<class01894, class06929> N = HashBiMap.create();
   public static final Codec<class06929> y = class01894.N
      .comapFlatMap(
         var0 -> Optional.ofNullable((class06929)N.get(var0))
            .<DataResult>map(DataResult::success)
            .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + var0 + "'")),
         N.inverse()::get
      );
   public static final class06929 L = N("empty", var0 -> {});
   public static final class06929 u = N("chest", var0 -> var0.N(class06551.B).y(class06551.N));
   public static final class06929 i = N("command", var0 -> var0.N(class06551.B).y(class06551.N));
   public static final class06929 R = N("selector", var0 -> var0.N(class06551.B).N(class06551.N));
   public static final class06929 M = N("fishing", var0 -> var0.N(class06551.B).N(class06551.U).y(class06551.N));
   public static final class06929 B = N("entity", var0 -> var0.N(class06551.N).N(class06551.B).N(class06551.i).y(class06551.R).y(class06551.M).y(class06551.u));
   public static final class06929 Z = N("equipment", var0 -> var0.N(class06551.B).N(class06551.N));
   public static final class06929 z = N("archaeology", var0 -> var0.N(class06551.B).N(class06551.N).N(class06551.U));
   public static final class06929 U = N("gift", var0 -> var0.N(class06551.B).N(class06551.N));
   public static final class06929 E = N("barter", var0 -> var0.N(class06551.N));
   public static final class06929 W = N("vault", var0 -> var0.N(class06551.B).y(class06551.N).y(class06551.U));
   public static final class06929 m = N("advancement_reward", var0 -> var0.N(class06551.N).N(class06551.B));
   public static final class06929 P = N("advancement_entity", var0 -> var0.N(class06551.N).N(class06551.B));
   public static final class06929 s = N("advancement_location", var0 -> var0.N(class06551.N).N(class06551.B).N(class06551.U).N(class06551.Z));
   public static final class06929 T = N("block_use", var0 -> var0.N(class06551.N).N(class06551.B).N(class06551.Z));
   public static final class06929 b = N(
      "generic",
      var0 -> var0.N(class06551.N)
         .N(class06551.u)
         .N(class06551.i)
         .N(class06551.R)
         .N(class06551.M)
         .N(class06551.B)
         .N(class06551.Z)
         .N(class06551.z)
         .N(class06551.U)
         .N(class06551.E)
   );
   public static final class06929 j = N("block", var0 -> var0.N(class06551.Z).N(class06551.B).N(class06551.U).y(class06551.N).y(class06551.z).y(class06551.E));
   public static final class06929 v = N("shearing", var0 -> var0.N(class06551.B).N(class06551.N).N(class06551.U));
   public static final class06929 n = N("entity_interact", var0 -> var0.N(class06551.L).y(class06551.y).N(class06551.U));
   public static final class06929 t = N("block_interact", var0 -> var0.N(class06551.Z).y(class06551.z).y(class06551.y).y(class06551.U));
   public static final class06929 G = N(
      "enchanted_damage", var0 -> var0.N(class06551.N).N(class06551.W).N(class06551.B).N(class06551.i).y(class06551.M).y(class06551.R)
   );
   public static final class06929 l = N("enchanted_item", var0 -> var0.N(class06551.U).N(class06551.W));
   public static final class06929 d = N("enchanted_location", var0 -> var0.N(class06551.N).N(class06551.W).N(class06551.B).N(class06551.m));
   public static final class06929 w = N("enchanted_entity", var0 -> var0.N(class06551.N).N(class06551.W).N(class06551.B));
   public static final class06929 k = N("hit_block", var0 -> var0.N(class06551.N).N(class06551.W).N(class06551.B).N(class06551.Z));

   public class06925() {
      super();
   }

   private static class06929 N(String var0, Consumer<class06943> var1) {
      class06943 class06943 = new class06943();
      var1.accept(class06943);
      class06929 class06929 = class06943.N();
      class01894 class01894 = class01894.y(var0);
      if ((class06929)N.put(class01894, class06929) != null) {
         throw new IllegalStateException("Loot table parameter set " + class01894 + " is already registered");
      } else {
         return class06929;
      }
   }
}
