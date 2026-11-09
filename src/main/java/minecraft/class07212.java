package minecraft;

public enum class07212 {
   field_11056(1, "Towards positive"),
   field_11060(-1, "Towards negative");

   private final int field_11059;
   private final String field_11057;

   public class07212 L() {
      return this == field_11056 ? field_11060 : field_11056;
   }

   private class07212(int var3, String var4) {
      this.field_11059 = var3;
      this.field_11057 = var4;
   }

   @Override
   public String toString() {
      return this.field_11057;
   }

   public String y() {
      return this.field_11057;
   }

   public int N() {
      return this.field_11059;
   }
}
