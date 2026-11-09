package minecraft;

import Nursultan.class10329;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.function.Consumer;

public class class04289 extends class03328 {
   public static final MapCodec<class04289> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class03530.N(class04227.F).fieldOf("name").forGetter(var0x -> var0x.u), Codec.BOOL.fieldOf("expand").forGetter(var0x -> var0x.E))
         .and(y(var0))
         .apply(var0, class04289::new)
   );
   private final class03530<class06581> u;
   private final boolean E;

   private class04289(class03530<class06581> var1, boolean var2, int var3, int var4, List<class05957> var5, List<class08122> var6) {
      super(var3, var4, var5, var6);
      this.u = var1;
      this.E = var2;
   }

   @Override
   public boolean expand(class05908 var1, Consumer<class03599> var2) {
      return this.E ? this.N(var1, var2) : super.expand(var1, var2);
   }

   public static class03366<?> y(class03530<class06581> var0) {
      return N((var1, var2, var3, var4) -> new class04289(var0, true, var1, var2, var3, var4));
   }

   @Override
   public class05950 N() {
      return class03942.R;
   }

   public static class03366<?> N(class03530<class06581> var0) {
      return N((var1, var2, var3, var4) -> new class04289(var0, false, var1, var2, var3, var4));
   }

   @Override
   public void N(Consumer<class06584> var1, class05908 var2) {
      class04206.B.u(this.u).forEach(var1x -> var1.accept(new class06584((class03556<class06581>)var1x)));
   }

   private boolean N(class05908 var1, Consumer<class03599> var2) {
      if (!this.N(var1)) {
         return false;
      } else {
         for (class03556 class03556 : class04206.B.u(this.u)) {
            var2.accept(new class10329(this, class03556));
         }

         return true;
      }
   }
}
