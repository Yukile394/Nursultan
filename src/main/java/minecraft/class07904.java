package minecraft;

import com.mojang.authlib.GameProfile;
import java.util.Optional;
import java.util.UUID;

public class class07904 implements class00909 {
   private final class06202 N;
   private final class00909 y;

   public class07904(class06202 var1, class00909 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public Optional<GameProfile> N(String var1) {
      class01683 class01683 = this.N.NE();
      if (class01683 != null) {
         class03458 class03458 = class01683.y(var1);
         if (class03458 != null) {
            return Optional.of(class03458.N());
         }
      }

      return this.y.N(var1);
   }

   @Override
   public Optional<GameProfile> N(UUID var1) {
      class01683 class01683 = this.N.NE();
      if (class01683 != null) {
         class03458 class03458 = class01683.N(var1);
         if (class03458 != null) {
            return Optional.of(class03458.N());
         }
      }

      return this.y.N(var1);
   }
}
