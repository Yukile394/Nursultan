package minecraft;

import java.util.List;

public class class05014 extends class04992 {
   private final class05096 N;
   private final int y;
   private final class02071 L;

   protected class05014(class05096 var1, class00392 var2, int var3) {
      super();
      this.N = var1;
      this.y = var3;
      this.L = new class02071(var2, var1.method_64506());
   }

   @Override
   public List<? extends class04654> method_25396() {
      return List.of(this.L);
   }

   @Override
   public List<? extends class03434> method_37025() {
      return List.of(this.L);
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      this.L.y(this.N.field_22789 / 2 - 155, this.method_73382() + this.y);
      this.L.method_25394(var1, var2, var3, var5);
   }
}
