package minecraft;

import Nursultan.class11668;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.slf4j.Logger;

public final class class08983<IdType> implements class02694 {
   private static final Logger L = LogUtils.getLogger();
   private static final String u = "id";
   public final IdType N;
   public final class07001 y;

   public class07001 L() {
      return this.y.N();
   }

   public class08983(IdType var1, class07001 var2) {
      super();
      this.N = (IdType)var1;
      this.y = N(var2);
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return !(var1 instanceof class08983 class08983) ? false : this.N == class08983.N && this.y.equals(class08983.y);
      }
   }

   @Override
   public String toString() {
      return this.N + " " + this.y;
   }

   @Override
   public int hashCode() {
      return 31 * this.N.hashCode() + this.y.hashCode();
   }

   private class07001 u() {
      return this.y;
   }

   @Deprecated
   public class07001 y() {
      return this.y;
   }

   public static <T> Codec<class08983<T>> N(Codec<T> var0) {
      return new class11668<>(var0);
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      if (this.N.getClass() == class07078.class) {
         class07078 class07078 = (class07078)this.N;
         if (var1.L() && !class07078.b()) {
            var2.accept(class00392.L("item.spawn_egg.peaceful").N(class06541.field_1061));
         }
      }
   }

   public static <B extends ByteBuf, T> class02362<B, class08983<T>> N(class02362<B, T> var0) {
      return class02362.N(var0, class08983::N, class02389.j, class08983::u, (BiFunction<IdType, class07001, class08983<T>>)(class08983::new));
   }

   public IdType N() {
      return this.N;
   }

   public boolean N(String var1) {
      return this.y.y(var1);
   }

   private static class07001 N(class07001 var0) {
      if (var0.y("id")) {
         class07001 class07001 = var0.N();
         class07001.b("id");
         return class07001;
      } else {
         return var0;
      }
   }

   public static <T> class08983<T> N(T var0, class07001 var1) {
      return (class08983<T>)(new class08983<>(var0, var1));
   }

   public void N(class07049 var1) {
      try (class04495 class04495 = new class04495(var1.method_71370(), L)) {
         class08303 class08303 = class08303.N(class04495, var1.method_56673());
         var1.method_5647(class08303);
         class07001 class07001 = class08303.y();
         UUID uuid = var1.method_5667();
         class07001.N(this.y());
         var1.method_5651(class08308.N(class04495, var1.method_56673(), class07001));
         var1.method_5826(uuid);
      }
   }

   public boolean N(class00394 var1, class01929 var2) {
      boolean flag;
      try (class04495 class04495 = new class04495(var1.J(), L)) {
         class08303 class08303 = class08303.N(class04495, var2);
         var1.R(class08303);
         class07001 class07001x = class08303.y();
         class07001 class07001x = class07001x.N();
         class07001x.N(this.y());
         if (!class07001x.equals(class07001x)) {
            try {
               var1.L(class08308.N(class04495, var2, class07001x));
               var1.method_5431();
               return true;
            } catch (Exception exception1) {
               L.warn("Failed to apply custom data to block entity at {}", var1.d(), exception1);

               try {
                  var1.L(class08308.N(class04495.N_46(() -> "(rollback)"), var2, class07001x));
               } catch (Exception exception) {
                  L.warn("Failed to rollback block entity at {} after failure", var1.d(), exception);
               }
            }
         }

         flag = false;
      }

      return flag;
   }
}
