package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class04664 implements class01295 {
   @Nullable
   private class04654 field_22780;
   private boolean field_22781;

   public class04664() {
      super();
   }

   @Nullable
   @Override
   public class04654 method_25399() {
      return this.field_22780;
   }

   @Override
   public void method_25395(@Nullable class04654 var1) {
      if (this.field_22780 != var1) {
         if (this.field_22780 != null) {
            this.field_22780.method_25365(false);
         }

         if (var1 != null) {
            var1.method_25365(true);
         }

         this.field_22780 = var1;
      }
   }

   @Override
   public final void method_25398(boolean var1) {
      this.field_22781 = var1;
   }

   @Override
   public final boolean method_25397() {
      return this.field_22781;
   }
}
