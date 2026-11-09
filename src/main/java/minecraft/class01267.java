package minecraft;

import java.util.List;

public class class01267 implements class01262, class05971 {
   private static final class01894 N = class01894.y("spectator/teleport_to_team");
   private static final class00392 y = class00392.L("spectatorMenu.team_teleport");
   private static final class00392 L = class00392.L("spectatorMenu.team_teleport.prompt");
   private final List<class01262> u;

   public class01267() {
      super();
      class06202 class06202 = class06202.Nq();
      this.u = N(class06202, ((class03448)class06202.T_3).method_8428());
   }

   @Override
   public class00392 y() {
      return L;
   }

   private static List<class01262> N(class06202 var0, class06683 var1) {
      return var1.i().stream().flatMap(var1x -> class01244.N(var0, var1x).stream()).toList();
   }

   @Override
   public void N(class01054 var1, float var2, float var3) {
      var1.N(class08394.Na, N, 0, 0, 16, 16, class02566.N(var3, var2, var2, var2));
   }

   @Override
   public List<class01262> N() {
      return this.u;
   }

   @Override
   public void N(class05973 var1) {
      var1.N(this);
   }

   @Override
   public class00392 aw_() {
      return y;
   }

   @Override
   public boolean ax_() {
      return !this.u.isEmpty();
   }
}
