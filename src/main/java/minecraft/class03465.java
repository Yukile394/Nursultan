package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03465 {
   private static final Logger N = LogUtils.getLogger();
   @Nullable
   private class03440 y;
   private int L;

   public class03465() {
      super();
   }

   public void N() {
      if (this.y == null) {
         N.warn("Trying to finish reload, but nothing was started");
      } else {
         this.y.y = true;
      }
   }

   public void N(class07080 var1) {
      class07074 class07074 = var1.N("Last reload");
      class07074.N("Reload number", this.L);
      if (this.y != null) {
         this.y.N(class07074);
      }
   }

   public void N(class03424 var1, List<class01622> var2) {
      this.L++;
      if (this.y != null && !this.y.y) {
         N.warn("Reload already ongoing, replacing");
      }

      this.y = new class03440(var1, var2.stream().map(class01622::method_14409).collect(ImmutableList.toImmutableList()));
   }

   public void N(Throwable var1) {
      if (this.y == null) {
         N.warn("Trying to signal reload recovery, but nothing was started");
         this.y = new class03440(class03424.field_33704, ImmutableList.of());
      }

      this.y.N = new class03438(var1);
   }
}
