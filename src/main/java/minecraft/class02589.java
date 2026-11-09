package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.stream.Stream;

public class class02589 extends class04297 {
   public static final MapCodec<class02589> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class07209.field_25064.listOf().fieldOf("positions").forGetter(var0x -> var0x.L)).apply(var0, class02589::new)
   );
   private final List<class07209> L;

   private class02589(List<class07209> var1) {
      super();
      this.L = var1;
   }

   public static class02589 N(class07209... var0) {
      return new class02589(List.of(var0));
   }

   @Override
   public class04323<?> N() {
      return class04323.P;
   }

   private static boolean N(int var0, int var1, class07209 var2) {
      return var0 == class01296.N(var2.method_10263()) && var1 == class01296.N(var2.method_10260());
   }

   @Override
   public Stream<class07209> N(class01034 var1, class06069 var2, class07209 var3) {
      int i = class01296.N(var3.method_10263());
      int j = class01296.N(var3.method_10260());
      boolean flag = false;

      for (class07209 class07209 : this.L) {
         if (N(i, j, class07209)) {
            flag = true;
            break;
         }
      }

      return !flag ? Stream.empty() : this.L.stream().filter(var2x -> N(i, j, var2x));
   }
}
