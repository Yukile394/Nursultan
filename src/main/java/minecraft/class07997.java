package minecraft;

import org.jspecify.annotations.Nullable;

public class class07997<T extends class07438> extends class07952<T> {
   private final class07453 Z;

   public class07997(class07453 var1, Class<T> var2, boolean var3, @Nullable class01317 var4) {
      super(var1, var2, 10, var3, false, var4);
      this.Z = var1;
   }

   @Override
   public boolean y() {
      return this.u != null ? this.u.N(N(this.i), this.i, this.L) : super.y();
   }

   @Override
   public boolean N() {
      return !this.Z.NQ() && super.N();
   }
}
