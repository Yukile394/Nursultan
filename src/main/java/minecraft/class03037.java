package minecraft;

import Nursultan.class10092;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03037(int offset, boolean addSurfaceDepth, int secondaryDepthRange, class02258 surfaceType) implements class04017 {
   static final class03979<class03037> i = class03979.N(
      RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               Codec.INT.fieldOf("offset").forGetter(class03037::y),
               Codec.BOOL.fieldOf("add_surface_depth").forGetter(class03037::L),
               Codec.INT.fieldOf("secondary_depth_range").forGetter(class03037::u),
               class02258.field_29315.fieldOf("surface_type").forGetter(class03037::i)
            )
            .apply(var0, class03037::new)
      )
   );

   public boolean L() {
      return this.addSurfaceDepth;
   }

   class03037(int offset, boolean addSurfaceDepth, int secondaryDepthRange, class02258 surfaceType) {
      this.offset = offset;
      this.addSurfaceDepth = addSurfaceDepth;
      this.secondaryDepthRange = secondaryDepthRange;
      this.surfaceType = surfaceType;
   }

   public class02258 i() {
      return this.surfaceType;
   }

   public int u() {
      return this.secondaryDepthRange;
   }

   public int y() {
      return this.offset;
   }

   @Override
   public class03979<? extends class04017> N() {
      return i;
   }

   public class04018 apply(class04039 var1) {
      boolean flag = this.surfaceType == class02258.field_29313;
      return new class10092(this, var1, flag);
   }
}
