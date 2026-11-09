package minecraft;

import java.util.ArrayList;
import java.util.List;

public record class02313<S, T>(
   class08501<S, T> element, class02353<List<T>> listName, class02315<S> separator, int minRepetitions, boolean allowTrailingSeparator
) implements class02315<S> {
   public boolean M() {
      return this.allowTrailingSeparator;
   }

   public class02313(class08501<S, T> element, class02353<List<T>> listName, class02315<S> separator, int minRepetitions, boolean allowTrailingSeparator) {
      super();
      this.element = element;
      this.listName = listName;
      this.separator = separator;
      this.minRepetitions = minRepetitions;
      this.allowTrailingSeparator = allowTrailingSeparator;
   }

   public class02315<S> i() {
      return this.separator;
   }

   public class02353<List<T>> y() {
      return this.listName;
   }

   @Override
   public boolean N(class02325<S> var1, class02332 var2, class02328 var3) {
      int i = var1.M();
      ArrayList arraylist = new ArrayList(this.minRepetitions);
      boolean flag = true;

      while (true) {
         int j = var1.M();
         if (!flag && !this.separator.N(var1, var2, var3)) {
            var1.N(j);
            break;
         }

         int k = var1.M();
         Object object = var1.N(this.element);
         if (object == null) {
            if (flag) {
               var1.N(k);
            } else {
               if (!this.allowTrailingSeparator) {
                  var1.N(i);
                  return false;
               }

               var1.N(k);
            }
            break;
         }

         arraylist.add(object);
         flag = false;
      }

      if (arraylist.size() < this.minRepetitions) {
         var1.N(i);
         return false;
      } else {
         var2.N(this.listName, arraylist);
         return true;
      }
   }

   public class08501<S, T> N() {
      return this.element;
   }

   public int R() {
      return this.minRepetitions;
   }
}
