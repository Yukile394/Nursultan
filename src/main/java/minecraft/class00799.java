package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public record class00799(Optional<class05196> player, List<class05196> victims) implements class01425 {
   public static final Codec<class00799> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class00799::N),
            class00821.y.listOf().optionalFieldOf("victims", List.of()).forGetter(class00799::y)
         )
         .apply(var0, class00799::new)
   );

   public class00799(Optional<class05196> player, List<class05196> victims) {
      super();
      this.player = player;
      this.victims = victims;
   }

   public List<class05196> y() {
      return this.victims;
   }

   public static class06915<class00799> N(class00810... var0) {
      return class06912.I.N(new class00799(Optional.empty(), class00821.N(var0)));
   }

   public boolean N(Collection<? extends class05908> var1) {
      for (class05196 class05196 : this.victims) {
         boolean flag = false;

         for (class05908 class05908 : var1) {
            if (class05196.N(class05908)) {
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

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   @Override
   public void N(class04492 var1) {
      class01425.super.N(var1);
      var1.N(this.victims, "victims");
   }
}
