package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class class04848 {
   static final Logger N = LogUtils.getLogger();
   private static final int y = Integer.MIN_VALUE;

   public class04848() {
      super();
   }

   public static boolean N(class04782 var0, class03556<class05281> var1, class01894 var2, int var3, class07209 var4, boolean var5) {
      class08088 class08088 = var0.method_14178().U();
      class01224 class01224 = var0.method_14183();
      class05324 class05324 = var0.method_27056();
      class06069 class06069 = var0.method_8409();
      Optional<class04780> optional = N(
         new class04764(
            var0.method_30349(), class08088, class08088.u(), var0.method_14178().W(), class01224, var0.method_8412(), new class07321(var4), var0, var0x -> true
         ),
         var1,
         Optional.of(var2),
         var3,
         var4,
         false,
         Optional.empty(),
         new class01031(128),
         class03098.N,
         class01017.N,
         class01017.y
      );
      if (optional.isPresent()) {
         for (class04890 class04890 : optional.get().N().N().L()) {
            if (class04890 instanceof class05236) {
               ((class05236)class04890).N(var0, class05324, class08088, class06069, class05163.N(), var4, var5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private static boolean N(class05474 var0, class02216 var1, class05163 var2) {
      if (var1 == class02216.y) {
         return false;
      } else {
         int i = var0.method_31607() + var1.y();
         int j = var0.method_31600() - var1.L();
         return var2.Z() < i || var2.E() > j;
      }
   }

   private static Optional<class07209> N(class05248 var0, class01894 var1, class07209 var2, class06993 var3, class01224 var4, class07836 var5) {
      for (class01203 class01203 : var0.N(var4, var2, var3, var5)) {
         if (var1.equals(class01203.L())) {
            return Optional.of(class01203.N().N());
         }
      }

      return Optional.empty();
   }

   private static void N(
      class04084 var0,
      int var1,
      boolean var2,
      class08088 var3,
      class01224 var4,
      class05474 var5,
      class06069 var6,
      class00751<class05281> var7,
      class05236 var8,
      List<class05236> var9,
      class00494 var10,
      class03098 var11,
      class02610 var12
   ) {
      class04863 class04863 = new class04863(var7, var1, var3, var4, var9, var6);
      class04863.N(var8, new MutableObject(var10), 0, var2, var5, var0, var11, var12);

      while (class04863.N.hasNext()) {
         class04867 class04867 = (class04867)class04863.N.next();
         class04863.N(class04867.N(), class04867.y(), class04867.L(), var2, var5, var0, var11, var12);
      }
   }

   public static Optional<class04780> N(
      class04764 var0,
      class03556<class05281> var1,
      Optional<class01894> var2,
      int var3,
      class07209 var4,
      boolean var5,
      Optional<class07830> var6,
      class01031 var7,
      class03098 var8,
      class02216 var9,
      class02610 var10
   ) {
      class01042 class01042 = var0.N();
      class08088 class08088 = var0.y();
      class01224 class01224 = var0.i();
      class05474 class05474 = var0.Z();
      class07836 class07836 = var0.R();
      class00751 class00751 = class01042.L(class04227.yv);
      class06993 class06993 = class06993.N(class07836);
      class05248 class05248 = var1.i().flatMap(var2x -> class00751.M(var8.lookup((class05946<class05281>)var2x))).orElse((class05281)var1.N()).N(class07836);
      if (class05248 == class04869.y) {
         return Optional.empty();
      } else {
         class07209 class07209xx;
         if (var2.isPresent()) {
            class01894 class01894 = (class01894)var2.get();
            Optional<class07209> optional = N(class05248, class01894, var4, class06993, class01224, class07836);
            if (optional.isEmpty()) {
               N.error("No starting jigsaw {} found in start pool {}", class01894, var1.i().map(var0x -> var0x.N().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            class07209xx = optional.get();
         } else {
            class07209xx = var4;
         }

         class07209 class07209x = class07209xx.method_10059(var4);
         class07209 class07209xx = var4.method_10059(class07209x);
         class05236 class05236 = new class05236(
            class01224, class05248, class07209xx, class05248.B(), class06993, class05248.N(class01224, class07209xx, class06993), var10
         );
         class05163 class05163 = class05236.L();
         int i = (class05163.U() + class05163.B()) / 2;
         int j = (class05163.W() + class05163.z()) / 2;
         int k = var6.isEmpty() ? class07209xx.method_10264() : var4.method_10264() + class08088.y(i, j, (class07830)var6.get(), class05474, var0.u());
         int l = class05163.Z() + class05236.z();
         class05236.N(0, k - l, 0);
         if (N(class05474, var9, class05236.L())) {
            N.debug("Center piece {} with bounding box {} does not fit dimension padding {}", new Object[]{class05248, class05236.L(), var9});
            return Optional.empty();
         } else {
            int i1 = k + class07209x.method_10264();
            return Optional.of(
               new class04780(
                  new class07209(i, i1, j),
                  (Consumer<class03291>)(var17x -> {
                     ArrayList arraylist = Lists.newArrayList();
                     arraylist.add(class05236);
                     if (var3 > 0) {
                        class00494 class00494 = class00389.N(
                           class00389.N(
                              new class00734(
                                 i - var7.N(),
                                 Math.max(i1 - var7.y(), class05474.method_31607() + var9.y()),
                                 j - var7.N(),
                                 i + var7.N() + 1,
                                 Math.min(i1 + var7.y() + 1, class05474.method_31600() + 1 - var9.L()),
                                 j + var7.N() + 1
                              )
                           ),
                           class00389.N(class00734.N(class05163)),
                           class07003.i
                        );
                        N(var0.u(), var3, var5, class08088, class01224, class05474, class07836, class00751, class05236, arraylist, class00494, var8, var10);
                        arraylist.forEach(var17x::N);
                     }
                  })
               )
            );
         }
      }
   }
}
