package minecraft;

public class class01023 implements class00381<class08051> {
   public static final class02362<class00667, class01023> N = class00381.N(class01023::N, class01023::new);
   private final class01015 y;
   private final boolean L;
   private final boolean u;

   public boolean L() {
      return this.u;
   }

   public class01023(class01015 var1, boolean var2, boolean var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   private class01023(class00667 var1) {
      super();
      this.y = var1.y(class01015.class);
      this.L = var1.readBoolean();
      this.u = var1.readBoolean();
   }

   public boolean y() {
      return this.L;
   }

   private void N(class00667 var1) {
      var1.N((Enum<?>)this.y);
      var1.writeBoolean(this.L);
      var1.writeBoolean(this.u);
   }

   public class01015 N() {
      return this.y;
   }

   public void method_65081(class08051 var1) {
      var1.method_30303(this);
   }

   @Override
   public class02897<class01023> method_65080() {
      return class04248.Lu;
   }
}
