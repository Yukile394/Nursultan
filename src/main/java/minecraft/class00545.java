package minecraft;

class class00545 implements class00533 {
   private final class07050 N;
   private final class06889 y;

   class00545(class07050 var1, class06889 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public class00545(class00667 var1) {
      super();
      this.y = new class06889(var1.readFloat(), var1.readFloat(), var1.readFloat());
      this.N = var1.y(class07050.class);
   }

   @Override
   public void N(class00565 var1) {
      var1.N(this.N, this.y);
   }

   @Override
   public void N(class00667 var1) {
      var1.writeFloat((float)this.y.M);
      var1.writeFloat((float)this.y.B);
      var1.writeFloat((float)this.y.Z);
      var1.N((Enum<?>)this.N);
   }

   @Override
   public class00563 N() {
      return class00563.field_29173;
   }
}
