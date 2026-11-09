package minecraft;

import Nursultan.class10091;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03033(int offset, int surfaceDepthMultiplier, boolean addStoneDepth) implements class04017 {
   static final class03979<class03033> i = class03979.N(
      RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               Codec.INT.fieldOf("offset").forGetter(class03033::y),
               Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(class03033::L),
               Codec.BOOL.fieldOf("add_stone_depth").forGetter(class03033::u)
            )
            .apply(var0, class03033::new)
      )
   );

   public int L() {
      return this.surfaceDepthMultiplier;
   }

   class03033(int offset, int surfaceDepthMultiplier, boolean addStoneDepth) {
      super();
      this.offset = offset;
      this.surfaceDepthMultiplier = surfaceDepthMultiplier;
      this.addStoneDepth = addStoneDepth;
   }

   public boolean u() {
      return this.addStoneDepth;
   }

   public int y() {
      return this.offset;
   }

   @Override
   public class03979<? extends class04017> N() {
      return i;
   }

   public class04018 apply(class04039 var1) {
      return new class10091(this, var1);
   }
}
