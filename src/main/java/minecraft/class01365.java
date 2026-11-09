package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class01365(Optional<Boolean> inOpenWater) implements class03622 {
   public static final class01365 N = new class01365(Optional.empty());
   public static final MapCodec<class01365> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.BOOL.optionalFieldOf("in_open_water").forGetter(class01365::y)).apply(var0, class01365::new)
   );

   public class01365(Optional<Boolean> inOpenWater) {
      super();
      this.inOpenWater = inOpenWater;
   }

   public Optional<Boolean> y() {
      return this.inOpenWater;
   }

   @Override
   public MapCodec<class01365> N() {
      return class03631.y;
   }

   public static class01365 N(boolean var0) {
      return new class01365(Optional.of(var0));
   }

   @Override
   public boolean N(class07049 var1, class04782 var2, @Nullable class06889 var3) {
      if (this.inOpenWater.isEmpty()) {
         return true;
      } else {
         return var1 instanceof class00696 class00696 ? this.inOpenWater.get() == class00696.y() : false;
      }
   }
}
