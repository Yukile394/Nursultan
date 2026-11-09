package minecraft;

import java.util.Map;

public class class08076 implements class00381<class01662> {
   public static final class02362<class00667, class08076> N = class00381.N(class08076::N, class08076::new);
   private final Map<class05946<? extends class00751<?>>, class03516> y;

   public class08076(Map<class05946<? extends class00751<?>>, class03516> var1) {
      super();
      this.y = var1;
   }

   private class08076(class00667 var1) {
      super();
      this.y = var1.N_17(class00667::b, class03516::y);
   }

   public Map<class05946<? extends class00751<?>>, class03516> N() {
      return this.y;
   }

   private void N(class00667 var1) {
      var1.N(this.y, class00667::y, (var0, var1x) -> var1x.N(var0));
   }

   public void method_65081(class01662 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class08076> method_65080() {
      return class02885.W;
   }
}
