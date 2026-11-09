package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;

public record class07499(int experience, List<class05946<class05074>> loot, List<class05946<class06521<?>>> recipes, Optional<class07692> function) {
   public static final Codec<class07499> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.INT.optionalFieldOf("experience", 0).forGetter(class07499::N),
            class05074.N.listOf().optionalFieldOf("loot", List.of()).forGetter(class07499::y),
            class06521.M.listOf().optionalFieldOf("recipes", List.of()).forGetter(class07499::L),
            class07692.N.optionalFieldOf("function").forGetter(class07499::u)
         )
         .apply(var0, class07499::new)
   );
   public static final class07499 y = new class07499(0, List.of(), List.of(), Optional.empty());

   public List<class05946<class06521<?>>> L() {
      return this.recipes;
   }

   public class07499(int experience, List<class05946<class05074>> loot, List<class05946<class06521<?>>> recipes, Optional<class07692> function) {
      super();
      this.experience = experience;
      this.loot = loot;
      this.recipes = recipes;
      this.function = function;
   }

   public Optional<class07692> u() {
      return this.function;
   }

   public List<class05946<class05074>> y() {
      return this.loot;
   }

   public void N(class04770 var1) {
      var1.method_7255(this.experience);
      class04782 class04782 = var1.method_51469();
      class02796 class02796 = class04782.method_8503();
      class04162 class04162 = new class04160(class04782).N(class06551.N, var1).N(class06551.B, var1.method_73189()).N(class06925.m);
      boolean flag = false;

      for (class05946<class05074> class05946 : this.loot) {
         ObjectListIterator<class06584> objectlistiterator = class02796.yd().N(class05946).N(class04162).iterator();

         while (objectlistiterator.hasNext()) {
            class06584 class06584 = (class06584)objectlistiterator.next();
            if (var1.method_7270(class06584)) {
               class04782.method_43128(
                  null,
                  var1.method_23317(),
                  var1.method_23318(),
                  var1.method_23321(),
                  class04909.sJ,
                  class04911.field_15248,
                  0.2F,
                  ((var1.method_59922().z() - var1.method_59922().z()) * 0.7F + 1.0F) * 2.0F
               );
               flag = true;
            } else {
               class00717 class00717 = var1.method_7328(class06584, false);
               if (class00717 != null) {
                  class00717.u();
                  class00717.N(var1.method_5667());
               }
            }
         }
      }

      if (flag) {
         ((class07482)var1.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).u();
      }

      if (!this.recipes.isEmpty()) {
         var1.method_7335(this.recipes);
      }

      this.function
         .flatMap(var1x -> var1x.N(class02796.Nr()))
         .ifPresent(var2x -> class02796.Nr().N((class07684<class07701>)var2x, var1.method_64396().y().N(class06984.L)));
   }

   public int N() {
      return this.experience;
   }
}
