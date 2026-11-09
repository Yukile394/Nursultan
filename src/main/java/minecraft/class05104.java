package minecraft;

import java.util.Locale;
import java.util.Optional;

public enum class05104 {
   field_19586("pc.realms.minecraft.net", "java.frontendlegacy.realms.minecraft-services.net", "https"),
   field_19587("pc-stage.realms.minecraft.net", "java.frontendlegacy.stage-c2a40e62.realms.minecraft-services.net", "https"),
   field_19588("localhost:8080", "localhost:8080", "http");

   public final String field_19589;
   public final String field_57919;
   public final String field_19590;

   private class05104(String var3, String var4, String var5) {
      this.field_19589 = var3;
      this.field_57919 = var4;
      this.field_19590 = var5;
   }

   public static Optional<class05104> N(String var0) {
      String s = var0.toLowerCase(Locale.ROOT);

      return switch (s) {
         case "production" -> Optional.of(field_19586);
         case "local" -> Optional.of(field_19588);
         case "stage", "staging" -> Optional.of(field_19587);
         default -> Optional.empty();
      };
   }
}
