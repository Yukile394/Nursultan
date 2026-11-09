package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class00844(Optional<class05196> player, List<class05196> victims, class00836 uniqueEntityTypes, Optional<class00845> firedFromWeapon)
   implements class01425 {
   public static final Codec<class00844> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class00844::N),
            class00821.y.listOf().optionalFieldOf("victims", List.of()).forGetter(class00844::y),
            class00836.u.optionalFieldOf("unique_entity_types", class00836.L).forGetter(class00844::L),
            class00845.N.optionalFieldOf("fired_from_weapon").forGetter(class00844::u)
         )
         .apply(var0, class00844::new)
   );

   public class00836 L() {
      return this.uniqueEntityTypes;
   }

   public class00844(Optional<class05196> player, List<class05196> victims, class00836 uniqueEntityTypes, Optional<class00845> firedFromWeapon) {
      this.player = player;
      this.victims = victims;
      this.uniqueEntityTypes = uniqueEntityTypes;
      this.firedFromWeapon = firedFromWeapon;
   }

   public Optional<class00845> u() {
      return this.firedFromWeapon;
   }

   public List<class05196> y() {
      return this.victims;
   }

   public static class06915<class00844> N(class02055<class06581> var0, class00810... var1) {
      return class06912.q.N(new class00844(Optional.empty(), class00821.N(var1), class00836.L, Optional.of(class00837.N().N(var0, class06570.dw).y())));
   }

   public boolean N(Collection<class05908> var1, int var2, @Nullable class06584 var3) {
      if (!this.firedFromWeapon.isPresent() || var3 != null && this.firedFromWeapon.get().test(var3)) {
         if (!this.victims.isEmpty()) {
            ArrayList arraylist = Lists.newArrayList(var1);

            for (class05196 class05196 : this.victims) {
               boolean flag = false;
               Iterator iterator = arraylist.iterator();

               while (iterator.hasNext()) {
                  class05908 class05908 = (class05908)iterator.next();
                  if (class05196.N(class05908)) {
                     iterator.remove();
                     flag = true;
                     break;
                  }
               }

               if (!flag) {
                  return false;
               }
            }
         }

         return this.uniqueEntityTypes.u(var2);
      } else {
         return false;
      }
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public static class06915<class00844> N(class02055<class06581> var0, class00836 var1) {
      return class06912.q.N(new class00844(Optional.empty(), List.of(), var1, Optional.of(class00837.N().N(var0, class06570.dw).y())));
   }

   @Override
   public void N(class04492 var1) {
      class01425.super.N(var1);
      var1.N(this.victims, "victims");
   }
}
