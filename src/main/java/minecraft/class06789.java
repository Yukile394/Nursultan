package minecraft;

import Nursultan.class09232;
import Nursultan.class09648;
import Nursultan.class09649;
import Nursultan.class09650;
import Nursultan.class09655;
import Nursultan.class10231;
import Nursultan.class10240;
import Nursultan.class10392;
import Nursultan.class10393;
import com.google.common.collect.Maps;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.LongArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import java.util.Locale;
import java.util.Map;
import net.fabricmc.fabric.mixin.command.ArgumentTypeInfosAccessor;

public class class06789 implements ArgumentTypeInfosAccessor {
   public static final Map<Class<?>, class06799<?, ?>> N = Maps.newHashMap();

   public class06789() {
      super();
   }

   public static <A extends ArgumentType<?>> class06763<A> y(A var0) {
      return N((A)var0).N((A)var0);
   }

   private static <T extends ArgumentType<?>> Class<T> y(Class<? super T> var0) {
      return var0;
   }

   public static <A extends ArgumentType<?>> class06799<A, ?> N(A var0) {
      class06799 class06799 = N.get(var0.getClass());
      if (class06799 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", var0, var0.getClass()));
      } else {
         return class06799;
      }
   }

   public static boolean N(Class<?> var0) {
      return N.containsKey(var0);
   }

   public static class06799<?, ?> N(class00751<class06799<?, ?>> var0) {
      N(var0, "brigadier:bool", BoolArgumentType.class, class06776.N_14(BoolArgumentType::bool));
      N(var0, "brigadier:float", FloatArgumentType.class, new class07198());
      N(var0, "brigadier:double", DoubleArgumentType.class, new class07224());
      N(var0, "brigadier:integer", IntegerArgumentType.class, new class07201());
      N(var0, "brigadier:long", LongArgumentType.class, new class04608());
      N(var0, "brigadier:string", StringArgumentType.class, new class07216());
      N(var0, "entity", class07680.class, new class07683());
      N(var0, "game_profile", class07659.class, class06776.N_14(class07659::N));
      N(var0, "block_pos", class00894.class, class06776.N_14(class00894::N));
      N(var0, "column_pos", class00905.class, class06776.N_14(class00905::N));
      N(var0, "vec3", class00881.class, class06776.N_14(class00881::N));
      N(var0, "vec2", class00887.class, class06776.N_14(class00887::N));
      N(var0, "block_state", class00877.class, class06776.N_62(class00877::N));
      N(var0, "block_predicate", class00878.class, class06776.N_62(class00878::N));
      N(var0, "item_stack", class06770.class, class06776.N_62(class06770::N));
      N(var0, "item_predicate", class06793.class, class06776.N_62(class06793::N));
      N(var0, "color", class07696.class, class06776.N_14(class07696::N));
      N(var0, "hex_color", class00035.class, class06776.N_14(class00035::N));
      N(var0, "component", class07698.class, class06776.N_62(class07698::N));
      N(var0, "style", class01786.class, class06776.N_62(class01786::N));
      N(var0, "message", class07690.class, class06776.N_14(class07690::N));
      N(var0, "nbt_compound_tag", class07667.class, class06776.N_14(class07667::N));
      N(var0, "nbt_tag", class07791.class, class06776.N_14(class07791::N));
      N(var0, "nbt_path", class07759.class, class06776.N_14(class07759::N));
      N(var0, "objective", class07794.class, class06776.N_14(class07794::N));
      N(var0, "objective_criteria", class07764.class, class06776.N_14(class07764::N));
      N(var0, "operation", class07785.class, class06776.N_14(class07785::N));
      N(var0, "particle", class07772.class, class06776.N_62(class07772::N));
      N(var0, "angle", class01021.class, class06776.N_14(class01021::N));
      N(var0, "rotation", class00897.class, class06776.N_14(class00897::N));
      N(var0, "scoreboard_slot", class07758.class, class06776.N_14(class07758::N));
      N(var0, "score_holder", class07786.class, new class07780());
      N(var0, "swizzle", class00879.class, class06776.N_14(class00879::N));
      N(var0, "team", class07761.class, class06776.N_14(class07761::N));
      N(var0, "item_slot", class07787.class, class06776.N_14(class07787::N));
      N(var0, "item_slots", class02494.class, class06776.N_14(class02494::N));
      N(var0, "resource_location", class07778.class, class06776.N_14(class07778::N));
      N(var0, "function", class06808.class, class06776.N_14(class06808::N));
      N(var0, "entity_anchor", class07687.class, class06776.N_14(class07687::N));
      N(var0, "int_range", class07767.class, class06776.N_14(class07788::N));
      N(var0, "float_range", class07766.class, class06776.N_14(class07788::y));
      N(var0, "dimension", class07678.class, class06776.N_14(class07678::N));
      N(var0, "gamemode", class04131.class, class06776.N_14(class04131::N));
      N(var0, "time", class07798.class, new class00871());
      N(var0, "resource_or_tag", y(class03789.class), new class10240());
      N(var0, "resource_or_tag_key", y(class04434.class), new class10392());
      N(var0, "resource", y(class03784.class), new class10231());
      N(var0, "resource_key", y(class04403.class), new class10393());
      N(var0, "resource_selector", y(class00202.class), new class09232());
      N(var0, "template_mirror", class03966.class, class06776.N_14(class03966::N));
      N(var0, "template_rotation", class03935.class, class06776.N_14(class03935::N));
      N(var0, "heightmap", class03583.class, class06776.N_14(class03583::N));
      N(var0, "loot_table", class09649.class, class06776.N_62(class02198::N));
      N(var0, "loot_predicate", class09648.class, class06776.N_62(class02198::L));
      N(var0, "loot_modifier", class09655.class, class06776.N_62(class02198::y));
      N(var0, "dialog", class09650.class, class06776.N_62(class02198::u));
      return N(var0, "uuid", class05193.class, class06776.N_14(class05193::N));
   }

   private static <A extends ArgumentType<?>, T extends class06763<A>> class06799<A, T> N(
      class00751<class06799<?, ?>> var0, String var1, Class<? extends A> var2, class06799<A, T> var3
   ) {
      N.put(var2, var3);
      return class00751.N(var0, var1, var3);
   }
}
