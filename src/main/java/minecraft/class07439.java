package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;

public class class07439 {
   public static final BiFunction<class06584, class05908, class06584> N = (var0, var1) -> var0;
   public static final Codec<class08122> y = class04206.g.T().dispatch("function", class08122::N, class05959::N);
   public static final Codec<class08122> L = Codec.lazyInitialized(() -> Codec.withAlternative(y, class04812.y));
   public static final Codec<class03556<class08122>> u = class01281.N(class04227.yo, L);
   public static final class05959<class07621> i = N("set_count", class07621.N);
   public static final class05959<class02925> R = N("set_item", class02925.N);
   public static final class05959<class08611> M = N("enchant_with_levels", class08611.N);
   public static final class05959<class08853> B = N("enchant_randomly", class08853.N);
   public static final class05959<class04815> Z = N("set_enchantments", class04815.N);
   public static final class05959<class07160> z = N("set_custom_data", class07160.N);
   public static final class05959<class02702> U = N("set_components", class02702.N);
   public static final class05959<class08017> E = N("furnace_smelt", class08017.N);
   public static final class05959<class06706> W = N("enchanted_count_increase", class06706.y);
   public static final class05959<class07882> m = N("set_damage", class07882.N);
   public static final class05959<class07986> P = N("set_attributes", class07986.N);
   public static final class05959<class04646> s = N("set_name", class04646.N);
   public static final class05959<class00030> T = N("exploration_map", class00030.R);
   public static final class05959<class00709> b = N("set_stew_effect", class00709.N);
   public static final class05959<class08252> j = N("copy_name", class08252.N);
   public static final class05959<class07437> v = N("set_contents", class07437.N);
   public static final class05959<class02930> n = N("modify_contents", class02930.N);
   public static final class05959<class02907> t = N("filtered", class02907.N);
   public static final class05959<class09004> G = N("limit_count", class09004.N);
   public static final class05959<class02349> l = N("apply_bonus", class02349.N);
   public static final class05959<class07624> d = N("set_loot_table", class07624.N);
   public static final class05959<class08828> w = N("explosion_decay", class08828.N);
   public static final class05959<class04668> k = N("set_lore", class04668.N);
   public static final class05959<class04677> Y = N("fill_player_head", class04677.N);
   public static final class05959<class05268> Q = N("copy_custom_data", class05268.N);
   public static final class05959<class05501> O = N("copy_state", class05501.N);
   public static final class05959<class01095> g = N("set_banner_pattern", class01095.N);
   public static final class05959<class04030> I = N("set_potion", class04030.N);
   public static final class05959<class04466> J = N("set_instrument", class04466.N);
   public static final class05959<class03364> o = N("reference", class03364.N);
   public static final class05959<class04812> q = N("sequence", class04812.N);
   public static final class05959<class02683> K = N("copy_components", class02683.N);
   public static final class05959<class02355> V = N("set_fireworks", class02355.N);
   public static final class05959<class02321> e = N("set_firework_explosion", class02321.N);
   public static final class05959<class02359> H = N("set_book_cover", class02359.N);
   public static final class05959<class02326> c = N("set_written_book_pages", class02326.N);
   public static final class05959<class02343> X = N("set_writable_book_pages", class02343.N);
   public static final class05959<class02167> a = N("toggle_tooltips", class02167.N);
   public static final class05959<class02635> p = N("set_ominous_bottle_amplifier", class02635.N);
   public static final class05959<class02937> F = N("set_custom_model_data", class02937.N);
   public static final class05959<class06810> A = N("discard", class06810.N);

   public class07439() {
      super();
   }

   private static <T extends class08122> class05959<T> N(String var0, MapCodec<T> var1) {
      return class00751.N(class04206.g, class01894.y(var0), new class05959<>(var1));
   }

   public static BiFunction<class06584, class05908, class06584> N(List<? extends BiFunction<class06584, class05908, class06584>> var0) {
      List list = List.copyOf(var0);

      return switch (list.size()) {
         case 0 -> N;
         case 1 -> (BiFunction)list.get(0);
         case 2 -> {
            BiFunction bifunction = (BiFunction)list.get(0);
            yield (var2x, var3) -> (class06584)var0x.apply((class06584)bifunction.apply(var2x, var3), var3);
         }
         default -> (var1x, var2x) -> {
            Iterator iterator = list.iterator();

            while (iterator.hasNext()) {
               var1x = (class06584)((BiFunction)iterator.next()).apply(var1x, var2x);
            }

            return var1x;
         };
      };
   }
}
