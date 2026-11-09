package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.List;

public record class00257(List<class00329> recipes) implements class00381<class07280> {
   public static final class02362<ByteBuf, class00257> N = class02362.N(class00329.N.N_33(class02389.N()), class00257::N, class00257::new);

   public class00257(List<class00329> recipes) {
      super();
      this.recipes = recipes;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public List<class00329> N() {
      return this.recipes;
   }

   @Override
   public class02897<class00257> method_65080() {
      return class04248.NT;
   }
}
