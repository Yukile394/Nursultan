package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01707 {
   private static final Logger N = LogUtils.getLogger();
   private final class06202 y;
   private final class02090 L;
   private final class07166 u = new class07166();
   private final Map<class03711, class08019> i = new Object2ObjectOpenHashMap();
   @Nullable
   private class01700 R;
   @Nullable
   private class03711 M;

   public class01707(class06202 var1, class02090 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   public void N(@Nullable class01700 var1) {
      this.R = var1;
      this.u.N(var1);
      if (var1 != null) {
         this.i.forEach((var2, var3) -> {
            class03734 class03734 = this.u.N(var2);
            if (class03734 != null) {
               var1.N(class03734, var3);
            }
         });
         var1.N(this.M);
      }
   }

   @Nullable
   public class03711 N(class01894 var1) {
      class03734 class03734 = this.u.N(var1);
      return class03734 != null ? class03734.y() : null;
   }

   public void N(class08077 var1) {
      if (var1.u()) {
         this.u.N();
         this.i.clear();
      }

      this.u.N(var1.y());
      this.u.N(var1.N());

      for (Entry entry : var1.L().entrySet()) {
         class03734 class03734 = this.u.N((class01894)entry.getKey());
         if (class03734 != null) {
            class08019 class08019 = (class08019)entry.getValue();
            class08019.N(class03734.N().R());
            this.i.put(class03734.y(), class08019);
            if (this.R != null) {
               this.R.N(class03734, class08019);
            }

            if (!var1.u() && class08019.N()) {
               if ((class03448)this.y.T_3 != null) {
                  this.L.N((class03448)this.y.T_3, class03734.y());
               }

               Optional<class06513> optional = class03734.N().L();
               if (var1.M() && optional.isPresent() && optional.get().B()) {
                  this.y.m().N(new class04683(class03734.y()));
               }
            }
         } else {
            N.warn("Server informed client about progress for unknown advancement {}", entry.getKey());
         }
      }
   }

   public void N(@Nullable class03711 var1, boolean var2) {
      class01683 class01683 = this.y.NE();
      if (class01683 != null && var1 != null && var2) {
         class01683.N(class07339.N(var1));
      }

      if (this.M != var1) {
         this.M = var1;
         if (this.R != null) {
            this.R.N(var1);
         }
      }
   }

   public class07166 N() {
      return this.u;
   }
}
