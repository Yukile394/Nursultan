package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class08219(Optional<Boolean> sheared) implements class03622 {
   public static final MapCodec<class08219> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.BOOL.optionalFieldOf("sheared").forGetter(class08219::L)).apply(var0, class08219::new)
   );

   public Optional<Boolean> L() {
      return this.sheared;
   }

   public class08219(Optional<Boolean> sheared) {
      super();
      this.sheared = sheared;
   }

   public static class08219 y() {
      return new class08219(Optional.of(false));
   }

   @Override
   public boolean N(class07049 var1, class04782 var2, @Nullable class06889 var3) {
      return var1 instanceof class07881 class07881 ? !this.sheared.isPresent() || class07881.m() == this.sheared.get() : false;
   }

   @Override
   public MapCodec<class08219> N() {
      return class03631.R;
   }
}
