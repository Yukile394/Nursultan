package minecraft;

public record class03657(
   class03665<class01404> transformation,
   class03679 billboardConstraints,
   int brightnessOverride,
   class03664 shadowRadius,
   class03664 shadowStrength,
   int glowColorOverride
) {

   public int L() {
      return this.brightnessOverride;
   }

   public class03657(
      class03665<class01404> transformation,
      class03679 billboardConstraints,
      int brightnessOverride,
      class03664 shadowRadius,
      class03664 shadowStrength,
      int glowColorOverride
   ) {
      super();
      this.transformation = transformation;
      this.billboardConstraints = billboardConstraints;
      this.brightnessOverride = brightnessOverride;
      this.shadowRadius = shadowRadius;
      this.shadowStrength = shadowStrength;
      this.glowColorOverride = glowColorOverride;
   }

   public class03664 i() {
      return this.shadowStrength;
   }

   public class03664 u() {
      return this.shadowRadius;
   }

   public class03679 y() {
      return this.billboardConstraints;
   }

   public class03665<class01404> N() {
      return this.transformation;
   }

   public int R() {
      return this.glowColorOverride;
   }
}
