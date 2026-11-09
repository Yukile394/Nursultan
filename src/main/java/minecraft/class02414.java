package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Map;

public record class02414(Map<class01894, class02430> internalTargets, List<class02433> passes) {
   public static final Codec<class02414> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.unboundedMap(class01894.N, class02430.N).optionalFieldOf("targets", Map.of()).forGetter(class02414::N),
            class02433.N.listOf().optionalFieldOf("passes", List.of()).forGetter(class02414::y)
         )
         .apply(var0, class02414::new)
   );

   public class02414(Map<class01894, class02430> internalTargets, List<class02433> passes) {
      super();
      this.internalTargets = internalTargets;
      this.passes = passes;
   }

   public List<class02433> y() {
      return this.passes;
   }

   public Map<class01894, class02430> N() {
      return this.internalTargets;
   }
}
