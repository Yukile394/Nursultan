package minecraft;

public record class02580(class06584 contents) implements class00381<class07280> {
   public static final class02362<class04247, class02580> N = class02362.N(class06584.B, class02580::N, class02580::new);

   public class02580(class06584 contents) {
      super();
      this.contents = contents;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public class06584 N() {
      return this.contents;
   }

   @Override
   public class02897<class02580> method_65080() {
      return class04248.Lw;
   }
}
