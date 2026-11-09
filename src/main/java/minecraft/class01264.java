package minecraft;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class class01264 implements class01262, class05971 {
   private static final class01894 N = class01894.y("spectator/teleport_to_player");
   private static final Comparator<class03458> y = Comparator.comparing(var0 -> var0.N().id());
   private static final class00392 L = class00392.L("spectatorMenu.teleport");
   private static final class00392 u = class00392.L("spectatorMenu.teleport.prompt");
   private final List<class01262> i;

   public class01264() {
      this(class06202.Nq().NE().B());
   }

   public class01264(Collection<class03458> var1) {
      super();
      this.i = var1.stream().filter(var0 -> var0.i() != class07282.field_9219).sorted(y).map(class05956::new).collect(Collectors.toUnmodifiableList());
   }

   @Override
   public class00392 y() {
      return u;
   }

   @Override
   public void N(class01054 var1, float var2, float var3) {
      var1.N(class08394.Na, N, 0, 0, 16, 16, class02566.N(var3, var2, var2, var2));
   }

   @Override
   public List<class01262> N() {
      return this.i;
   }

   @Override
   public void N(class05973 var1) {
      var1.N(this);
   }

   @Override
   public class00392 aw_() {
      return L;
   }

   @Override
   public boolean ax_() {
      return !this.i.isEmpty();
   }
}
