package minecraft;

public abstract class class06466 extends class06478 {
   private class00392 field_63861;

   public class06466(int var1, int var2, int var3, int var4, class00392 var5) {
      super(var1, var2, var3, var4, var5);
      this.field_63861 = method_75800(var5);
   }

   @Override
   public class00392 method_25369() {
      return this.field_22763 ? super.method_25369() : this.field_63861;
   }

   @Override
   public void method_25355(class00392 var1) {
      super.method_25355(var1);
      this.field_63861 = method_75800(var1);
   }

   public static class00392 method_75800(class00392 var0) {
      return class00390.N(var0, class00405.N.N(-6250336));
   }
}
