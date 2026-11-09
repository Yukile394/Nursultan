package minecraft;

import com.mojang.serialization.MapCodec;

public class class07693 {
   public static final class05955 N = N("inverted", class00815.N);
   public static final class05955 y = N("any_of", class03494.i);
   public static final class05955 L = N("all_of", class03496.i);
   public static final class05955 u = N("random_chance", class07657.N);
   public static final class05955 i = N("random_chance_with_enchanted_bonus", class00908.N);
   public static final class05955 R = N("entity_properties", class07700.N);
   public static final class05955 M = N("killed_by_player", class07776.N);
   public static final class05955 B = N("entity_scores", class00805.N);
   public static final class05955 Z = N("block_state_property", class00851.N);
   public static final class05955 z = N("match_tool", class07795.N);
   public static final class05955 U = N("table_bonus", class06526.N);
   public static final class05955 E = N("survives_explosion", class00788.N);
   public static final class05955 W = N("damage_source_properties", class07318.N);
   public static final class05955 m = N("location_check", class00859.N);
   public static final class05955 P = N("weather_check", class00866.N);
   public static final class05955 s = N("reference", class01429.N);
   public static final class05955 T = N("time_check", class01405.N);
   public static final class05955 b = N("value_check", class04796.N);
   public static final class05955 j = N("enchantment_active_check", class02205.N);

   public class07693() {
      super();
   }

   private static class05955 N(String var0, MapCodec<? extends class05957> var1) {
      return class00751.N(class04206.I, class01894.y(var0), new class05955(var1));
   }
}
