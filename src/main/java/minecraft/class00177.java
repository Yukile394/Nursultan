package minecraft;

import java.util.function.Function;

public record class00177(class04540<class08880> entries) implements class08880 {
   public class00177(class04540<class08880> entries) {
      super();
      this.entries = entries;
   }

   public class04540<class08880> y() {
      return this.entries;
   }

   @Override
   public void method_62326(class08350 var1) {
      this.entries.u().forEach(var1x -> var1x.N().method_62326(var1));
   }

   @Override
   public class08887 method_68521(class02028 var1) {
      return new class00163(this.entries.N((Function<class08880, class08887>)(var1x -> var1x.method_68521(var1))));
   }
}
