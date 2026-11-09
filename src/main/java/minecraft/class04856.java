package minecraft;

import org.jspecify.annotations.Nullable;

public class class04856<T extends class07438> extends class07952<T> {
   private boolean Z = true;

   public class04856(class04882 var1, Class<T> var2, int var3, boolean var4, boolean var5, @Nullable class01317 var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void N(boolean var1) {
      this.Z = var1;
   }

   @Override
   public boolean N() {
      return this.Z && super.N();
   }
}
