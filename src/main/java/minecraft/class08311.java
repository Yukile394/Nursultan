package minecraft;

import com.google.common.collect.Lists;
import java.net.InetAddress;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class08311 {
   private final List<class00068> N = Lists.newArrayList();
   private boolean y;

   public class08311() {
      super();
   }

   @Nullable
   public synchronized List<class00068> N() {
      if (this.y) {
         List list = List.copyOf(this.N);
         this.y = false;
         return list;
      } else {
         return null;
      }
   }

   public synchronized void N(String var1, InetAddress var2) {
      String s = class08338.N(var1);
      String s1 = class08338.y(var1);
      if (s1 != null) {
         s1 = var2.getHostAddress() + ":" + s1;
         boolean flag = false;

         for (class00068 class00068 : this.N) {
            if (class00068.y().equals(s1)) {
               class00068.L();
               flag = true;
               break;
            }
         }

         if (!flag) {
            this.N.add(new class00068(s, s1));
            this.y = true;
         }
      }
   }
}
