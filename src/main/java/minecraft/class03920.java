package minecraft;

import org.joml.Vector3f;
import org.joml.Vector3fc;

public record class03920(class03956 xFace, class03956 yFace, class03956 zFace) {
   public class03956 L() {
      return this.zFace;
   }

   public class03920(class03956 xFace, class03956 yFace, class03956 zFace) {
      this.xFace = xFace;
      this.yFace = yFace;
      this.zFace = zFace;
   }

   public class03956 y() {
      return this.yFace;
   }

   public class03956 N() {
      return this.xFace;
   }

   public Vector3f N(Vector3fc var1, Vector3fc var2) {
      return new Vector3f(this.xFace.N(var1, var2), this.yFace.N(var1, var2), this.zFace.N(var1, var2));
   }
}
