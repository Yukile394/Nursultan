package minecraft;

import java.util.function.Predicate;

public interface class04205 {
   void N(Predicate<class01894> var1);

   void N(class01894 var1, class04214 var2);

   default void N(class01894 var1, class01079 var2) {
      this.N(var1, var2x -> var2x.loadSprite(var1, var2));
   }
}
