package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.List;

public record class00431(class05163 boundingBox, List<class00426> pieces) {
   public static final class02362<ByteBuf, class00431> N = class02362.N(
      class05163.y, class00431::N, class00426.N.N_33(class02389.N()), class00431::y, class00431::new
   );

   public class00431(class05163 boundingBox, List<class00426> pieces) {
      this.boundingBox = boundingBox;
      this.pieces = pieces;
   }

   public List<class00426> y() {
      return this.pieces;
   }

   public class05163 N() {
      return this.boundingBox;
   }
}
