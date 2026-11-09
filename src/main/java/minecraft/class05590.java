package minecraft;

import com.google.common.base.MoreObjects;
import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.DataResult.Error;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

class class05590 implements class05603 {
   class05590(class05630 var1, class07001 var2) {
      super();
      this.N = var2;
   }

   @Override
   public String N(String var1, String var2) {
      return (String)MoreObjects.firstNonNull(this.N(var1), var2);
   }

   @Override
   public float N(String var1, float var2) {
      String s = this.N(var1);
      if (s == null) {
         return var2;
      } else if (class05630.N(s)) {
         return 1.0F;
      } else if (class05630.y(s)) {
         return 0.0F;
      } else {
         try {
            return Float.parseFloat(s);
         } catch (NumberFormatException numberformatexception) {
            class05630.N.warn("Invalid floating point value for option {} = {}", new Object[]{var1, s, numberformatexception});
            return var2;
         }
      }
   }

   @Override
   public <T> T N(String var1, T var2, Function<String, T> var3, Function<T, String> var4) {
      String s = this.N(var1);
      return (T)(s == null ? var2 : var3.apply(s));
   }

   @Nullable
   private String N(String var1) {
      class07709 class07709 = this.N.N(var1);
      if (class07709 == null) {
         return null;
      } else if (class07709 instanceof class07707 class07707x) {
         class07707 class07707x = class07707x;

         try {
            return class07707x.U();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }
      } else {
         throw new IllegalStateException("Cannot read field of wrong type, expected string: " + class07709);
      }
   }

   @Override
   public <T> void N(String var1, class04370<T> var2) {
      String s = this.N(var1);
      if (s != null) {
         JsonElement jsonelement = class08314.N(s.isEmpty() ? "\"\"" : s);
         var2.method_42404()
            .parse(JsonOps.INSTANCE, jsonelement)
            .ifError(var2x -> class05630.N.error("Error parsing option value {} for option {}: {}", new Object[]{s, var2, var2x.message()}))
            .ifSuccess(var2::method_41748);
      }
   }

   @Override
   public int N(String var1, int var2) {
      String s = this.N(var1);
      if (s != null) {
         try {
            return Integer.parseInt(s);
         } catch (NumberFormatException numberformatexception) {
            class05630.N.warn("Invalid integer value for option {} = {}", new Object[]{var1, s, numberformatexception});
         }
      }

      return var2;
   }

   @Override
   public boolean N(String var1, boolean var2) {
      String s = this.N(var1);
      return s != null ? class05630.N(s) : var2;
   }
}
