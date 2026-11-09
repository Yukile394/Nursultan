package minecraft;

public enum class00423 {
   field_11941("serverbound"),
   field_11942("clientbound");

   private final String field_48613;

   private class00423(String var3) {
      this.field_48613 = var3;
   }

   public String y() {
      return this.field_48613;
   }

   public class00423 N() {
      return this == field_11942 ? field_11941 : field_11942;
   }
}
