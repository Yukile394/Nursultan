package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class01777 extends class03922 implements class01295 {
   @Nullable
   private class04654 field_47551;
   private boolean field_47552;

   public class01777(int var1, int var2, int var3, int var4, class00392 var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Nullable
   @Override
   public class04654 method_25399() {
      return this.field_47551;
   }

   @Nullable
   @Override
   public class02106 method_48205(class02089 var1) {
      return class01295.super.method_48205(var1);
   }

   @Override
   public boolean method_25403(class06613 var1, double var2, double var4) {
      super.method_25403(var1, var2, var4);
      return class01295.super.method_25403(var1, var2, var4);
   }

   @Override
   public void method_25365(boolean var1) {
      class01295.super.method_25365(var1);
   }

   @Override
   public void method_25395(@Nullable class04654 var1) {
      if (this.field_47551 != null) {
         this.field_47551.method_25365(false);
      }

      if (var1 != null) {
         var1.method_25365(true);
      }

      this.field_47551 = var1;
   }

   @Override
   public final void method_25398(boolean var1) {
      this.field_47552 = var1;
   }

   @Override
   public boolean method_25370() {
      return class01295.super.method_25370();
   }

   @Override
   public boolean method_25406(class06613 var1) {
      super.method_25406(var1);
      return class01295.super.method_25406(var1);
   }

   @Override
   public final boolean method_25397() {
      return this.field_47552;
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      boolean flag = this.method_65505(var1);
      return class01295.super.method_25402(var1, var2) || flag;
   }
}
