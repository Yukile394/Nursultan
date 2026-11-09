package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class06897 {
   private final class07299 N;
   private final class07209 y;
   private final class07760 L;
   private class00500 u;
   private final boolean i;
   private final List<class07209> R = Lists.newArrayList();

   private void L(class06897 var1) {
      this.R.add(var1.y);
      class07209 class07209xxx = this.y.method_10095();
      class07209 class07209x = this.y.method_10072();
      class07209 class07209xx = this.y.method_10067();
      class07209 class07209xxx = this.y.method_10078();
      boolean flag = this.L(class07209xxx);
      boolean flag1 = this.L(class07209x);
      boolean flag2 = this.L(class07209xx);
      boolean flag3 = this.L(class07209xxx);
      class08080 class08080 = null;
      if (flag || flag1) {
         class08080 = class08080.field_12665;
      }

      if (flag2 || flag3) {
         class08080 = class08080.field_12674;
      }

      if (!this.i) {
         if (flag1 && flag3 && !flag && !flag2) {
            class08080 = class08080.field_12664;
         }

         if (flag1 && flag2 && !flag && !flag3) {
            class08080 = class08080.field_12671;
         }

         if (flag && flag2 && !flag1 && !flag3) {
            class08080 = class08080.field_12672;
         }

         if (flag && flag3 && !flag1 && !flag2) {
            class08080 = class08080.field_12663;
         }
      }

      if (class08080 == class08080.field_12665) {
         if (class07760.N(this.N, class07209xxx.method_10084())) {
            class08080 = class08080.field_12670;
         }

         if (class07760.N(this.N, class07209x.method_10084())) {
            class08080 = class08080.field_12668;
         }
      }

      if (class08080 == class08080.field_12674) {
         if (class07760.N(this.N, class07209xxx.method_10084())) {
            class08080 = class08080.field_12667;
         }

         if (class07760.N(this.N, class07209xx.method_10084())) {
            class08080 = class08080.field_12666;
         }
      }

      if (class08080 == null) {
         class08080 = class08080.field_12665;
      }

      this.u = this.u.y(this.L.L(), class08080);
      this.N.method_8652(this.y, this.u, 3);
   }

   public class00500 L() {
      return this.u;
   }

   private boolean L(class07209 var1) {
      for (int ix = 0; ix < this.R.size(); ix++) {
         class07209 class07209 = this.R.get(ix);
         if (class07209.method_10263() == var1.method_10263() && class07209.method_10260() == var1.method_10260()) {
            return true;
         }
      }

      return false;
   }

   public class06897(class07299 var1, class07209 var2, class00500 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.u = var3;
      this.L = (class07760)var3.i();
      class08080 class08080 = var3.L(this.L.L());
      this.i = this.L.y();
      this.N(class08080);
   }

   private boolean u(class07209 var1) {
      class06897 class06897 = this.y(var1);
      if (class06897 == null) {
         return false;
      } else {
         class06897.u();
         return class06897.y(this);
      }
   }

   private void u() {
      for (int ix = 0; ix < this.R.size(); ix++) {
         class06897 class06897 = this.y(this.R.get(ix));
         if (class06897 != null && class06897.N(this)) {
            this.R.set(ix, class06897.y);
         } else {
            this.R.remove(ix--);
         }
      }
   }

   public int y() {
      int ix = 0;

      for (class07211 class07211 : class07221.field_11062) {
         if (this.N(this.y.method_10093(class07211))) {
            ix++;
         }
      }

      return ix;
   }

   private boolean y(class06897 var1) {
      return this.N(var1) || this.R.size() != 2;
   }

   @Nullable
   private class06897 y(class07209 var1) {
      class00500 class00500 = this.N.method_8320(var1);
      if (class07760.U(class00500)) {
         return new class06897(this.N, var1, class00500);
      } else {
         class07209 class07209 = var1.method_10084();
         class00500 = this.N.method_8320(class07209);
         if (class07760.U(class00500)) {
            return new class06897(this.N, class07209, class00500);
         } else {
            class07209 = var1.method_10074();
            class00500 = this.N.method_8320(class07209);
            return class07760.U(class00500) ? new class06897(this.N, class07209, class00500) : null;
         }
      }
   }

   private boolean N(class07209 var1) {
      return class07760.N(this.N, var1) || class07760.N(this.N, var1.method_10084()) || class07760.N(this.N, var1.method_10074());
   }

   private void N(class08080 var1) {
      this.R.clear();
      switch (var1) {
         case field_12665:
            this.R.add(this.y.method_10095());
            this.R.add(this.y.method_10072());
            break;
         case field_12674:
            this.R.add(this.y.method_10067());
            this.R.add(this.y.method_10078());
            break;
         case field_12667:
            this.R.add(this.y.method_10067());
            this.R.add(this.y.method_10078().method_10084());
            break;
         case field_12666:
            this.R.add(this.y.method_10067().method_10084());
            this.R.add(this.y.method_10078());
            break;
         case field_12670:
            this.R.add(this.y.method_10095().method_10084());
            this.R.add(this.y.method_10072());
            break;
         case field_12668:
            this.R.add(this.y.method_10095());
            this.R.add(this.y.method_10072().method_10084());
            break;
         case field_12664:
            this.R.add(this.y.method_10078());
            this.R.add(this.y.method_10072());
            break;
         case field_12671:
            this.R.add(this.y.method_10067());
            this.R.add(this.y.method_10072());
            break;
         case field_12672:
            this.R.add(this.y.method_10067());
            this.R.add(this.y.method_10095());
            break;
         case field_12663:
            this.R.add(this.y.method_10078());
            this.R.add(this.y.method_10095());
      }
   }

   public class06897 N(boolean var1, boolean var2, class08080 var3) {
      class07209 class07209xxx = this.y.method_10095();
      class07209 class07209x = this.y.method_10072();
      class07209 class07209xx = this.y.method_10067();
      class07209 class07209xxx = this.y.method_10078();
      boolean flag = this.u(class07209xxx);
      boolean flag1 = this.u(class07209x);
      boolean flag2 = this.u(class07209xx);
      boolean flag3 = this.u(class07209xxx);
      class08080 class08080 = null;
      boolean flag4 = flag || flag1;
      boolean flag5 = flag2 || flag3;
      if (flag4 && !flag5) {
         class08080 = class08080.field_12665;
      }

      if (flag5 && !flag4) {
         class08080 = class08080.field_12674;
      }

      boolean flag6 = flag1 && flag3;
      boolean flag7 = flag1 && flag2;
      boolean flag8 = flag && flag3;
      boolean flag9 = flag && flag2;
      if (!this.i) {
         if (flag6 && !flag && !flag2) {
            class08080 = class08080.field_12664;
         }

         if (flag7 && !flag && !flag3) {
            class08080 = class08080.field_12671;
         }

         if (flag9 && !flag1 && !flag3) {
            class08080 = class08080.field_12672;
         }

         if (flag8 && !flag1 && !flag2) {
            class08080 = class08080.field_12663;
         }
      }

      if (class08080 == null) {
         if (flag4 && flag5) {
            class08080 = var3;
         } else if (flag4) {
            class08080 = class08080.field_12665;
         } else if (flag5) {
            class08080 = class08080.field_12674;
         }

         if (!this.i) {
            if (var1) {
               if (flag6) {
                  class08080 = class08080.field_12664;
               }

               if (flag7) {
                  class08080 = class08080.field_12671;
               }

               if (flag8) {
                  class08080 = class08080.field_12663;
               }

               if (flag9) {
                  class08080 = class08080.field_12672;
               }
            } else {
               if (flag9) {
                  class08080 = class08080.field_12672;
               }

               if (flag8) {
                  class08080 = class08080.field_12663;
               }

               if (flag7) {
                  class08080 = class08080.field_12671;
               }

               if (flag6) {
                  class08080 = class08080.field_12664;
               }
            }
         }
      }

      if (class08080 == class08080.field_12665) {
         if (class07760.N(this.N, class07209xxx.method_10084())) {
            class08080 = class08080.field_12670;
         }

         if (class07760.N(this.N, class07209x.method_10084())) {
            class08080 = class08080.field_12668;
         }
      }

      if (class08080 == class08080.field_12674) {
         if (class07760.N(this.N, class07209xxx.method_10084())) {
            class08080 = class08080.field_12667;
         }

         if (class07760.N(this.N, class07209xx.method_10084())) {
            class08080 = class08080.field_12666;
         }
      }

      if (class08080 == null) {
         class08080 = var3;
      }

      this.N(class08080);
      this.u = this.u.y(this.L.L(), class08080);
      if (var2 || this.N.method_8320(this.y) != this.u) {
         this.N.method_8652(this.y, this.u, 3);

         for (int ix = 0; ix < this.R.size(); ix++) {
            class06897 class06897 = this.y(this.R.get(ix));
            if (class06897 != null) {
               class06897.u();
               if (class06897.y(this)) {
                  class06897.L(this);
               }
            }
         }
      }

      return this;
   }

   private boolean N(class06897 var1) {
      return this.L(var1.y);
   }

   public List<class07209> N() {
      return this.R;
   }
}
