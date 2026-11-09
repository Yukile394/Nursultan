package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class class03942 {
   public static final Codec<class04129> N = class04206.O.T().dispatch(class04129::N, class05950::N);
   public static final class05950 y = N("empty", class03626.N);
   public static final class05950 L = N("item", class03798.N);
   public static final class05950 u = N("loot_table", class03367.N);
   public static final class05950 i = N("dynamic", class03024.N);
   public static final class05950 R = N("tag", class04289.N);
   public static final class05950 M = N("slots", class07577.N);
   public static final class05950 B = N("alternatives", class04559.N);
   public static final class05950 Z = N("sequence", class01927.N);
   public static final class05950 z = N("group", class02709.N);

   public class03942() {
      super();
   }

   private static class05950 N(String var0, MapCodec<? extends class04129> var1) {
      return class00751.N(class04206.O, class01894.y(var0), new class05950(var1));
   }
}
