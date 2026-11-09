package minecraft;

public class class08643 implements class08657 {
   private static final class01894 i = class01894.y("hud/experience_bar_background");
   private static final class01894 R = class01894.y("hud/experience_bar_progress");
   private final class06202 M;

   public class08643(class06202 var1) {
      super();
      this.M = var1;
   }

   @Override
   public void y(class01054 var1, class02233 var2) {
   }

   @Override
   public void N(class01054 var1, class02233 var2) {
      class04453 class04453 = (class04453)this.M.T_4;
      int ix = this.N(this.M.Nt());
      int j = this.y(this.M.Nt());
      if (class04453.method_7349() > 0) {
         int k = (int)(class04453.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 * 183.0F);
         var1.N(class08394.Na, i, ix, j, 182, 5);
         if (k > 0) {
            var1.N(class08394.Na, R, 182, 5, 0, 0, ix, j, k, 5);
         }
      }
   }
}
