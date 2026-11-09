package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class07203 extends class07796 {
   public static final MapCodec<class07203> N = y(class07203::new);
   public static final List<class07209> y = class07209.method_17962(-2, 0, -2, 2, 1, 2)
      .filter(var0 -> Math.abs(var0.method_10263()) == 2 || Math.abs(var0.method_10260()) == 2)
      .map(class07209::method_10062)
      .toList();
   private static final class00494 L = class00891.y(16.0, 0.0, 12.0);

   public class07203(class01362 var1) {
      super(var1);
   }

   @Nullable
   @Override
   protected class06237 N(class00500 var1, class07299 var2, class07209 var3) {
      class00394 class00394 = var2.method_8321(var3);
      if (class00394 instanceof class07264) {
         class00392 class00392 = ((class07264)class00394).method_5476();
         return new class03965((var2x, var3x, var4x) -> new class07500(var2x, var3x, class05880.N(var2, var3)), class00392);
      } else {
         return null;
      }
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!var2.method_8608()) {
         var4.method_17355(var1.N(var2, var3));
      }

      return class07082.N;
   }

   @Override
   public MapCodec<class07203> N() {
      return N;
   }

   public static boolean N(class07299 var0, class07209 var1, class07209 var2) {
      return var0.method_8320(var1.method_10081(var2)).N(class01210.Lc)
         && var0.method_8320(var1.method_10069(var2.method_10263() / 2, var2.method_10264(), var2.method_10260() / 2)).N(class01210.LX);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return L;
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      super.N_20(var1, var2, var3, var4);

      for (class07209 class07209 : y) {
         if (var4.y(16) == 0 && N(var2, var3, class07209)) {
            var2.method_8406(
               class07107.v,
               var3.method_10263() + 0.5,
               var3.method_10264() + 2.0,
               var3.method_10260() + 0.5,
               class07209.method_10263() + var4.z() - 0.5,
               class07209.method_10264() - var4.z() - 1.0F,
               class07209.method_10260() + var4.z() - 0.5
            );
         }
      }
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class07264(var1, var2);
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return var1.method_8608() ? N(var3, class00404.field_11912, class07264::N) : null;
   }

   @Override
   protected boolean a_(class00500 var1) {
      return true;
   }
}
