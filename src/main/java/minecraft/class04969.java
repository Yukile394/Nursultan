package minecraft;

public enum class04969 {
   field_19437("normal"),
   field_19438("minigame"),
   field_19439("adventureMap"),
   field_19440("experience"),
   field_19441("inspiration"),
   field_63822("unknown");

   private static final String field_63823 = "mco.backup.entry.worldType.";
   private final class00392 field_63824;

   private class04969(String var3) {
      this.field_63824 = class00392.L("mco.backup.entry.worldType." + var3);
   }

   public class00392 N() {
      return this.field_63824;
   }
}
