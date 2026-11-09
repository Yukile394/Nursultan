package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;

public record class07379(class07415 message, boolean overlay, Optional<List<class07947>> receivingPlayers) {
   public static final Codec<class07379> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class07415.N.fieldOf("message").forGetter(class07379::N),
            Codec.BOOL.fieldOf("overlay").forGetter(class07379::y),
            class07947.N.codec().listOf().lenientOptionalFieldOf("receivingPlayers").forGetter(class07379::L)
         )
         .apply(var0, class07379::new)
   );

   public Optional<List<class07947>> L() {
      return this.receivingPlayers;
   }

   public class07379(class07415 message, boolean overlay, Optional<List<class07947>> receivingPlayers) {
      super();
      this.message = message;
      this.overlay = overlay;
      this.receivingPlayers = receivingPlayers;
   }

   public boolean y() {
      return this.overlay;
   }

   public class07415 N() {
      return this.message;
   }
}
