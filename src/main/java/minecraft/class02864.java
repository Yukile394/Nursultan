package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

class class02864 {
   private final Map<class05946<? extends class00751<?>>, class03516> N = new HashMap<>();

   class02864() {
      super();
   }

   public void N(class05946<? extends class00751<?>> var1, class03516 var2) {
      this.N.put(var1, var2);
   }

   public void N(BiConsumer<? super class05946<? extends class00751<?>>, ? super class03516> var1) {
      this.N.forEach(var1);
   }
}
