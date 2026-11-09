package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record class02816(int rgb) implements class02694 {
   public static final Codec<class02816> N = class06338.E.xmap(class02816::new, class02816::N);
   public static final class02362<ByteBuf, class02816> y = class02362.N(class02389.M, class02816::N, class02816::new);
   public static final int L = -6265536;

   public class02816(int rgb) {
      this.rgb = rgb;
   }

   public static class06584 N(class06584 var0, List<class06559> var1) {
      if (!var0.N(class01226.Lz)) {
         return class06584.E;
      } else {
         class06584 class06584 = var0.L(1);
         int i = 0;
         int j = 0;
         int k = 0;
         int l = 0;
         int i1 = 0;
         class02816 class02816 = class06584.method_58694(class02484.F);
         if (class02816 != null) {
            int j1 = class02566.L(class02816.N());
            int k1 = class02566.u(class02816.N());
            int l1 = class02566.i(class02816.N());
            l += Math.max(j1, Math.max(k1, l1));
            i += j1;
            j += k1;
            k += l1;
            i1++;
         }

         for (class06559 class06559 : var1) {
            int j3 = class06559.N().L();
            int i2 = class02566.L(j3);
            int j2 = class02566.u(j3);
            int k2 = class02566.i(j3);
            l += Math.max(i2, Math.max(j2, k2));
            i += i2;
            j += j2;
            k += k2;
            i1++;
         }

         int l2 = i / i1;
         int i3 = j / i1;
         int k3 = k / i1;
         float f = (float)l / i1;
         float f1 = Math.max(l2, Math.max(i3, k3));
         l2 = (int)(l2 * f / f1);
         i3 = (int)(i3 * f / f1);
         k3 = (int)(k3 * f / f1);
         int l3 = class02566.y(0, l2, i3, k3);
         class06584.N(class02484.F, new class02816(l3));
         return class06584;
      }
   }

   public int N() {
      return this.rgb;
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      if (var3.N()) {
         var2.accept(class00392.N("item.color", String.format(Locale.ROOT, "#%06X", this.rgb)).N(class06541.field_1080));
      } else {
         var2.accept(class00392.L("item.dyed").N(class06541.field_1080, class06541.field_1056));
      }
   }

   public static int N(class06584 var0, int var1) {
      class02816 class02816 = var0.method_58694(class02484.F);
      return class02816 != null ? class02566.M(class02816.N()) : var1;
   }
}
