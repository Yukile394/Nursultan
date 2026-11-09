package minecraft;

import java.util.function.BooleanSupplier;

public class class05926 extends class06428 {
   private final BooleanSupplier y;
   private boolean L;
   private final boolean u;

   public boolean T() {
      boolean flag = this.u && this.y.getAsBoolean() && this.N.N() == class04648.field_1668 && this.L;
      this.L = false;
      return flag;
   }

   public class05926(String var1, int var2, class06384 var3, BooleanSupplier var4, boolean var5) {
      this(var1, class04648.field_1668, var2, var3, var4, var5);
   }

   public class05926(String var1, class04648 var2, int var3, class06384 var4, BooleanSupplier var5, boolean var6) {
      super(var1, var2, var3, var4);
      this.y = var5;
      this.u = var6;
   }

   @Override
   protected void Z() {
      if (this.y.getAsBoolean() && this.R() || this.L) {
         this.L = true;
      }

      this.b();
   }

   public void b() {
      super.N(false);
   }

   @Override
   protected boolean z() {
      return super.z() && !this.y.getAsBoolean();
   }

   @Override
   public void N(boolean var1) {
      if (this.y.getAsBoolean()) {
         if (var1) {
            super.N(!this.R());
         }
      } else {
         super.N(var1);
      }
   }
}
