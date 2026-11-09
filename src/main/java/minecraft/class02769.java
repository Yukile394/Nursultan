package minecraft;

import io.netty.buffer.ByteBuf;

public record class02769(class06889 position, class06889 movement, float yRot, float xRot, float weight) {
   public static final class02362<ByteBuf, class02769> R = class02362.N(
      class06889.y,
      class02769::N,
      class06889.y,
      class02769::y,
      class02389.u,
      class02769::L,
      class02389.u,
      class02769::u,
      class02389.E,
      class02769::i,
      class02769::new
   );
   public static class02769 M = new class02769(class06889.L, class06889.L, 0.0F, 0.0F, 0.0F);

   public float L() {
      return this.yRot;
   }

   public class02769(class06889 position, class06889 movement, float yRot, float xRot, float weight) {
      super();
      this.position = position;
      this.movement = movement;
      this.yRot = yRot;
      this.xRot = xRot;
      this.weight = weight;
   }

   public float i() {
      return this.weight;
   }

   public float u() {
      return this.xRot;
   }

   public class06889 y() {
      return this.movement;
   }

   public class06889 N() {
      return this.position;
   }
}
