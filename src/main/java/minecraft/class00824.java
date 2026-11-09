package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Collection;
import java.util.Optional;

public record class00824(Optional<class05196> player, Optional<class00845> rod, Optional<class05196> entity, Optional<class00845> item) implements class01425 {
   public static final Codec<class00824> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class00824::N),
            class00845.N.optionalFieldOf("rod").forGetter(class00824::y),
            class00821.y.optionalFieldOf("entity").forGetter(class00824::L),
            class00845.N.optionalFieldOf("item").forGetter(class00824::u)
         )
         .apply(var0, class00824::new)
   );

   public Optional<class05196> L() {
      return this.entity;
   }

   public class00824(Optional<class05196> player, Optional<class00845> rod, Optional<class05196> entity, Optional<class00845> item) {
      super();
      this.player = player;
      this.rod = rod;
      this.entity = entity;
      this.item = item;
   }

   public Optional<class00845> u() {
      return this.item;
   }

   public Optional<class00845> y() {
      return this.rod;
   }

   @Override
   public void N(class04492 var1) {
      class01425.super.N(var1);
      var1.N(this.entity, "entity");
   }

   public boolean N(class06584 var1, class05908 var2, Collection<class06584> var3) {
      if (this.rod.isPresent() && !this.rod.get().test(var1)) {
         return false;
      } else if (this.entity.isPresent() && !this.entity.get().N(var2)) {
         return false;
      } else {
         if (this.item.isPresent()) {
            boolean flag = false;
            class07049 class07049 = var2.L(class06551.N);
            if (class07049 instanceof class00717 class00717 && this.item.get().test(class00717.N())) {
               flag = true;
            }

            for (class06584 class06584 : var3) {
               if (this.item.get().test(class06584)) {
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

   public static class06915<class00824> N(Optional<class00845> var0, Optional<class00821> var1, Optional<class00845> var2) {
      return class06912.g.N(new class00824(Optional.empty(), var0, class00821.N(var1), var2));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }
}
