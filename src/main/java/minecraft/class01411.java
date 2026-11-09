package minecraft;

import java.util.List;

public class class01411 extends class01388 {
   private final class02091 y;

   public class01411(class01402 var1, class06384 var2) {
      super();
      this.N = var1;
      this.y = class02091.N(var2.N(), (class01590)class01402.N(var1).i_3).N(false).N(class02086.field_62118).N();
   }

   @Override
   protected void N() {
   }

   @Override
   public List<? extends class04654> method_25396() {
      return List.of(this.y);
   }

   @Override
   public List<? extends class03434> method_37025() {
      return List.of(this.y);
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      this.y.y(class01402.y(this.N) / 2 - this.y.method_25368() / 2, this.method_73386() - this.y.method_25364());
      this.y.method_25394(var1, var2, var3, var5);
   }
}
