package minecraft;

import com.google.common.collect.Multimap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder;
import net.fabricmc.fabric.impl.renderer.MissingSpriteFinderImpl;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
class class00175 implements class02601 {
   private final class08388 i;
   private final class08388 R;
   @Nullable
   private volatile MissingSpriteFinderImpl M;

   class00175(class02008 var1, class02008 var2, Multimap var3, Multimap var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = this.N.u();
      this.R = this.y.u();
   }

   @Override
   public class08388 N(String var1, class08512 var2) {
      this.u.put(var2.L(), var1);
      return this.i;
   }

   @Override
   public class08388 N(class05913 var1, class08512 var2) {
      class01894 class01894 = var1.N();
      boolean flag = class01894.equals(class00183.N);
      boolean flag1 = class01894.equals(class08626.y);
      boolean flag2 = class01894.equals(class08626.N);
      if (flag || flag1) {
         class08388 class08388x = this.y.N(var1.y());
         if (class08388x != null) {
            return class08388x;
         }
      }

      if (flag || flag2) {
         class08388 class08388 = this.N.N(var1.y());
         if (class08388 != null) {
            return class08388;
         }
      }

      this.L.put(var2.L(), var1);
      return flag1 ? this.R : this.i;
   }

   public SpriteFinder spriteFinder(class01894 var1) {
      if (var1.equals(class08626.N)) {
         return this.N.spriteFinder();
      } else if (var1.equals(class08626.y)) {
         return this.y.spriteFinder();
      } else {
         MissingSpriteFinderImpl missingspritefinderimpl = this.M;
         if (missingspritefinderimpl == null) {
            synchronized (this) {
               missingspritefinderimpl = this.M;
               if (missingspritefinderimpl == null) {
                  this.M = missingspritefinderimpl = new MissingSpriteFinderImpl(this.i);
               }
            }
         }

         return missingspritefinderimpl;
      }
   }
}
