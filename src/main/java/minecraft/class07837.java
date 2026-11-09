package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class07837(int max, int online, List<class08774> sample) {
   public static final Codec<class07837> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.INT.fieldOf("max").forGetter(class07837::N),
            Codec.INT.fieldOf("online").forGetter(class07837::y),
            class08774.N.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(class07837::L)
         )
         .apply(var0, class07837::new)
   );

   public List<class08774> L() {
      return this.sample;
   }

   public class07837(int max, int online, List<class08774> sample) {
      super();
      this.max = max;
      this.online = online;
      this.sample = sample;
   }

   public int y() {
      return this.online;
   }

   public int N() {
      return this.max;
   }
}
