package minecraft;

import java.util.Locale;

public enum class03752 {
   field_46064("chat"),
   field_46065("skin"),
   field_46066("username");

   private final String field_46067;

   private class03752(String var3) {
      this.field_46067 = var3.toUpperCase(Locale.ROOT);
   }

   public String N() {
      return this.field_46067;
   }
}
