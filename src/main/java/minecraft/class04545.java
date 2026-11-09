package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;

public record class04545(Optional<class05196> player, Optional<class05196> lightning, Optional<class05196> bystander) implements class01425 {
   public static final Codec<class04545> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class04545::N),
            class00821.y.optionalFieldOf("lightning").forGetter(class04545::y),
            class00821.y.optionalFieldOf("bystander").forGetter(class04545::L)
         )
         .apply(var0, class04545::new)
   );

   public Optional<class05196> L() {
      return this.bystander;
   }

   public class04545(Optional<class05196> player, Optional<class05196> lightning, Optional<class05196> bystander) {
      super();
      this.player = player;
      this.lightning = lightning;
      this.bystander = bystander;
   }

   public Optional<class05196> y() {
      return this.lightning;
   }

   public static class06915<class04545> N(Optional<class00821> var0, Optional<class00821> var1) {
      return class06912.D.N(new class04545(Optional.empty(), class00821.N(var0), class00821.N(var1)));
   }

   @Override
   public void N(class04492 var1) {
      class01425.super.N(var1);
      var1.N(this.lightning, "lightning");
      var1.N(this.bystander, "bystander");
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public boolean N(class05908 var1, List<class05908> var2) {
      return this.lightning.isPresent() && !this.lightning.get().N(var1)
         ? false
         : !this.bystander.isPresent() || !var2.stream().noneMatch(this.bystander.get()::N);
   }
}
