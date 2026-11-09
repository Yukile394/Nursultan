package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public record class00843(Optional<class05196> player, class00855 slots, List<class00845> items) implements class01425 {
   public static final Codec<class00843> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class00843::N),
            class00855.N.optionalFieldOf("slots", class00855.y).forGetter(class00843::y),
            class00845.N.listOf().optionalFieldOf("items", List.of()).forGetter(class00843::L)
         )
         .apply(var0, class00843::new)
   );

   public List<class00845> L() {
      return this.items;
   }

   public class00843(Optional<class05196> player, class00855 slots, List<class00845> items) {
      super();
      this.player = player;
      this.slots = slots;
      this.items = items;
   }

   public class00855 y() {
      return this.slots;
   }

   public static class06915<class00843> N(class07310... var0) {
      class00845[] aclass00845 = new class00845[var0.length];

      for (int i = 0; i < var0.length; i++) {
         aclass00845[i] = new class00845(Optional.of(class03543.N(var0[i].B().i())), class00836.L, class00142.N);
      }

      return N(aclass00845);
   }

   public static class06915<class00843> N(class00845... var0) {
      return class06912.R.N(new class00843(Optional.empty(), class00855.y, List.of(var0)));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public boolean N(class08044 var1, class06584 var2, int var3, int var4, int var5) {
      if (!this.slots.N(var3, var4, var5)) {
         return false;
      } else if (this.items.isEmpty()) {
         return true;
      } else if (this.items.size() != 1) {
         ObjectArrayList objectarraylist = new ObjectArrayList(this.items);
         int i = var1.method_5439();

         for (int j = 0; j < i; j++) {
            if (objectarraylist.isEmpty()) {
               return true;
            }

            class06584 class06584 = var1.method_5438(j);
            if (!class06584.R()) {
               objectarraylist.removeIf(var1x -> var1x.test(class06584));
            }
         }

         return objectarraylist.isEmpty();
      } else {
         return !var2.R() && this.items.get(0).test(var2);
      }
   }

   public static class06915<class00843> N(class00837... var0) {
      return N(Stream.of(var0).map(class00837::y).toArray(class00845[]::new));
   }
}
