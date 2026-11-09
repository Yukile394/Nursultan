package minecraft;

import java.util.ArrayList;
import java.util.List;

public record class02358<S, T>(class08501<S, T> element, class02353<List<T>> listName, int minRepetitions) implements class02315<S> {
   public class02358(class08501<S, T> element, class02353<List<T>> listName, int minRepetitions) {
      this.element = element;
      this.listName = listName;
      this.minRepetitions = minRepetitions;
   }

   public int i() {
      return this.minRepetitions;
   }

   public class02353<List<T>> y() {
      return this.listName;
   }

   @Override
   public boolean N(class02325<S> var1, class02332 var2, class02328 var3) {
      int i = var1.M();
      ArrayList arraylist = new ArrayList(this.minRepetitions);

      while (true) {
         int j = var1.M();
         Object object = var1.N(this.element);
         if (object == null) {
            var1.N(j);
            if (arraylist.size() < this.minRepetitions) {
               var1.N(i);
               return false;
            } else {
               var2.N(this.listName, arraylist);
               return true;
            }
         }

         arraylist.add(object);
      }
   }

   public class08501<S, T> N() {
      return this.element;
   }
}
