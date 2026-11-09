package minecraft;

public record class08082(class00392 header, class00392 footer) implements class00381<class07280> {
   public static final class02362<class04247, class08082> N = class02362.N(class03748.u, class08082::N, class03748.u, class08082::y, class08082::new);

   public class08082(class00392 header, class00392 footer) {
      this.header = header;
      this.footer = footer;
   }

   public class00392 y() {
      return this.footer;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public class00392 N() {
      return this.header;
   }

   @Override
   public class02897<class08082> method_65080() {
      return class04248.yR;
   }
}
