package minecraft;

import java.util.function.Supplier;

public class class06921 {
   private static final class06950 field_41038 = (var0, var1) -> {};
   private final class06909 field_41039;
   private final int field_41040;
   private class00392 field_41041 = class00392.i();
   private Supplier<class06584> field_41042 = () -> class06584.E;
   private class06950 field_41043 = field_41038;
   private boolean field_41044 = true;
   private boolean field_41045 = true;
   private boolean field_41046 = false;
   private class06936 field_41047 = class06936.field_41052;
   private class01894 field_41048 = class06911.N;

   public class06921(class06909 var1, int var2) {
      super();
      this.field_41039 = var1;
      this.field_41040 = var2;
   }

   public class06921 method_47319(class01894 var1) {
      this.field_41048 = var1;
      return this;
   }

   public class06921 method_47318(class06936 var1) {
      this.field_41047 = var1;
      return this;
   }

   public class06921 method_47320(Supplier<class06584> var1) {
      this.field_41042 = var1;
      return this;
   }

   public class06921 method_47315() {
      this.field_41046 = true;
      return this;
   }

   public class06911 method_47324() {
      if ((this.field_41047 == class06936.field_41054 || this.field_41047 == class06936.field_41053) && this.field_41043 != field_41038) {
         throw new IllegalStateException("Special tabs can't have display items");
      } else {
         class06911 class06911 = new class06911(this.field_41039, this.field_41040, this.field_41047, this.field_41041, this.field_41042, this.field_41043);
         class06911.i = this.field_41046;
         class06911.u = this.field_41045;
         class06911.L = this.field_41044;
         class06911.y = this.field_41048;
         return class06911;
      }
   }

   public class06921 method_47317(class06950 var1) {
      this.field_41043 = var1;
      return this;
   }

   public class06921 method_47321(class00392 var1) {
      this.field_41041 = var1;
      return this;
   }

   public class06921 method_47323() {
      this.field_41044 = false;
      return this;
   }

   public class06921 method_47322() {
      this.field_41045 = false;
      return this;
   }
}
