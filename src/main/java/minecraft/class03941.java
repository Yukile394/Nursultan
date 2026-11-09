package minecraft;

import java.util.EnumMap;
import java.util.Map;

public enum class03941 {
   field_3965(
      new class03920(class03956.field_64559, class03956.field_64560, class03956.field_64564),
      new class03920(class03956.field_64559, class03956.field_64560, class03956.field_64561),
      new class03920(class03956.field_64562, class03956.field_64560, class03956.field_64561),
      new class03920(class03956.field_64562, class03956.field_64560, class03956.field_64564)
   ),
   field_3960(
      new class03920(class03956.field_64559, class03956.field_64563, class03956.field_64561),
      new class03920(class03956.field_64559, class03956.field_64563, class03956.field_64564),
      new class03920(class03956.field_64562, class03956.field_64563, class03956.field_64564),
      new class03920(class03956.field_64562, class03956.field_64563, class03956.field_64561)
   ),
   field_3962(
      new class03920(class03956.field_64562, class03956.field_64563, class03956.field_64561),
      new class03920(class03956.field_64562, class03956.field_64560, class03956.field_64561),
      new class03920(class03956.field_64559, class03956.field_64560, class03956.field_64561),
      new class03920(class03956.field_64559, class03956.field_64563, class03956.field_64561)
   ),
   field_3963(
      new class03920(class03956.field_64559, class03956.field_64563, class03956.field_64564),
      new class03920(class03956.field_64559, class03956.field_64560, class03956.field_64564),
      new class03920(class03956.field_64562, class03956.field_64560, class03956.field_64564),
      new class03920(class03956.field_64562, class03956.field_64563, class03956.field_64564)
   ),
   field_3966(
      new class03920(class03956.field_64559, class03956.field_64563, class03956.field_64561),
      new class03920(class03956.field_64559, class03956.field_64560, class03956.field_64561),
      new class03920(class03956.field_64559, class03956.field_64560, class03956.field_64564),
      new class03920(class03956.field_64559, class03956.field_64563, class03956.field_64564)
   ),
   field_3961(
      new class03920(class03956.field_64562, class03956.field_64563, class03956.field_64564),
      new class03920(class03956.field_64562, class03956.field_64560, class03956.field_64564),
      new class03920(class03956.field_64562, class03956.field_64560, class03956.field_64561),
      new class03920(class03956.field_64562, class03956.field_64563, class03956.field_64561)
   );

   private static final Map<class07211, class03941> field_3958 = class07536.N(new EnumMap<>(class07211.class), var0 -> {
      var0.put(class07211.field_11033, field_3965);
      var0.put(class07211.field_11036, field_3960);
      var0.put(class07211.field_11043, field_3962);
      var0.put(class07211.field_11035, field_3963);
      var0.put(class07211.field_11039, field_3966);
      var0.put(class07211.field_11034, field_3961);
   });
   private final class03920[] field_3959;

   private class03941(class03920... var3) {
      this.field_3959 = var3;
   }

   public class03920 N(int var1) {
      return this.field_3959[var1];
   }

   public static class03941 N(class07211 var0) {
      return field_3958.get(var0);
   }
}
