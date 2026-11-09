package minecraft;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class00137 implements class00124<class00002> {
   private final List<class00124<class00002>> N = Lists.newArrayList();
   @Nullable
   private final class00392 y;

   public class00137(class01894 var1, @Nullable String var2) {
      super();
      if (class07529.Nq) {
         class05216 class05216 = class00392.y(var1.N());
         if ("FOR THE DEBUG!".equals(var2)) {
            class05216 = class05216.y(class00392.y(" missing").N(class06541.field_1061));
         }

         this.y = class05216;
      } else {
         this.y = var2 == null ? null : class00392.L(var2);
      }
   }

   @Override
   public int i() {
      int i = 0;

      for (class00124<class00002> class00124 : this.N) {
         i += class00124.i();
      }

      return i;
   }

   public void N(class00124<class00002> var1) {
      this.N.add(var1);
   }

   @Override
   public void N(class09038 var1) {
      Iterator<class00124<class00002>> iterator = this.N.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(var1);
      }
   }

   @Nullable
   public class00392 N() {
      return this.y;
   }

   public class00002 y(class06069 var1) {
      int i = this.i();
      if (!this.N.isEmpty() && i != 0) {
         int j = var1.y(i);

         for (class00124<class00002> class00124 : this.N) {
            j -= class00124.i();
            if (j < 0) {
               return class00124.y(var1);
            }
         }

         return class09033.y;
      } else {
         return class09033.y;
      }
   }
}
