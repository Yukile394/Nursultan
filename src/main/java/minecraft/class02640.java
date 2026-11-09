package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class02640(boolean hasRaid, boolean isCaptain) implements class03622 {
   public static final MapCodec<class02640> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.BOOL.optionalFieldOf("has_raid", false).forGetter(class02640::y), Codec.BOOL.optionalFieldOf("is_captain", false).forGetter(class02640::L)
         )
         .apply(var0, class02640::new)
   );
   public static final class02640 y = new class02640(false, true);

   public boolean L() {
      return this.isCaptain;
   }

   public class02640(boolean hasRaid, boolean isCaptain) {
      this.hasRaid = hasRaid;
      this.isCaptain = isCaptain;
   }

   public boolean y() {
      return this.hasRaid;
   }

   @Override
   public boolean N(class07049 var1, class04782 var2, @Nullable class06889 var3) {
      return !(var1 instanceof class04882 class04882) ? false : class04882.e() == this.hasRaid && class04882.V() == this.isCaptain;
   }

   @Override
   public MapCodec<class02640> N() {
      return class03631.i;
   }
}
