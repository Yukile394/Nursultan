package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public record class03488(Optional<class05196> player, class05946<class06521<?>> recipeId, List<class00845> ingredients) implements class01425 {
   public static final Codec<class03488> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class03488::N),
            class06521.M.fieldOf("recipe_id").forGetter(class03488::y),
            class00845.N.listOf().optionalFieldOf("ingredients", List.of()).forGetter(class03488::L)
         )
         .apply(var0, class03488::new)
   );

   public List<class00845> L() {
      return this.ingredients;
   }

   public class03488(Optional<class05196> player, class05946<class06521<?>> recipeId, List<class00845> ingredients) {
      super();
      this.player = player;
      this.recipeId = recipeId;
      this.ingredients = ingredients;
   }

   public static class06915<class03488> y(class05946<class06521<?>> var0) {
      return class06912.NR.N(new class03488(Optional.empty(), var0, List.of()));
   }

   public class05946<class06521<?>> y() {
      return this.recipeId;
   }

   boolean y(class05946<class06521<?>> var1, List<class06584> var2) {
      if (var1 != this.recipeId) {
         return false;
      } else {
         ArrayList arraylist = new ArrayList(var2);

         for (class00845 class00845 : this.ingredients) {
            boolean flag = false;
            Iterator iterator = arraylist.iterator();

            while (iterator.hasNext()) {
               if (class00845.test((class06584)iterator.next())) {
                  iterator.remove();
                  flag = true;
                  break;
               }
            }

            if (!flag) {
               return false;
            }
         }

         return true;
      }
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public static class06915<class03488> N(class05946<class06521<?>> var0, List<class00837> var1) {
      return class06912.Ni.N(new class03488(Optional.empty(), var0, var1.stream().map(class00837::y).toList()));
   }

   public static class06915<class03488> N(class05946<class06521<?>> var0) {
      return class06912.Ni.N(new class03488(Optional.empty(), var0, List.of()));
   }
}
