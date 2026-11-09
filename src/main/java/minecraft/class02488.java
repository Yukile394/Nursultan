package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntLists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class02488 {
   private static final List<class02466> y = class07536.N(new ArrayList<>(), var0 -> {
      N(var0, "contents", 0);
      N(var0, "container.", 0, 54);
      N(var0, "hotbar.", 0, 9);
      N(var0, "inventory.", 9, 27);
      N(var0, "enderchest.", 200, 27);
      N(var0, "villager.", 300, 8);
      N(var0, "horse.", 500, 15);
      int i = class07085.field_6173.N(98);
      int j = class07085.field_6171.N(98);
      N(var0, "weapon", i);
      N(var0, "weapon.mainhand", i);
      N(var0, "weapon.offhand", j);
      N(var0, "weapon.*", i, j);
      i = class07085.field_6169.N(100);
      j = class07085.field_6174.N(100);
      int k = class07085.field_6172.N(100);
      int l = class07085.field_6166.N(100);
      int i1 = class07085.field_48824.N(105);
      N(var0, "armor.head", i);
      N(var0, "armor.chest", j);
      N(var0, "armor.legs", k);
      N(var0, "armor.feet", l);
      N(var0, "armor.body", i1);
      N(var0, "armor.*", i, j, k, l, i1);
      N(var0, "saddle", class07085.field_55946.N(106));
      N(var0, "horse.chest", 499);
      N(var0, "player.cursor", 499);
      N(var0, "player.crafting.", 500, 4);
   });
   public static final Codec<class02466> N = class05033.y(() -> y.toArray(var0 -> new class02466[var0]));
   private static final Function<String, class02466> L = class05033.N(y.toArray(class02466[]::new));

   public class02488() {
      super();
   }

   public static Stream<String> y() {
      return y.stream().filter(var0 -> var0.y() == 1).map(class05033::method_15434);
   }

   private static class02466 N(String var0, int var1) {
      return class02466.N(var0, IntLists.singleton(var1));
   }

   public static Stream<String> N() {
      return y.stream().map(class05033::method_15434);
   }

   private static void N(List<class02466> var0, String var1, int var2) {
      var0.add(N(var1, var2));
   }

   private static void N(List<class02466> var0, String var1, int var2, int var3) {
      IntArrayList intarraylist = new IntArrayList(var3);

      for (int i = 0; i < var3; i++) {
         int j = var2 + i;
         var0.add(N(var1 + i, j));
         intarraylist.add(j);
      }

      var0.add(N(var1 + "*", intarraylist));
   }

   private static void N(List<class02466> var0, String var1, int... var2) {
      var0.add(N(var1, var2));
   }

   @Nullable
   public static class02466 N(String var0) {
      return L.apply(var0);
   }

   private static class02466 N(String var0, IntList var1) {
      return class02466.N(var0, IntLists.unmodifiable(var1));
   }

   private static class02466 N(String var0, int... var1) {
      return class02466.N(var0, IntList.of(var1));
   }
}
