package minecraft;

import java.util.Map;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public record class02081(Vector3fc from, Vector3fc to, Map<class07211, class02067> faces, class04120 rotation, boolean shade, int lightEmission) {
   private static final boolean M = false;
   private static final float B = -16.0F;
   private static final float Z = 32.0F;

   public Map<class07211, class02067> L() {
      return this.faces;
   }

   public class02081(Vector3fc var1, Vector3fc var2, Map<class07211, class02067> var3) {
      this(var1, var2, var3, null, true, 0);
   }

   public class02081(Vector3fc from, Vector3fc to, Map<class07211, class02067> faces, @Nullable class04120 rotation, boolean shade, int lightEmission) {
      this.from = from;
      this.to = to;
      this.faces = faces;
      this.rotation = rotation;
      this.shade = shade;
      this.lightEmission = lightEmission;
   }

   public boolean i() {
      return this.shade;
   }

   @Nullable
   public class04120 u() {
      return this.rotation;
   }

   public Vector3fc y() {
      return this.to;
   }

   public Vector3fc N() {
      return this.from;
   }

   public int R() {
      return this.lightEmission;
   }
}
