package minecraft;

import org.jspecify.annotations.Nullable;

public enum class01980 {
   field_42891("generic_violation"),
   field_42892("false_reporting"),
   field_42893("hate_speech"),
   field_42894("hate_terrorism_notorious_figure"),
   field_42895("harassment_or_bullying"),
   field_42896("defamation_impersonation_false_information"),
   field_42897("drugs"),
   field_42898("fraud"),
   field_42899("spam_or_advertising"),
   field_42900("nudity_or_pornography"),
   field_42901("sexually_inappropriate"),
   field_42902("extreme_violence_or_gore"),
   field_42903("imminent_harm_to_person_or_property");

   private final class00392 field_42904;

   private class01980(String var3) {
      this.field_42904 = class00392.L("gui.banned.reason." + var3);
   }

   @Nullable
   public static class01980 N(int var0) {
      return switch (var0) {
         case 2 -> field_42892;
         default -> null;
         case 5 -> field_42893;
         case 16, 25 -> field_42894;
         case 17, 19, 23, 31 -> field_42891;
         case 21 -> field_42895;
         case 27 -> field_42896;
         case 28 -> field_42897;
         case 29 -> field_42898;
         case 30 -> field_42899;
         case 32 -> field_42900;
         case 33, 35, 36 -> field_42901;
         case 34 -> field_42902;
         case 53 -> field_42903;
      };
   }

   public class00392 N() {
      return this.field_42904;
   }
}
