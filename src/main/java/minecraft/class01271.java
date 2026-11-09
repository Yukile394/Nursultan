package minecraft;

import com.google.common.base.MoreObjects;
import java.util.List;

public class class01271 {
   public static final int N = -1;
   private final List<class01262> y;
   private final int L;

   public class01271(List<class01262> var1, int var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   public class01262 N(int var1) {
      return var1 >= 0 && var1 < this.y.size() ? (class01262)MoreObjects.firstNonNull(this.y.get(var1), class05973.M) : class05973.M;
   }

   public int N() {
      return this.L;
   }
}
