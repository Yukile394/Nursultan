package minecraft;

import Nursultan.class10321;
import com.google.common.collect.Maps;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class class04160 {
   private final class04782 N;
   private final class00289 y = new class00289();
   private final Map<class01894, class10321> L = Maps.newHashMap();
   private float u;

   public class04160(class04782 var1) {
      super();
      this.N = var1;
   }

   @Nullable
   public <T> T y(class07491<T> var1) {
      return this.y.y(var1);
   }

   public <T> class04160 y(class07491<T> var1, @Nullable T var2) {
      this.y.y(var1, var2);
      return this;
   }

   public class04160 N(float var1) {
      this.u = var1;
      return this;
   }

   public class04160 N(class01894 var1, class10321 var2) {
      if (this.L.put(var1, var2) != null) {
         throw new IllegalStateException("Duplicated dynamic drop '" + this.L + "'");
      } else {
         return this;
      }
   }

   public class04162 N(class06929 var1) {
      class00311 class00311 = this.y.N(var1);
      return new class04162(this.N, class00311, this.L, this.u);
   }

   public <T> T N(class07491<T> var1) {
      return this.y.N(var1);
   }

   public <T> class04160 N(class07491<T> var1, T var2) {
      this.y.N(var1, var2);
      return this;
   }

   public class04782 N() {
      return this.N;
   }
}
