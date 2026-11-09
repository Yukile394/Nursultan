package minecraft;

import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class class03647 {
   public static final Codec<class03647> u = class04206.x.T().dispatch(class03647::N, class03619::N);
   protected final class02142 i;
   protected final class01471 R;
   protected final Optional<class03628> M;

   public class03647(class02142 var1, class01471 var2, Optional<class03628> var3) {
      super();
      this.i = var1;
      this.R = var2;
      this.M = var3;
   }

   public class07209 N(class07209 var1, class06069 var2) {
      return var1.method_10086(this.i.N(var2));
   }

   protected static <P extends class03647> P3<Mu<P>, class02142, class01471, Optional<class03628>> N(Instance<P> var0) {
      return var0.group(
         class02142.L.fieldOf("trunk_offset_y").forGetter(var0x -> var0x.i),
         class01471.N.fieldOf("root_provider").forGetter(var0x -> var0x.R),
         class03628.N.optionalFieldOf("above_root_placement").forGetter(var0x -> var0x.M)
      );
   }

   protected abstract class03619<?> N();

   public abstract boolean N(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, class07209 var4, class07209 var5, class01476 var6);

   public boolean N(class04887 var1, class07209 var2) {
      return class03194.L(var1, var2);
   }

   public void N(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, class07209 var4, class01476 var5) {
      if (this.N(var1, var4)) {
         var2.accept(var4, this.N(var1, var4, this.R.N(var3, var4)));
         if (this.M.isPresent()) {
            class03628 class03628 = this.M.get();
            class07209 class07209 = var4.method_10084();
            if (var3.z() < class03628.y() && var1.method_16358(class07209, class01339::P)) {
               var2.accept(class07209, this.N(var1, class07209, class03628.N().N(var3, class07209)));
            }
         }
      }
   }

   protected class00500 N(class04887 var1, class07209 var2, class00500 var3) {
      if (var3.y(class06665.q)) {
         boolean flag = var1.method_35237(var2, var0 -> var0.N(class01231.N));
         return var3.y(class06665.q, flag);
      } else {
         return var3;
      }
   }
}
