package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public abstract class class00208 {
   private static final List<class00208> N = new ArrayList<>();

   public class00208() {
      super();
   }

   public static void y(class00751<Consumer<class05523>> var0) {
      Iterator<class00208> iterator = N.iterator();

      while (iterator.hasNext()) {
         iterator.next().N((var1x, var2) -> class00751.N(var0, var1x, var2));
      }
   }

   public abstract void N(BiConsumer<class05946<Consumer<class05523>>, Consumer<class05523>> var1);

   public static void N(class00208 var0) {
      N.add(var0);
   }
}
