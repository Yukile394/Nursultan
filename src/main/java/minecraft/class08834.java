package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class08834(int value) implements class08843 {
   public static final MapCodec<class08834> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.E.fieldOf("value").forGetter(class08834::y)).apply(var0, class08834::new)
   );

   public class08834(int value) {
      super();
      value = class02566.M(value);
      this.value = value;
   }

   public int y() {
      return this.value;
   }

   @Override
   public MapCodec<class08834> N() {
      return N;
   }

   @Override
   public int N(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3) {
      return this.value;
   }
}
