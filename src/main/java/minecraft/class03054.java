package minecraft;

import org.jspecify.annotations.Nullable;

public record class03054(int indicatorColor, class03050 icon, class00392 text, String logTag) {
   private static final class00392 i = class00392.L("chat.tag.system");
   private static final class00392 R = class00392.L("chat.tag.system_single_player");
   private static final class00392 M = class00392.L("chat.tag.not_secure");
   private static final class00392 B = class00392.L("chat.tag.modified");
   private static final class00392 Z = class00392.L("chat.tag.error");
   private static final int z = 13684944;
   private static final int U = 6316128;
   private static final class03054 E = new class03054(13684944, null, i, "System");
   private static final class03054 W = new class03054(13684944, null, R, "System");
   private static final class03054 m = new class03054(13684944, null, M, "Not Secure");
   private static final class03054 P = new class03054(16733525, null, Z, "Chat Error");

   public static class03054 L() {
      return m;
   }

   @Nullable
   public class00392 M() {
      return this.text;
   }

   public class03054(int indicatorColor, @Nullable class03050 icon, @Nullable class00392 text, @Nullable String logTag) {
      super();
      this.indicatorColor = indicatorColor;
      this.icon = icon;
      this.text = text;
      this.logTag = logTag;
   }

   @Nullable
   public String B() {
      return this.logTag;
   }

   public int i() {
      return this.indicatorColor;
   }

   public static class03054 u() {
      return P;
   }

   public static class03054 y() {
      return W;
   }

   public static class03054 N(String var0) {
      class05216 class05216x = class00392.y(var0).N(class06541.field_1080);
      class05216 class05216x = class00392.i().y(B).y(class05220.n).y(class05216x);
      return new class03054(6316128, class03050.field_39763, class05216x, "Modified");
   }

   public static class03054 N() {
      return E;
   }

   @Nullable
   public class03050 R() {
      return this.icon;
   }
}
