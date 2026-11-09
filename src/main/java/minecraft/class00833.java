package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00833(Optional<class00817> located, Optional<class00817> steppingOn, Optional<class00817> affectsMovement) {
   public static final MapCodec<class00833> u = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class00817.N.optionalFieldOf("location").forGetter(class00833::N),
            class00817.N.optionalFieldOf("stepping_on").forGetter(class00833::y),
            class00817.N.optionalFieldOf("movement_affected_by").forGetter(class00833::L)
         )
         .apply(var0, class00833::new)
   );

   public Optional<class00817> L() {
      return this.affectsMovement;
   }

   public class00833(Optional<class00817> located, Optional<class00817> steppingOn, Optional<class00817> affectsMovement) {
      super();
      this.located = located;
      this.steppingOn = steppingOn;
      this.affectsMovement = affectsMovement;
   }

   public Optional<class00817> y() {
      return this.steppingOn;
   }

   public Optional<class00817> N() {
      return this.located;
   }
}
