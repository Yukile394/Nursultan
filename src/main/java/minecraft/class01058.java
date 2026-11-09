package minecraft;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class class01058 extends class06391<class04685> {
   public static final int NE = 10;
   private static final int NW = 42;
   private static final LoadingCache<Long, List<class01076>> Nm = CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build(new class01052());

   public class01058(Codec<class04685> var1) {
      super(var1);
   }

   public static List<class01076> N(class05974 var0) {
      long i = class06069.y(var0.method_8412()).B() & 65535L;
      return (List<class01076>)Nm.getUnchecked(i);
   }

   private void N(class01001 var1, class06069 var2, class04685 var3, class01076 var4) {
      int i = var4.L();

      for (class07209 class07209x : class07209.method_10097(
         new class07209(var4.N() - i, var1.method_31607(), var4.y() - i), new class07209(var4.N() + i, var4.u() + 10, var4.y() + i)
      )) {
         if (class07209x.method_40081(var4.N(), class07209x.method_10264(), var4.y()) <= i * i + 1 && class07209x.method_10264() < var4.u()) {
            this.N(var1, class07209x, class00869.LV.W());
         } else if (class07209x.method_10264() > 65) {
            this.N(var1, class07209x, class00869.N.W());
         }
      }

      if (var4.i()) {
         byte b1 = -2;
         byte b2 = 2;
         byte b0 = 3;
         class07218 class07218 = new class07218();

         for (int j = -2; j <= 2; j++) {
            for (int k = -2; k <= 2; k++) {
               for (int l = 0; l <= 3; l++) {
                  boolean flag = class04995.N(j) == 2;
                  boolean flag1 = class04995.N(k) == 2;
                  boolean flag2 = l == 3;
                  if (flag || flag1 || flag2) {
                     boolean flag3 = j == -2 || j == 2 || flag2;
                     boolean flag4 = k == -2 || k == 2 || flag2;
                     class00500 class00500 = class00869.RQ
                        .W()
                        .y(class07100.y, flag3 && k != -2)
                        .y(class07100.u, flag3 && k != 2)
                        .y(class07100.i, flag4 && j != -2)
                        .y(class07100.L, flag4 && j != 2);
                     this.N(var1, class07218.N(var4.N() + j, var4.u() + l, var4.y() + k), class00500);
                  }
               }
            }
         }
      }

      class00676 class00676 = class07078.S.N(var1.method_8410(), class06113.field_16474);
      if (class00676 != null) {
         class00676.N(var3.L());
         class00676.method_5684(var3.N());
         class00676.method_5808(var4.N() + 0.5, var4.u() + 1, var4.y() + 0.5, var2.z() * 360.0F, 0.0F);
         var1.method_8649(class00676);
         class07209 class07209x = class00676.method_24515();
         this.N(var1, class07209x.method_10074(), class00869.q.W());
         this.N(var1, class07209x, class00756.y(var1, class07209x));
      }
   }

   @Override
   public boolean N(class06058<class04685> var1) {
      class04685 class04685 = (class04685)var1.R();
      class05974 class05974 = var1.y();
      class06069 class06069 = var1.u();
      class07209 class07209 = var1.i();
      List<class01076> list = class04685.y();
      if (list.isEmpty()) {
         list = N(class05974);
      }

      for (class01076 class01076 : list) {
         if (class01076.N(class07209)) {
            this.N(class05974, class06069, class04685, class01076);
         }
      }

      return true;
   }
}
