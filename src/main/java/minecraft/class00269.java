package minecraft;

public record class00269(int id, class08716 values, boolean onGround) implements class00381<class07280> {
   public static final class02362<class00667, class00269> N = class02362.N(
      class02389.B, class00269::N, class08716.N, class00269::y, class02389.y, class00269::L, class00269::new
   );

   public boolean L() {
      return this.onGround;
   }

   public class00269(int id, class08716 values, boolean onGround) {
      this.id = id;
      this.values = values;
      this.onGround = onGround;
   }

   public class08716 y() {
      return this.values;
   }

   public static class00269 N(class07049 var0) {
      return new class00269(
         var0.method_5628(), new class08716(var0.method_43390(), var0.method_18798(), var0.method_36454(), var0.method_36455()), var0.method_24828()
      );
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public int N() {
      return this.id;
   }

   @Override
   public class02897<class00269> method_65080() {
      return class04248.o;
   }
}
