package minecraft;

import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class class07952<T extends class07438> extends class07953 {
   private static final int Z = 10;
   protected final Class<T> N;
   protected final int y;
   @Nullable
   protected class07438 L;
   protected class01328 u;

   @Override
   public void L() {
      this.i.y(this.L);
      super.L();
   }

   protected void M() {
      class04782 class04782 = N(this.i);
      if (this.N != class08036.class && this.N != class04770.class) {
         this.L = class04782.N(
            this.i.method_73183().N(this.N, this.N(this.Z()), var0 -> true),
            this.U(),
            this.i,
            this.i.method_23317(),
            this.i.method_23320(),
            this.i.method_23321()
         );
      } else {
         this.L = class04782.N(this.U(), this.i, this.i.method_23317(), this.i.method_23320(), this.i.method_23321());
      }
   }

   public class07952(class07079 var1, Class<T> var2, boolean var3) {
      this(var1, var2, 10, var3, false, null);
   }

   public class07952(class07079 var1, Class<T> var2, int var3, boolean var4, boolean var5, @Nullable class01317 var6) {
      super(var1, var4, var5);
      this.N = var2;
      this.y = y(var3);
      this.N_71(EnumSet.of(class07430.field_18408));
      this.u = class01328.N().N(this.Z()).N(var6);
   }

   public class07952(class07079 var1, Class<T> var2, boolean var3, boolean var4) {
      this(var1, var2, 10, var3, var4, null);
   }

   public class07952(class07079 var1, Class<T> var2, boolean var3, class01317 var4) {
      this(var1, var2, 10, var3, false, var4);
   }

   private class01328 U() {
      return this.u.N(this.Z());
   }

   protected class00734 N(double var1) {
      return this.i.method_5829().L(var1, var1, var1);
   }

   @Override
   public boolean N() {
      if (this.y > 0 && this.i.method_59922().y(this.y) != 0) {
         return false;
      } else {
         this.M();
         return this.L != null;
      }
   }

   public void N(@Nullable class07438 var1) {
      this.L = var1;
   }
}
