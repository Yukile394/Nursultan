package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00841(Optional<class05196> player, class05946<class06521<?>> recipe) implements class01425 {
   public static final Codec<class00841> N = RecordCodecBuilder.create(
      var0 -> var0.group(class00821.y.optionalFieldOf("player").forGetter(class00841::N), class06521.M.fieldOf("recipe").forGetter(class00841::y))
         .apply(var0, class00841::new)
   );

   public class00841(Optional<class05196> player, class05946<class06521<?>> recipe) {
      this.player = player;
      this.recipe = recipe;
   }

   public class05946<class06521<?>> y() {
      return this.recipe;
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public boolean N(class03729<?> var1) {
      return this.recipe == var1.N();
   }
}
