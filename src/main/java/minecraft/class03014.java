package minecraft;

import java.util.Iterator;
import java.util.List;
import org.jspecify.annotations.Nullable;

record class03014(List<class03003> rules) implements class03003 {
   class03014(List<class03003> rules) {
      this.rules = rules;
   }

   public List<class03003> N() {
      return this.rules;
   }

   @Nullable
   @Override
   public class00500 tryApply(int var1, int var2, int var3) {
      Iterator<class03003> iterator = this.rules.iterator();

      while (iterator.hasNext()) {
         class00500 class00500 = iterator.next().tryApply(var1, var2, var3);
         if (class00500 != null) {
            return class00500;
         }
      }

      return null;
   }
}
