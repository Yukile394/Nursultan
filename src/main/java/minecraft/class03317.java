package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Iterator;
import java.util.List;

class class03317 extends class04023 {
   public static final MapCodec<class03317> N = N(class03317::new);

   public class03317(List<class04025> var1) {
      super(var1);
   }

   public boolean test(class05974 var1, class07209 var2) {
      Iterator<class04025> iterator = this.i.iterator();

      while (iterator.hasNext()) {
         if (iterator.next().test(var1, var2)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public class04054<?> N() {
      return class04054.Z;
   }
}
