package minecraft;

import java.util.Objects;

public class class08662 implements class08657 {
   private static final class01894 i = class01894.y("hud/jump_bar_background");
   private static final class01894 R = class01894.y("hud/jump_bar_cooldown");
   private static final class01894 M = class01894.y("hud/jump_bar_progress");
   private final class06202 B;
   private final class07431 Z;

   public class08662(class06202 var1) {
      super();
      this.B = var1;
      this.Z = Objects.requireNonNull(((class04453)Objects.requireNonNull((class04453)var1.T_4)).G());
   }

   @Override
   public void y(class01054 var1, class02233 var2) {
   }

   @Override
   public void N(class01054 var1, class02233 var2) {
      int ix = this.N(this.B.Nt());
      int j = this.y(this.B.Nt());
      var1.N(class08394.Na, i, ix, j, 182, 5);
      if (this.Z.n() > 0) {
         var1.N(class08394.Na, R, ix, j, 182, 5);
      } else {
         int k = class04995.y(((class04453)this.B.T_4).P(), 0, 182);
         if (k > 0) {
            var1.N(class08394.Na, M, 182, 5, 0, 0, ix, j, k, 5);
         }
      }
   }
}
