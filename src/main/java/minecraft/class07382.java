package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class07382(boolean started, List<class07947> players, class07808 version) {
   public static final Codec<class07382> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.BOOL.fieldOf("started").forGetter(class07382::N),
            class07947.N.codec().listOf().lenientOptionalFieldOf("players", List.of()).forGetter(class07382::y),
            class07808.N.fieldOf("version").forGetter(class07382::L)
         )
         .apply(var0, class07382::new)
   );
   public static final class07382 y = new class07382(false, List.of(), class07808.N());

   public class07808 L() {
      return this.version;
   }

   public class07382(boolean started, List<class07947> players, class07808 version) {
      super();
      this.started = started;
      this.players = players;
      this.version = version;
   }

   public List<class07947> y() {
      return this.players;
   }

   public boolean N() {
      return this.started;
   }
}
