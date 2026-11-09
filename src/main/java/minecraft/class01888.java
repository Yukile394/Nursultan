package minecraft;

import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01888 {
   private static final Logger N = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<class01852> y;

   public class01888() {
      super();
   }

   private static CompletableFuture<class01852> y() {
      if (class06202.Nq().Nz()) {
         return CompletableFuture.completedFuture(new class01852(class01880.field_45188));
      } else {
         return true ? CompletableFuture.completedFuture(new class01852(class01880.field_45185)) : CompletableFuture.supplyAsync(() -> {
            class05111 class05111 = class05111.N();

            try {
               if (class05111.Z() != class05127.field_19582) {
                  return new class01852(class01880.field_45186);
               } else {
                  return !class05111.B() ? new class01852(class01880.field_45187) : new class01852(class01880.field_45185);
               }
            } catch (class05097 class05097) {
               N.error("Couldn't connect to realms", class05097);
               return class05097.N.N() == 401 ? new class01852(class01880.field_45188) : new class01852(class05097);
            }
         }, class07536.Z());
      }
   }

   public static CompletableFuture<class01852> N() {
      if (y == null || N(y)) {
         y = y();
      }

      return y;
   }

   private static boolean N(CompletableFuture<class01852> var0) {
      class01852 class01852 = (class01852)var0.getNow(null);
      return class01852 != null && class01852.y() != null;
   }
}
