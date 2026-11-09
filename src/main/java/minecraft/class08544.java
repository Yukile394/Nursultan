package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class08544(class02470<?> predicate) implements class08909 {
   public static final MapCodec<class08544> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02500.N("predicate").forGetter(class08544::y)).apply(var0, class08544::new)
   );

   public class08544(class02470<?> predicate) {
      this.predicate = predicate;
   }

   public class02470<?> y() {
      return this.predicate;
   }

   @Override
   public MapCodec<class08544> N() {
      return N;
   }

   @Override
   public boolean method_65638(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      return this.predicate.y().N(var1);
   }
}
