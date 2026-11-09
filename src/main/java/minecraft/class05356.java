package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.OptionalDynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Optional;

record class05356<T>(Int2ObjectMap<T> sectionsByY, boolean versionChanged) {

   private class05356(Int2ObjectMap<T> sectionsByY, boolean versionChanged) {
      this.sectionsByY = sectionsByY;
      this.versionChanged = versionChanged;
   }

   public boolean y() {
      return this.versionChanged;
   }

   public Int2ObjectMap<T> N() {
      return this.sectionsByY;
   }

   public static <T> class05356<T> N(Codec<T> var0, DynamicOps<class07709> var1, class07709 var2, class06172 var3, class05474 var4) {
      Dynamic dynamic = new Dynamic(var1, var2);
      Dynamic<class07709> dynamic1 = var3.N(dynamic, 1945);
      boolean flag = dynamic != dynamic1;
      OptionalDynamic<class07709> optionaldynamic = dynamic1.get("Sections");
      Int2ObjectOpenHashMap int2objectopenhashmap = new Int2ObjectOpenHashMap();

      for (int i = var4.method_32891(); i <= var4.method_31597(); i++) {
         Optional optional = optionaldynamic.get(Integer.toString(i)).result().flatMap(var1x -> var0.parse(var1x).resultOrPartial(class05374.L::error));
         if (optional.isPresent()) {
            int2objectopenhashmap.put(i, optional.get());
         }
      }

      return new class05356<>(int2objectopenhashmap, flag);
   }
}
