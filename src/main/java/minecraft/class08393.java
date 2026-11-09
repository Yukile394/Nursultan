package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import net.irisshaders.iris.mixin.texture.AnimationMetadataSectionAccessor;

public record class08393(
   Optional<List<class08421>> frames, Optional<Integer> frameWidth, Optional<Integer> frameHeight, int defaultFrameTime, boolean interpolatedFrames
) implements AnimationMetadataSectionAccessor {
   public static final Codec<class08393> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class08421.y.listOf().optionalFieldOf("frames").forGetter(class08393::N),
            class06338.b.optionalFieldOf("width").forGetter(class08393::y),
            class06338.b.optionalFieldOf("height").forGetter(class08393::L),
            class06338.b.optionalFieldOf("frametime", 1).forGetter(class08393::u),
            Codec.BOOL.optionalFieldOf("interpolate", false).forGetter(class08393::i)
         )
         .apply(var0, class08393::new)
   );
   public static final class02968<class08393> y = new class02968<>("animation", N);

   public Optional<Integer> L() {
      return this.frameHeight;
   }

   public class08393(
      Optional<List<class08421>> frames, Optional<Integer> frameWidth, Optional<Integer> frameHeight, int defaultFrameTime, boolean interpolatedFrames
   ) {
      super();
      this.frames = frames;
      this.frameWidth = frameWidth;
      this.frameHeight = frameHeight;
      this.defaultFrameTime = defaultFrameTime;
      this.interpolatedFrames = interpolatedFrames;
   }

   public boolean i() {
      return this.interpolatedFrames;
   }

   public int u() {
      return this.defaultFrameTime;
   }

   public Optional<Integer> y() {
      return this.frameWidth;
   }

   public class02002 N(int var1, int var2) {
      if (this.frameWidth.isPresent()) {
         return this.frameHeight.isPresent() ? new class02002(this.frameWidth.get(), this.frameHeight.get()) : new class02002(this.frameWidth.get(), var2);
      } else if (this.frameHeight.isPresent()) {
         return new class02002(var1, this.frameHeight.get());
      } else {
         int i = Math.min(var1, var2);
         return new class02002(i, i);
      }
   }

   public Optional<List<class08421>> N() {
      return this.frames;
   }
}
