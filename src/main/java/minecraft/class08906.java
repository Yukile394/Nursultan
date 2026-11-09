package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08906(boolean handAnimationOnSwap, boolean oversizedInGui, float swapAnimationScale) {
   public static final class08906 N = new class08906(true, false, 1.0F);
   public static final MapCodec<class08906> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.BOOL.optionalFieldOf("hand_animation_on_swap", true).forGetter(class08906::N),
            Codec.BOOL.optionalFieldOf("oversized_in_gui", false).forGetter(class08906::y),
            Codec.FLOAT.optionalFieldOf("swap_animation_scale", 1.0F).forGetter(class08906::L)
         )
         .apply(var0, class08906::new)
   );

   public float L() {
      return this.swapAnimationScale;
   }

   public class08906(boolean handAnimationOnSwap, boolean oversizedInGui, float swapAnimationScale) {
      this.handAnimationOnSwap = handAnimationOnSwap;
      this.oversizedInGui = oversizedInGui;
      this.swapAnimationScale = swapAnimationScale;
   }

   public boolean y() {
      return this.oversizedInGui;
   }

   public boolean N() {
      return this.handAnimationOnSwap;
   }
}
