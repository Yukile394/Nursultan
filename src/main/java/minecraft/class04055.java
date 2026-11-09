package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class04055(List<class04031> layers, class07211 direction, class04025 allowedPlacement, boolean prioritizeTip) implements class06386 {
   public static final Codec<class04055> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class04031.N.listOf().fieldOf("layers").forGetter(class04055::N),
            class07211.field_29502.fieldOf("direction").forGetter(class04055::y),
            class04025.y.fieldOf("allowed_placement").forGetter(class04055::L),
            Codec.BOOL.fieldOf("prioritize_tip").forGetter(class04055::i)
         )
         .apply(var0, class04055::new)
   );

   public class04025 L() {
      return this.allowedPlacement;
   }

   public class04055(List<class04031> layers, class07211 direction, class04025 allowedPlacement, boolean prioritizeTip) {
      this.layers = layers;
      this.direction = direction;
      this.allowedPlacement = allowedPlacement;
      this.prioritizeTip = prioritizeTip;
   }

   public boolean i() {
      return this.prioritizeTip;
   }

   public class07211 y() {
      return this.direction;
   }

   public static class04055 y(class02142 var0, class01471 var1) {
      return new class04055(List.of(N(var0, var1)), class07211.field_11036, class04025.L, false);
   }

   public List<class04031> N() {
      return this.layers;
   }

   public static class04031 N(class02142 var0, class01471 var1) {
      return new class04031(var0, var1);
   }
}
