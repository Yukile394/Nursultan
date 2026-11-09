package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import org.joml.Vector4f;

public class class02783 implements class01857 {
   public static final class07211[] N = class07211.values();
   private final class06202 y;

   public class02783(class06202 var1) {
      super();
      this.y = var1;
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      class03063 class03063 = (class03063)this.y.B_2;
      boolean flag = ((class05731)this.y.L_0).y(class06134.w);
      boolean flag1 = ((class05731)this.y.L_0).y(class06134.H);
      if (flag || flag1) {
         class01886 class01886 = class03063.n();
         ObjectListIterator<class03345> objectlistiterator = class03063.v().iterator();

         while (objectlistiterator.hasNext()) {
            class03345 class03345 = (class03345)objectlistiterator.next();
            class01639 class01639 = class01886.y(class03345);
            if (class01639 != null) {
               class07209 class07209 = class03345.R();
               if (flag) {
                  int i = class01639.L == 0 ? 0 : class04995.M(class01639.L / 50.0F, 0.9F, 0.9F);

                  for (int j = 0; j < N.length; j++) {
                     if (class01639.N(j)) {
                        class07211 class07211xx = N[j];
                        class06724.N(
                           class06889.N(class07209, 8.0, 8.0, 8.0),
                           class06889.N(class07209, 8 - 16 * class07211xx.P(), 8 - 16 * class07211xx.s(), 8 - 16 * class07211xx.T()),
                           class02566.M(i)
                        );
                     }
                  }
               }

               if (flag1 && class03345.u().N()) {
                  int i1 = 0;

                  for (class07211 class07211x : N) {
                     int k = N.length;

                     for (int l = 0; l < k; l++) {
                        class07211 class07211x = N[l];
                        if (!class03345.u().N(class07211x, class07211x)) {
                           i1++;
                           class06724.N(
                              class06889.N(class07209, 8 + 8 * class07211x.P(), 8 + 8 * class07211x.s(), 8 + 8 * class07211x.T()),
                              class06889.N(class07209, 8 + 8 * class07211x.P(), 8 + 8 * class07211x.s(), 8 + 8 * class07211x.T()),
                              class02566.y(255, 255, 0, 0)
                           );
                        }
                     }
                  }

                  if (i1 > 0) {
                     float f = 0.5F;
                     float f1 = 0.2F;
                     class06724.N(class03345.L().B(0.5), class06747.y(class02566.N(0.2F, 0.9F, 0.9F, 0.0F)));
                  }
               }
            }
         }
      }

      class01383 class01383 = class03063.t();
      if (class01383 != null) {
         class06889 class06889 = new class06889(class01383.method_62343(), class01383.method_62344(), class01383.method_62345());
         Vector4f[] avector4f = class01383.method_62342();
         this.N(class06889, avector4f, 0, 1, 2, 3, 0, 1, 1);
         this.N(class06889, avector4f, 4, 5, 6, 7, 1, 0, 0);
         this.N(class06889, avector4f, 0, 1, 5, 4, 1, 1, 0);
         this.N(class06889, avector4f, 2, 3, 7, 6, 0, 0, 1);
         this.N(class06889, avector4f, 0, 4, 7, 3, 0, 1, 0);
         this.N(class06889, avector4f, 1, 5, 6, 2, 1, 0, 1);
         this.N(class06889, avector4f[0], avector4f[1]);
         this.N(class06889, avector4f[1], avector4f[2]);
         this.N(class06889, avector4f[2], avector4f[3]);
         this.N(class06889, avector4f[3], avector4f[0]);
         this.N(class06889, avector4f[4], avector4f[5]);
         this.N(class06889, avector4f[5], avector4f[6]);
         this.N(class06889, avector4f[6], avector4f[7]);
         this.N(class06889, avector4f[7], avector4f[4]);
         this.N(class06889, avector4f[0], avector4f[4]);
         this.N(class06889, avector4f[1], avector4f[5]);
         this.N(class06889, avector4f[2], avector4f[6]);
         this.N(class06889, avector4f[3], avector4f[7]);
      }
   }

   private void N(class06889 var1, Vector4f[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      float f = 0.25F;
      class06724.N(
         new class06889(var2[var3].x(), var2[var3].y(), var2[var3].z()).i(var1),
         new class06889(var2[var4].x(), var2[var4].y(), var2[var4].z()).i(var1),
         new class06889(var2[var5].x(), var2[var5].y(), var2[var5].z()).i(var1),
         new class06889(var2[var6].x(), var2[var6].y(), var2[var6].z()).i(var1),
         class06747.y(class02566.N(0.25F, (float)var7, (float)var8, (float)var9))
      );
   }

   private void N(class06889 var1, Vector4f var2, Vector4f var3) {
      class06724.N(
         new class06889(var1.M + var2.x, var1.B + var2.y, var1.Z + var2.z), new class06889(var1.M + var3.x, var1.B + var3.y, var1.Z + var3.z), -16777216
      );
   }
}
