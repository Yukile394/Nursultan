package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class00729 extends class00864 implements class04107 {
   protected static final MapCodec<class02692> y = class02692.L.fieldOf("suspicious_stew_effects");
   public static final MapCodec<class00729> L = RecordCodecBuilder.mapCodec(var0 -> var0.group(y.forGetter(class00729::L), t()).apply(var0, class00729::new));
   private static final class00494 N = class00891.y(6.0, 0.0, 10.0);
   private final class02692 u;

   @Override
   public class02692 L() {
      return this.u;
   }

   public class00729(class02692 var1, class01362 var2) {
      super(var2);
      this.u = var1;
   }

   public class00729(class03556<class07084> var1, float var2, class01362 var3) {
      this(N(var1, var2), var3);
   }

   @Nullable
   public class07055 y() {
      return null;
   }

   @Override
   public MapCodec<? extends class00729> N() {
      return L;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return N.method_64034(var1.N(var3));
   }

   protected static class02692 N(class03556<class07084> var0, float var1) {
      return new class02692(List.of(new class02679(var0, class04995.y(var1 * 20.0F))));
   }
}
