package minecraft;

import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.List;

public class class06525 implements class02995 {
   public static final Codec<class03556<class06525>> N = class04206.Z.b();
   public static final class02362<class04247, class03556<class06525>> y = class02389.y(class04227.NW);
   private final String L;
   private final List<class07055> u;
   private class03767 i = class03794.M;

   public boolean L() {
      Iterator<class07055> iterator = this.u.iterator();

      while (iterator.hasNext()) {
         if (iterator.next().L().N().N()) {
            return true;
         }
      }

      return false;
   }

   public class06525(String var1, class07055... var2) {
      super();
      this.L = var1;
      this.u = List.of(var2);
   }

   public String y() {
      return this.L;
   }

   public List<class07055> N() {
      return this.u;
   }

   public class06525 N(class02957... var1) {
      this.i = class03794.i.N(var1);
      return this;
   }

   @Override
   public class03767 method_45322() {
      return this.i;
   }
}
