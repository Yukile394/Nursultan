package minecraft;

import com.mojang.datafixers.DataFixUtils;
import org.jspecify.annotations.Nullable;

public record class01631(class06955 body, class06955 cape, class06955 elytra, class04208 model, boolean secure) {
   @Nullable
   public class06955 L() {
      return this.elytra;
   }

   public class01631(class06955 body, @Nullable class06955 cape, @Nullable class06955 elytra, class04208 model, boolean secure) {
      super();
      this.body = body;
      this.cape = cape;
      this.elytra = elytra;
      this.model = model;
      this.secure = secure;
   }

   public boolean i() {
      return this.secure;
   }

   public class04208 u() {
      return this.model;
   }

   @Nullable
   public class06955 y() {
      return this.cape;
   }

   public class06955 N() {
      return this.body;
   }

   public static class01631 N(class06955 var0, @Nullable class06955 var1, @Nullable class06955 var2, class04208 var3) {
      return new class01631(var0, var1, var2, var3, false);
   }

   public class01631 N(class01653 var1) {
      return var1.equals(class01653.i)
         ? this
         : N(
            (class06955)DataFixUtils.orElse(var1.N(), this.body),
            (class06955)DataFixUtils.orElse(var1.y(), this.cape),
            (class06955)DataFixUtils.orElse(var1.L(), this.elytra),
            var1.u().orElse(this.model)
         );
   }
}
