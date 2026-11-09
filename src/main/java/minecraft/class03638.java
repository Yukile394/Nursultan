package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class03638(class00836 size) implements class03622 {
   public static final MapCodec<class03638> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class00836.u.optionalFieldOf("size", class00836.L).forGetter(class03638::y)).apply(var0, class03638::new)
   );

   public class03638(class00836 size) {
      super();
      this.size = size;
   }

   public class00836 y() {
      return this.size;
   }

   @Override
   public boolean N(class07049 var1, class04782 var2, @Nullable class06889 var3) {
      return var1 instanceof class07162 class07162 ? this.size.u(class07162.t()) : false;
   }

   public static class03638 N(class00836 var0) {
      return new class03638(var0);
   }

   @Override
   public MapCodec<class03638> N() {
      return class03631.u;
   }
}
