package minecraft;

import Nursultan.class10094;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03022(class06055 anchor, int surfaceDepthMultiplier, boolean addStoneDepth) implements class04017 {
   static final class03979<class03022> i = class03979.N(
      RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               class06055.N.fieldOf("anchor").forGetter(class03022::y),
               Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(class03022::L),
               Codec.BOOL.fieldOf("add_stone_depth").forGetter(class03022::u)
            )
            .apply(var0, class03022::new)
      )
   );

   public int L() {
      return this.surfaceDepthMultiplier;
   }

   class03022(class06055 anchor, int surfaceDepthMultiplier, boolean addStoneDepth) {
      this.anchor = anchor;
      this.surfaceDepthMultiplier = surfaceDepthMultiplier;
      this.addStoneDepth = addStoneDepth;
   }

   public boolean u() {
      return this.addStoneDepth;
   }

   public class06055 y() {
      return this.anchor;
   }

   @Override
   public class03979<? extends class04017> N() {
      return i;
   }

   public class04018 apply(class04039 var1) {
      return new class10094(this, var1);
   }
}
