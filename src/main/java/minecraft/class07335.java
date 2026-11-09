package minecraft;

public class class07335 implements class00381<class08051> {
   public static final class02362<class00667, class07335> N = class00381.N(class07335::N, class07335::new);
   private final int y;

   public class07335(int var1) {
      super();
      this.y = var1;
   }

   private class07335(class00667 var1) {
      super();
      this.y = var1.readShort();
   }

   public void method_65081(class08051 var1) {
      var1.method_12056(this);
   }

   private void N(class00667 var1) {
      var1.writeShort(this.y);
   }

   public int N() {
      return this.y;
   }

   @Override
   public class02897<class07335> method_65080() {
      return class04248.Lz;
   }
}
