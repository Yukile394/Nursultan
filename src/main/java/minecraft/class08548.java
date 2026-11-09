package minecraft;

import Nursultan.class11647;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record class08548(class08569 base, Map<class05946<class11647>, class08569> overrides) {
   public static final String N = "_";
   public static final MapCodec<class08548> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class08569.N.fieldOf("asset_name").forGetter(class08548::N),
            Codec.unboundedMap(class05946.N(class08699.N), class08569.N).optionalFieldOf("override_armor_assets", Map.of()).forGetter(class08548::y)
         )
         .apply(var0, class08548::new)
   );
   public static final class02362<ByteBuf, class08548> L = class02362.N(
      class08569.y, class08548::N, class02389.N(Object2ObjectOpenHashMap::new, class05946.y(class08699.N), class08569.y), class08548::y, class08548::new
   );
   public static final class08548 u = N("quartz");
   public static final class08548 i = N("iron", Map.of(class08699.i, "iron_darker"));
   public static final class08548 R = N("netherite", Map.of(class08699.Z, "netherite_darker"));
   public static final class08548 M = N("redstone");
   public static final class08548 B = N("copper", Map.of(class08699.L, "copper_darker"));
   public static final class08548 Z = N("gold", Map.of(class08699.R, "gold_darker"));
   public static final class08548 z = N("emerald");
   public static final class08548 U = N("diamond", Map.of(class08699.M, "diamond_darker"));
   public static final class08548 E = N("lapis");
   public static final class08548 W = N("amethyst");
   public static final class08548 m = N("resin");

   public class08548(class08569 base, Map<class05946<class11647>, class08569> overrides) {
      this.base = base;
      this.overrides = overrides;
   }

   public Map<class05946<class11647>, class08569> y() {
      return this.overrides;
   }

   public static class08548 N(String var0) {
      return new class08548(new class08569(var0), Map.of());
   }

   public static class08548 N(String var0, Map<class05946<class11647>, String> var1) {
      return new class08548(new class08569(var0), Map.copyOf(Maps.transformValues(var1, class08569::new)));
   }

   public class08569 N() {
      return this.base;
   }

   public class08569 N(class05946<class11647> var1) {
      return this.overrides.getOrDefault(var1, this.base);
   }
}
