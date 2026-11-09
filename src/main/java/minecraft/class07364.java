package minecraft;

public class class07364 implements class00381<class08051> {
   public static final class02362<class00667, class07364> N = class00381.N(class07364::N, class07364::new);
   private final class07209 y;
   private final class07211 L;
   private final class07356 u;
   private final int i;

   public class07356 L() {
      return this.u;
   }

   private class07364(class00667 var1) {
      super();
      this.u = var1.y(class07356.class);
      this.y = var1.i();
      this.L = class07211.N(var1.readUnsignedByte());
      this.i = var1.E();
   }

   public class07364(class07356 var1, class07209 var2, class07211 var3) {
      this(var1, var2, var3, 0);
   }

   public class07364(class07356 var1, class07209 var2, class07211 var3, int var4) {
      super();
      this.u = var1;
      this.y = var2.method_10062();
      this.L = var3;
      this.i = var4;
   }

   public int u() {
      return this.i;
   }

   public class07211 y() {
      return this.L;
   }

   private void N(class00667 var1) {
      var1.N((Enum<?>)this.u);
      var1.N(this.y);
      var1.writeByte(this.L.L());
      var1.L(this.i);
   }

   public class07209 N() {
      return this.y;
   }

   public void method_65081(class08051 var1) {
      var1.method_12066(this);
   }

   @Override
   public class02897<class07364> method_65080() {
      return class04248.yr;
   }
}
