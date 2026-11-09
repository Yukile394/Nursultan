package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class09027(class00392 label, Optional<class00392> tooltip, int width) {
   public static final int N = 150;
   public static final MapCodec<class09027> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class03748.N.fieldOf("label").forGetter(class09027::N),
            class03748.N.optionalFieldOf("tooltip").forGetter(class09027::y),
            class09037.y.optionalFieldOf("width", 150).forGetter(class09027::L)
         )
         .apply(var0, class09027::new)
   );

   public int L() {
      return this.width;
   }

   public class09027(class00392 var1, int var2) {
      this(var1, Optional.empty(), var2);
   }

   public class09027(class00392 label, Optional<class00392> tooltip, int width) {
      super();
      this.label = label;
      this.tooltip = tooltip;
      this.width = width;
   }

   public Optional<class00392> y() {
      return this.tooltip;
   }

   public class00392 N() {
      return this.label;
   }
}
