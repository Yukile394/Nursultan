package minecraft;

import java.util.OptionalDouble;

public record class06715(int color, float scale, OptionalDouble adjustLeft) {
   public static final float u = 0.32F;

   public float L() {
      return this.scale;
   }

   public class06715(int color, float scale, OptionalDouble adjustLeft) {
      super();
      this.color = color;
      this.scale = scale;
      this.adjustLeft = adjustLeft;
   }

   public OptionalDouble u() {
      return this.adjustLeft;
   }

   public int y() {
      return this.color;
   }

   public class06715 y(float var1) {
      return new class06715(this.color, this.scale, OptionalDouble.of(var1));
   }

   public static class06715 y(int var0) {
      return new class06715(var0, 0.32F, OptionalDouble.of(0.0));
   }

   public static class06715 N() {
      return new class06715(-1, 0.32F, OptionalDouble.empty());
   }

   public class06715 N(float var1) {
      return new class06715(this.color, var1, this.adjustLeft);
   }

   public static class06715 N(int var0) {
      return new class06715(var0, 0.32F, OptionalDouble.empty());
   }
}
