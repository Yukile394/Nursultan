package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class03301 extends class02142 {
   public static final MapCodec<class03301> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class04540.y(class02142.L).fieldOf("distribution").forGetter(var0x -> var0x.y)).apply(var0, class03301::new)
   );
   private final class04540<class02142> y;
   private final int R;
   private final int M;

   @Override
   public int L() {
      return this.M;
   }

   public class03301(class04540<class02142> var1) {
      super();
      this.y = var1;
      int i = Integer.MAX_VALUE;
      int j = Integer.MIN_VALUE;

      for (class04523 class04523 : var1.u()) {
         int k = ((class02142)class04523.N()).y();
         int l = ((class02142)class04523.N()).L();
         i = Math.min(i, k);
         j = Math.max(j, l);
      }

      this.R = i;
      this.M = j;
   }

   @Override
   public class02139<?> u() {
      return class02139.i;
   }

   @Override
   public int y() {
      return this.R;
   }

   @Override
   public int N(class06069 var1) {
      return this.y.y(var1).N(var1);
   }
}
