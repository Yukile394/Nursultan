package minecraft;

public record class08640(class07209 position, class00235 mode, String message) implements class00381<class08051> {
   public static final class02362<class00667, class08640> N = class02362.N(
      class07209.field_48404, class08640::N, class00235.field_56029, class08640::y, class02389.s, class08640::L, class08640::new
   );

   public String L() {
      return this.message;
   }

   public class08640(class07209 position, class00235 mode, String message) {
      this.position = position;
      this.mode = mode;
      this.message = message;
   }

   public class00235 y() {
      return this.mode;
   }

   public void method_65081(class08051 var1) {
      var1.method_66581(this);
   }

   public class07209 N() {
      return this.position;
   }

   @Override
   public class02897<class08640> method_65080() {
      return class04248.Ls;
   }
}
