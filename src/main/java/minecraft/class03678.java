package minecraft;

public enum class03678 {
   field_20624("survival", class07282.field_9215),
   field_20625("hardcore", class07282.field_9215),
   field_20626("creative", class07282.field_9220),
   field_20627("spectator", class07282.field_9219);

   public final class07282 field_20629;
   public final class00392 field_42224;
   private final class00392 field_42225;

   private class03678(String var3, class07282 var4) {
      this.field_20629 = var4;
      this.field_42224 = class00392.L("selectWorld.gameMode." + var3);
      this.field_42225 = class00392.L("selectWorld.gameMode." + var3 + ".info");
   }

   public class00392 N() {
      return this.field_42225;
   }
}
