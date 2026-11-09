package minecraft;

import Nursultan.class10416;
import Nursultan.class10419;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.fabricmc.fabric.mixin.loot.LootPoolAccessor;
import org.apache.commons.lang3.mutable.MutableInt;

public class class05441 implements LootPoolAccessor {
   public static final Codec<class05441> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03942.N.listOf().fieldOf("entries").forGetter(var0x -> var0x.y),
            class05957.L.listOf().optionalFieldOf("conditions", List.of()).forGetter(var0x -> var0x.L),
            class07439.L.listOf().optionalFieldOf("functions", List.of()).forGetter(var0x -> var0x.u),
            class06339.N.fieldOf("rolls").forGetter(var0x -> var0x.i),
            class06339.N.fieldOf("bonus_rolls").orElse(class04711.N(0.0F)).forGetter(var0x -> var0x.R)
         )
         .apply(var0, class05441::new)
   );
   public final List<class04129> y;
   public final List<class05957> L;
   private final Predicate<class05908> M;
   public final List<class08122> u;
   private final BiFunction<class06584, class05908, class06584> B;
   public final class06378 i;
   public final class06378 R;

   class05441(List<class04129> var1, List<class05957> var2, List<class08122> var3, class06378 var4, class06378 var5) {
      super();
      this.y = var1;
      this.L = var2;
      this.M = class07536.N(var2);
      this.u = var3;
      this.B = class07439.N(var3);
      this.i = var4;
      this.R = var5;
   }

   private void y(Consumer<class06584> var1, class05908 var2) {
      class06069 class06069 = var2.y();
      ArrayList arraylist = Lists.newArrayList();
      MutableInt mutableint = new MutableInt();

      for (class04129 class04129 : this.y) {
         class04129.expand(var2, var3x -> {
            int k = var3x.N(var2.L());
            if (k > 0) {
               arraylist.add(var3x);
               mutableint.add(k);
            }
         });
      }

      int ix = arraylist.size();
      if (mutableint.intValue() != 0 && ix != 0) {
         if (ix == 1) {
            ((class03599)arraylist.get(0)).N(var1, var2);
         } else {
            int j = class06069.y(mutableint.intValue());

            for (class03599 class03599 : arraylist) {
               j -= class03599.N(var2.L());
               if (j < 0) {
                  class03599.N(var1, var2);
                  return;
               }
            }
         }
      }
   }

   public void N(Consumer<class06584> var1, class05908 var2) {
      if (this.M.test(var2)) {
         Consumer<class06584> consumer = class08122.N(this.B, var1, var2);
         int ix = this.i.N(var2) + class04995.y(this.R.y(var2) * var2.L());

         for (int j = 0; j < ix; j++) {
            this.y(consumer, var2);
         }
      }
   }

   public void N(class05561 var1) {
      for (int ix = 0; ix < this.L.size(); ix++) {
         this.L.get(ix).N(var1.N(new class10416("conditions", ix)));
      }

      for (int j = 0; j < this.u.size(); j++) {
         this.u.get(j).N(var1.N(new class10416("functions", j)));
      }

      for (int k = 0; k < this.y.size(); k++) {
         this.y.get(k).N(var1.N(new class10416("entries", k)));
      }

      this.i.N(var1.N(new class10419("rolls")));
      this.R.N(var1.N(new class10419("bonus_rolls")));
   }

   public static class05457 N() {
      return new class05457();
   }
}
