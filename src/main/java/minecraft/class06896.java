package minecraft;

import Nursultan.class10682;
import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.jspecify.annotations.Nullable;

public class class06896 extends class03710 {
   public static final MapCodec<class06896> u = y(class06896::new);
   public static final class06667 i = class06665.n;
   private static final Map<class07290, List<class10682>> N = new WeakHashMap<>();
   public static final int R = 60;
   public static final int M = 8;
   public static final int B = 160;
   private static final int y = 2;

   public class06896(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(i, true));
   }

   private void y(class07299 var1, class07209 var2, class00500 var3) {
      class02733 class02733 = this.N(var1, var3);

      for (class07211 class07211 : class07211.values()) {
         var1.method_8452(var2.method_10093(class07211), this, class02752.N(class02733, class07211));
      }
   }

   @Override
   protected int y(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var4 == class07211.field_11033 ? var1.N(var2, var3, var4) : 0;
   }

   @Nullable
   protected class02733 N(class07299 var1, class00500 var2) {
      return class02752.N(var1, null, class07211.field_11036);
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (var1.L(i)) {
         double d0 = var3.method_10263() + 0.5 + (var4.U() - 0.5) * 0.2;
         double d1 = var3.method_10264() + 0.7 + (var4.U() - 0.5) * 0.2;
         double d2 = var3.method_10260() + 0.5 + (var4.U() - 0.5) * 0.2;
         var2.method_8406(class07138.y, d0, d1, d2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(i);
   }

   private static boolean N(class07299 var0, class07209 var1, boolean var2) {
      List<class10682> list = N.computeIfAbsent(var0, var0x -> Lists.newArrayList());
      if (var2) {
         list.add(new class10682(var1.method_10062(), var0.N()));
      }

      int ix = 0;
      Iterator<class10682> iterator = list.iterator();

      while (iterator.hasNext()) {
         if (iterator.next().N.equals(var1)) {
            if (++ix >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public MapCodec<? extends class06896> N() {
      return u;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      if (!var4) {
         this.y(var2, var3, var1);
      }
   }

   @Override
   protected int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var1.L(i) && class07211.field_11036 != var4 ? 15 : 0;
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      this.y(var2, var3, var1);
   }

   protected boolean N(class07299 var1, class07209 var2, class00500 var3) {
      return var1.L(var2.method_10074(), class07211.field_11033);
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      if (var1.L(i) == this.N(var2, var3, var1) && !var2.method_8397().y(var3, this)) {
         var2.N(var3, this, 2);
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      boolean flag = this.N(var2, var3, var1);
      List<class10682> list = N.get(var2);

      while (list != null && !list.isEmpty() && var2.N() - list.get(0).y > 60L) {
         list.remove(0);
      }

      if (var1.L(i)) {
         if (flag) {
            var2.method_8652(var3, var1.y(i, false), 3);
            if (N(var2, var3, true)) {
               var2.N(1502, var3, 0);
               var2.N(var3, var2.method_8320(var3).i(), 160);
            }
         }
      } else if (!flag && !N(var2, var3, false)) {
         var2.method_8652(var3, var1.y(i, true), 3);
      }
   }

   @Override
   protected boolean i_(class00500 var1) {
      return true;
   }
}
