package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06858 extends class00891 {
   public static final MapCodec<class06858> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02142.N(0, 10).fieldOf("experience").forGetter(var0x -> var0x.y), t()).apply(var0, class06858::new)
   );
   private final class02142 y;

   public class06858(class02142 var1, class01362 var2) {
      super(var2);
      this.y = var1;
   }

   @Override
   public MapCodec<? extends class06858> N() {
      return N;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06584 var4, boolean var5) {
      super.N(var1, var2, var3, var4, var5);
      if (var5) {
         this.N(var2, var3, var4, this.y);
      }
   }
}
