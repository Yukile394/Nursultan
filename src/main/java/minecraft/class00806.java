package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class00806(Optional<class05196> player, Optional<class00834> effects, Optional<class05196> source) implements class01425 {
   public static final Codec<class00806> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class00806::N),
            class00834.N.optionalFieldOf("effects").forGetter(class00806::y),
            class00821.y.optionalFieldOf("source").forGetter(class00806::L)
         )
         .apply(var0, class00806::new)
   );

   public Optional<class05196> L() {
      return this.source;
   }

   public class00806(Optional<class05196> player, Optional<class00834> effects, Optional<class05196> source) {
      super();
      this.player = player;
      this.effects = effects;
      this.source = source;
   }

   public Optional<class00834> y() {
      return this.effects;
   }

   public boolean N(class04770 var1, @Nullable class05908 var2) {
      return this.effects.isPresent() && !this.effects.get().N((class07438)var1)
         ? false
         : !this.source.isPresent() || var2 != null && this.source.get().N(var2);
   }

   public static class06915<class00806> N(class00814 var0) {
      return class06912.Y.N(new class00806(Optional.empty(), var0.y(), Optional.empty()));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public static class06915<class00806> N(class00810 var0) {
      return class06912.Y.N(new class00806(Optional.empty(), Optional.empty(), Optional.of(class00821.N(var0.y()))));
   }

   @Override
   public void N(class04492 var1) {
      class01425.super.N(var1);
      var1.N(this.source, "source");
   }
}
