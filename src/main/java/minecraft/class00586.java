package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00586(class00617 canSleep, class00617 canSetSpawn, boolean explodes, Optional<class00392> errorMessage) {
   public static final class00586 N = new class00586(
      class00617.field_63707, class00617.field_63706, false, Optional.of(class00392.L("block.minecraft.bed.no_sleep"))
   );
   public static final class00586 y = new class00586(class00617.field_63708, class00617.field_63708, true, Optional.empty());
   public static final Codec<class00586> L = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00617.field_63709.fieldOf("can_sleep").forGetter(class00586::y),
            class00617.field_63709.fieldOf("can_set_spawn").forGetter(class00586::L),
            Codec.BOOL.optionalFieldOf("explodes", false).forGetter(class00586::u),
            class03748.N.optionalFieldOf("error_message").forGetter(class00586::i)
         )
         .apply(var0, class00586::new)
   );

   public class00617 L() {
      return this.canSetSpawn;
   }

   public class00586(class00617 canSleep, class00617 canSetSpawn, boolean explodes, Optional<class00392> errorMessage) {
      this.canSleep = canSleep;
      this.canSetSpawn = canSetSpawn;
      this.explodes = explodes;
      this.errorMessage = errorMessage;
   }

   public Optional<class00392> i() {
      return this.errorMessage;
   }

   public boolean u() {
      return this.explodes;
   }

   public boolean y(class07299 var1) {
      return this.canSetSpawn.N(var1);
   }

   public class00617 y() {
      return this.canSleep;
   }

   public class08035 N() {
      return new class08035(this.errorMessage.orElse(null));
   }

   public boolean N(class07299 var1) {
      return this.canSleep.N(var1);
   }
}
