package minecraft;

import org.jspecify.annotations.Nullable;

public class class03672 extends class03688 {
   public static final String s = "block_state";
   private static final class02131<class00500> T = class03289.N(class03672.class, class02154.Z);
   @Nullable
   private class03670 b;

   @Nullable
   public class03670 T() {
      return this.b;
   }

   @Override
   public void method_5674(class02131<?> var1) {
      super.method_5674(var1);
      if (var1.equals(T)) {
         this.P = true;
      }
   }

   @Override
   protected void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(T, class00869.N.W());
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("block_state", class00500.N, this.s());
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.<class00500>N("block_state", class00500.N).orElse(class00869.N.W()));
   }

   public class03672(class07078<?> var1, class07299 var2) {
      super(var1, var2);
   }

   public final class00500 s() {
      return this.field_6011.N(T);
   }

   public final void N(class00500 var1) {
      this.field_6011.N(T, var1);
   }

   @Override
   protected void N(boolean var1, float var2) {
      this.b = new class03670(this.s());
   }
}
