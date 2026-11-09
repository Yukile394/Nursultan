package minecraft;

class class05130 extends class05699<class05130> {
   private static final class00392 y = class00392.L("mco.backup.entry.templateName");
   private static final class00392 L = class00392.L("mco.backup.entry.gameDifficulty");
   private static final class00392 u = class00392.L("mco.backup.entry.name");
   private static final class00392 i = class00392.L("mco.backup.entry.gameServerVersion");
   private static final class00392 R = class00392.L("mco.backup.entry.uploaded");
   private static final class00392 M = class00392.L("mco.backup.entry.enabledPack");
   private static final class00392 B = class00392.L("mco.backup.entry.description");
   private static final class00392 Z = class00392.L("mco.backup.entry.gameMode");
   private static final class00392 z = class00392.L("mco.backup.entry.seed");
   private static final class00392 U = class00392.L("mco.backup.entry.worldType");
   private static final class00392 E = class00392.L("mco.backup.entry.undefined");
   private final String W;
   private final String m;
   private final class00392 P;
   private final class00392 s;

   public class05130(class05112 var1, String var2, String var3) {
      super();
      this.N = var1;
      this.W = var2;
      this.m = var3;
      this.P = this.N(var2);
      this.s = var1.N(var2, var3);
   }

   private class00392 N(String var1) {
      return switch (var1) {
         case "template_name" -> y;
         case "game_difficulty" -> L;
         case "name" -> u;
         case "game_server_version" -> i;
         case "uploaded" -> R;
         case "enabled_packs" -> M;
         case "description" -> B;
         case "game_mode" -> Z;
         case "seed" -> z;
         case "world_type" -> U;
         default -> E;
      };
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      var1.y(class05112.N(this.N), this.P, this.method_73380(), this.method_73382(), -6250336);
      var1.y(class05112.y(this.N), this.s, this.method_73380(), this.method_73382() + 12, -1);
   }

   @Override
   public class00392 method_37006() {
      return class00392.N("narrator.select", this.W + " " + this.m);
   }
}
