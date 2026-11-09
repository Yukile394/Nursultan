package minecraft;

import org.jspecify.annotations.Nullable;

public class class06266<T extends class07438> extends class07952<T> {
   private static final int Z = 200;
   private int z = 0;

   @Override
   public void L() {
      this.z = y(200);
      super.L();
   }

   public class06266(class04882 var1, Class<T> var2, boolean var3, @Nullable class01317 var4) {
      super(var1, var2, 500, var3, false, var4);
   }

   public int U() {
      return this.z;
   }

   public void E() {
      this.z--;
   }

   @Override
   public boolean N() {
      if (this.z > 0 || !this.i.method_59922().Z()) {
         return false;
      } else if (!((class04882)this.i).NQ()) {
         return false;
      } else {
         this.M();
         return this.L != null;
      }
   }
}
