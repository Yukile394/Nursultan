package minecraft;

import java.util.List;
import java.util.Locale;

public enum class03380 {
   field_53035("i_want_to_report_them"),
   field_39659("hate_speech"),
   field_39664("harassment_or_bullying"),
   field_39667("self_harm_or_suicide"),
   field_39662("imminent_harm"),
   field_39666("defamation_impersonation_false_information"),
   field_39670("alcohol_tobacco_drugs"),
   field_39661("child_sexual_exploitation_or_abuse"),
   field_39660("terrorism_or_violent_extremism"),
   field_39663("non_consensual_intimate_imagery"),
   field_53036("sexually_inappropriate");

   private final String field_39671;
   private final class00392 field_39672;
   private final class00392 field_39673;

   public class00392 L() {
      return this.field_39673;
   }

   private class03380(String var3) {
      this.field_39671 = var3.toUpperCase(Locale.ROOT);
      String s = "gui.abuseReport.reason." + var3;
      this.field_39672 = class00392.L(s);
      this.field_39673 = class00392.L(s + ".description");
   }

   public class00392 y() {
      return this.field_39672;
   }

   public String N() {
      return this.field_39671;
   }

   public static List<class03380> N(class03752 var0) {
      return switch (var0) {
         case field_46064 -> List.of(field_53036);
         case field_46065 -> List.of(field_39662, field_39666);
         default -> List.of();
      };
   }
}
