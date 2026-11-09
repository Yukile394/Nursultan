package minecraft;

import org.joml.Quaternionf;
import org.joml.Vector3f;

public record class06755(class06889 start, class06889 end, int color, float width) implements class06730 {
   public static final float N = 2.5F;

   public int L() {
      return this.color;
   }

   public class06755(class06889 start, class06889 end, int color, float width) {
      super();
      this.start = start;
      this.end = end;
      this.color = color;
      this.width = width;
   }

   public float u() {
      return this.width;
   }

   public class06889 y() {
      return this.end;
   }

   @Override
   public void N(class06722 var1, float var2) {
      int i = class02566.N(this.color, var2);
      var1.N(this.start, this.end, i, this.width);
      Quaternionf quaternionf = new Quaternionf().rotationTo(new Vector3f(1.0F, 0.0F, 0.0F), this.end.u(this.start).W().normalize());
      float f = (float)class04995.N(this.end.R(this.start) * 0.1F, 0.1F, 1.0);

      for (Vector3f vector3f : new Vector3f[]{
         quaternionf.transform(-f, f, 0.0F, new Vector3f()),
         quaternionf.transform(-f, 0.0F, f, new Vector3f()),
         quaternionf.transform(-f, -f, 0.0F, new Vector3f()),
         quaternionf.transform(-f, 0.0F, -f, new Vector3f())
      }) {
         var1.N(this.end.y(vector3f.x, vector3f.y, vector3f.z), this.end, i, this.width);
      }
   }

   public class06889 N() {
      return this.start;
   }
}
