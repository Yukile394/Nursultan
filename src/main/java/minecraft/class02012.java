package minecraft;

import org.joml.Vector3f;
import org.joml.Vector3fc;

public interface class02012 {
   default Vector3fc N(float var1, float var2, float var3) {
      return this.N(new Vector3f(var1, var2, var3));
   }

   Vector3fc N(Vector3fc var1);
}
