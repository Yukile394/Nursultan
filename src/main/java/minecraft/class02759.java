package minecraft;

public enum class02759 {
   field_52681("left"),
   field_52682("right");

   private final String field_52683;

   private class02759(String var3) {
      this.field_52683 = var3;
   }

   @Override
   public String toString() {
      return this.field_52683;
   }

   public class02759 N() {
      return this == field_52681 ? field_52682 : field_52681;
   }
}
