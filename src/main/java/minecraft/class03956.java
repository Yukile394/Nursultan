package minecraft;

import org.joml.Vector3fc;

public enum class03956 {
   field_64559,
   field_64560,
   field_64561,
   field_64562,
   field_64563,
   field_64564;

   private class03956() {
   }

   public float N(Vector3fc var1, Vector3fc var2) {
      return switch (this) {
         case field_64559 -> var1.x();
         case field_64560 -> var1.y();
         case field_64561 -> var1.z();
         case field_64562 -> var2.x();
         case field_64563 -> var2.y();
         case field_64564 -> var2.z();
      };
   }

   public float N(float var1, float var2, float var3, float var4, float var5, float var6) {
      return switch (this) {
         case field_64559 -> var1;
         case field_64560 -> var2;
         case field_64561 -> var3;
         case field_64562 -> var4;
         case field_64563 -> var5;
         case field_64564 -> var6;
      };
   }
}
