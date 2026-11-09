package minecraft;

import net.caffeinemc.mods.lithium.common.world.explosions.ClipContextAccess;
import net.caffeinemc.mods.lithium.mixin.world.raycast.ClipContextAccessor;

public class class05862 implements ClipContextAccess, ClipContextAccessor {
   private class06889 N;
   private final class06889 y;
   private final class05849 L;
   private final class05835 u;
   private final class06092 i;

   public class05862(class06889 var1, class06889 var2, class05849 var3, class05835 var4, class07049 var5) {
      this(var1, var2, var3, var4, class06092.N(var5));
   }

   public class05862(class06889 var1, class06889 var2, class05849 var3, class05835 var4, class06092 var5) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
   }

   public class06889 y() {
      return this.N;
   }

   public class00494 N(class00500 var1, class07290 var2, class07209 var3) {
      return this.L.get(var1, var2, var3, this.i);
   }

   public class00494 N(class04688 var1, class07290 var2, class07209 var3) {
      return this.u.N(var1) ? var1.u(var2, var3) : class00389.N();
   }

   public class06889 N() {
      return this.y;
   }

   public class06092 lithium$getCollisionContext() {
      return this.i;
   }

   public void lithium$setFrom(class06889 var1) {
      this.N = var1;
   }
}
