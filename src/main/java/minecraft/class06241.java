package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public record class06241(List<class00392> pages) {
   public class06241(List<class00392> pages) {
      super();
      this.pages = pages;
   }

   public List<class00392> y() {
      return this.pages;
   }

   public class00392 N(int var1) {
      return var1 >= 0 && var1 < this.N() ? this.pages.get(var1) : class05220.N;
   }

   public int N() {
      return this.pages.size();
   }

   @Nullable
   public static class06241 N(class06584 var0) {
      boolean flag = class06202.Nq().yi();
      class02706 class02706 = var0.method_58694(class02484.NL);
      if (class02706 != null) {
         return new class06241(class02706.N(flag));
      } else {
         class02699 class02699 = var0.method_58694(class02484.Ny);
         return class02699 != null ? new class06241(class02699.N(flag).map(class00392::y).toList()) : null;
      }
   }
}
