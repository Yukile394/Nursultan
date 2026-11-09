package minecraft;

import java.util.Objects;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

public record class00577(Matrix3x2fc pose, float opacity, class03255 scissor) {
   @Nullable
   public class03255 L() {
      return this.scissor;
   }

   public class00577(Matrix3x2fc var1) {
      this(var1, 1.0F, null);
   }

   public class00577(Matrix3x2fc pose, float opacity, @Nullable class03255 scissor) {
      super();
      this.pose = pose;
      this.opacity = opacity;
      this.scissor = scissor;
   }

   public class00577 y(float var1) {
      return this.opacity == var1 ? this : new class00577(this.pose, var1, this.scissor);
   }

   public float y() {
      return this.opacity;
   }

   public class00577 N(int var1, int var2, int var3, int var4) {
      class03255 class03255 = new class03255(var1, var3, var2 - var1, var4 - var3).N(this.pose);
      if (this.scissor != null) {
         class03255 = Objects.requireNonNullElse(this.scissor.y(class03255), class03255.N());
      }

      return this.N(class03255);
   }

   public Matrix3x2fc N() {
      return this.pose;
   }

   public class00577 N(Matrix3x2fc var1) {
      return new class00577(var1, this.opacity, this.scissor);
   }

   public class00577 N(class03255 var1) {
      return var1.equals(this.scissor) ? this : new class00577(this.pose, this.opacity, var1);
   }

   public class00577 N(float var1) {
      return this.N(this.pose.scale(var1, var1, new Matrix3x2f()));
   }
}
