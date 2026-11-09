package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalIntRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.caffeinemc.mods.lithium.common.util.ChunkConstants;

public class class03788 {
   private final class04782 N;

   public class03788(class04782 var1) {
      super();
      this.N = var1;
   }

   private class00570 N(class04751 var1, int var2, int var3) {
      return ChunkConstants.DUMMY_CHUNK;
   }

   private class01166 N(class08050 var1, int var2) {
      return null;
   }

   private boolean N(class01166 var1, class03556 var2, class06889 var3, class01164 var4, class01159 var5, int var6, int var7, int var8) {
      if (var1 == null) {
         Int2ObjectMap<class01166> int2objectmap = this.N.lithium$getData().gameEventDispatchers().get(class07321.u(var6, var7));
         var1 = int2objectmap == null ? null : (class01166)int2objectmap.get(var8);
      }

      return var1 != null && var1.N(var2, var3, var4, var5);
   }

   private boolean N(class01166 var1, class03556 var2, class06889 var3, class01164 var4, class01159 var5, LocalIntRef var6, LocalIntRef var7, LocalIntRef var8) {
      return this.N(var1, var2, var3, var4, var5, var6.get(), var7.get(), var8.get());
   }

   private void N(List<class01148> var1) {
      Collections.sort(var1);

      for (class01148 class01148 : var1) {
         class01148.u().N(this.N, class01148.N(), class01148.L(), class01148.y());
      }
   }

   public void N(class03556<class01194> var1, class06889 var2, class01164 var3) {
      int i = ((class01194)var1.N()).N();
      class07209 class07209 = class07209.method_49638(var2);
      int j = class01296.N(class07209.method_10263() - i);
      int k = class01296.N(class07209.method_10264() - i);
      int l = class01296.N(class07209.method_10260() - i);
      int i1 = class01296.N(class07209.method_10263() + i);
      int j1 = class01296.N(class07209.method_10264() + i);
      int k1 = class01296.N(class07209.method_10260() + i);
      ArrayList arraylist = new ArrayList();
      class01159 class01159 = (var5x, var6x) -> {
         if (var5x.L() == class01163.field_40354) {
            arraylist.add(new class01148(var1, var2, var3, var5x, var6x));
         } else {
            var5x.N(this.N, var1, var3, var2);
         }
      };
      boolean flag = false;

      for (int l1 = j; l1 <= i1; l1++) {
         for (int i2 = l; i2 <= k1; i2++) {
            class04751 class04751 = this.N.method_14178();
            class00570 class00570 = this.N(class04751, l1, i2);
            if (class00570 != null) {
               for (int j2 = k; j2 <= j1; j2++) {
                  class01166 class01166 = this.N(class00570, j2);
                  LocalIntRefImpl localintrefimpl = new LocalIntRefImpl();
                  LocalIntRefImpl localintrefimpl1 = new LocalIntRefImpl();
                  LocalIntRefImpl localintrefimpl2 = new LocalIntRefImpl();
                  localintrefimpl.init(l1);
                  localintrefimpl1.init(i2);
                  localintrefimpl2.init(j2);
                  boolean flag1 = this.N(class01166, var1, var2, var3, class01159, localintrefimpl, localintrefimpl1, localintrefimpl2);
                  j2 = localintrefimpl2.dispose();
                  i2 = localintrefimpl1.dispose();
                  l1 = localintrefimpl.dispose();
                  flag |= flag1;
               }
            }
         }
      }

      if (!arraylist.isEmpty()) {
         this.N(arraylist);
      }

      if (flag) {
         this.N.method_74535().y(class07209.method_49638(var2), class00429.s, new class00435(var1, var2));
      }
   }
}
