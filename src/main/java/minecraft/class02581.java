package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.List;

public record class02581(List<class02231> links) implements class00381<class01662> {
   public static final class02362<ByteBuf, class02581> N = class02362.N(class02243.L, class02581::N, class02581::new);

   public class02581(List<class02231> links) {
      super();
      this.links = links;
   }

   public void method_65081(class01662 var1) {
      var1.N(this);
   }

   public List<class02231> N() {
      return this.links;
   }

   @Override
   public class02897<class02581> method_65080() {
      return class02885.Z;
   }
}
