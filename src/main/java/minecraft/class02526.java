package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02526(class02546 duration) implements class02560 {
   public static final MapCodec<class02526> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02546.y.fieldOf("duration").forGetter(var0x -> var0x.duration)).apply(var0, class02526::new)
   );

   public class02526(class02546 duration) {
      super();
      this.duration = duration;
   }

   public class02546 y() {
      return this.duration;
   }

   @Override
   public MapCodec<class02526> N() {
      return N;
   }

   @Override
   public void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5) {
      var4.method_5639(this.duration.N(var2));
   }
}
