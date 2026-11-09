package minecraft;

import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

public record class08665(
   class08800 renderState,
   Vector3f translation,
   Quaternionf rotation,
   Quaternionf overrideCameraAngle,
   int x0,
   int y0,
   int x1,
   int y1,
   float scale,
   class03255 scissorArea,
   class03255 bounds
) implements class08647 {
   public Vector3f L() {
      return this.translation;
   }

   @Override
   public int M() {
      return this.x1;
   }

   public class08665(
      class08800 var1,
      Vector3f var2,
      Quaternionf var3,
      @Nullable Quaternionf var4,
      int var5,
      int var6,
      int var7,
      int var8,
      float var9,
      @Nullable class03255 var10
   ) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, class08647.N(var5, var6, var7, var8, var10));
   }

   public class08665(
      class08800 renderState,
      Vector3f translation,
      Quaternionf rotation,
      @Nullable Quaternionf overrideCameraAngle,
      int x0,
      int y0,
      int x1,
      int y1,
      float scale,
      @Nullable class03255 scissorArea,
      @Nullable class03255 bounds
   ) {
      this.renderState = renderState;
      this.translation = translation;
      this.rotation = rotation;
      this.overrideCameraAngle = overrideCameraAngle;
      this.x0 = x0;
      this.y0 = y0;
      this.x1 = x1;
      this.y1 = y1;
      this.scale = scale;
      this.scissorArea = scissorArea;
      this.bounds = bounds;
   }

   @Override
   public int B() {
      return this.y1;
   }

   @Nullable
   @Override
   public class03255 Z() {
      return this.scissorArea;
   }

   @Override
   public int i() {
      return this.x0;
   }

   @Nullable
   public Quaternionf z() {
      return this.overrideCameraAngle;
   }

   public Quaternionf u() {
      return this.rotation;
   }

   public class08800 y() {
      return this.renderState;
   }

   @Override
   public float N() {
      return this.scale;
   }

   @Nullable
   @Override
   public class03255 comp_4274() {
      return this.bounds;
   }

   @Override
   public int R() {
      return this.y0;
   }
}
