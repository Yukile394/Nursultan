package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public class class04593 extends class07796 {
   public static final MapCodec<class04593> N = y(class04593::new);
   public static final class08064<class07211> y = class07101.R;
   public static final class08071 L = class06665.NF;
   public static final int u = 5;

   public class04593(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(L, 0).y(y, class07211.field_11043));
   }

   private boolean y(class07299 var1, class07209 var2) {
      class00394 class00394 = var1.method_8321(var2);
      return class00394 instanceof class04620 ? !((class04620)class00394).L() : false;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, y);
   }

   @Override
   public class00500 N(class07299 var1, class07209 var2, class00500 var3, class08036 var4) {
      if (var1 instanceof class04782 class04782
         && var4.method_66324()
         && class04782.method_64395().N(class07305.u)
         && var1.method_8321(var2) instanceof class04620 class04620) {
         int i = var3.L(L);
         if (!class04620.L() || i > 0) {
            class06584 class06584 = new class06584(this);
            class06584.y(class04620.g());
            class06584.N(class02484.Nl, class02841.N.N(L, i));
            class00717 class00717 = new class00717(var1, var2.method_10263(), var2.method_10264(), var2.method_10260(), class06584);
            class00717.L();
            var1.method_8649(class00717);
         }
      }

      return super.N(var1, var2, var3, var4);
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return var1.method_8608() ? null : N(var3, class00404.field_20431, class04620::N);
   }

   @Nullable
   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class04620(var1, var2);
   }

   private void N(class07299 var1, double var2, double var4, double var6, double var8, double var10) {
      var1.method_8406(class07107.Nw, class04995.u(var1.field_9229.U(), var2, var4), var10, class04995.u(var1.field_9229.U(), var6, var8), 0.0, 0.0, 0.0);
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(y, var1.method_8042().b());
   }

   @Override
   public class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   public class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   public MapCodec<class04593> N() {
      return N;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var2.method_8320(var6).i() instanceof class00756) {
         class00394 class00394 = var2.method_8321(var4);
         if (class00394 instanceof class04620) {
            ((class04620)class00394).N(null, var1, class05497.field_21052);
         }
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      class06584 class06584 = super.N(var1, var2, var3, var4);
      if (var4) {
         class06584.N(class02484.Nl, class02841.N.N(L, var3.L(L)));
      }

      return class06584;
   }

   @Override
   protected List<class06584> N(class00500 var1, class04160 var2) {
      class07049 class07049 = var2.y(class06551.N);
      if (class07049 instanceof class00674
         || class07049 instanceof class07550
         || class07049 instanceof class07513
         || class07049 instanceof class00680
         || class07049 instanceof class07507) {
         class00394 class00394 = var2.y(class06551.z);
         if (class00394 instanceof class04620) {
            ((class04620)class00394).N(null, var1, class05497.field_21052);
         }
      }

      return super.N(var1, var2);
   }

   public static void N(class04782 var0, class06584 var1, class00500 var2, @Nullable class00394 var3, @Nullable class07049 var4, class07209 var5) {
      N(var0, class06273.Nc, var2, var3, var1, var4, (var1x, var2x) -> N_21(var1x, var5, var2x));
   }

   private void N(class07299 var1, class07209 var2) {
      class00734 class00734 = new class00734(var2).L(8.0, 6.0, 8.0);
      List<class04626> list = var1.N(class04626.class, class00734);
      if (!list.isEmpty()) {
         List<class08036> list1 = var1.N(class08036.class, class00734);
         if (list1.isEmpty()) {
            return;
         }

         for (class04626 class04626 : list) {
            if (class04626.T() == null) {
               class08036 class08036 = class07536.N_77(list1, var1.field_9229);
               class04626.y(class08036);
            }
         }
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class07307 var4, BiConsumer<class06584, class07209> var5) {
      super.N(var1, var2, var3, var4, var5);
      this.N(var2, var3);
   }

   @Override
   public void N(class07299 var1, class08036 var2, class07209 var3, class00500 var4, @Nullable class00394 var5, class06584 var6) {
      super.N(var1, var2, var3, var4, var5, var6);
      if (!var1.method_8608() && var5 instanceof class04620 class04620) {
         if (!class07323.N(var6, class02625.T)) {
            class04620.N(var2, var4, class05497.field_21052);
            class06704.N(var4, var1, var3);
            this.N(var1, var3);
         }

         class06912.H.N((class04770)var2, var4, var6, class04620.R());
      }
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      return var1.L(L);
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   private void N(class07299 var1, class07209 var2, class00494 var3, double var4) {
      this.N(
         var1,
         var2.method_10263() + var3.method_1091(class07185.field_11048),
         var2.method_10263() + var3.method_1105(class07185.field_11048),
         var2.method_10260() + var3.method_1091(class07185.field_11051),
         var2.method_10260() + var3.method_1105(class07185.field_11051),
         var4
      );
   }

   private void N(class07299 var1, class07209 var2, class00500 var3) {
      if (var3.Y().W() && !(var1.field_9229.z() < 0.3F)) {
         class00494 class00494 = var3.M(var1, var2);
         if (class00494.method_1105(class07185.field_11052) >= 1.0 && !var3.N(class01210.Ng)) {
            double d0 = class00494.method_1091(class07185.field_11052);
            if (d0 > 0.0) {
               this.N(var1, var2, class00494, var2.method_10264() + d0 - 0.05);
            } else {
               class07209 class07209 = var2.method_10074();
               class00500 class00500 = var1.method_8320(class07209);
               if ((class00500.M(var1, class07209).method_1105(class07185.field_11052) < 1.0 || !class00500.W(var1, class07209)) && class00500.Y().W()) {
                  this.N(var1, var2, class00494, var2.method_10264() - 0.05);
               }
            }
         }
      }
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (var1.L(L) >= 5) {
         for (int i = 0; i < var4.y(1) + 1; i++) {
            this.N(var2, var3, var1);
         }
      }
   }

   public void N(class07299 var1, class00500 var2, class07209 var3) {
      var1.method_8652(var3, var2.y(L, 0), 3);
   }

   public void N(class07299 var1, class00500 var2, class07209 var3, @Nullable class08036 var4, class05497 var5) {
      this.N(var1, var2, var3);
      class00394 class00394 = var1.method_8321(var3);
      if (class00394 instanceof class04620) {
         ((class04620)class00394).N(var4, var2, var5);
      }
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      int i = var2.L(L);
      boolean flag = false;
      if (i >= 5) {
         class06581 class06581 = var1.B();
         if (var3 instanceof class04782 class04782 && var1.N(class06570.vr)) {
            N(class04782, var1, var2, var3.method_8321(var4), var5, var4);
            var3.method_43128(null, var5.method_23317(), var5.method_23318(), var5.method_23321(), class04909.Lz, class04911.field_15245, 1.0F, 1.0F);
            var1.N(1, var5, var6.N());
            flag = true;
            var3.N(var5, class01194.H, var4);
         } else if (var1.N(class06570.nP)) {
            var1.B(1);
            var3.method_43128(var5, var5.method_23317(), var5.method_23318(), var5.method_23321(), class04909.LX, class04911.field_15245, 1.0F, 1.0F);
            if (var1.R()) {
               var5.method_6122(var6, new class06584(class06570.wZ));
            } else if (!var5.method_31548().M(new class06584(class06570.wZ))) {
               var5.method_7328(new class06584(class06570.wZ), false);
            }

            flag = true;
            var3.N(var5, class01194.d, var4);
         }

         if (!var3.method_8608() && flag) {
            var5.method_7259(class01235.L.y(class06581));
         }
      }

      if (flag) {
         if (!class05847.N(var3, var4)) {
            if (this.y(var3, var4)) {
               this.N(var3, var4);
            }

            this.N(var3, var2, var4, var5, class05497.field_21052);
         } else {
            this.N(var3, var2, var4);
         }

         return class07082.N;
      } else {
         return super.N(var1, var2, var3, var4, var5, var6, var7);
      }
   }
}
