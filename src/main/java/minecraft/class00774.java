package minecraft;

import org.jspecify.annotations.Nullable;

public class class00774 {
   private boolean N = true;
   @Nullable
   private Float y;
   private class00785 L = class00785.field_26407;
   @Nullable
   private Float u;
   private final class00576 i = class00587.N();
   @Nullable
   private class05987 R;
   @Nullable
   private class01002 M;
   @Nullable
   private class01029 B;

   public class00774() {
      super();
   }

   @Override
   public String toString() {
      return "BiomeBuilder{\nhasPrecipitation="
         + this.N
         + ",\ntemperature="
         + this.y
         + ",\ntemperatureModifier="
         + this.L
         + ",\ndownfall="
         + this.u
         + ",\nspecialEffects="
         + this.R
         + ",\nmobSpawnSettings="
         + this.M
         + ",\ngenerationSettings="
         + this.B
         + ",\n}";
   }

   public class00774 y(float var1) {
      this.u = var1;
      return this;
   }

   public class00774 N(class01029 var1) {
      this.B = var1;
      return this;
   }

   public class00774 N(class01002 var1) {
      this.M = var1;
      return this;
   }

   public class00774 N(class05987 var1) {
      this.R = var1;
      return this;
   }

   public class00774 N(class00785 var1) {
      this.L = var1;
      return this;
   }

   public class00780 N() {
      if (this.y != null && this.u != null && this.R != null && this.M != null && this.B != null) {
         return new class00780(new class00777(this.N, this.y, this.L, this.u), this.i.N(), this.R, this.B, this.M);
      } else {
         throw new IllegalStateException("You are missing parameters to build a proper biome\n" + this);
      }
   }

   public <Value, Parameter> class00774 N(class00607<Value> var1, class00619<Value, Parameter> var2, Parameter var3) {
      this.i.N(var1, var2, var3);
      return this;
   }

   public class00774 N(float var1) {
      this.y = var1;
      return this;
   }

   public class00774 N(class00587 var1) {
      this.i.N(var1);
      return this;
   }

   public class00774 N(class00576 var1) {
      return this.N(var1.N());
   }

   public <Value> class00774 N(class00607<Value> var1, Value var2) {
      this.i.N(var1, var2);
      return this;
   }

   public class00774 N(boolean var1) {
      this.N = var1;
      return this;
   }
}
