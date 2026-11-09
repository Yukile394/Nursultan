package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class class04939 {
   static final class01219 N = N(class00869.e, class00869.H, class06273.ym);
   static final class01219 y = N(class00869.X, class00869.a, class06273.yP);
   private static final class01894[] L = new class01894[]{
      class01894.y("underwater_ruin/warm_1"),
      class01894.y("underwater_ruin/warm_2"),
      class01894.y("underwater_ruin/warm_3"),
      class01894.y("underwater_ruin/warm_4"),
      class01894.y("underwater_ruin/warm_5"),
      class01894.y("underwater_ruin/warm_6"),
      class01894.y("underwater_ruin/warm_7"),
      class01894.y("underwater_ruin/warm_8")
   };
   private static final class01894[] u = new class01894[]{
      class01894.y("underwater_ruin/brick_1"),
      class01894.y("underwater_ruin/brick_2"),
      class01894.y("underwater_ruin/brick_3"),
      class01894.y("underwater_ruin/brick_4"),
      class01894.y("underwater_ruin/brick_5"),
      class01894.y("underwater_ruin/brick_6"),
      class01894.y("underwater_ruin/brick_7"),
      class01894.y("underwater_ruin/brick_8")
   };
   private static final class01894[] i = new class01894[]{
      class01894.y("underwater_ruin/cracked_1"),
      class01894.y("underwater_ruin/cracked_2"),
      class01894.y("underwater_ruin/cracked_3"),
      class01894.y("underwater_ruin/cracked_4"),
      class01894.y("underwater_ruin/cracked_5"),
      class01894.y("underwater_ruin/cracked_6"),
      class01894.y("underwater_ruin/cracked_7"),
      class01894.y("underwater_ruin/cracked_8")
   };
   private static final class01894[] R = new class01894[]{
      class01894.y("underwater_ruin/mossy_1"),
      class01894.y("underwater_ruin/mossy_2"),
      class01894.y("underwater_ruin/mossy_3"),
      class01894.y("underwater_ruin/mossy_4"),
      class01894.y("underwater_ruin/mossy_5"),
      class01894.y("underwater_ruin/mossy_6"),
      class01894.y("underwater_ruin/mossy_7"),
      class01894.y("underwater_ruin/mossy_8")
   };
   private static final class01894[] M = new class01894[]{
      class01894.y("underwater_ruin/big_brick_1"),
      class01894.y("underwater_ruin/big_brick_2"),
      class01894.y("underwater_ruin/big_brick_3"),
      class01894.y("underwater_ruin/big_brick_8")
   };
   private static final class01894[] B = new class01894[]{
      class01894.y("underwater_ruin/big_mossy_1"),
      class01894.y("underwater_ruin/big_mossy_2"),
      class01894.y("underwater_ruin/big_mossy_3"),
      class01894.y("underwater_ruin/big_mossy_8")
   };
   private static final class01894[] Z = new class01894[]{
      class01894.y("underwater_ruin/big_cracked_1"),
      class01894.y("underwater_ruin/big_cracked_2"),
      class01894.y("underwater_ruin/big_cracked_3"),
      class01894.y("underwater_ruin/big_cracked_8")
   };
   private static final class01894[] z = new class01894[]{
      class01894.y("underwater_ruin/big_warm_4"),
      class01894.y("underwater_ruin/big_warm_5"),
      class01894.y("underwater_ruin/big_warm_6"),
      class01894.y("underwater_ruin/big_warm_7")
   };

   public class04939() {
      super();
   }

   private static class01894 y(class06069 var0) {
      return class07536.N((class01894[])z, var0);
   }

   private static List<class07209> N(class06069 var0, class07209 var1) {
      ArrayList arraylist = Lists.newArrayList();
      arraylist.add(var1.method_10069(-16 + class04995.N(var0, 1, 8), 0, 16 + class04995.N(var0, 1, 7)));
      arraylist.add(var1.method_10069(-16 + class04995.N(var0, 1, 8), 0, class04995.N(var0, 1, 7)));
      arraylist.add(var1.method_10069(-16 + class04995.N(var0, 1, 8), 0, -16 + class04995.N(var0, 4, 8)));
      arraylist.add(var1.method_10069(class04995.N(var0, 1, 7), 0, 16 + class04995.N(var0, 1, 7)));
      arraylist.add(var1.method_10069(class04995.N(var0, 1, 7), 0, -16 + class04995.N(var0, 4, 6)));
      arraylist.add(var1.method_10069(16 + class04995.N(var0, 1, 7), 0, 16 + class04995.N(var0, 3, 8)));
      arraylist.add(var1.method_10069(16 + class04995.N(var0, 1, 7), 0, class04995.N(var0, 1, 7)));
      arraylist.add(var1.method_10069(16 + class04995.N(var0, 1, 7), 0, -16 + class04995.N(var0, 4, 8)));
      return arraylist;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void N(class01224 var0, class07209 var1, class06993 var2, class03860 var3, class06069 var4, class04906 var5, boolean var6, float var7) {
      switch (var5.y) {
         case field_14532:
         default:
            class01894 class01894 = var6 ? y(var4) : N(var4);
            var3.N(new class04935(var0, class01894, var1, var2, var7, var5.y, var6));
            break;
         case field_14528:
            class01894[] aclass01894 = var6 ? M : u;
            class01894[] aclass018941 = var6 ? Z : i;
            class01894[] aclass018942 = var6 ? B : R;
            int ix = var4.y(aclass01894.length);
            var3.N(new class04935(var0, aclass01894[ix], var1, var2, var7, var5.y, var6));
            var3.N(new class04935(var0, aclass018941[ix], var1, var2, 0.7F, var5.y, var6));
            var3.N(new class04935(var0, aclass018942[ix], var1, var2, 0.5F, var5.y, var6));
      }
   }

   public static void N(class01224 var0, class07209 var1, class06993 var2, class03860 var3, class06069 var4, class04906 var5) {
      boolean flag = var4.z() <= var5.R;
      float f = flag ? 0.9F : 0.8F;
      N(var0, var1, var2, var3, var4, var5, flag, f);
      if (flag && var4.z() <= var5.M) {
         N(var0, var4, var2, var1, var5, var3);
      }
   }

   private static void N(class01224 var0, class06069 var1, class06993 var2, class07209 var3, class04906 var4, class03860 var5) {
      class07209 class07209xxxx = new class07209(var3.method_10263(), 90, var3.method_10260());
      class07209 class07209x = class01207.N(new class07209(15, 0, 15), class07111.field_11302, var2, class07209.field_10980).method_10081(class07209xxxx);
      class05163 class05163 = class05163.N(class07209xxxx, class07209x);
      class07209 class07209xx = new class07209(
         Math.min(class07209xxxx.method_10263(), class07209x.method_10263()),
         class07209xxxx.method_10264(),
         Math.min(class07209xxxx.method_10260(), class07209x.method_10260())
      );
      List<class07209> list = N(var1, class07209xx);
      int ix = class04995.N(var1, 4, 8);

      for (int j = 0; j < ix; j++) {
         if (!list.isEmpty()) {
            int k = var1.y(list.size());
            class07209 class07209xxx = list.remove(k);
            class06993 class06993 = class06993.N(var1);
            class07209 class07209xxxx = class01207.N(new class07209(5, 0, 6), class07111.field_11302, class06993, class07209.field_10980)
               .method_10081(class07209xxx);
            if (!class05163.N(class07209xxx, class07209xxxx).N(class05163)) {
               N(var0, class07209xxx, class06993, var5, var1, var4, false, 0.8F);
            }
         }
      }
   }

   private static class01219 N(class00891 var0, class00891 var1, class05946<class05074> var2) {
      return new class03564(
         new class05273(List.of(new class05265(new class05244(var0), class05243.y, class05329.y, var1.W(), new class03594(var2)))), class02151.N(5)
      );
   }

   private static class01894 N(class06069 var0) {
      return class07536.N((class01894[])L, var0);
   }
}
