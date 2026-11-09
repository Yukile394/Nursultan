package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class00659 extends class00891 {
   public static final MapCodec<class00659> N = y(class00659::new);
   public static final class06667 y = class06901.R;
   public static final class06667 L = class06901.y;
   public static final class06667 u = class06901.L;
   public static final class06667 i = class06901.u;
   public static final class06667 R = class06901.i;
   public static final Map<class07211, class06667> M = class06901.B
      .entrySet()
      .stream()
      .filter(var0 -> var0.getKey() != class07211.field_11033)
      .collect(class07536.N());
   private final Function<class00500, class00494> B;

   private int T(class00500 var1) {
      int ix = 0;

      for (class06667 class06667 : M.values()) {
         if (var1.L(class06667)) {
            ix++;
         }
      }

      return ix;
   }

   public class00659(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, false).y(L, false).y(u, false).y(i, false).y(R, false));
      this.B = this.y();
   }

   private class00500 i(class00500 var1, class07290 var2, class07209 var3) {
      class07209 class07209 = var3.method_10084();
      if (var1.L(y)) {
         var1 = var1.y(y, N(var2, class07209, class07211.field_11033));
      }

      class00500 class00500 = null;

      for (class07211 class07211 : class07221.field_11062) {
         class06667 class06667 = N(class07211);
         if (var1.L(class06667)) {
            boolean flag = this.y(var2, var3, class07211);
            if (!flag) {
               if (class00500 == null) {
                  class00500 = var2.method_8320(class07209);
               }

               flag = class00500.N(this) && class00500.L(class06667);
            }

            var1 = var1.y(class06667, flag);
         }
      }

      return var1;
   }

   private boolean b(class00500 var1) {
      return var1.L(L) || var1.L(u) || var1.L(i) || var1.L(R);
   }

   private boolean U(class00500 var1) {
      return this.T(var1) > 0;
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var2.method_64395().N(class07305.NL)) {
         if (var4.y(4) == 0) {
            class07211 class07211xxxx = class07211.y(var4);
            class07209 class07209xxxx = var3.method_10084();
            if (class07211xxxx.z().L() && !var1.L(N(class07211xxxx))) {
               if (this.N(var2, var3)) {
                  class07209 class07209x = var3.method_10093(class07211xxxx);
                  class00500 class00500 = var2.method_8320(class07209x);
                  if (class00500.P()) {
                     class07211 class07211x = class07211xxxx.R();
                     class07211 class07211xx = class07211xxxx.M();
                     boolean flag = var1.L(N(class07211x));
                     boolean flag1 = var1.L(N(class07211xx));
                     class07209 class07209xx = class07209x.method_10093(class07211x);
                     class07209 class07209xxx = class07209x.method_10093(class07211xx);
                     if (flag && N(var2, class07209xx, class07211x)) {
                        var2.method_8652(class07209x, this.W().y(N(class07211x), true), 2);
                     } else if (flag1 && N(var2, class07209xxx, class07211xx)) {
                        var2.method_8652(class07209x, this.W().y(N(class07211xx), true), 2);
                     } else {
                        class07211 class07211xxx = class07211xxxx.b();
                        if (flag && var2.R(class07209xx) && N(var2, var3.method_10093(class07211x), class07211xxx)) {
                           var2.method_8652(class07209xx, this.W().y(N(class07211xxx), true), 2);
                        } else if (flag1 && var2.R(class07209xxx) && N(var2, var3.method_10093(class07211xx), class07211xxx)) {
                           var2.method_8652(class07209xxx, this.W().y(N(class07211xxx), true), 2);
                        } else if (var4.z() < 0.05 && N(var2, class07209x.method_10084(), class07211.field_11036)) {
                           var2.method_8652(class07209x, this.W().y(y, true), 2);
                        }
                     }
                  } else if (N(var2, class07209x, class07211xxxx)) {
                     var2.method_8652(var3, var1.y(N(class07211xxxx), true), 2);
                  }
               }
            } else {
               if (class07211xxxx == class07211.field_11036 && var3.method_10264() < var2.method_31600()) {
                  if (this.y(var2, var3, class07211xxxx)) {
                     var2.method_8652(var3, var1.y(y, true), 2);
                     return;
                  }

                  if (var2.R(class07209xxxx)) {
                     if (!this.N(var2, var3)) {
                        return;
                     }

                     class00500 class00500x = var1;

                     for (class07211 class07211x : class07221.field_11062) {
                        if (var4.Z() || !N(var2, class07209xxxx.method_10093(class07211x), class07211x)) {
                           class00500x = class00500x.y(N(class07211x), false);
                        }
                     }

                     if (this.b(class00500x)) {
                        var2.method_8652(class07209xxxx, class00500x, 2);
                     }

                     return;
                  }
               }

               if (var3.method_10264() > var2.method_31607()) {
                  class07209 class07209x = var3.method_10074();
                  class00500 class00500xxxx = var2.method_8320(class07209x);
                  if (class00500xxxx.P() || class00500xxxx.N(this)) {
                     class00500 class00500x = class00500xxxx.P() ? this.W() : class00500xxxx;
                     class00500 class00500xx = this.N(var1, class00500x, var4);
                     if (class00500x != class00500xx && this.b(class00500xx)) {
                        var2.method_8652(class07209x, class00500xx, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private boolean y(class07290 var1, class07209 var2, class07211 var3) {
      if (var3 == class07211.field_11033) {
         return false;
      } else {
         class07209 class07209 = var2.method_10093(var3);
         if (N(var1, class07209, var3)) {
            return true;
         } else if (var3.z() == class07185.field_11052) {
            return false;
         } else {
            class06667 class06667 = M.get(var3);
            class00500 class00500 = var1.method_8320(var2.method_10084());
            return class00500.N(this) && class00500.L(class06667);
         }
      }
   }

   @Override
   protected boolean y(class00500 var1) {
      return true;
   }

   private Function<class00500, class00494> y() {
      Map map = class00389.u(class00891.L(16.0, 0.0, 1.0));
      return this.N(var1x -> {
         class00494 class00494 = class00389.N();

         for (Entry entry : M.entrySet()) {
            if (var1x.<Boolean>L((class08092<Boolean>)entry.getValue())) {
               class00494 = class00389.N(class00494, (class00494)map.get(entry.getKey()));
            }
         }

         return class00494.method_1110() ? class00389.y() : class00494;
      });
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      switch (var2) {
         case field_11464:
            return var1.y(L, var1.L(i)).y(u, var1.L(R)).y(i, var1.L(L)).y(R, var1.L(u));
         case field_11465:
            return var1.y(L, var1.L(u)).y(u, var1.L(i)).y(i, var1.L(R)).y(R, var1.L(L));
         case field_11463:
            return var1.y(L, var1.L(R)).y(u, var1.L(L)).y(i, var1.L(u)).y(R, var1.L(i));
         default:
            return var1;
      }
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500x = var1.method_8045().method_8320(var1.method_8037());
      boolean flag = class00500x.N(this);
      class00500 class00500x = flag ? class00500x : this.W();

      for (class07211 class07211 : var1.i()) {
         if (class07211 != class07211.field_11033) {
            class06667 class06667 = N(class07211);
            if ((!flag || !class00500x.L(class06667)) && this.y(var1.method_8045(), var1.method_8037(), class07211)) {
               return class00500x.y(class06667, true);
            }
         }
      }

      return flag ? class00500x : null;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L, u, i, R);
   }

   public static class06667 N(class07211 var0) {
      return M.get(var0);
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      switch (var2) {
         case field_11300:
            return var1.y(L, var1.L(i)).y(i, var1.L(L));
         case field_11301:
            return var1.y(u, var1.L(R)).y(R, var1.L(u));
         default:
            return super.N(var1, var2);
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.B.apply(var1);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var5 == class07211.field_11033) {
         return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         class00500 class00500 = this.i(var1, var2, var4);
         return !this.U(class00500) ? class00869.N.W() : class00500;
      }
   }

   public static boolean N(class07290 var0, class07209 var1, class07211 var2) {
      return class05543.N(var0, var2, var1, var0.method_8320(var1));
   }

   @Override
   protected boolean N(class00500 var1, class06942 var2) {
      class00500 class00500 = var2.method_8045().method_8320(var2.method_8037());
      return class00500.N(this) ? this.T(class00500) < M.size() : super.N(var1, var2);
   }

   @Override
   public MapCodec<class00659> N() {
      return N;
   }

   private boolean N(class07290 var1, class07209 var2) {
      byte b0 = 4;
      Iterable iterable = class07209.method_10094(
         var2.method_10263() - 4, var2.method_10264() - 1, var2.method_10260() - 4, var2.method_10263() + 4, var2.method_10264() + 1, var2.method_10260() + 4
      );
      int ix = 5;

      for (class07209 class07209 : iterable) {
         if (var1.method_8320(class07209).N(this)) {
            if (--ix <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   private class00500 N(class00500 var1, class00500 var2, class06069 var3) {
      for (class07211 class07211 : class07221.field_11062) {
         if (var3.Z()) {
            class06667 class06667 = N(class07211);
            if (var1.L(class06667)) {
               var2 = var2.y(class06667, true);
            }
         }
      }

      return var2;
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return this.U(this.i(var1, var2, var3));
   }
}
