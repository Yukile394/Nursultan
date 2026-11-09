package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class class02085 {
   @Nullable
   String N;
   private final List<String> y = Lists.newArrayList();

   class02085() {
      super();
   }

   @Override
   public String toString() {
      if (this.N != null) {
         return this.y.isEmpty() ? this.N : this.N + " " + this.y();
      } else {
         return this.y.isEmpty() ? "(Unknown file)" : "(Unknown file) " + this.y();
      }
   }

   public String y() {
      return StringUtils.join(this.y, "->");
   }

   void N(String var1) {
      this.y.add(0, var1);
   }

   @Nullable
   public String N() {
      return this.N;
   }
}
