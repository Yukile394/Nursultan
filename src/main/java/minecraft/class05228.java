package minecraft;

import Nursultan.class10497;
import Nursultan.class10501;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;
import org.jspecify.annotations.Nullable;

public class class05228 {
   final class05233 N;

   public String L(String var1, int var2, class00405 var3) {
      MutableFloat mutablefloat = new MutableFloat();
      MutableInt mutableint = new MutableInt(var1.length());
      class05232.y(var1, var3, (var4x, var5x, var6) -> {
         if (mutablefloat.addAndGet(this.N.getWidth(var6, var5x)) > var2) {
            return false;
         } else {
            mutableint.setValue(var4x);
            return true;
         }
      });
      return var1.substring(mutableint.intValue());
   }

   public class05228(class05233 var1) {
      super();
      this.N = var1;
   }

   public List<class05936> i(String var1, int var2, class00405 var3) {
      ArrayList arraylist = Lists.newArrayList();
      this.N(var1, var2, var3, false, (var2x, var3x, var4x) -> arraylist.add(class05936.N(var1.substring(var3x, var4x), var2x)));
      return arraylist;
   }

   public int u(String var1, int var2, class00405 var3) {
      class05198 class05198 = new class05198(this, var2);
      class05232.L(var1, var3, class05198);
      return class05198.N();
   }

   public List<class05936> y(class05936 var1, int var2, class00405 var3) {
      ArrayList arraylist = Lists.newArrayList();
      this.N(var1, var2, var3, (var1x, var2x) -> arraylist.add(var1x));
      return arraylist;
   }

   public String y(String var1, int var2, class00405 var3) {
      return var1.substring(0, this.N(var1, var2, var3));
   }

   public void N(String var1, int var2, class00405 var3, boolean var4, class10497 var5) {
      int i = 0;
      int j = var1.length();
      class00405 class00405 = var3;

      while (i < j) {
         class05198 class05198 = new class05198(this, var2);
         if (class05232.N(var1, i, class00405, var3, class05198)) {
            var5.accept(class00405, i, j);
            break;
         }

         int k = class05198.N();
         char c0 = var1.charAt(k);
         int l = c0 != '\n' && c0 != ' ' ? k : k + 1;
         var5.accept(class00405, i, var4 ? l : k);
         i = l;
         class00405 = class05198.y();
      }
   }

   public static int N(String var0, int var1, int var2, boolean var3) {
      int i = var2;
      boolean flag = var1 < 0;
      int j = Math.abs(var1);

      for (int k = 0; k < j; k++) {
         if (flag) {
            while (var3 && i > 0 && (var0.charAt(i - 1) == ' ' || var0.charAt(i - 1) == '\n')) {
               i--;
            }

            while (i > 0 && var0.charAt(i - 1) != ' ' && var0.charAt(i - 1) != '\n') {
               i--;
            }
         } else {
            int l = var0.length();
            int i1 = var0.indexOf(32, i);
            int j1 = var0.indexOf(10, i);
            if (i1 == -1 && j1 == -1) {
               i = -1;
            } else if (i1 != -1 && j1 != -1) {
               i = Math.min(i1, j1);
            } else if (i1 != -1) {
               i = i1;
            } else {
               i = j1;
            }

            if (i == -1) {
               i = l;
            } else {
               while (var3 && i < l && (var0.charAt(i) == ' ' || var0.charAt(i) == '\n')) {
                  i++;
               }
            }
         }
      }

      return i;
   }

   public class05936 N(class05936 var1, int var2, class00405 var3) {
      class05209 class05209 = new class05209(this, var2);
      return var1.N(new class10501(this, class05209), var3).orElse(var1);
   }

   public float N(class05936 var1) {
      MutableFloat mutablefloat = new MutableFloat();
      class05232.N(var1, class00405.N, (var2x, var3, var4) -> {
         mutablefloat.add(this.N.getWidth(var4, var3));
         return true;
      });
      return mutablefloat.floatValue();
   }

   public int N(String var1, int var2, class00405 var3) {
      class05209 class05209 = new class05209(this, var2);
      class05232.N(var1, var3, class05209);
      return class05209.N();
   }

   public float N(@Nullable String var1) {
      if (var1 == null) {
         return 0.0F;
      } else {
         MutableFloat mutablefloat = new MutableFloat();
         class05232.L(var1, class00405.N, (var2x, var3, var4) -> {
            mutablefloat.add(this.N.getWidth(var4, var3));
            return true;
         });
         return mutablefloat.floatValue();
      }
   }

   public float N(class01028 var1) {
      MutableFloat mutablefloat = new MutableFloat();
      var1.accept((var2x, var3, var4) -> {
         mutablefloat.add(this.N.getWidth(var4, var3));
         return true;
      });
      return mutablefloat.floatValue();
   }

   public void N(class05936 var1, int var2, class00405 var3, BiConsumer<class05936, Boolean> var4) {
      ArrayList arraylist = Lists.newArrayList();
      var1.N((var1x, var2x) -> {
         if (!var2x.isEmpty()) {
            arraylist.add(new class05204(var2x, var1x));
         }

         return Optional.empty();
      }, var3);
      class05201 class05201 = new class05201(arraylist);
      boolean flag = true;
      boolean flag1 = false;
      boolean flag2 = false;

      while (flag) {
         flag = false;
         class05198 class05198 = new class05198(this, var2);

         for (class05204 class05204 : class05201.N) {
            if (!class05232.N(class05204.N, 0, class05204.y, var3, class05198)) {
               int i = class05198.N();
               class00405 class00405 = class05198.y();
               char c0 = class05201.N(i);
               boolean flag3 = c0 == '\n';
               boolean flag4 = flag3 || c0 == ' ';
               flag1 = flag3;
               class05936 class05936x = class05201.N(i, flag4 ? 1 : 0, class00405);
               var4.accept(class05936x, flag2);
               flag2 = !flag3;
               flag = true;
               break;
            }

            class05198.N(class05204.N.length());
         }
      }

      class05936 class05936 = class05201.N();
      if (class05936 != null) {
         var4.accept(class05936, flag2);
      } else if (flag1) {
         var4.accept(class05936.u, false);
      }
   }
}
