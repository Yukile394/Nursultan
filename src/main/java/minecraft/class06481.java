package minecraft;

import java.util.UUID;

class class06481 implements class07262 {
   class06481(class06455 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void N(UUID var1, class00392 var2) {
      this.N.N.get(var1).N(var2);
   }

   @Override
   public void N(UUID var1, class06685 var2, class06702 var3) {
      class01206 class01206 = this.N.N.get(var1);
      class01206.N(var2);
      class01206.N(var3);
   }

   @Override
   public void N(UUID var1, boolean var2, boolean var3, boolean var4) {
      class01206 class01206 = this.N.N.get(var1);
      class01206.N(var2);
      class01206.y(var3);
      class01206.L(var4);
   }

   @Override
   public void N(UUID var1, float var2) {
      this.N.N.get(var1).N(var2);
   }

   @Override
   public void N(UUID var1) {
      this.N.N.remove(var1);
   }

   @Override
   public void N(UUID var1, class00392 var2, float var3, class06685 var4, class06702 var5, boolean var6, boolean var7, boolean var8) {
      this.N.N.put(var1, new class01206(var1, var2, var3, var4, var5, var6, var7, var8));
   }
}
