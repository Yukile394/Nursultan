package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05492 {
   public static final class05492 N = new class05492();
   private static final Logger y = LogUtils.getLogger();
   private final Collection<class05513> L = Lists.newCopyOnWriteArrayList();
   @Nullable
   private class05520 u;
   private class05493 i = class05493.field_57042;

   private class05492() {
      super();
   }

   public void y() {
      if (this.u != null) {
         this.i = class05493.field_57043;
         this.L.forEach(var1x -> var1x.N(this.u));
         this.L.removeIf(class05513::U);
         class05493 class05493 = this.i;
         this.i = class05493.field_57042;
         if (class05493 == class05493.field_57044) {
            this.N();
         }
      }
   }

   public void N(class05520 var1) {
      if (this.u != null) {
         class07536.y("The runner was already set in GameTestTicker");
      }

      this.u = var1;
   }

   public void N() {
      if (this.i != class05493.field_57042) {
         this.i = class05493.field_57044;
      } else {
         this.L.clear();
         if (this.u != null) {
            this.u.L();
            this.u = null;
         }
      }
   }

   public void N(class05513 var1) {
      this.L.add(var1);
   }
}
