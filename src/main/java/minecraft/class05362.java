package minecraft;

import java.util.function.Supplier;

public abstract class class05362 extends class06308 {
   public static final int field_39499 = 120;
   public static final int field_39500 = 150;
   public static final int field_49479 = 200;
   public static final int field_39501 = 20;
   public static final int field_46856 = 8;
   public static final class05341 field_40754 = var0 -> var0.get();
   public class05361 field_22767;
   protected final class05341 field_40755;

   public class05362(int var1, int var2, int var3, int var4, class00392 var5, class05361 var6, class05341 var7) {
      super(var1, var2, var3, var4, var5);
      this.field_22767 = var6;
      this.field_40755 = var7;
   }

   @Override
   public void method_25306(class06611 var1) {
      this.field_22767.onPress(this);
   }

   public static class05373 method_46430(class00392 var0, class05361 var1) {
      return new class05373(var0, var1);
   }

   @Override
   public void method_47399(class03428 var1) {
      this.method_37021(var1);
   }

   @Override
   protected class05216 method_25360() {
      return this.field_40755.createNarrationMessage(() -> super.method_25360());
   }
}
