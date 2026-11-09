package minecraft;

import com.google.common.collect.Sets;
import java.util.Set;
import org.jspecify.annotations.Nullable;

class class06294 implements class06302 {
   private final int N;
   private final Set<class06297> y = Sets.newIdentityHashSet();

   @Override
   public int L() {
      return this.N;
   }

   public class06294(int var1) {
      super();
      this.N = var1;
   }

   @Override
   public int u() {
      return this.y.size();
   }

   @Override
   public void y() {
      this.y.forEach(class06297::y);
      this.y.clear();
   }

   @Nullable
   @Override
   public class06297 N() {
      if (this.y.size() >= this.N) {
         if (class07529.ND) {
            class06313.N.warn("Maximum sound pool size {} reached", this.N);
         }

         return null;
      } else {
         class06297 class06297 = class06297.N();
         if (class06297 != null) {
            this.y.add(class06297);
         }

         return class06297;
      }
   }

   @Override
   public boolean N(class06297 var1) {
      if (!this.y.remove(var1)) {
         return false;
      } else {
         var1.y();
         return true;
      }
   }
}
